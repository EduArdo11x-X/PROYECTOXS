/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author EDU
 */
public class Modificar_representante extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_representante
     */
    public Modificar_representante() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        smujer = new javax.swing.JRadioButton();
        shombre = new javax.swing.JRadioButton();
        snobinario = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        edad_repre = new javax.swing.JSpinner();
        segundoapellido_repre = new javax.swing.JTextField();
        primerapellido_repre = new javax.swing.JTextField();
        segundonombre_repre = new javax.swing.JTextField();
        primernombre_repre = new javax.swing.JTextField();
        cedula_repre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correo_repre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        parentesco_repre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        calleprincipal_repre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        telefono_repre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        callesecundaria_repre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(210, 165, 130));
        jPanel4.setPreferredSize(new java.awt.Dimension(910, 487));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese la cedula del representante que desea modificar:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Primer nombre:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Segundo nombre:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Primer Apellido:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Segundo Apellido:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Sexo:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        smujer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        smujer.setText("Mujer");
        jPanel4.add(smujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 70, -1));

        shombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        shombre.setText("Hombre");
        jPanel4.add(shombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, -1));

        snobinario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        snobinario.setText("No Binario");
        jPanel4.add(snobinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Edad:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        edad_repre.setModel(new javax.swing.SpinnerNumberModel(18, 18, 80, 1));
        jPanel4.add(edad_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));
        jPanel4.add(segundoapellido_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, -1));

        primerapellido_repre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerapellido_repreActionPerformed(evt);
            }
        });
        jPanel4.add(primerapellido_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, -1));
        jPanel4.add(segundonombre_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, -1));
        jPanel4.add(primernombre_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, -1));

        cedula_repre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_repreActionPerformed(evt);
            }
        });
        cedula_repre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula_repreKeyTyped(evt);
            }
        });
        jPanel4.add(cedula_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo electronico:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));
        jPanel4.add(correo_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 160, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Parentesco:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        parentesco_repre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Hermano", "Tio", "Tia", "Abuelo", "Abuela" }));
        jPanel4.add(parentesco_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Calle principal:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 30));
        jPanel4.add(calleprincipal_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 160, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Telefono:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 20));
        jPanel4.add(telefono_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Calle Secundaria:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 20));
        jPanel4.add(callesecundaria_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 160, -1));

        jButton1.setBackground(java.awt.SystemColor.desktop);
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/deshacer.png"))); // NOI18N
        jButton1.setText("VOLVER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 110, 30));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/editar_1.png"))); // NOI18N
        jButton3.setText("MODIFICAR");
        jButton3.setBorder(null);
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jButton2.setBackground(java.awt.SystemColor.activeCaptionText);
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/lupa.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 50, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 740, 410));

        jPanel3.setBackground(new java.awt.Color(93, 127, 182));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setPreferredSize(new java.awt.Dimension(487, 487));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MODIFICAR REPRESENTANTE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 350, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primerapellido_repreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerapellido_repreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerapellido_repreActionPerformed

    private void cedula_repreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_repreActionPerformed
        boolean resultado;

        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_repreActionPerformed

    private void cedula_repreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_repreKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= 48 && aux <= 57;
        if (numeros == false) {
            System.out.println("Ingrese solo numeros" + evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_cedula_repreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Pag_adm vsar1 = new Pag_adm();
        vsar1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calleprincipal_repre;
    private javax.swing.JTextField callesecundaria_repre;
    private javax.swing.JTextField cedula_repre;
    private javax.swing.JTextField correo_repre;
    private javax.swing.JSpinner edad_repre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> parentesco_repre;
    private javax.swing.JTextField primerapellido_repre;
    private javax.swing.JTextField primernombre_repre;
    private javax.swing.JTextField segundoapellido_repre;
    private javax.swing.JTextField segundonombre_repre;
    private javax.swing.JRadioButton shombre;
    private javax.swing.JRadioButton smujer;
    private javax.swing.JRadioButton snobinario;
    private javax.swing.JTextField telefono_repre;
    // End of variables declaration//GEN-END:variables
}
