package Interfaces;

import Clases.Representante;
import Clases.Validaciones;
//import com.db4o.Db4o;
//import com.db4o.ObjectContainer;
//import com.db4o.ObjectSet;

//import com.db4o.Db4o;
//import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import proyectoxs.PROYECTOXS;


public class Registro_representante extends javax.swing.JFrame {

    String Cedula = "";
    String Primer_nom = "";
    String Segundo_Nom = "";
    String Primer_Ape = "";
    String Segundo_Ape = "";
    String Calle_principal = "";
    String Calle_Secundaria = "";
    String Sexo = "";
    int Edad = 0;
     String Telefono_repre;
     String Correo_Electronico_repre;
     String Parentesco_repre;

    /**
     * Creates new form Registro_representante
     */
    public Registro_representante() {
        initComponents();
    }
    /*

    public void Crear_R(ObjectContainer Base) {
        Validaciones miValidaciones = new Validaciones();
        if (validarCampos(Base)) {

            Representante Rnuevo = new Representante( Telefono_repre,  Correo_Electronico_repre,  Parentesco_repre,  Cedula,  Primer_nom,  Segundo_Nom,  Primer_Ape,  Segundo_Ape,  Calle_principal,  Calle_Secundaria,Sexo, Edad);

            if (Comprobar_Representante(Base, Cedula) == 0) {
                Base.set(Rnuevo);
                JOptionPane.showMessageDialog(null, "El estudiante se guardo correctamente");
                LimpiarCampos();
            } else {

                JOptionPane.showMessageDialog(null, "El estudiante ya existe");
            }

            jTFidestudiante.setText("");

        }
    }
    
    public static int Comprobar_Representante(ObjectContainer Base, String Cedula) {

        Representante Rbuscar = new Representante(null,  null,  null,  Cedula,  null,  null,  null,  null,  null,  null,null, 0);

        ObjectSet result = Base.get(Rbuscar);

        return result.size();
    }

public boolean validarCampos(ObjectContainer Base) {
        
    }

public void LimpiarCampos() {
        
        
        cedula_repre.setText("");
        primernombre_repre.setText("");
        segundonombre_repre.setText("");
        primerapellido_repre.setText("");
        segundoapellido_repre.setText("");
        calleprincipal_repre.setText("");
        callesecundaria_repre.setText("");
        telefono_repre.setText("");;
      correo_repre.setText("");;
      parentesco_repre.setSelectedIndex(0);
      edad_repre.setValue(18);
      //shombre.clearSelection();

    }


    public void asignarvariables(ObjectContainer Base) {
        Cedula = cedula_repre.getText();
        Primer_nom = primernombre_repre.getText();
        Segundo_Nom = segundonombre_repre.getText();
        Primer_Ape = primerapellido_repre.getText();
        Segundo_Ape = segundoapellido_repre.getText();
        Calle_principal = calleprincipal_repre.getText();
        Calle_Secundaria = callesecundaria_repre.getText();
         Telefono_repre = telefono_repre.getText();;
      Correo_Electronico_repre = correo_repre.getText();;
      Parentesco_repre = parentesco_repre.getSelectedItem().toString();
      
      
        if (shombre.isSelected()) {
            Sexo = "Hombre";
        }
        if (smujer.isSelected()) {
            Sexo = "Mujer";
        }
        if (snobinario.isSelected()) {
            Sexo = "No Binario";
        }
        
        Edad = (Integer) edad_repre.getValue();

    }

    public void cerrarBD(ObjectContainer Base) {
        Base.close();
    }
    */
////////////////////
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        primernombre_repre = new javax.swing.JTextField();
        segundonombre_repre = new javax.swing.JTextField();
        cedula_repre = new javax.swing.JTextField();
        segundoapellido_repre = new javax.swing.JTextField();
        primerapellido_repre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        correo_repre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        callesecundaria_repre = new javax.swing.JTextField();
        calleprincipal_repre = new javax.swing.JTextField();
        telefono_repre = new javax.swing.JTextField();
        edad_repre = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Guardar_repre = new javax.swing.JButton();
        snobinario = new javax.swing.JRadioButton();
        smujer = new javax.swing.JRadioButton();
        shombre = new javax.swing.JRadioButton();
        parentesco_repre = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Primer nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Segundo Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Segundo nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Calle Secundaria:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Primer Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Calle principal:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Edad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 30));
        jPanel1.add(primernombre_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 150, -1));
        jPanel1.add(segundonombre_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, -1));

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
        jPanel1.add(cedula_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 150, -1));
        jPanel1.add(segundoapellido_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 150, -1));

        primerapellido_repre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerapellido_repreActionPerformed(evt);
            }
        });
        jPanel1.add(primerapellido_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("REGISTRO REPRESENTANTE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 252, 28));
        jPanel1.add(correo_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/empleado (1).png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 320));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Correo electronico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Parentesco:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Telefono:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Sexo:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 20));
        jPanel1.add(callesecundaria_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 160, -1));
        jPanel1.add(calleprincipal_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 160, -1));
        jPanel1.add(telefono_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 160, -1));

        edad_repre.setModel(new javax.swing.SpinnerNumberModel(18, 18, 80, 1));
        jPanel1.add(edad_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 100, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 90, 50));

        Guardar_repre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Guardar_repre.setText("Registrar Cuenta");
        Guardar_repre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_repreActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 140, 50));

        snobinario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        snobinario.setText("No Binario");
        jPanel1.add(snobinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 100, -1));

        smujer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        smujer.setText("Mujer");
        jPanel1.add(smujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 70, -1));

        shombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        shombre.setText("Hombre");
        jPanel1.add(shombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, -1));

        parentesco_repre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Hermano", "Tio", "Tia", "Abuelo", "Abuela" }));
        jPanel1.add(parentesco_repre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cedula_repreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_repreActionPerformed
        boolean resultado;

// TODO add your handling code here:

    }//GEN-LAST:event_cedula_repreActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Eleccion_rol vsar1 = new Eleccion_rol();
        vsar1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Guardar_repreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_repreActionPerformed
        //ObjectContainer Base = Db4o.openFile(PROYECTOXS.direccionBD);

        //Crear_E(BaseD);
        //Cerrar_BD(BaseD);        // TODO add your handling code here:
    }//GEN-LAST:event_Guardar_repreActionPerformed

    private void cedula_repreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_repreKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= 48 && aux <= 57;
        if (numeros == false) {
            System.out.println("Ingrese solo numeros" + evt.getKeyChar());
            evt.consume();
        }

    }//GEN-LAST:event_cedula_repreKeyTyped

    
    
    private void primerapellido_repreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerapellido_repreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerapellido_repreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar_repre;
    private javax.swing.JTextField calleprincipal_repre;
    private javax.swing.JTextField callesecundaria_repre;
    private javax.swing.JTextField cedula_repre;
    private javax.swing.JTextField correo_repre;
    private javax.swing.JSpinner edad_repre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
