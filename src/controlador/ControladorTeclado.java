package controlador;

import java.awt.event.*;

public class ControladorTeclado implements KeyListener{

    public enum tipo {Numeros, Letras, Iden, Texto};
    private tipo selec;

    public ControladorTeclado(tipo selec){
        this.selec = selec;
    }

    @Override
    public void keyTyped(KeyEvent e) {//Solo selecciona unas teclas en especifico
        
        int eve = e.getKeyChar();

        switch(selec){
            case Numeros: {
                if(eve < 48 || eve >57) {
                    e.consume();
                }
            }
            break;
            case Letras: {
                if( !(eve >= 65 && eve <= 90) && !(eve >= 97 & eve <= 122) && (eve != 32) ) {
                    e.consume();
                }
            }
            break;
            case Iden: {
                if( !(eve >= 65 && eve <= 90) && !(eve >= 48 & eve <= 57) && !(eve >= 97 & eve <= 122) ) {
                    e.consume();
                }
            }
            break;
            case Texto: {
                if( !(eve >= 65 && eve <= 90)&&!(eve >= 97 && eve <= 122)&&!(eve >= 48 && eve <= 57) 
                && (eve != 32) && !(eve >= 44 && eve <= 46)) {
                    e.consume();
                }
            }
            break;
        }
        
    }

    //Sin usar

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    


}
