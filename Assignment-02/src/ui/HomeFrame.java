/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.City;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;
import model.PatientDirectory;
import ui.Community.AddCityPanel;
import ui.Community.AddCommunityPanel;
import ui.Community.CommunityAdminFrame;
import ui.Doctor.DoctorFrame;
import ui.Doctor.DoctorPanel;
import ui.Hospital.HospitalAdminFrame;
import ui.Patient.PatientFrame;
import ui.Patient.PatientPanel;
import ui.Systemadmin.SystemAdminFrame;

/**
 *
 * @author devikaboddu
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
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

        jHomePanel = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabelRole = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsername.setText("Username");

        jLabelPassword.setText("Password");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabelRole.setText("Select Role:");

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Community Admin", "Hospital Admin", "Doctor", "Patient" }));
        jComboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoleActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jHomePanelLayout = new javax.swing.GroupLayout(jHomePanel);
        jHomePanel.setLayout(jHomePanelLayout);
        jHomePanelLayout.setHorizontalGroup(
            jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHomePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabelRole)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRole, 0, 1, Short.MAX_VALUE))
                    .addGroup(jHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabelUsername)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabelPassword)
                        .addGap(30, 30, 30)
                        .addGroup(jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(tfPassword))))
                .addContainerGap(580, Short.MAX_VALUE))
            .addGroup(jHomePanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jHomePanelLayout.setVerticalGroup(
            jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHomePanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRole)
                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoleActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String role = (String) jComboBoxRole.getSelectedItem();
        
        String username = tfUsername.getText();
        char[] password = tfPassword.getPassword();
        String passwordString = String.valueOf(password);
        HospitalAdminFrame hospitalAdminFrame;
        SystemAdminFrame systemAdminFrame;
        if(username.isEmpty() || password.length == 0) {
            JOptionPane.showMessageDialog(this,
                        "Enter username & password",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.setVisible(false);
            if(role.equals("Community Admin") 
                    && username.equals("cadmin")
                    && passwordString.equals("cadmin")) {
                CommunityAdminFrame communityAdminFrame = new CommunityAdminFrame();
                communityAdminFrame.setVisible(true);
            }
            else if (role.equals("Hospital Admin")
                    && username.equals("hadmin")
                    && passwordString.equals("hadmin")) {
                hospitalAdminFrame = new HospitalAdminFrame();
                hospitalAdminFrame.setVisible(true);
                
            }
            else if (role.equals("Patient")) {
                for(Patient p: PatientDirectory.getListOfPatients()) {
                    if(username.equals(p.getUserName()) && passwordString.equals(p.getPassWord())) 
                    {
                        PatientFrame patientFrame = new PatientFrame();
                        PatientPanel patientPanel = new PatientPanel(p);
                        patientFrame.setContentPane(patientPanel);
                        patientFrame.setVisible(true);
                    }
                }
            }
            else if (role.equals("Doctor")) {
                for(Doctor d: DoctorDirectory.getListOfDoctors()) {
                    if(username.equals(d.getUserName()) && passwordString.equals(d.getPassWord())) {
                        DoctorFrame doctorFrame = new DoctorFrame();
                        DoctorPanel doctorPanel = new DoctorPanel(d);
                        doctorFrame.setContentPane(doctorPanel);
                        doctorFrame.setVisible(true);
                    }
                }
            }
            else if (role.equals("System Admin") 
                    && username.equals("sadmin")
                    && passwordString.equals("sadmin")) {
                systemAdminFrame = new SystemAdminFrame();
                systemAdminFrame.setVisible(true);
            }
            else {
                this.setVisible(true);
                JOptionPane.showMessageDialog(this,
                        "Incorrect username or password",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JPanel jHomePanel;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
