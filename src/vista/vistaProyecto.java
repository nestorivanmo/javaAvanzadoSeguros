package vista;
import controlador.Conectar;
import controlador.CargarBD;
import controlador.Consultar;
import controlador.BuscarPor;
import java.sql.Connection;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class vistaProyecto extends javax.swing.JFrame {
    
    Conectar con;
    CargarBD carga = new CargarBD();
    Consultar consulta = new Consultar();
    BuscarPor busqueda = new BuscarPor();
    int selectedRow = 0;
    
    public vistaProyecto() {
        initComponents();
        
       radio1.setVisible(false);
       radio2.setVisible(false);      
       radio3.setVisible(false);
       txtBusqueda.setVisible(false);
        
       consultarPanel.setEnabled(false);
       listaMostrar.removeAllItems();
       listaMostrar.addItem("Todos los clientes");
       listaMostrar.addItem("Todas las facturas");
       listaMostrar.addItem("Todos los vehiculos");
       listaMostrar.addItem("Clientes con vehiculos");
       listaMostrar.addItem("Fechas poliza");
       listaMostrar.addItem("Poliza más alta");
       
       listaCampos.removeAllItems();
       listaCampos.addItem("Nombre");
       listaCampos.addItem("Dirección");
       listaCampos.addItem("Placas del vehículo");
       listaCampos.addItem("Costo poliza");
       listaCampos.addItem("Prima asegurada");
       elementoLabel.setText(listaCampos.getItemAt(listaCampos.getSelectedIndex()));
       
       
       elem1Label.setVisible(false);
       elem2Label.setVisible(false);
       elem3Label.setVisible(false);
       elem4Label.setVisible(false);
       elem5Label.setVisible(false);
       elem6Label.setVisible(false);
       elem7Label.setVisible(false);
       
       tf1.setVisible(false);
       tf2.setVisible(false);
       tf3.setVisible(false);
       tf4.setVisible(false);
       tf5.setVisible(false);
       tf6.setVisible(false);
       tf7.setVisible(false);
       
       
       tablaActualizar.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
           public void valueChanged(ListSelectionEvent event){
               
               selectedRow = tablaActualizar.getSelectedRow();
               if(clientesTButton.isSelected()){  
                   tf3.setText(tablaActualizar.getModel().getValueAt(selectedRow, 0).toString());
                   tf4.setText(tablaActualizar.getModel().getValueAt(selectedRow, 1).toString());
                   tf5.setText(tablaActualizar.getModel().getValueAt(selectedRow, 2).toString());
               }
               if(vehiculoTButton.isSelected()){                                      
                   tf3.setText(tablaActualizar.getModel().getValueAt(selectedRow, 0).toString());
                   tf4.setText(tablaActualizar.getModel().getValueAt(selectedRow, 1).toString());
                   tf5.setText(tablaActualizar.getModel().getValueAt(selectedRow, 2).toString());
                   tf6.setText(tablaActualizar.getModel().getValueAt(selectedRow, 3).toString());
               }
               if(polizaTButton.isSelected()){
                   tf1.setText(tablaActualizar.getModel().getValueAt(selectedRow, 0).toString());
                   tf2.setText(tablaActualizar.getModel().getValueAt(selectedRow, 1).toString());
                   tf3.setText(tablaActualizar.getModel().getValueAt(selectedRow, 2).toString());
                   tf4.setText(tablaActualizar.getModel().getValueAt(selectedRow, 3).toString());
                   tf5.setText(tablaActualizar.getModel().getValueAt(selectedRow, 4).toString());
                   tf6.setText(tablaActualizar.getModel().getValueAt(selectedRow, 5).toString());
                   tf7.setText(tablaActualizar.getModel().getValueAt(selectedRow, 6).toString());                   
               }
               if(facturaTButton.isSelected()){
                   tf3.setText(tablaActualizar.getModel().getValueAt(selectedRow, 0).toString());
                   tf4.setText(tablaActualizar.getModel().getValueAt(selectedRow, 1).toString());
               }
           }
       });
       
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        consultarPanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cargarButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        listaMostrar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        mostrarButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        listaCampos = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        elementoLabel = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        clientesTButton = new javax.swing.JToggleButton();
        vehiculoTButton = new javax.swing.JToggleButton();
        polizaTButton = new javax.swing.JToggleButton();
        facturaTButton = new javax.swing.JToggleButton();
        elem1Label = new javax.swing.JLabel();
        elem2Label = new javax.swing.JLabel();
        elem3Label = new javax.swing.JLabel();
        elem4Label = new javax.swing.JLabel();
        actualizarButton = new javax.swing.JButton();
        elem5Label = new javax.swing.JLabel();
        elem6Label = new javax.swing.JLabel();
        elem7Label = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaActualizar = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 163, 2));

        jButton1.setText("Conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Qué quieres hacer?");

        jLabel2.setText("Estado:");

        jButton2.setText("Desconectar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cargarButton.setText("Cargar Datos");
        cargarButton.setEnabled(false);
        cargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(cargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addComponent(cargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        consultarPanel.addTab("Iniciar", jPanel2);

        listaMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMostrarActionPerformed(evt);
            }
        });

        jLabel3.setText("¿Qué quieres ver?");

        jPanel6.setBackground(new java.awt.Color(178, 178, 178));

        jLabel4.setText("Datos arrojados");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaDatos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(tituloLabel)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(mostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(listaMostrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        consultarPanel.addTab("Consultar", jPanel5);

        jLabel9.setText("Buscar por...");

        listaCampos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCamposActionPerformed(evt);
            }
        });

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        elementoLabel.setText("Elemento");

        radio1.setText("0-50,000");

        radio2.setText("50,000-100,000");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        radio3.setText("100,000-300,000");

        javax.swing.GroupLayout txtDireccionLayout = new javax.swing.GroupLayout(txtDireccion);
        txtDireccion.setLayout(txtDireccionLayout);
        txtDireccionLayout.setHorizontalGroup(
            txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtDireccionLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaCampos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtDireccionLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio3)
                            .addComponent(radio2)
                            .addComponent(radio1))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addComponent(txtBusqueda)))
            .addGroup(txtDireccionLayout.createSequentialGroup()
                .addGroup(txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtDireccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(elementoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtDireccionLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txtDireccionLayout.setVerticalGroup(
            txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDireccionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(txtDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(listaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(elementoLabel)
                .addGap(3, 3, 3)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio1)
                .addGap(15, 15, 15)
                .addComponent(radio2)
                .addGap(18, 18, 18)
                .addComponent(radio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel9.setBackground(new java.awt.Color(175, 175, 175));

        jLabel5.setText("Datos arrojados");

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaBusqueda.setToolTipText("");
        jScrollPane4.setViewportView(tablaBusqueda);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        consultarPanel.addTab("Buscar", jPanel7);

        clientesTButton.setText("Clientes");
        clientesTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesTButtonActionPerformed(evt);
            }
        });

        vehiculoTButton.setText("Vehículos");
        vehiculoTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoTButtonActionPerformed(evt);
            }
        });

        polizaTButton.setText("Polizas");
        polizaTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polizaTButtonActionPerformed(evt);
            }
        });

        facturaTButton.setText("Facturas");
        facturaTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaTButtonActionPerformed(evt);
            }
        });

        elem1Label.setText("elem1");

        elem2Label.setText("elem2");

        elem3Label.setText("elem3");

        elem4Label.setText("elem4");

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        elem5Label.setText("elem5");

        elem6Label.setText("elem6");

        elem7Label.setText("elem7");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehiculoTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientesTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(polizaTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facturaTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(elem7Label)
                        .addGap(18, 18, 18)
                        .addComponent(tf7))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(elem3Label)
                                .addGap(18, 18, 18)
                                .addComponent(tf3))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(elem2Label)
                                .addGap(18, 18, 18)
                                .addComponent(tf2))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(elem1Label)
                                .addGap(18, 18, 18)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(elem4Label)
                        .addGap(18, 18, 18)
                        .addComponent(tf4))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(elem5Label)
                        .addGap(18, 18, 18)
                        .addComponent(tf5))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(elem6Label)
                        .addGap(18, 18, 18)
                        .addComponent(tf6))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elem1Label)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(clientesTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elem2Label)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elem3Label)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiculoTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elem4Label)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(polizaTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elem5Label)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elem6Label)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elem7Label)
                        .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(facturaTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizarButton))
        );

        jPanel11.setBackground(new java.awt.Color(175, 175, 175));

        tablaActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaActualizarKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tablaActualizar);

        jLabel6.setText("Selecciona el renglón a modificar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        consultarPanel.addTab("Actualizar", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultarPanel)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(consultarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //CONECTARSE A LA BD -> BOTON CONECTAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        con = new Conectar();
        Connection reg = con.getConnection();
        if(reg != null){        
            txtEstado.setText("Conectado");
            
                cargarButton.setEnabled(true);
              
            
        }else{
            txtEstado.setText("Error: intenta en unos minutos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection reg = con.getConnection();
        con.desconectar();
        reg = null;
        txtEstado.setText("Desconectado");
        cargarButton.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //BOTON PARA CARGAR DATOS A LA BD
    private void cargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarButtonActionPerformed
        if(carga.getEstadoCarga() == true){
                System.out.println("Los archivos XML ya están en la BD");
            }else{
                carga.cargar(con.getConnection());
                carga.setEstadoCargo(true);
                cargarButton.setEnabled(false);
                 consultarPanel.setEnabled(true);
            }
    }//GEN-LAST:event_cargarButtonActionPerformed

    private void listaMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMostrarActionPerformed

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        consulta.consultaBD(listaMostrar.getSelectedIndex(), con.getConnection(), tablaDatos);
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
     
        int r = 0;
        if(radio1.isSelected()){
            r = 1;
        }else if(radio2.isSelected()){
            r = 2;
        }else if(radio3.isSelected()){
            r = 3;
        }else{
            r = 0;
        }
        
        busqueda.buscar(listaCampos.getSelectedIndex(), con.getConnection(), tablaBusqueda, txtBusqueda.getText(), r);
         
        
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void listaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCamposActionPerformed
        
        elementoLabel.setText(listaCampos.getItemAt(listaCampos.getSelectedIndex()));
         
        if(listaCampos.getItemAt(listaCampos.getSelectedIndex()) == "Costo poliza" || listaCampos.getItemAt(listaCampos.getSelectedIndex()) == "Prima asegurada"){
            radio1.setVisible(true);
            radio2.setVisible(true);
            radio3.setVisible(true);
            txtBusqueda.setVisible(false);
        }else{
            txtBusqueda.setVisible(true);
            radio1.setVisible(false);
            radio2.setVisible(false);
            radio3.setVisible(false);
        }               
    }//GEN-LAST:event_listaCamposActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ActionPerformed

    private void clientesTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesTButtonActionPerformed
        
        if(clientesTButton.isSelected()){                                     
            facturaTButton.setVisible(false);
            polizaTButton.setVisible(false);
            vehiculoTButton.setVisible(false);
            consulta.mostrarTablaCliente(tablaActualizar, con.getConnection());          
            elem3Label.setVisible(true);
            elem4Label.setVisible(true);
            elem5Label.setVisible(true);
            elem3Label.setText("id_cliente");
            elem4Label.setText("nombre");
            elem5Label.setText("direccion");
            
            tf3.setVisible(true);
            tf4.setVisible(true);
            tf5.setVisible(true);

        }else{    
            
            DefaultTableModel model = (DefaultTableModel) tablaActualizar.getModel();
            model.setRowCount(0);
            facturaTButton.setVisible(true);
            polizaTButton.setVisible(true);
            vehiculoTButton.setVisible(true);
            elem3Label.setVisible(false);
            elem4Label.setVisible(false);
            elem5Label.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
        }
    }//GEN-LAST:event_clientesTButtonActionPerformed

    private void vehiculoTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoTButtonActionPerformed
        if(vehiculoTButton.isSelected()){        
            
            
            facturaTButton.setVisible(false);
            polizaTButton.setVisible(false);
            clientesTButton.setVisible(false);
            consulta.mostrarTodoVehiculo(tablaActualizar, con.getConnection());
            elem3Label.setVisible(true);
            elem4Label.setVisible(true);
            elem5Label.setVisible(true);
            elem6Label.setVisible(true);
            elem3Label.setText("id_vehiculo");
            elem4Label.setText("placa");
            elem5Label.setText("modelo");
            elem6Label.setText("marca");
            tf3.setVisible(true);
            tf4.setVisible(true);
            tf5.setVisible(true);
            tf6.setVisible(true);
           
        }else{                         
            DefaultTableModel model = (DefaultTableModel) tablaActualizar.getModel();
            model.setRowCount(0);
            facturaTButton.setVisible(true);
            polizaTButton.setVisible(true);
            clientesTButton.setVisible(true);
            elem4Label.setVisible(false);
            elem5Label.setVisible(false);
            elem3Label.setVisible(false);
            elem6Label.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            tf6.setVisible(false);
        }
    }//GEN-LAST:event_vehiculoTButtonActionPerformed

    private void polizaTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polizaTButtonActionPerformed
        if(polizaTButton.isSelected()){                                     
            facturaTButton.setVisible(false);
            vehiculoTButton.setVisible(false);
            clientesTButton.setVisible(false);
            consulta.mostrarTodoPoliza(tablaActualizar, con.getConnection());
            elem1Label.setVisible(true);
            elem2Label.setVisible(true);
            elem3Label.setVisible(true);
            elem4Label.setVisible(true);
            elem5Label.setVisible(true);
            elem6Label.setVisible(true);
            elem7Label.setVisible(true);            
            elem1Label.setText("id_poliza");
            elem2Label.setText("id_cliente_fk");
            elem3Label.setText("id_vehiculo_fk");
            elem4Label.setText("costoPoliza");
            elem5Label.setText("valorPrima");
            elem6Label.setText("fecha apertura");
            elem7Label.setText("fecha venc.");
            tf1.setVisible(true);
            tf2.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(true);
            tf5.setVisible(true);
            tf6.setVisible(true);
            tf7.setVisible(true);
            
           
        }else{          
            DefaultTableModel model = (DefaultTableModel) tablaActualizar.getModel();
            model.setRowCount(0);
            
            facturaTButton.setVisible(true);
            vehiculoTButton.setVisible(true);
            clientesTButton.setVisible(true);
            
            elem1Label.setVisible(false);
            elem2Label.setVisible(false);
            elem3Label.setVisible(false);
            elem4Label.setVisible(false);
            elem5Label.setVisible(false);
            elem6Label.setVisible(false);
            elem7Label.setVisible(false); 
            
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            tf5.setVisible(false);
            tf6.setVisible(false);
            tf7.setVisible(false);
        }
    }//GEN-LAST:event_polizaTButtonActionPerformed

    private void facturaTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaTButtonActionPerformed
        if(facturaTButton.isSelected()){                                     
            vehiculoTButton.setVisible(false);
            polizaTButton.setVisible(false);
            clientesTButton.setVisible(false);
            consulta.mostrarTablaFactura(tablaActualizar, con.getConnection());            
            elem3Label.setVisible(true);
            elem4Label.setVisible(true);
            elem3Label.setText("id_factrua");
            elem4Label.setText("monto");
            
            tf3.setVisible(true);
            tf4.setVisible(true);
           
        }else{    
            DefaultTableModel model = (DefaultTableModel) tablaActualizar.getModel();
            model.setRowCount(0);
            
            vehiculoTButton.setVisible(true);
            polizaTButton.setVisible(true);
            clientesTButton.setVisible(true);
           
            elem3Label.setVisible(false);
            elem4Label.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(false);
            
        }
    }//GEN-LAST:event_facturaTButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void tablaActualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaActualizarKeyPressed
        
    }//GEN-LAST:event_tablaActualizarKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton cargarButton;
    private javax.swing.JToggleButton clientesTButton;
    private javax.swing.JTabbedPane consultarPanel;
    private javax.swing.JLabel elem1Label;
    private javax.swing.JLabel elem2Label;
    private javax.swing.JLabel elem3Label;
    private javax.swing.JLabel elem4Label;
    private javax.swing.JLabel elem5Label;
    private javax.swing.JLabel elem6Label;
    private javax.swing.JLabel elem7Label;
    private javax.swing.JLabel elementoLabel;
    private javax.swing.JToggleButton facturaTButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> listaCampos;
    private javax.swing.JComboBox<String> listaMostrar;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JToggleButton polizaTButton;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JTable tablaActualizar;
    private javax.swing.JTable tablaBusqueda;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JPanel txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JToggleButton vehiculoTButton;
    // End of variables declaration//GEN-END:variables
}
