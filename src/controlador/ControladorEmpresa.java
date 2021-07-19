package controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

import modelo.Empresa;
import modelo.Propietario;
import vista.VistaEmpresa;

public class ControladorEmpresa extends AdaptadorListener{
    
    private VistaEmpresa vista;
    private Empresa manejo;
    private DefaultTableModel modelTabla;
    private ControladorTeclado soloNumeros;
    private ControladorTeclado soloIden;
    private String seleccionIden;

    public ControladorEmpresa(VistaEmpresa vista){
        this.vista = vista;
        this.manejo = Empresa.getEmpresa();

        //Cargamos Empresa
        vista.textNombreEmpresa.setText(manejo.getNombre());
        vista.textDireccionEmpresa.setText(manejo.getDireccion());

        //Deshabilitamos valores
        this.vista.btnEliminar.setEnabled(false);
        this.vista.btnModificarProp.setEnabled(false);
        this.vista.btnMas.setEnabled(false);
        this.vista.textIden2.setEnabled(false);
        this.vista.textProcentaje.setEnabled(false);

        //Ponermos a la escucha a los botones;
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnMas.addActionListener(this);
        this.vista.btnModificarEmpresa.addActionListener(this);
        this.vista.btnModificarProp.addActionListener(this);
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnVer.addActionListener(this);

        //Declaramos los controladores de Texto
        soloNumeros = new ControladorTeclado(ControladorTeclado.tipo.Numeros);
        ControladorTeclado soloLetras = new ControladorTeclado(ControladorTeclado.tipo.Letras);
        ControladorTeclado soloTexto = new ControladorTeclado(ControladorTeclado.tipo.Texto);
        soloIden = new ControladorTeclado(ControladorTeclado.tipo.Iden);

        //Pnemos a la escuchas a los TextField
        this.vista.textApellidos.addKeyListener(soloLetras);
        this.vista.textDireccionEmpresa.addKeyListener(soloTexto);
        this.vista.textIden2.addKeyListener(soloIden);
        this.vista.textNombreEmpresa.addKeyListener(soloTexto);
        this.vista.textNombres.addKeyListener(soloLetras);
        this.vista.textProcentaje.addKeyListener(soloNumeros);

        //Pone a la escucha de Mouselistener a la tabla;
        vista.tablePropietarios.addMouseListener(this);

        //Pone a las escucha de focus listener a Iden y combobox
        vista.textIden.addFocusListener(this);
        vista.comboBoxIden.addFocusListener(this);
    }

    public void actializarTabla() {
        manejo = Empresa.getEmpresa();
        String col[] = {"Identificacion", "Nombres", "Apellidos"};

        String data[][] = manejo.getMatrizPropietarios();
        modelTabla = new DefaultTableModel(data, col);
        vista.tablePropietarios.setModel(modelTabla);
    }

    public boolean agregarModificarProp(boolean agregar) {

        String iden = vista.textIden.getText();
        String nom = vista.textNombres.getText();
        String ape = vista.textApellidos.getText();

        if(agregar){
            return manejo.agregarPropietario(iden, nom, ape);
        }
        else{
            return manejo.modificarPropietario(nom, ape, iden);
        }

    }

    public void limpiar(){
        vista.textIden.setText(null);
        vista.textNombres.setText(null);
        vista.textApellidos.setText(null);

        vista.comboBoxIden.setEnabled(true);
        this.vista.btnEliminar.setEnabled(false);
        this.vista.btnModificarProp.setEnabled(false);
        this.vista.btnMas.setEnabled(false);
        this.vista.textIden2.setEnabled(false);
        this.vista.textProcentaje.setEnabled(false);
    }

    public String verificacion(){
        String retorno = "Corregir :";
        boolean ced = false;
        if((String)vista.comboBoxIden.getSelectedItem() == "Cedula") ced = true;

        if(!Propietario.Validacion(vista.textIden.getText(), ced)) retorno = retorno + " Identificacion.";
        if(vista.textNombres.getText().length() < 3) retorno = retorno + " Nombres.";
        if(vista.textApellidos.getText().length() < 3) retorno = retorno + " Apellidos.";

        if(!retorno.equals("Corregir :")) return retorno;
        return null;
    }

