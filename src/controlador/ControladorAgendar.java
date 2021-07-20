package controlador;

import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuEvent;

import modelo.Cabana;
import modelo.ManejoAreas;
import modelo.ManejoHuespedes;
import modelo.Mesa;
import modelo.Piscina;
import modelo.Restaurante;
import vista.VentanaListaPersonas;
import vista.VistaAgendar;

public class ControladorAgendar  extends AdaptadorListener{
    
    private VistaAgendar vista;
    private VentanaListaPersonas vistaListaPer;
    private ManejoAreas manejo;
    private ManejoHuespedes manejoPer;
    private DefaultTableModel modelTabla;
    private String nombreLeer;
    private Restaurante res;

    public ControladorAgendar(VistaAgendar vista){
        this.vista = vista;
        this.vistaListaPer = new VentanaListaPersonas();
        vistaListaPer.setSize(702, 500);
        this.manejo = ManejoAreas.getManejoAreas();
        this.manejoPer = ManejoHuespedes.getListas();

        //actualizarTabla();

        //Deshabilitamos valores

        this.vista.btnQuitar.setEnabled(false);
        this.vista.tableMesas.setVisible(false);

        //Ponemos a la escucha a los botones
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);
        this.vista.btnListar.addActionListener(this);
        this.vista.btnListarAgenda.addActionListener(this);

        //Declaramos los controladores de Texto
        ControladorTeclado soloNumeros = new ControladorTeclado(ControladorTeclado.tipo.Numeros);

        //Pnemos a la escucha a los TextField
        this.vista.textDia.addKeyListener(soloNumeros);
        this.vista.textMes.addKeyListener(soloNumeros);
        this.vista.textAnio.addKeyListener(soloNumeros);

        //Pone a la escucha de Mouselistener a la tabla
        vista.tableSeleccion.addMouseListener(this);
        vista.tableMesas.addMouseListener(this);

    }

    

}

