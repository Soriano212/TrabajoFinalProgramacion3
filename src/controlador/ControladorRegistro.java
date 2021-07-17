package controlador;

import vista.Registro;
import vista.VentanaListaPersonas;

import java.awt.event.*;
import java.time.*;

import javax.swing.JOptionPane;

import modelo.ManejoHuespedes;

public class ControladorRegistro implements ActionListener{

    private Registro vista;
    private ManejoHuespedes manejo;
    private VentanaListaPersonas vistaLista;

    public ControladorRegistro(Registro vista){
        this.vista = vista;
        this.manejo = ManejoHuespedes.getListas();
        this.vistaLista = new VentanaListaPersonas();

        //Pone a la escucha a los botones
        vista.btnRegistrar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnListar.addActionListener(this);

        ControladorTeclado soloNumeros = new ControladorTeclado(ControladorTeclado.tipo.Numeros);
        ControladorTeclado soloLetras = new ControladorTeclado(ControladorTeclado.tipo.Letras);
        ControladorTeclado soloTexto = new ControladorTeclado(ControladorTeclado.tipo.Texto);
        ControladorTeclado soloIden = new ControladorTeclado(ControladorTeclado.tipo.Iden);

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
        vista.textFieldCell.setText(null);+
        vista.textFieldFijo.setText(null);
        vista.textFieldDirec.setText(null);
        vista.textFieldBanco.setText(null);
        vista.textFieldNumTar.setText(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== vista.btnRegistrar){
            if(agregarModificar(true)){
                JOptionPane.showMessageDialog(null, "Huesped agregado.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar, verifique los campos de texto.");
            }
        }

        if(e.getSource()== vista.btnVer){

        }

        if(e.getSource()== vista.btnLimpiar){

        }

        if(e.getSource()== vista.btnModificar){
            if(agregarModificar(false)){
                JOptionPane.showMessageDialog(null, "Huesped modificado.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al modificar, verifique los campos de texto.");
            }
        }
        if(e.getSource()== vista.btnListar){
            
        }
        
    }

}