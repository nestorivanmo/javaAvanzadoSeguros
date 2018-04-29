package modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ExtraerDatos {
    
    
    File clientes = new File("/home/nestorivanmo/Desktop/docs/Clientes.xml");
    File facturas = new File("/home/nestorivanmo/Desktop/docs/Facturas.xml");
    File vehiculos = new File("/home/nestorivanmo/Desktop/docs/Vehiculos.xml");
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    Node nodo;
    Element element;
    
    /*Document doc2 = documentBuilder.parse(facturas);
    Document doc3 = documentBuilder.parse(vehiculos);*/

    
   // NodeList listaFacturas = doc2.getElementsByTagName("factura");
    //NodeList listaVehiculos = doc3.getElementsByTagName("vehiculo");
            
     
     public String getCliente(int i, String tipo){
         
         String nombre = "@C";
         
         try{
             DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
             Document document = documentBuilder.parse(clientes);
             NodeList listaClientes = document.getElementsByTagName("cliente");             
             nodo = listaClientes.item(i);             
              if(nodo.getNodeType() == Node.ELEMENT_NODE){
                  element = (Element) nodo;
                  nombre = element.getElementsByTagName(tipo).item(0).getTextContent();
              }
              
         }catch(Exception e){System.out.println("Error al obtener nombre : "+ e.getMessage());}
         
         System.out.println("nombre es : " + nombre);
         
         return nombre;
     }
     
     public String getVehiculo(int i, String tipo){
         String elemento = "@V";
          try{
             DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
             Document document = documentBuilder.parse(vehiculos);
             NodeList listaClientes = document.getElementsByTagName("vehiculo");             
             nodo = listaClientes.item(i);             
              if(nodo.getNodeType() == Node.ELEMENT_NODE){
                  element = (Element) nodo;
                  elemento = element.getElementsByTagName(tipo).item(0).getTextContent();
              }
              
         }catch(Exception e){System.out.println("Error al obtener nombre : "+ e.getMessage());}
         return elemento;
     }
     
     public int getFactura(int i){
         int elemento = 10;
          try{
             DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
             Document document = documentBuilder.parse(facturas);
             NodeList listaClientes = document.getElementsByTagName("factura");             
             nodo = listaClientes.item(i);             
              if(nodo.getNodeType() == Node.ELEMENT_NODE){
                  element = (Element) nodo;
                  elemento = Integer.parseInt(element.getElementsByTagName("costo_total").item(0).getTextContent());
              }
              
         }catch(Exception e){System.out.println("Error al obtener facturas : "+ e.getMessage());}
         return elemento;
     }          
}
