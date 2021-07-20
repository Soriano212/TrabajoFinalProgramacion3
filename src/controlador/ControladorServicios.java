package controlador;

import java.security.Provider.Service;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

import modelo.ManejoServicios;
import modelo.Servicio;
import vista.VistaServicios;


public class ControladorServicios extends AdaptadorListener {
    
    private VistaServicios vista;
    private ManejoServicios manejo;
    private DefaultTableModel modelTabla;
    private String seleccion = null;
    private Servicio serv;

    public ControladorServicios(VistaServicios vista){
        this.vista = vista;
        this.manejo = ManejoServicios.getManejoServicios();

        actualizarTabla();

        //Deshabilitamos valores
        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnQuitar.setEnabled(false);
        this.vista.btnPedir.setEnabled(false);
        this.vista.textCantidad.setEnabled(false);
        this.vista.tablePedidos.setVisible(false);

        //Ponemos a la escucha a los botones
        this.vista.btnPedir.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);

        //Declaramos los controladores de Texto
        ControladorTeclado soloNumeros = new ControladorTeclado(ControladorTeclado.tipo.Numeros);

        //Pnemos a la escucha a los TextField
        this.vista.textCantidad.addKeyListener(soloNumeros);
        this.vista.textCapacidad.addKeyListener(soloNumeros);

        //Pone a la escucha de Mouselistener a la tabla
        vista.tablePedidos.addMouseListener(this);
        vista.tableSeleccion.addMouseListener(this);
    }

    public int obtenerTipo(){

        if(seleccion.equals("Toallas")) return ManejoServicios.TIPO_TOALLA;
        if(seleccion.equals("Spas")) return ManejoServicios.TIPO_SPA;
        if(seleccion.equals("Parasoles")) return ManejoServicios.TIPO_PARASOL;
        if(seleccion.equals("Traslados")) return ManejoServicios.TIPO_TRASLADO;

        return -1;
    }

    public void actualizarTablaPedidos() {
        manejo = ManejoServicios.getManejoServicios();
        String col[] = {"Nombres", "Capacidad", "En Uso"};

        //System.out.println(seleccion);
        if(seleccion != null){
            //String data[][] = manejo.getMatrizDatos(obtenerTipo());
            //modelTabla = new DefaultTableModel(data, col);
            //vista.tableSeleccion.setModel(modelTabla);
        }

    }

    public void actualizarTabla() {
        manejo = ManejoServicios.getManejoServicios();
        String col[] = {"Nombres", "Capacidad", "En Uso"};

        String data[][] = manejo.getMatrizDatos();
        modelTabla = new DefaultTableModel(data, col);
        vista.tableSeleccion.setModel(modelTabla);

    }

    public void limpiar(){
        this.vista.textCantidad.setText(null);
        this.vista.textCapacidad.setText(null);

        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnQuitar.setEnabled(false);
        this.vista.btnPedir.setEnabled(false);
        this.vista.textCantidad.setEnabled(false);
        this.vista.tablePedidos.setVisible(false);
    }

    public boolean cargarDatos(){
        serv = manejo.getServicio(obtenerTipo());

        if(serv != null){
            vista.lblSeleccion.setText(serv.getNombre());
            vista.textCapacidad.setText(serv.getCapacidad()+"");

            this.vista.btnActualizar.setEnabled(true);
            this.vista.btnQuitar.setEnabled(true);
            this.vista.btnPedir.setEnabled(true);
            this.vista.textCantidad.setEnabled(true);
            this.vista.tablePedidos.setVisible(true);

            return true;
        }

        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnActualizar){
            String texto = vista.textCapacidad.getText();
            int cant = -1;
            if(!texto.equals("")) cant = Integer.parseInt(texto);

            if( manejo.getServicio(obtenerTipo()).setCapacidad(cant) ){
                JOptionPane.showMessageDialog(null, "Servicio Actualizar");
                limpiar();

            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualziar el servicio.");
            }
        }
        if(e.getSource() == vista.btnPedir){
            String texto = vista.textCantidad.getText();
            int cant = 0;
            if(texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Error al pedir el servicio.");
            }
            else{
                cant = Integer.parseInt(texto);
                if( manejo.getServicio(obtenerTipo()).setEnUso(cant+manejo.getServicio(obtenerTipo()).getEnUso()) ){
                    JOptionPane.showMessageDialog(null, "Servicio Pedido");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al pedir el servicio.");
                }
            }
        }
            
        if(e.getSource() == vista.btnQuitar){
            String texto = vista.textCantidad.getText();
            int cant = 0;
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "Error al devolver el servicio.");
            }
            else{
                cant = Integer.parseInt(texto);
                if( manejo.getServicio(obtenerTipo()).setEnUso(manejo.getServicio(obtenerTipo()).getEnUso()-cant) ){
                    JOptionPane.showMessageDialog(null, "Devolviendo Servicio");
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error al devolver el servicio.");
                }
            }
            
        }
        if(e.getSource() == vista.btnLimpiar){
            limpiar();
        }
        
        actualizarTabla();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.tableSeleccion){
            int sele = vista.tableSeleccion.getSelectedRow();
            limpiar();
            this.seleccion = (String)vista.tableSeleccion.getValueAt(sele, 0);
            cargarDatos();
            actualizarTabla();
        }
        if(e.getSource() == vista.tablePedidos){
            int seleccion = vista.tablePedidos.getSelectedRow();
            //int id = Integer.parseInt((String)vista.tableMesas.getValueAt(seleccion, 0));
            //cargarMesa(id);
        }
    }

}
