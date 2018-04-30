package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consultar {
    
    public void mostrarTablaCliente(JTable tabladatos, Connection conn){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cliente");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");
        
        tabladatos.setModel(modelo);
        
        String query = "SELECT * FROM CLIENTE";
        String datos[] = new String [3];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void mostrarTablaFactura(JTable tabladatos, Connection conn){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_factura");
        modelo.addColumn("monto");
        
        tabladatos.setModel(modelo);
        
        String query = "SELECT * FROM FACTURA";
        String datos[] = new String [2];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);                
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
     public void mostrarTablaPoliza(JTable tabladatos, Connection conn){
        DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("id_poliza");
        modelo.addColumn("fecha apertura");
        modelo.addColumn("fecha vencimiento");
        
        tabladatos.setModel(modelo);
        
        String query = "SELECT id_poliza, FECHA_APERTURA, FECHA_VENCIMIENOT FROM POLIZA";
        String datos[] = new String [3];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);                
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
    public void mostrarTablaClienteVehiculo1(JTable tabladatos, Connection conn){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cliente");
        modelo.addColumn("nombre");
        modelo.addColumn("placa");
        modelo.addColumn("modelo");
        modelo.addColumn("monto");       
        
        tabladatos.setModel(modelo);
        
        String query = "SELECT CLIENTE.id_cliente, CLIENTE.nombre, VEHICULO.placa, VEHICULO.modelo, FACTURA.monto"
                + " FROM CLIENTE INNER JOIN POLIZA ON CLIENTE.id_cliente = POLIZA.id_cliente_fk"
                + "INNER JOIN VEHICULO on POLIZA.id_vehiculo_fk = VEHICULO.id_vehiculo"
                + "INNER JOIN FACTURA ON FACTURA.id_factura = VEHICULO.id_vehiculo";
        String datos[] = new String [5];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);  
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
    public void consultaBD(int i, Connection conn, JTable tabladatos){
        switch(i){
            case 0:
                mostrarTablaCliente(tabladatos, conn);
                break;
            case 1:
                mostrarTablaFactura(tabladatos, conn);
                break;
            case 2:
                mostrarTablaClienteVehiculo1(tabladatos, conn);
                break;
            case 3:
                mostrarTablaPoliza(tabladatos, conn);
                break;
        }
    }
    
}