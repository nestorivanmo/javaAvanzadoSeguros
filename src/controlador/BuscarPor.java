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
    
    
    
    public void buscar(int tipo, Connection conn, JTable tablaBusqueda, String elemento){
        switch(tipo){
            case 0: //NOMBRE
                buscarNombre(tablaBusqueda, conn, "nombre", elemento);
                break;
            case 1: //DIRECCION
                buscarNombre(tablaBusqueda, conn, "direccion", elemento);
                break;
            case 2: //PLACAS
                break;
            case 3://COSTO POLIZA
                break;
            case 4://PRIMA ASEGURADA
                break;
        }
    }
}