    public boolean cargarDatos(String iden){
        Propietario prop = manejo.getPropietario(iden);

        if(prop != null){
            vista.textIden.setText(prop.getIdentificacion());
            vista.textNombres.setText(prop.getNombre());
            vista.textApellidos.setText(prop.getApellido());
    
            vista.comboBoxIden.setEnabled(false);
            this.vista.btnEliminar.setEnabled(true);
            this.vista.btnModificarProp.setEnabled(true);
            this.vista.btnMas.setEnabled(true);
            this.vista.textIden2.setEnabled(true);
            this.vista.textProcentaje.setEnabled(true);

            return true;
        }

        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnRegistrar){
            String val = verificacion();
            String iden = vista.textIden.getText();

            if(manejo.buscar(iden) == -1){
                if(val == null){
                    agregarModificarProp(true);
                    JOptionPane.showMessageDialog(null, "Propietario agregado.");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al agregar, "+val);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar, ya exite un Propietario registrado con esa ID.");
            }
        }
        if(e.getSource() == vista.btnModificarProp){
            String val =verificacion();
            if(val == null){
                if(agregarModificarProp(false)){
                    JOptionPane.showMessageDialog(null, "Propietario modificado.");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al modificar, No se encontro el registro.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al modificar, "+val);
            }
        }
        if(e.getSource() == vista.btnEliminar){
            String iden = vista.textIden.getText();

            if(manejo.buscar(iden) != -1){
                if(manejo.eliminarPropietario(iden)){
                    JOptionPane.showMessageDialog(null, "Propietario Eliminado.");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se puede eliminar un Propietario con porcentaje diferente de 0.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar, Propietarios no encontrado.");
            }
        }
        if(e.getSource() == vista.btnLimpiar){
            limpiar();
        }
        if(e.getSource() == vista.btnMas){
            String idenRec = vista.textIden.getText();
            String idenEmi = vista.textIden2.getText();
            int porcentaje = 0;
            boolean val = true;

            try{
                porcentaje = Integer.parseInt(vista.textProcentaje.getText());
                if(porcentaje < 0 || porcentaje >100){
                    val = false;
                }
            }
            catch(NumberFormatException ex){
                val = false;
            }

            if(val){
                int mod = manejo.cambiarPorcentaje(idenRec, idenEmi, porcentaje);
                if(mod == 0 ) JOptionPane.showMessageDialog(null, "Error no se encontro el Propietario Receptor");
                if(mod == 1 ) JOptionPane.showMessageDialog(null, "Error no se encontro el Propietario Emisor");
                if(mod == 2 ) JOptionPane.showMessageDialog(null, "Error el porcentaje es invalido");
                if(mod == 3 ) JOptionPane.showMessageDialog(null, "Porcentaje cambiado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al modificar porcentaje invalido");
            }

        }
        if(e.getSource() == vista.btnVer){
            if(cargarDatos(vista.textIden.getText())){
                JOptionPane.showMessageDialog(null, "Datos Cargados.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error no se encontraron los datos.");
            }
        }
        if(e.getSource() == vista.btnModificarEmpresa){
            manejo.setDireccion(vista.textDireccionEmpresa.getText());
            manejo.setNombre(vista.textNombreEmpresa.getText());
            vista.textNombreEmpresa.setText(manejo.getNombre());
            vista.textDireccionEmpresa.setText(manejo.getDireccion());
        }

        actializarTabla();
    }

    // Mouse Listener
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.tablePropietarios){
            int seleccion = vista.tablePropietarios.getSelectedRow();
            limpiar();
            cargarDatos((String)vista.tablePropietarios.getValueAt(seleccion, 0));
        }
    }

    //Focus Listerner
    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == vista.textIden){
            if( vista.comboBoxIden.getSelectedItem().equals("Cedula") ){
                this.vista.textIden.removeKeyListener(soloIden);
                this.vista.textIden.addKeyListener(soloNumeros);
            }
            else{
                this.vista.textIden.removeKeyListener(soloNumeros);
                this.vista.textIden.addKeyListener(soloIden);
            }
        }
        if(e.getSource() == vista.comboBoxIden){
            seleccionIden = (String)vista.comboBoxIden.getSelectedItem();
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource() == vista.comboBoxIden){
            if(!vista.comboBoxIden.getSelectedItem().equals(seleccionIden)){
                vista.textIden.setText("");
            }
        }
    }
}
