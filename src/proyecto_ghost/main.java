
package proyecto_ghost;

import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {
    public static User actualUser;
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Crear_panel.hide();
        Login.hide();
        if(User.users.isEmpty()){
            User.users.add(new User("admin","admin",0));
            User.users.add(new User("cole", "123", 0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        ghosts_lbl = new javax.swing.JLabel();
        crear_bt = new javax.swing.JButton();
        exit_bt = new javax.swing.JButton();
        login_bt = new javax.swing.JButton();
        fondo1_lbl = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        user_TF = new javax.swing.JTextField();
        pass_TF = new javax.swing.JTextField();
        log_bt = new javax.swing.JButton();
        regresar_bt = new javax.swing.JButton();
        log_lbl = new javax.swing.JLabel();
        fondo_lbl = new javax.swing.JLabel();
        Crear_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usr_tb = new javax.swing.JTextField();
        crearUser_bt = new javax.swing.JButton();
        regresar2_bt = new javax.swing.JButton();
        pass_tb = new javax.swing.JTextField();
        crear_lbl = new javax.swing.JLabel();
        fondo2_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 600));

        MainMenu.setBackground(new java.awt.Color(51, 51, 51));
        MainMenu.setOpaque(false);
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ghosts_lbl.setFont(new java.awt.Font("Algerian", 3, 90)); // NOI18N
        ghosts_lbl.setForeground(new java.awt.Color(153, 255, 0));
        ghosts_lbl.setText("Ghosts");
        MainMenu.add(ghosts_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 370, 110));

        crear_bt.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        crear_bt.setText("Crear Player");
        crear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_btActionPerformed(evt);
            }
        });
        MainMenu.add(crear_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 240, 60));

        exit_bt.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        exit_bt.setText("Salir");
        exit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btActionPerformed(evt);
            }
        });
        MainMenu.add(exit_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 110, 30));

        login_bt.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        login_bt.setText("Login");
        login_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btActionPerformed(evt);
            }
        });
        MainMenu.add(login_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 60));

        fondo1_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        MainMenu.add(fondo1_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        Login.setBackground(new java.awt.Color(51, 51, 51));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_TF.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        user_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_TF.setText("Usuario");
        Login.add(user_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 50));

        pass_TF.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        pass_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_TF.setText("Password");
        Login.add(pass_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 320, 50));

        log_bt.setFont(new java.awt.Font("Algerian", 0, 10)); // NOI18N
        log_bt.setText("Login");
        log_bt.setOpaque(true);
        log_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btActionPerformed(evt);
            }
        });
        Login.add(log_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 90, 30));

        regresar_bt.setFont(new java.awt.Font("Algerian", 0, 10)); // NOI18N
        regresar_bt.setText("Regresar");
        regresar_bt.setOpaque(true);
        regresar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_btActionPerformed(evt);
            }
        });
        Login.add(regresar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 90, 30));

        log_lbl.setFont(new java.awt.Font("Algerian", 2, 82)); // NOI18N
        log_lbl.setForeground(new java.awt.Color(153, 255, 0));
        log_lbl.setText("Login");
        Login.add(log_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 240, -1));

        fondo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        Login.add(fondo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 440));

        Crear_panel.setBackground(new java.awt.Color(51, 51, 51));
        Crear_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("Usuario");
        Crear_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 300, 70));

        usr_tb.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        usr_tb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usr_tb.setText("Usuario");
        Crear_panel.add(usr_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, 40));

        crearUser_bt.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        crearUser_bt.setText("Crear");
        crearUser_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUser_btActionPerformed(evt);
            }
        });
        Crear_panel.add(crearUser_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, 25));

        regresar2_bt.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        regresar2_bt.setText("Regresar");
        regresar2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar2_btActionPerformed(evt);
            }
        });
        Crear_panel.add(regresar2_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 100, 25));

        pass_tb.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        pass_tb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_tb.setText("Password");
        Crear_panel.add(pass_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 250, 40));

        crear_lbl.setFont(new java.awt.Font("Algerian", 0, 72)); // NOI18N
        crear_lbl.setForeground(new java.awt.Color(102, 255, 0));
        crear_lbl.setText("Crear");
        Crear_panel.add(crear_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, 60));

        fondo2_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        Crear_panel.add(fondo2_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 342, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Crear_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Crear_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btActionPerformed

    private void login_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btActionPerformed
        MainMenu.hide();
        Login.show();
    }//GEN-LAST:event_login_btActionPerformed

    private void log_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btActionPerformed
        if(User.buscarUser(user_TF.getText()) != null){
            if(User.buscarUser(user_TF.getText()).getPass().equals(pass_TF.getText())){
                JOptionPane.showMessageDialog(this,"Se ha iniciado sesion");
                actualUser = User.buscarUser(user_TF.getText());
                GhostGameFrame ggf = new GhostGameFrame();
                ggf.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Password incorrecto");
                Login.hide();
                MainMenu.show();
            }
        }else{
            JOptionPane.showMessageDialog(this,"Usuario no existe");
            Login.hide();
            MainMenu.show();
        }
    }//GEN-LAST:event_log_btActionPerformed

    private void regresar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_btActionPerformed
        Login.hide();
        MainMenu.show();
    }//GEN-LAST:event_regresar_btActionPerformed

    private void regresar2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar2_btActionPerformed
        Crear_panel.hide();
        MainMenu.show();
    }//GEN-LAST:event_regresar2_btActionPerformed

    private void crear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_btActionPerformed
        MainMenu.hide();
        Crear_panel.show();
    }//GEN-LAST:event_crear_btActionPerformed

    private void crearUser_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUser_btActionPerformed
        if(User.buscarUser(usr_tb.getText()) == null){
            User.users.add(new User(usr_tb.getText(), pass_tb.getText(),0));
            JOptionPane.showMessageDialog(this,"Se ha creado un usuario!");
        }else{
            JOptionPane.showMessageDialog(this,"Ya existe un usuario con este nombre");
        }
    }//GEN-LAST:event_crearUser_btActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Crear_panel;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton crearUser_bt;
    private javax.swing.JButton crear_bt;
    private javax.swing.JLabel crear_lbl;
    private javax.swing.JButton exit_bt;
    private javax.swing.JLabel fondo1_lbl;
    private javax.swing.JLabel fondo2_lbl;
    private javax.swing.JLabel fondo_lbl;
    private javax.swing.JLabel ghosts_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton log_bt;
    private javax.swing.JLabel log_lbl;
    private javax.swing.JButton login_bt;
    private javax.swing.JTextField pass_TF;
    private javax.swing.JTextField pass_tb;
    private javax.swing.JButton regresar2_bt;
    private javax.swing.JButton regresar_bt;
    private javax.swing.JTextField user_TF;
    private javax.swing.JTextField usr_tb;
    // End of variables declaration//GEN-END:variables
}
