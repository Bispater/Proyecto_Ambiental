/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaMain;

public class RegistroUsuario extends javax.swing.JFrame {

    TiposUsuarios Regresar = new TiposUsuarios();
    
    public RegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        Borde = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TituloPrincipal = new javax.swing.JLabel();
        RegistrarButton = new javax.swing.JButton();
        TextUserName = new javax.swing.JLabel();
        TextRut = new javax.swing.JLabel();
        LabelCiudad = new javax.swing.JLabel();
        FieldPass = new javax.swing.JTextField();
        FieldName1 = new javax.swing.JTextField();
        FieldRUT = new javax.swing.JTextField();
        TextErrorUsuario = new javax.swing.JLabel();
        TextErrorRut = new javax.swing.JLabel();
        TextErrorPass = new javax.swing.JLabel();
        TextPass1 = new javax.swing.JLabel();
        FieldCiudad = new javax.swing.JTextField();
        TextErrorCiudad = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(201, 234, 253));

        Borde.setBackground(new java.awt.Color(76, 168, 207));

        ExitButton.setBackground(new java.awt.Color(76, 168, 207));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Regresar");
        ExitButton.setBorder(null);
        ExitButton.setBorderPainted(false);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.setMinimumSize(new java.awt.Dimension(78, 28));
        ExitButton.setPreferredSize(new java.awt.Dimension(78, 28));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BordeLayout = new javax.swing.GroupLayout(Borde);
        Borde.setLayout(BordeLayout);
        BordeLayout.setHorizontalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordeLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BordeLayout.setVerticalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TituloPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(0, 0, 102));
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("RecyPoint");
        TituloPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        RegistrarButton.setBackground(new java.awt.Color(76, 168, 207));
        RegistrarButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        RegistrarButton.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarButton.setText("Registrar");
        RegistrarButton.setMaximumSize(new java.awt.Dimension(105, 40));
        RegistrarButton.setPreferredSize(new java.awt.Dimension(105, 40));
        RegistrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarButtonActionPerformed(evt);
            }
        });

        TextUserName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextUserName.setForeground(new java.awt.Color(76, 168, 207));
        TextUserName.setText("Nombre de usuario:");
        TextUserName.setMaximumSize(new java.awt.Dimension(200, 40));
        TextUserName.setPreferredSize(new java.awt.Dimension(200, 40));

        TextRut.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextRut.setForeground(new java.awt.Color(76, 168, 207));
        TextRut.setText("RUT:");
        TextRut.setMaximumSize(new java.awt.Dimension(100, 40));
        TextRut.setPreferredSize(new java.awt.Dimension(100, 40));

        LabelCiudad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LabelCiudad.setForeground(new java.awt.Color(76, 168, 207));
        LabelCiudad.setText("Ciudad:");
        LabelCiudad.setMaximumSize(new java.awt.Dimension(100, 40));
        LabelCiudad.setPreferredSize(new java.awt.Dimension(100, 40));

        FieldPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldPass.setBorder(null);
        FieldPass.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldPass.setPreferredSize(new java.awt.Dimension(140, 35));

        FieldName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldName1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldName1.setBorder(null);
        FieldName1.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldName1.setPreferredSize(new java.awt.Dimension(140, 35));

        FieldRUT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldRUT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldRUT.setBorder(null);
        FieldRUT.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldRUT.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldRUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRUTActionPerformed(evt);
            }
        });

        TextErrorUsuario.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        TextErrorUsuario.setText("jLabel1");

        TextErrorRut.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorRut.setForeground(new java.awt.Color(255, 0, 0));
        TextErrorRut.setText("jLabel2");

        TextErrorPass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorPass.setForeground(new java.awt.Color(255, 0, 0));
        TextErrorPass.setText("jLabel3");
        TextErrorPass.setMaximumSize(new java.awt.Dimension(37, 22));

        TextPass1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextPass1.setForeground(new java.awt.Color(76, 168, 207));
        TextPass1.setText("Contraseña:");
        TextPass1.setMaximumSize(new java.awt.Dimension(100, 40));
        TextPass1.setPreferredSize(new java.awt.Dimension(100, 40));

        FieldCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldCiudad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldCiudad.setBorder(null);
        FieldCiudad.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldCiudad.setPreferredSize(new java.awt.Dimension(140, 35));

        TextErrorCiudad.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorCiudad.setForeground(new java.awt.Color(255, 0, 0));
        TextErrorCiudad.setText("jLabel3");
        TextErrorCiudad.setMaximumSize(new java.awt.Dimension(37, 22));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Borde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextErrorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextErrorPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextErrorRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextErrorCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TextPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(RegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Borde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TextPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        Regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void FieldRUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRUTActionPerformed

    private void RegistrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButtonActionPerformed
        Regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Borde;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FieldCiudad;
    private javax.swing.JTextField FieldName1;
    private javax.swing.JTextField FieldPass;
    private javax.swing.JTextField FieldRUT;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LabelCiudad;
    private javax.swing.JButton RegistrarButton;
    private javax.swing.JLabel TextErrorCiudad;
    private javax.swing.JLabel TextErrorPass;
    private javax.swing.JLabel TextErrorRut;
    private javax.swing.JLabel TextErrorUsuario;
    private javax.swing.JLabel TextPass1;
    private javax.swing.JLabel TextRut;
    private javax.swing.JLabel TextUserName;
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
