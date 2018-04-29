package controlador;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import modelo.ExtraerDatos;

public class CargarBD {
    private static PreparedStatement pps = null;
    private static ResultSet rs = null;
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "rotsen";
    private static final String url = "jdbc:mysql://localhost:3306/javaAvanzado";
    private Boolean cargo = false;
    private static ExtraerDatos ex;
    
    public void cargar(){
        conn = null;
       try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                pps = conn.prepareStatement("INSERT INTO CLIENTE (id_cliente, nombre, direccion ) VALUES (?,?,?)");
                pps.setInt(1,1);
                pps.setString(2, "NESTOR");
                pps.setString(3, "xotepingo");
                pps.executeUpdate();   
            }
           System.out.println("Se cargaron los archivos XML con éxito");
       }catch(ClassNotFoundException | SQLException e){System.out.println("Error al cargar datos : " + e.getMessage());}
    }
    
    public Boolean getEstadoCarga(){
        return cargo;
    }
    
    public void setEstadoCargo(Boolean es){
        cargo = es;
    }
}
