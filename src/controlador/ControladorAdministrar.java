package controlador;

import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuEvent;

import modelo.Cabana;
import modelo.ManejoAreas;
import modelo.Piscina;
import modelo.Restaurante;
import vista.VistaAdministrar;

public class ControladorAdministrar  extends AdaptadorListener{
    
    private VistaAdministrar vista;
    private ManejoAreas manejo;
    private DefaultTableModel modelTabla;
    private String nombreLeer;
    private Restaurante res;

    public ControladorAdministrar(VistaAdministrar vista){
        this.vista = vista;
        this.manejo = ManejoAreas.getManejoAreas();

        actualizarTabla();

        //Deshabilitamos valores
        this.vista.btnModificar.setEnabled(false);
        this.vista.btnQuitar.setEnabled(false);
        this.vista.btnMesaAgregar.setEnabled(false);
        this.vista.btnMesaLimpiar.setEnabled(false);
        this.vista.btnMesaQuitar.setEnabled(false);
        this.vista.comboBoxMesaCap.setEnabled(false);
        this.vista.tableMesas.setVisible(false);

        //Ponemos a la escucha a los botones
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);
        this.vista.btnMesaAgregar.addActionListener(this);
        this.vista.btnMesaLimpiar.addActionListener(this);
        this.vista.btnMesaQuitar.addActionListener(this);

        //Declaramos los controladores de Texto
        ControladorTeclado soloTexto = new ControladorTeclado(ControladorTeclado.tipo.Texto);

        //Pnemos a la escucha a los TextField
        this.vista.textNombre.addKeyListener(soloTexto);
        this.vista.textUbicacion.addKeyListener(soloTexto);

        //Pone a la escucha de Mouselistener a la tabla
        vista.tableAgregar.addMouseListener(this);
        vista.tableMesas.addMouseListener(this);
        
        //Pone a la escucha de POPUP a los comboBox
        vista.comboBoxSeleccion.addPopupMenuListener(this);

