package controlador;

import vista.Registro;
import vista.VentanaListaPersonas;

import java.awt.event.*;
import java.time.*;
import java.time.temporal.TemporalField;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Huesped;
import modelo.ManejoHuespedes;

public class ControladorRegistro implements ActionListener{

    private Registro vista;
    private ManejoHuespedes manejo;
    private VentanaListaPersonas vistaLista;
    private DefaultTableModel modelTabla;
    private ControladorTeclado soloNumeros;
    private ControladorTeclado soloIden;

    public ControladorRegistro(Registro vista){
        this.vista = vista;
        this.manejo = ManejoHuespedes.getListas();
        this.vistaLista = new VentanaListaPersonas();

        //Pone a la escucha a los botones
        vista.btnRegistrar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnListar.addActionListener(this);
        vistaLista.btnCambiar.addActionListener(this);

        soloNumeros = new ControladorTeclado(ControladorTeclado.tipo.Numeros);
        ControladorTeclado soloLetras = new ControladorTeclado(ControladorTeclado.tipo.Letras);
        ControladorTeclado soloTexto = new ControladorTeclado(ControladorTeclado.tipo.Texto);
        soloIden = new ControladorTeclado(ControladorTeclado.tipo.Iden);

        //Pone a la escucha a los TextField con KeyListener
        vista.textFieldAnioBan.addKeyListener(soloNumeros);
        vista.textFieldAnioCli.addKeyListener(soloNumeros);
        vista.textFieldApellidos.addKeyListener(soloLetras);
        vista.textFieldBanco.addKeyListener(soloLetras);
        vista.textFieldCell.addKeyListener(soloNumeros);
        vista.textFieldDiaCli.addKeyListener(soloNumeros);
        vista.textFieldDirec.addKeyListener(soloTexto);
        vista.textFieldFijo.addKeyListener(soloNumeros);
        vista.textFieldIden.addKeyListener(soloIden);
        vista.textFieldMesBan.addKeyListener(soloNumeros);
        vista.textFieldMesCli.addKeyListener(soloNumeros);
        vista.textFieldNombres.addKeyListener(soloLetras);
        vista.textFieldNumTar.addKeyListener(soloNumeros);
        vista.textFieldProf.addKeyListener(soloLetras);

        vistaLista.textAnio.addKeyListener(soloNumeros);
        vistaLista.textMes.addKeyListener(soloNumeros);
        vistaLista.textDia.addKeyListener(soloNumeros);

    }

    public void actializarTabla() {
        String col[] = {"Identificacion", "Nombres", "Apellidos"};

        String data[][] = manejo.getMatrizAfiliados();
        modelTabla = new DefaultTableModel(data, col);
        vistaLista.tableAfiliados.setModel(modelTabla);

        data = manejo.getMatrizNoAfiliados();
        modelTabla = new DefaultTableModel(data, col);
        vistaLista.tableNoAfiliados.setModel(modelTabla);
    }

    public boolean agregarModificar(boolean agregar){

        String iden = vista.textFieldIden.getText();
        String nom = vista.textFieldNombres.getText();
        String ape = vista.textFieldApellidos.getText();
        String prof = vista.textFieldProf.getText();
        String cell = vista.textFieldCell.getText();
        String fijo = vista.textFieldFijo.getText();
        String dir = vista.textFieldDirec.getText();
        String banco = vista.textFieldBanco.getText();
        String numtar = vista.textFieldNumTar.getText();
        
        int diacli = Integer.parseInt(vista.textFieldDiaCli.getText());
        int mescli = Integer.parseInt(vista.textFieldMesCli.getText());
        int aniocli = Integer.parseInt(vista.textFieldAnioCli.getText());
        LocalDate fecNac = LocalDate.of(aniocli, mescli, diacli);

        int mesban = Integer.parseInt(vista.textFieldMesBan.getText());
        int anioban = Integer.parseInt(vista.textFieldAnioBan.getText());
        LocalDate fecCad = LocalDate.of(anioban,mesban,1);

        boolean afil;
        if(vista.rdbtnSi.isSelected()){
            afil = true;
        }
        else{
            afil = false;
        }

        LocalDate fecAf;
        if(afil){
            fecAf = LocalDate.now();
        }else{
            fecAf = null;
        }

        if(agregar){
            manejo.addValor(iden, nom, ape, fecNac, cell, fijo, dir, prof, banco, numtar, fecCad, afil, fecAf);
            return true;
        }
        else{
            if(manejo.modificarHuesped(iden, nom, ape, fecNac, cell, fijo, dir, prof, banco, numtar, fecCad, afil)){
                return true;
            }
        }

        return false;
    }

    public void limpiar(){
        vista.textFieldIden.setText(null);
        vista.textFieldNombres.setText(null);
        vista.textFieldApellidos.setText(null);
        vista.textFieldProf.setText(null);
        vista.textFieldCell.setText(null);
        vista.textFieldFijo.setText(null);
        vista.textFieldDirec.setText(null);
        vista.textFieldBanco.setText(null);
        vista.textFieldNumTar.setText(null);
        vista.textFieldAnioBan.setText(null);
        vista.textFieldAnioCli.setText(null);
        vista.textFieldDiaCli.setText(null);
        vista.textFieldMesBan.setText(null);
        vista.textFieldMesCli.setText(null);
        vista.rdbtnNo.setSelected(true);
    }

