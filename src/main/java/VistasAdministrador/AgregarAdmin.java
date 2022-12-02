/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistasAdministrador;

/**
 *
 * @author Byron
 */
public class AgregarAdmin extends javax.swing.JPanel {

    /**
     * Creates new form Agregar
     */
    public AgregarAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextID = new javax.swing.JLabel();
        TextPass = new javax.swing.JLabel();
        TextRut = new javax.swing.JLabel();
        TextNombre = new javax.swing.JLabel();
        PanelTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Borde = new javax.swing.JPanel();
        FieldName4 = new javax.swing.JTextField();
        FieldPass = new javax.swing.JTextField();
        FieldRut = new javax.swing.JTextField();
        FieldID = new javax.swing.JTextField();
        AgregarButton = new javax.swing.JButton();
        LabelErrorPass = new javax.swing.JLabel();
        LabelErrorN = new javax.swing.JLabel();
        LabelErrorRut = new javax.swing.JLabel();
        LabelErrorID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(201, 234, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextID.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextID.setForeground(new java.awt.Color(76, 168, 207));
        TextID.setText("Identificador:");
        TextID.setMaximumSize(new java.awt.Dimension(100, 40));
        TextID.setPreferredSize(new java.awt.Dimension(100, 40));
        add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        TextPass.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextPass.setForeground(new java.awt.Color(76, 168, 207));
        TextPass.setText("Contraseña:");
        TextPass.setMaximumSize(new java.awt.Dimension(100, 40));
        TextPass.setPreferredSize(new java.awt.Dimension(100, 40));
        add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        TextRut.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextRut.setForeground(new java.awt.Color(76, 168, 207));
        TextRut.setText("Rut:");
        TextRut.setMaximumSize(new java.awt.Dimension(100, 40));
        TextRut.setPreferredSize(new java.awt.Dimension(100, 40));
        add(TextRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        TextNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextNombre.setForeground(new java.awt.Color(76, 168, 207));
        TextNombre.setText("Nombre:");
        TextNombre.setMaximumSize(new java.awt.Dimension(100, 40));
        TextNombre.setPreferredSize(new java.awt.Dimension(100, 40));
        add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        PanelTitulo.setBackground(new java.awt.Color(76, 168, 207));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 51));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Agregar nuevo administrador");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(PanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        Borde.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout BordeLayout = new javax.swing.GroupLayout(Borde);
        Borde.setLayout(BordeLayout);
        BordeLayout.setHorizontalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        BordeLayout.setVerticalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        add(Borde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 5));

        FieldName4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldName4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldName4.setBorder(null);
        FieldName4.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldName4.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldName4ActionPerformed(evt);
            }
        });
        add(FieldName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 30));

        FieldPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldPass.setBorder(null);
        FieldPass.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldPass.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPassActionPerformed(evt);
            }
        });
        add(FieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 30));

        FieldRut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldRut.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldRut.setBorder(null);
        FieldRut.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldRut.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRutActionPerformed(evt);
            }
        });
        add(FieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 30));

        FieldID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldID.setBorder(null);
        FieldID.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldID.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDActionPerformed(evt);
            }
        });
        add(FieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 30));

        AgregarButton.setBackground(new java.awt.Color(76, 168, 207));
        AgregarButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        AgregarButton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarButton.setText("Agregar");
        AgregarButton.setMaximumSize(new java.awt.Dimension(104, 40));
        AgregarButton.setPreferredSize(new java.awt.Dimension(104, 40));
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        add(AgregarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        LabelErrorPass.setForeground(new java.awt.Color(255, 0, 0));
        LabelErrorPass.setText("jLabel1");
        add(LabelErrorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 170, 20));

        LabelErrorN.setForeground(new java.awt.Color(255, 0, 0));
        LabelErrorN.setText("jLabel1");
        add(LabelErrorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 86, 170, 20));

        LabelErrorRut.setForeground(new java.awt.Color(255, 0, 0));
        LabelErrorRut.setText("jLabel1");
        add(LabelErrorRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 170, 20));

        LabelErrorID.setForeground(new java.awt.Color(255, 0, 0));
        LabelErrorID.setText("jLabel1");
        add(LabelErrorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 170, 20));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void FieldName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldName4ActionPerformed

    private void FieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPassActionPerformed

    private void FieldRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRutActionPerformed

    private void FieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIDActionPerformed

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        /*
        VALIDAR QUE SE HAYAN INGRESADO BIEN LOS DATOS --> Funciones de la clase
        */
    }//GEN-LAST:event_AgregarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JPanel Borde;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldName4;
    private javax.swing.JTextField FieldPass;
    private javax.swing.JTextField FieldRut;
    private javax.swing.JLabel LabelErrorID;
    private javax.swing.JLabel LabelErrorN;
    private javax.swing.JLabel LabelErrorPass;
    private javax.swing.JLabel LabelErrorRut;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JLabel TextID;
    private javax.swing.JLabel TextNombre;
    private javax.swing.JLabel TextPass;
    private javax.swing.JLabel TextRut;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
