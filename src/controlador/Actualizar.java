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

public class Actualizar {
    public void actualizarCliente(JTable tablaActualizar, Connection conn, int id, String nombre, String direccion){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_cliente");        
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");       
        
        tablaActualizar.setModel(modelo);
        String query = "UPDATE CLIENTE SET nombre="+nombre+", direccion="+direccion+" WHERE id_cliente="+id+"";
        Statement st;
        String datos[] = new String [3];
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);  
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tablaActualizar.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarVehiculo(JTable tablaActualizar, Connection conn){
        
    }
    public void actualizarFactura(JTable tablaActualizar, Connection conn){
        
    }
}