    public boolean cargarDatos(String iden){
        Huesped hues = manejo.getHuesped(iden);
        
        if(hues != null){
            vista.textFieldAnioBan.setText(hues.getTarjeta().getFechaCaducidad().getYear()+"");
            vista.textFieldAnioCli.setText(hues.getFechaNacimiento().getYear()+"");
            vista.textFieldApellidos.setText(hues.getApellido());
            vista.textFieldBanco.setText(hues.getTarjeta().getBancoEmisor());
            vista.textFieldCell.setText(hues.getTelefonoCelular());
            vista.textFieldDiaCli.setText(hues.getFechaNacimiento().getDayOfMonth()+"");
            vista.textFieldDirec.setText(hues.getDireccionOrigen());
            vista.textFieldFijo.setText(hues.getTelefonoFijo());
            vista.textFieldIden.setText(hues.getIdentificacion());
            vista.textFieldMesBan.setText(hues.getTarjeta().getFechaCaducidad().getMonthValue()+"");
            vista.textFieldMesCli.setText(hues.getFechaNacimiento().getMonthValue()+"");;
            vista.textFieldNombres.setText(hues.getNombre());
            vista.textFieldNumTar.setText(hues.getTarjeta().getNumeroTarjeta());
            vista.textFieldProf.setText(hues.getProfesion());
            return true;
        }

        return false;
    }

    public String verificacion(){
        String retorno = "Corregir :";
        boolean ced = false;
        if((String)vista.comboBoxIden.getSelectedItem() == "Cedula") ced = true;

        if(!Huesped.Validacion(vista.textFieldIden.getText(), ced)) retorno = retorno + " Identificacion.";
        if(vista.textFieldNombres.getText().length() < 3) retorno = retorno + " Nombres.";
        if(vista.textFieldApellidos.getText().length() < 3) retorno = retorno + " Apellidos.";
        if(vista.textFieldCell.getText().length() < 3) retorno = retorno + " Celular.";
        if(vista.textFieldDirec.getText().length() < 3) retorno = retorno + " Direccion.";
        if(vista.textFieldBanco.getText().length() < 3) retorno = retorno + " Banco.";
        if(vista.textFieldNumTar.getText().length() < 8) retorno = retorno + " Tarjeta.";

        try{
            int diacli = Integer.parseInt(vista.textFieldDiaCli.getText());
            int mescli = Integer.parseInt(vista.textFieldMesCli.getText());
            int aniocli = Integer.parseInt(vista.textFieldAnioCli.getText());
            LocalDate.of(aniocli, mescli, diacli);
        }
        catch(DateTimeException ex){
            retorno = retorno + " Fecha Nacimiento.";
        }

        try{
            int mesban = Integer.parseInt(vista.textFieldMesBan.getText());
            int anioban = Integer.parseInt(vista.textFieldAnioBan.getText());
            LocalDate.of(anioban,mesban,1);
        }
        catch(DateTimeException ex){
            retorno = retorno + " Fecha Caducidad.";
        }

        if(!retorno.equals("Corregir :")) return retorno;
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.btnRegistrar){
            String val = verificacion();
            String iden = vista.textFieldIden.getText();

            if(manejo.buscar(true,iden) == -1 && manejo.buscar(false,iden) == -1){
                if(val != null){
                    agregarModificar(true);
                    JOptionPane.showMessageDialog(null, "Huesped agregado.");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al agregar, "+val);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar, ya exite un huesped registrado con esa ID.");
            }
        }
        if(e.getSource() == vista.btnVer){
            if(cargarDatos(vista.textFieldIden.getText())){
                JOptionPane.showMessageDialog(null, "Datos Cargados.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error no se encontraron los datos.");
            }
        }
        if(e.getSource() == vista.btnLimpiar){
            limpiar();
        }
        if(e.getSource() == vista.btnModificar){
            String val =verificacion();
            if(val != null){
                if(agregarModificar(false)){
                    JOptionPane.showMessageDialog(null, "Huesped modificado.");
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
        if(e.getSource() == vista.btnListar){
            vistaLista.setVisible(true);
        }
        if(e.getSource() == vistaLista.btnCambiar){
            String iden = vista.textFieldIden.getText();
            boolean val = true;
            LocalDate fecha = null;

            int dia = Integer.parseInt(vistaLista.textDia.getText());
            int mes = Integer.parseInt(vistaLista.textMes.getText());
            int anio = Integer.parseInt(vistaLista.textAnio.getText());
            try{
                fecha = LocalDate.of(anio, mes, dia);
                val =true;
            }
            catch(DateTimeException timeE){
                val = false;
                JOptionPane.showMessageDialog(null, "Error al modificar fecha, fecha invalida.");
            }

            if(val){
                if(manejo.modificarAfiliacion(fecha, iden)){
                    JOptionPane.showMessageDialog(null, "Fehca modificada.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al modificar fecha, verifique los campos de texto.");
                }
            }
            
        }

        actializarTabla();
    }

}