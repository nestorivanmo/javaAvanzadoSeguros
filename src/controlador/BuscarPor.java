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

public class BuscarPor {
    
    public void buscarNombre(JTable tablaBusqueda, Connection conn, String tipo, String nombre){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cliente");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");        
        
        tablaBusqueda.setModel(modelo);
        
        String query = "SELECT * FROM CLIENTE WHERE "+tipo+" = '"+nombre+"'";
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
            tablaBusqueda.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarV(JTable tablaBusqueda, Connection conn, String tipo, String nombre){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_vehiculo");
        modelo.addColumn("placa");
        modelo.addColumn("modelo");   
        modelo.addColumn("marca");
        
        tablaBusqueda.setModel(modelo);
        
        String query = "SELECT id_vehiculo, placa, modelo, marca FROM VEHICULO WHERE "+tipo+" = '"+nombre+"'";
        String datos[] = new String [4];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);  
                datos[2] = rs.getString(3);  
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            tablaBusqueda.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPoliza(JTable tablaBusqueda, Connection conn, int radio, String tipo){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_poliza");
        modelo.addColumn("id_cliente");
        modelo.addColumn("id_vehiculo");
        modelo.addColumn(tipo);
        
        tablaBusqueda.setModel(modelo);
        int costoMenor = 0, costoMayor = 0;
        switch(radio){
            case 1:
                costoMayor = 50000;
                costoMenor = 0;
                 break;
            case 2:
                 costoMayor = 100000;
                costoMenor = 50000;
                 break;
            case 3:
                costoMayor = 300000;
                costoMenor = 100000;
                 break;
        }
        
        
        String query = "SELECT id_poliza, id_cliente_fk, id_vehiculo_fk, "+tipo+" FROM POLIZA WHERE "+tipo+" < "+costoMayor+" AND "+tipo+" >= "+costoMenor+"";
        String datos[] = new String [4];
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);  
                datos[2] = rs.getString(3);  
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            tablaBusqueda.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscar(int tipo, Connection conn, JTable tablaBusqueda, String elemento, int radio){
        switch(tipo){
            case 0: //NOMBRE
                buscarNombre(tablaBusqueda, conn, "nombre", elemento);
                break;
            case 1: //DIRECCION
                buscarNombre(tablaBusqueda, conn, "direccion", elemento);
                break;
            case 2: //PLACAS
                buscarV(tablaBusqueda, conn, "placa", elemento);
                break;
            case 3://COSTO POLIZA
                buscarPoliza(tablaBusqueda, conn, radio, "costoPoliza");
                break;
            case 4://PRIMA ASEGURADA
                buscarPoliza(tablaBusqueda, conn, radio, "valorPrima");
                break;
        }
    }
}
