package controlador;

import vista.Registro;
import java.awt.event.*;

public class ControladorRegistro implements ActionListener{

    private Registro vista;

    public ControladorRegistro(Registro vista){
        this.vista = vista;

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

    @Override
    public void actionPerformed(ActionEvent e) {
            String iden = vista.textFieldIden.getText();
            String nom = vista.textFieldNombres.getText();
            String ape = vista.textFieldApellidos.getText();
            String prof = vista.textFieldProf.getText();
            String diacli = vista.textFieldDiaCli.getText();
            String cell = vista.textFieldCell.getText();
            String fijo = vista.textFieldFijo.getText();
            String dir = vista.textFieldDirec.getText();
            String mescli = vista.textFieldMesCli.getText();
            String aniocli = vista.textFieldAnioCli.getText();
            String banco = vista.textFieldBanco.getText();
            String mesban = vista.textFieldMesBan.getText();
            String anioban = vista.textFieldAnioBan.getText();
            String numtar = vista.textFieldNumTar.getText();
        
        if(e.getSource()== vista.btnRegistrar){
            
            
        }
        if(e.getSource()== vista.btnVer){




        }
        if(e.getSource()== vista.btnLimpiar){
            



        }
        if(e.getSource()== vista.btnModificar){
            



        }
        if(e.getSource()== vista.btnListar){
            



        }












        
    }

}