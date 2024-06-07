/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.menu;

import com.login.Login;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sql.conexionsql;



/**
 *
 * @author Dell-Latitude
 */
public class categorias extends javax.swing.JFrame {
    conexionsql con = new conexionsql();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet res;
    
    public categorias() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttoncerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttagregar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttcategoria1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        carneButton = new javax.swing.JLabel();
        bebeButton = new javax.swing.JLabel();
        Bebidasbutton = new javax.swing.JLabel();
        EmbutidosButton = new javax.swing.JLabel();
        PanificadoButton = new javax.swing.JLabel();
        LacteosButton = new javax.swing.JLabel();
        HigieneButton = new javax.swing.JLabel();
        vestiButton = new javax.swing.JLabel();
        RotiButton = new javax.swing.JLabel();
        PescaderiaButton = new javax.swing.JLabel();
        despensaButton = new javax.swing.JLabel();
        MascotasButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        LimpiezaButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(239, 237, 237));
        jPanel2.setPreferredSize(new java.awt.Dimension(1302, 538));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 110, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Categorías");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, 592, 170));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Menú principal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 100, 198, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 700, 130));

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

        principal.setBackground(new java.awt.Color(65, 116, 221));
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\home.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Menú principal");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 40));

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

        buttagregar.setBackground(new java.awt.Color(66, 113, 209));
        buttagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttagregarMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\agregar.png")); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Agregar producto");

        javax.swing.GroupLayout buttagregarLayout = new javax.swing.GroupLayout(buttagregar);
        buttagregar.setLayout(buttagregarLayout);
        buttagregarLayout.setHorizontalGroup(
            buttagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttagregarLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttagregarLayout.setVerticalGroup(
            buttagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttagregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(buttagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\super.png")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 210));

        buttcategoria1.setBackground(new java.awt.Color(66, 113, 209));
        buttcategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttcategoria1MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\grocery_bag_shopping_bag_marketplace_icon_225105.png")); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Categorías");

        javax.swing.GroupLayout buttcategoria1Layout = new javax.swing.GroupLayout(buttcategoria1);
        buttcategoria1.setLayout(buttcategoria1Layout);
        buttcategoria1Layout.setHorizontalGroup(
            buttcategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttcategoria1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttcategoria1Layout.setVerticalGroup(
            buttcategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttcategoria1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(buttcategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 538));

        carneButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\carnes1.png")); // NOI18N
        carneButton.setText("Carnes");
        carneButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carneButtonMouseClicked(evt);
            }
        });
        jPanel2.add(carneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 110, 80));

        bebeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\bebe.png")); // NOI18N
        bebeButton.setText("Bebé");
        bebeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bebeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bebeButtonMouseClicked(evt);
            }
        });
        jPanel2.add(bebeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 110, 80));

        Bebidasbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\bebida.png")); // NOI18N
        Bebidasbutton.setText("Bebidas");
        Bebidasbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Bebidasbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BebidasbuttonMouseClicked(evt);
            }
        });
        jPanel2.add(Bebidasbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 110, 80));

        EmbutidosButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\embutido1.png")); // NOI18N
        EmbutidosButton.setText("Embutidos");
        EmbutidosButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EmbutidosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmbutidosButtonMouseClicked(evt);
            }
        });
        jPanel2.add(EmbutidosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 120, 80));

        PanificadoButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\pan.png")); // NOI18N
        PanificadoButton.setText("Panificados");
        PanificadoButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanificadoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanificadoButtonMouseClicked(evt);
            }
        });
        jPanel2.add(PanificadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 120, 80));

        LacteosButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\leche1.png")); // NOI18N
        LacteosButton.setText("Lácteos");
        LacteosButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LacteosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LacteosButtonMouseClicked(evt);
            }
        });
        jPanel2.add(LacteosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 110, 80));

        HigieneButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\higiene.png")); // NOI18N
        HigieneButton.setText("Higiene");
        HigieneButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HigieneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HigieneButtonMouseClicked(evt);
            }
        });
        jPanel2.add(HigieneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 110, 80));

        vestiButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\vestimenta.png")); // NOI18N
        vestiButton.setText("Vestimenta");
        vestiButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vestiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vestiButtonMouseClicked(evt);
            }
        });
        jPanel2.add(vestiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 120, 80));

        RotiButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\rotiseria.png")); // NOI18N
        RotiButton.setText("Rotisería");
        RotiButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RotiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RotiButtonMouseClicked(evt);
            }
        });
        jPanel2.add(RotiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 110, 80));

        PescaderiaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\pescaderia.png")); // NOI18N
        PescaderiaButton.setText("Pescadería");
        PescaderiaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PescaderiaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PescaderiaButtonMouseClicked(evt);
            }
        });
        jPanel2.add(PescaderiaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 120, 80));

        despensaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\despensa.png")); // NOI18N
        despensaButton.setText("Despensa");
        despensaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        despensaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                despensaButtonMouseClicked(evt);
            }
        });
        jPanel2.add(despensaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 80));

        MascotasButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\mascotas.png")); // NOI18N
        MascotasButton.setText("Mascotas");
        MascotasButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MascotasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MascotasButtonMouseClicked(evt);
            }
        });
        jPanel2.add(MascotasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, 80));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Producto", "ID producto", "Tipo Producto", "Precio", "Descripcion", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 650, 110));

        LimpiezaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell-Latitude\\Documents\\proyectoSoftware-master\\src\\main\\java\\com\\images\\limpieza1.png")); // NOI18N
        LimpiezaButton.setText("Limpieza");
        LimpiezaButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LimpiezaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaButtonMouseClicked(evt);
            }
        });
        jPanel2.add(LimpiezaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 110, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncerrarMouseClicked
        Login inicio = new Login();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttoncerrarMouseClicked

    private void principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseClicked
          MenuPrincipal menup = new MenuPrincipal();
            menup.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_principalMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void buttagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttagregarMouseClicked
        MenuCategorias menu = new MenuCategorias();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttagregarMouseClicked

    private void BebidasbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BebidasbuttonMouseClicked

    String sql = "SELECT * FROM productos WHERE tipo_producto = 'Bebida'";
    
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
        
    } catch (Exception e) {
    }//GEN-LAST:event_BebidasbuttonMouseClicked
    }
    private void LimpiezaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiezaButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Producto de limpieza'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_LimpiezaButtonMouseClicked

    private void LacteosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LacteosButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Lácteos'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_LacteosButtonMouseClicked

    private void EmbutidosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmbutidosButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Embutido'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_EmbutidosButtonMouseClicked

    private void PanificadoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanificadoButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Panificado'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_PanificadoButtonMouseClicked

    private void MascotasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MascotasButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Mascotas'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_MascotasButtonMouseClicked

    private void HigieneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HigieneButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Producto de higiene'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_HigieneButtonMouseClicked

    private void RotiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RotiButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Rotisería'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_RotiButtonMouseClicked

    private void PescaderiaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PescaderiaButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Pescadería'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_PescaderiaButtonMouseClicked

    private void vestiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vestiButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Vestimenta'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_vestiButtonMouseClicked

    private void despensaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_despensaButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Despensa'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_despensaButtonMouseClicked

    private void bebeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bebeButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Bebé'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_bebeButtonMouseClicked

    private void carneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carneButtonMouseClicked
        String sql = "SELECT * FROM productos WHERE tipo_producto = 'Carne'";
    
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
        
    } catch (Exception e) {
    }                                          
    }//GEN-LAST:event_carneButtonMouseClicked

    private void buttcategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttcategoria1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttcategoria1MouseClicked
  
    
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
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bebidasbutton;
    private javax.swing.JLabel EmbutidosButton;
    private javax.swing.JLabel HigieneButton;
    private javax.swing.JLabel LacteosButton;
    private javax.swing.JLabel LimpiezaButton;
    private javax.swing.JLabel MascotasButton;
    private javax.swing.JLabel PanificadoButton;
    private javax.swing.JLabel PescaderiaButton;
    private javax.swing.JLabel RotiButton;
    private javax.swing.JLabel bebeButton;
    private javax.swing.JPanel buttagregar;
    private javax.swing.JPanel buttcategoria1;
    private javax.swing.JPanel buttoncerrar;
    private javax.swing.JLabel carneButton;
    private javax.swing.JLabel despensaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principal;
    private javax.swing.JTable table;
    private javax.swing.JLabel vestiButton;
    // End of variables declaration//GEN-END:variables
}
