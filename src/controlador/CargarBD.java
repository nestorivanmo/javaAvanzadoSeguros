package controlador;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import modelo.ExtraerDatos;

public class CargarBD {
    private static PreparedStatement pps_Clientes = null;
    private static PreparedStatement pps_Vehiculos = null;
    private static PreparedStatement pps_Facturas = null;
    private static PreparedStatement pps_Polizas = null;
    
    private static ResultSet rs = null;
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "rotsen";
    private static final String url = "jdbc:mysql://localhost:3306/javaAvanzado";
    private Boolean cargo = false;
    
    private static ExtraerDatos ex = new ExtraerDatos();
    
    
    public void cargar(Connection conn){        
  
            if(conn != null){                
                //llenar BD                
                for(int i = 1; i < 5; i++){
                   cargarClientes(conn, i);                    
                   cargarFacturas(conn, i);
                   cargarVehiculos(conn, i); 
                   cargarPolizas(conn ,i);
                }              
            }
           
    }
    
    public void cargarClientes(Connection conn, int i){
      /* try{
            pps_Clientes = conn.prepareStatement("INSERT INTO CLIENTE (id_cliente, nombre, direccion ) VALUES (?,?,?)");
            pps_Clientes.setInt(1, i);
            pps_Clientes.setString(2, ex.getCliente((i - 1), "nombre"));
            pps_Clientes.setString(3, ex.getCliente((i - 1), "direccion"));
            pps_Clientes.executeUpdate();
            
        }catch(Exception e){System.out.println("Error al cargar clientes : " + e.getMessage());};*/            
       
    }
    
    public void cargarFacturas(Connection conn, int i){
        try{
            pps_Facturas = conn.prepareStatement("INSERT INTO FACTURA (id_factura, monto) VALUES (?,?)");
            pps_Facturas.setInt(1, i);
            pps_Facturas.setInt(2, ex.getFactura((i-1)));
            pps_Facturas.executeUpdate();
        }catch(SQLException e){System.out.println("Error al cargar facturas : "+ e.getMessage());}
    }
    
    public void cargarVehiculos(Connection conn, int i){     
        
        try{
            pps_Vehiculos = conn.prepareStatement("INSERT INTO VEHICULO (id_vehiculo, id_factura_fk, marca, modelo, placa) VALUES (?,?,?,?,?)");
            pps_Vehiculos.setInt(1, i);
            pps_Vehiculos.setInt(2, Integer.parseInt(ex.getVehiculo((i-1), "id_factura")));
            pps_Vehiculos.setString(3, ex.getVehiculo((i-1), "marca"));
            pps_Vehiculos.setString(4, ex.getVehiculo((i-1), "modelo"));
            pps_Vehiculos.setString(5, ex.getVehiculo((i-1), "placas"));
            pps_Vehiculos.executeUpdate();
        }catch(SQLException e){System.out.println("Error al cargar vehiculos : " + e.getMessage());};
    }
    
    public void cargarPolizas(Connection conn, int i){
        
        Random rand = new Random();
        int  n = rand.nextInt(4) + 1;
       
        try{
            pps_Polizas = conn.prepareCall("INSERT INTO POLIZA (id_poliza, id_cliente_fk, id_vehiculo_fk, costoPoliza, valorPrima) VALUES (?,?,?,?,?)");
            pps_Polizas.setInt(1, i);
            pps_Polizas.setInt(2, i);
            pps_Polizas.setInt(3, n);
            pps_Polizas.setDouble(4, calcularPoliza(conn, i, n));
            pps_Polizas.setDouble(5, calcularValorPrima(conn,i,n));
            pps_Polizas.executeUpdate();
            
        }catch(SQLException e){System.out.println("Eror al cargar polizas : " + e.getMessage());};
    }
    
    public double calcularPoliza(Connection conn, int i, int id_veh){
        double poliza = 0;
        double v = (6.67 * 12) / 100;
        try{
            String sql = "SELECT FACTURA.monto FROM FACTURA INNER JOIN VEHICULO ON FACTURA.id_factura = " + id_veh;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                poliza = rs.getInt(1) * v;
            }
        }catch(SQLException e){System.out.println("Error al calcular poliza : " + e.getMessage());};
       return poliza;
    }
    
    public double calcularValorPrima(Connection conn, int i, int id_veh){
        double prima = 0;
        double v = 0.85;
        try{
            String sql = "SELECT FACTURA.monto FROM FACTURA INNER JOIN VEHICULO ON FACTURA.id_factura = " + id_veh;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                prima = rs.getInt(1) * v;
            }
        }catch(SQLException e){System.out.println("Error al calcular poliza : " + e.getMessage());};
       return prima;
    }
    
    public Boolean getEstadoCarga(){
        return cargo;
    }
    
    public void setEstadoCargo(Boolean es){
        cargo = es;
    }
}