        //Pone los valores a los comboBox
        vista.comboBoxCapacidad.setModel(new DefaultComboBoxModel<String>(new String[] {"4","6","8","10","12"}));
        vista.comboBoxTipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Playa","Piscina"}));

    }

    public ManejoAreas.selec obtenerTipo(){
        if(vista.comboBoxSeleccion.getSelectedItem().equals("Restaurante")) return ManejoAreas.selec.Restaurante;
        if(vista.comboBoxSeleccion.getSelectedItem().equals("Piscina")) return ManejoAreas.selec.Piscina;
        if(vista.comboBoxSeleccion.getSelectedItem().equals("Cabaña")) return ManejoAreas.selec.Cabana;
        
        return null;
    }

    public void actualizarTabla() {
        manejo = ManejoAreas.getManejoAreas();
        String col[] = {"Nombres", "Capacidad"};
        ManejoAreas.selec seleccion = obtenerTipo();

        if(seleccion != null){
            String data[][] = manejo.getMatrizDatos(seleccion);
            modelTabla = new DefaultTableModel(data, col);
            vista.tableAgregar.setModel(modelTabla);
        }

    }

    public String verificacion(){
        String retorno = "Corregir :";

        if(vista.textNombre.getText().length() < 3) retorno = retorno + " Nombre.";
        if(vista.comboBoxSeleccion.equals("Cabaña")){
            if(vista.textUbicacion.getText().length() < 3) retorno = retorno + " Ubicacion.";
        }

        if(!retorno.equals("Corregir :")) return retorno;
        return null;
    }

    public boolean agregarModiciarRes(boolean agregar){
        String nombre = vista.textNombre.getText();

        if(agregar){
            return manejo.agregarRestaurante(nombre);
        }
        else{
            return manejo.modificarRestaurante(nombreLeer,nombre);
        }
    }

    public boolean agregarModiciarCab(boolean agregar){
        String nombre = vista.textNombre.getText();
        String ubi = vista.textUbicacion.getText();
        String tipo = (String)vista.comboBoxTipo.getSelectedItem();
        int cap = Integer.parseInt((String)vista.comboBoxCapacidad.getSelectedItem());

        if(agregar){
            return manejo.agregarCabana(tipo, ubi, cap, nombre);
        }
        else{
            return manejo.modificarCabana(tipo, ubi, cap, nombreLeer, nombre);
        }
    }

    public boolean agregarModiciarPisc(boolean agregar){
        String nombre = vista.textNombre.getText();
        String tipo = (String)vista.comboBoxTipo.getSelectedItem();
        int cap = Integer.parseInt((String)vista.comboBoxCapacidad.getSelectedItem());

        if(agregar){
            return manejo.agregarPiscina(nombre, cap, tipo);
        }
        else{
            return manejo.modificarPiscina(nombreLeer, cap, tipo, nombre);
        }
    }

    public void limpiar(){
        this.vista.textNombre.setText(null);
        this.vista.textUbicacion.setText(null);

        this.vista.comboBoxMesaCap.setSelectedIndex(0);
        this.vista.lblMesa.setText(".....");
        this.vista.lblRestaurante.setText(".....");

        this.vista.btnModificar.setEnabled(false);
        this.vista.btnQuitar.setEnabled(false);
        this.vista.btnMesaAgregar.setEnabled(false);
        this.vista.btnMesaLimpiar.setEnabled(false);
        this.vista.btnMesaQuitar.setEnabled(false);
        this.vista.comboBoxMesaCap.setEnabled(false);
        this.vista.tableMesas.setVisible(false);
        this.vista.btnAgregar.setEnabled(true);

        if(!vista.comboBoxSeleccion.getSelectedItem().equals("Restaurante")){
            this.vista.comboBoxCapacidad.setSelectedIndex(0);
            this.vista.comboBoxTipo.setSelectedIndex(0);
        }
    }

    public boolean cargarDatosRes(String nombre){
        res = manejo.getRestaurante(nombre);

        if(res != null){
            vista.textNombre.setText(res.getNombre());
            vista.comboBoxCapacidad.setModel(new DefaultComboBoxModel<String>(new String[] {res.getCapacidad()+""}));
    
            this.vista.btnModificar.setEnabled(true);
            this.vista.btnQuitar.setEnabled(true);

            this.vista.btnAgregar.setEnabled(false);

            this.vista.btnMesaAgregar.setEnabled(true);
            this.vista.btnMesaLimpiar.setEnabled(true);
            this.vista.btnMesaQuitar.setEnabled(false);
            this.vista.comboBoxMesaCap.setEnabled(true);
            this.vista.tableMesas.setVisible(true);

            if(res.getCapacidad() == 0){
                this.vista.lblMesa.setText("1");
            }else{
                this.vista.lblMesa.setText(""+(res.getCapacidad()+1));
            }
            this.vista.lblRestaurante.setText(res.getNombre());

            actualizarTablaMesas();

            return true;
        }

        return false;
    }

    public boolean cargarDatosCab(String nombre){
        Cabana cab = manejo.getCabana(nombre);

        if(cab != null){
            vista.textNombre.setText(cab.getNombre());
            vista.textUbicacion.setText(cab.getUbicacion());
            vista.comboBoxCapacidad.setSelectedItem(cab.getCapacidad()+"");
            vista.comboBoxTipo.setSelectedItem(cab.getTipo()+"");
    
            this.vista.btnModificar.setEnabled(true);
            this.vista.btnQuitar.setEnabled(true);

            this.vista.btnAgregar.setEnabled(false);

            return true;
        }

        return false;
    }

    public boolean cargarDatosPisc(String nombre){
        Piscina pisc = manejo.getPiscina(nombre);

        if(pisc != null){
            vista.textNombre.setText(pisc.getNombre());
            vista.comboBoxCapacidad.setSelectedItem(pisc.getCapacidad()+"");
            vista.comboBoxTipo.setSelectedItem(pisc.getTipo()+"");
    
            this.vista.btnModificar.setEnabled(true);
            this.vista.btnQuitar.setEnabled(true);

            this.vista.btnAgregar.setEnabled(false);

            return true;
        }

        return false;
    }

    //Metodos Generales

    public boolean eliminarArea(String nombre){
        ManejoAreas.selec seleccion = obtenerTipo();

        switch(seleccion){
        case Restaurante:{
            manejo.eliminarRestaurante(nombre);
            return true;
        }
        case Cabana:{
            manejo.eliminarCabana(nombre);
            return true;
        }
        case Piscina:{
            manejo.eliminarPiscina(nombre);
            return true;
        }
        }

        return false;

    }

    public boolean buscar(String nombre){
        ManejoAreas.selec seleccion = obtenerTipo();
        
        switch(seleccion){
            case Restaurante:{
                if(manejo.buscarRestaurante(nombre) != -1) return true;
            }
            case Cabana:{
                if(manejo.buscarCabana(nombre) != -1) return true;
            }
            case Piscina:{
                if(manejo.buscarPiscina(nombre) != -1) return true;
            }
            }
    
        return false;
    }

    public boolean cargar(String nombre){
        ManejoAreas.selec seleccion = obtenerTipo();
        
        switch(seleccion){
            case Restaurante:{
                return cargarDatosRes(nombre);
            }
            case Cabana:{
                return cargarDatosCab(nombre);
            }
            case Piscina:{
                return cargarDatosPisc(nombre);
            }
            }
    
        return false;
    }

    public boolean agregarMod(boolean agregar){
        ManejoAreas.selec seleccion = obtenerTipo();
        
        switch(seleccion){
            case Restaurante:{
                return agregarModiciarRes(agregar);
            }
            case Cabana:{
                return agregarModiciarCab(agregar);
            }
            case Piscina:{
                return agregarModiciarPisc(agregar);
            }
            }
    
        return false;
    }

    //Metodo para Mesas

    public void limpiarMesa(){
        this.vista.btnMesaAgregar.setEnabled(true);
        this.vista.btnMesaQuitar.setEnabled(false);
        this.vista.comboBoxMesaCap.setSelectedIndex(0);
    }

    private void actualizarTablaMesas(){
        String col[] = {"ID", "Capacidad"};

        String data[][] = res.getMatrizDatos();
        DefaultTableModel modelTabla = new DefaultTableModel(data, col);
        vista.tableMesas.setModel(modelTabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnAgregar){
            String val = verificacion();
            String nombre = vista.textNombre.getText();
            String seleccion = (String)vista.comboBoxSeleccion.getSelectedItem();

            if(!buscar(nombre)){
                if(val == null){
                    agregarMod(true);
                    JOptionPane.showMessageDialog(null, seleccion+" agregado.");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al agregar, "+val);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar, ya exite un "+seleccion+" registrado con ese nombre.");
            }
        }
        if(e.getSource() == vista.btnModificar){
            String val = verificacion();
            String seleccion = (String)vista.comboBoxSeleccion.getSelectedItem();

            if(val == null){
                if(agregarMod(false)){
                    JOptionPane.showMessageDialog(null, seleccion+" modificado.");
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
        if(e.getSource() == vista.btnQuitar){
            String seleccion = (String)vista.comboBoxSeleccion.getSelectedItem();
            String nombre = vista.textNombre.getText();

            if(eliminarArea(nombre)){
                JOptionPane.showMessageDialog(null, seleccion+" borrado.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al borrar, No se encontro el registro.");
            }

        }
        if(e.getSource() == vista.btnLimpiar){
            limpiar();
        }
        if(e.getSource() == vista.btnMesaAgregar){
            int capacidad = Integer.parseInt((String)vista.comboBoxMesaCap.getSelectedItem());
            if(res.agregarMesa(capacidad)){
                JOptionPane.showMessageDialog(null, "Mesa agregada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar Mesa.");
            }
            actualizarTablaMesas();
        }
        if(e.getSource() == vista.btnMesaLimpiar){
            limpiarMesa();
            actualizarTablaMesas();
        }
        if(e.getSource() == vista.btnMesaQuitar){
            int id = Integer.parseInt(vista.lblMesa.getText());
            if(res.eliminarMesa(id)){
                JOptionPane.showMessageDialog(null, "Mesa eliminada.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar Mesa.");
            }
            actualizarTablaMesas();
        }

        actualizarTabla();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.tableAgregar){
            int seleccion = vista.tableAgregar.getSelectedRow();
            limpiar();
            nombreLeer = (String)vista.tableAgregar.getValueAt(seleccion, 0);
            cargar((String)vista.tableAgregar.getValueAt(seleccion, 0));
        }
        if(e.getSource() == vista.tableMesas){
            
        }
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        if(e.getSource() == vista.comboBoxSeleccion){
            if(vista.comboBoxSeleccion.getSelectedItem().equals("Cabaña")){
                vista.comboBoxCapacidad.setEnabled(true);
                vista.comboBoxTipo.setEnabled(true);
                vista.textUbicacion.setEnabled(true);

                vista.comboBoxCapacidad.setModel(new DefaultComboBoxModel<String>(new String[] {"4","6","8","10","12"}));
                vista.comboBoxTipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Playa","Piscina"}));
            }
            if(vista.comboBoxSeleccion.getSelectedItem().equals("Piscina")){
                vista.comboBoxCapacidad.setEnabled(true);
                vista.comboBoxTipo.setEnabled(true);
                vista.textUbicacion.setEnabled(false);

                vista.textUbicacion.setText(null);
                vista.comboBoxCapacidad.setModel(new DefaultComboBoxModel<String>(new String[] {"10","15","20","30"}));
                vista.comboBoxTipo.setModel(new DefaultComboBoxModel<String>(new String[] {"A","B"}));
            }
            if(vista.comboBoxSeleccion.getSelectedItem().equals("Restaurante")){
                vista.comboBoxCapacidad.setEnabled(false);
                vista.comboBoxTipo.setEnabled(false);
                vista.textUbicacion.setEnabled(false);

                vista.textUbicacion.setText(null);
                vista.comboBoxCapacidad.setModel(new DefaultComboBoxModel<String>(new String[] {}));
                vista.comboBoxTipo.setModel(new DefaultComboBoxModel<String>(new String[] {}));
            }
        }
        actualizarTabla();
        limpiar();
    }

}
