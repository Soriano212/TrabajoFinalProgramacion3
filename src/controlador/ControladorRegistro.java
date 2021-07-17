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
        

        
    }

}