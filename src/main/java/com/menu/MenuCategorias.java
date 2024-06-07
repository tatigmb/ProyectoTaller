/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.menu;

import com.login.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.conexionsql;

/**
 *
 * @author Dell-Latitude
 */
public class MenuCategorias extends javax.swing.JFrame {
    
    conexionsql con = new conexionsql();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet res;
    
    
    public MenuCategorias() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }
    void consultar(){
        String sql = "select * from productos";
        
        try {
            conect = con.getConnection();
            st = conect.createStatement();
            res = st.executeQuery(sql);
            Object[] producto = new Object[6];
            modelo = (DefaultTableModel) table.getModel();
            modelo.setRowCount(0);
            while (res.next()){
                producto [0] = res.getString("nombre");
                producto [1] = res.getInt("id_producto");
                producto [2] = res.getString("tipo_producto");
                producto [3] = res.getFloat("precio");
                producto [4] = res.getString("descripcion");
                producto [5] = res.getInt("cantidad");
                
                modelo.addRow(producto);
            }
            table.setModel(modelo);
        }catch (Exception e){
            
        }
    }
    void Insertar(){
        String nom = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        String tipo = (String) categoriasbox.getSelectedItem();
        float prec = Float.parseFloat(txtPrecio.getText());
        String desc = txtDescripcion.getText();
        int cant = Integer.parseInt(txtCantidad.getText());
        
        try{
            if(nom.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan cargar datos");
                LimpiarTabla();
            }else{
                String sql = "insert into productos(id_producto,nombre,tipo_producto,cantidad,precio,descripcion) values ('"+id+"','"+nom+"','"+tipo+"','"+cant+"','"+prec+"','"+desc+"')";
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto cargado al sistema");
                LimpiarTabla();
            }
        }catch(Exception e){
            }     
    }
    void Modificar(){
        String nom = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        String tipo = (String) categoriasbox.getSelectedItem();
        float prec = Float.parseFloat(txtPrecio.getText());
        String desc = txtDescripcion.getText();
        int cant = Integer.parseInt(txtCantidad.getText());
        
        try{
            if(nom.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan cargar datos");
                LimpiarTabla();
            }else{
                String sql = "Update productos set id_producto='"+id+"',nombre='"+nom+"',tipo_producto='"+tipo+"',cantidad='"+cant+"',precio='"+prec+"',descripcion='"+desc+"' where id_producto="+id;
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto modificado");
                LimpiarTabla();
            }
        }catch(Exception e){
         }
    }
    void Eliminar(){
        int fila = table.getSelectedRow();
        try{
            if(fila<0){
            JOptionPane.showMessageDialog(null, "El producto no fue seleccionado");
            LimpiarTabla();
            }else{
                int id = (int) table.getValueAt(fila, 1);
                String sql= "Delete from productos where id_producto=" +id;
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                LimpiarTabla();
                
            }
        }catch(Exception e){
            
        }
    }
    void LimpiarTabla(){
        for(int i = 0; i <= table.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttoncerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        agregarbutton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        categoriasbutton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        categoriasbox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        insertarbutton = new javax.swing.JButton();
        editarbutton = new javax.swing.JButton();
        eliminarbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuperMarket");

        panel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(239, 237, 237));
        jPanel2.setPreferredSize(new java.awt.Dimension(1302, 538));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 110, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Menú principal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 100, 198, 30));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel12.setText("Registro de productos");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 550, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 700, 130));

        jPanel3.setBackground(new java.awt.Color(71, 110, 188));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttoncerrar.setBackground(new java.awt.Color(66, 113, 209));
        buttoncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncerrarMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\logout.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cerrar Sesión");

        javax.swing.GroupLayout buttoncerrarLayout = new javax.swing.GroupLayout(buttoncerrar);
        buttoncerrar.setLayout(buttoncerrarLayout);
        buttoncerrarLayout.setHorizontalGroup(
            buttoncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttoncerrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttoncerrarLayout.setVerticalGroup(
            buttoncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttoncerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buttoncerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(buttoncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 40));

        jPanel5.setBackground(new java.awt.Color(65, 116, 221));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\home.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Menú principal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 40));

        jPanel6.setBackground(new java.awt.Color(81, 127, 221));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\stock1.png")); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel9.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Control Stock");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        agregarbutton.setBackground(new java.awt.Color(66, 113, 209));
        agregarbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarbuttonMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\agregar.png")); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Agregar producto");

        javax.swing.GroupLayout agregarbuttonLayout = new javax.swing.GroupLayout(agregarbutton);
        agregarbutton.setLayout(agregarbuttonLayout);
        agregarbuttonLayout.setHorizontalGroup(
            agregarbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarbuttonLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        agregarbuttonLayout.setVerticalGroup(
            agregarbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarbuttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(agregarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\super.png")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 210));

        categoriasbutton.setBackground(new java.awt.Color(66, 113, 209));
        categoriasbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriasbuttonMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\grocery_bag_shopping_bag_marketplace_icon_225105.png")); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel18.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel18.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Categorías");

        javax.swing.GroupLayout categoriasbuttonLayout = new javax.swing.GroupLayout(categoriasbutton);
        categoriasbutton.setLayout(categoriasbuttonLayout);
        categoriasbuttonLayout.setHorizontalGroup(
            categoriasbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriasbuttonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        categoriasbuttonLayout.setVerticalGroup(
            categoriasbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriasbuttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(categoriasbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 538));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Producto:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("ID producto");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 170, -1));

        categoriasbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorías", "Bebida", "Producto de limpieza", "Carne", "Embutido", "Lácteos", "Panificado", "Producto de higiene", "Vestimenta", "Rotisería", "Pescadería", "Despensa", "Mascotas", "Bebé", " " }));
        categoriasbox.setOpaque(true);
        jPanel2.add(categoriasbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 200, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tipo de producto");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Cantidad ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 190, -1));

        table.setBackground(new java.awt.Color(107, 145, 222));
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "ID producto", "Tipo de producto", "Precio", "Descripción", "Cantidad"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(102, 153, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 670, 150));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Precio unidad");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 200, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Descripción de producto");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 180, -1));

        insertarbutton.setBackground(new java.awt.Color(204, 204, 204));
        insertarbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        insertarbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\inser1.png")); // NOI18N
        insertarbutton.setText("Insertar");
        insertarbutton.setBorder(null);
        insertarbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarbuttonMouseClicked(evt);
            }
        });
        insertarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(insertarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 91, 46));

        editarbutton.setBackground(new java.awt.Color(204, 204, 204));
        editarbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editarbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\edit1.png")); // NOI18N
        editarbutton.setText("Editar");
        editarbutton.setBorder(null);
        editarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(editarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 88, 46));

        eliminarbutton.setBackground(new java.awt.Color(204, 204, 204));
        eliminarbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\eliminar.png")); // NOI18N
        eliminarbutton.setText("Eliminar");
        eliminarbutton.setBorder(null);
        eliminarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 80, 46));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncerrarMouseClicked
         Login inicio = new Login();
            inicio.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_buttoncerrarMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        MenuPrincipal menup = new MenuPrincipal();
            menup.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void agregarbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarbuttonMouseClicked
       MenuCategorias menu = new MenuCategorias();
            menu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_agregarbuttonMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void insertarbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarbuttonMouseClicked

    private void insertarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarbuttonActionPerformed
        Insertar();
        consultar();
    }//GEN-LAST:event_insertarbuttonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      int fila = table.getSelectedRow();
      if(fila== -1){
          JOptionPane.showMessageDialog(null, "No seleccionó fila");
      }else{
          String nom = (String) table.getValueAt(fila, 0);
          int id = Integer.parseInt((String) table.getValueAt(fila, 1).toString());
          String tipo = (String) table.getValueAt(fila, 2);
          float prec = Float.parseFloat((String) table.getValueAt(fila, 3).toString());
          String desc = (String) table.getValueAt(fila, 4);
          int cant = Integer.parseInt((String) table.getValueAt(fila, 5).toString());
          
          txtNombre.setText(nom);
          txtId.setText(""+id);
          categoriasbox.setSelectedItem(tipo);
          txtPrecio.setText(""+prec);
          txtDescripcion.setText(desc);
          txtCantidad.setText(""+cant);
      }
    }//GEN-LAST:event_tableMouseClicked

    private void editarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbuttonActionPerformed
        Modificar();
        consultar();
    }//GEN-LAST:event_editarbuttonActionPerformed

    private void eliminarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbuttonActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_eliminarbuttonActionPerformed

    private void categoriasbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasbuttonMouseClicked
       categorias cate = new categorias();
            cate.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_categoriasbuttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarbutton;
    private javax.swing.JPanel buttoncerrar;
    private javax.swing.JComboBox<String> categoriasbox;
    private javax.swing.JPanel categoriasbutton;
    private javax.swing.JButton editarbutton;
    private javax.swing.JButton eliminarbutton;
    private javax.swing.JButton insertarbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
