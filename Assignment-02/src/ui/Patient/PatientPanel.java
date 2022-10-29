/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Patient;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import ui.HomeFrame;

/**
 *
 * @author varshareddykumbham
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    Patient patient;
    DefaultTableModel getDoctorsTblModel;
    ArrayList<String> hospitalNames;
    public PatientPanel(Patient p) {
        initComponents();
        patient = p;
        tfPatientName.setText(p.getName());
        tfCommunityName.setText(p.getCommunity());
        getDoctorsTblModel = (DefaultTableModel)tableGetDoctors.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPatientName = new javax.swing.JLabel();
        jLabelCommunity = new javax.swing.JLabel();
        tfPatientName = new javax.swing.JTextField();
        tfCommunityName = new javax.swing.JTextField();
        btnGetDoctors = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGetDoctors = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();

        jLabelPatientName.setText("Patient Name");

        jLabelCommunity.setText("Community");

        tfPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPatientNameActionPerformed(evt);
            }
        });

        tfCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCommunityNameActionPerformed(evt);
            }
        });

        btnGetDoctors.setText("Get Doctors");
        btnGetDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDoctorsActionPerformed(evt);
            }
        });

        tableGetDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Id", "Gender", "Hospital Name", "Department", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableGetDoctors);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tfCommunityName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGetDoctors)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPatientName)
                            .addComponent(tfPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCommunity)
                            .addComponent(tfCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnGetDoctors)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPatientNameActionPerformed

    private void tfCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCommunityNameActionPerformed

    private void btnGetDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDoctorsActionPerformed
        // TODO add your handling code here:
        
        String communityName = tfCommunityName.getText();
        hospitalNames = new ArrayList();
        System.out.println(HospitalDirectory.getListOfHospitals());
        for(Hospital hospital:HospitalDirectory.getListOfHospitals()) {
            if(hospital.getHospitalCommunity().equals(communityName)) {
                hospitalNames.add(hospital.getHospitalName());
            }
        }
        System.out.println(hospitalNames);
        for(Doctor doctor:DoctorDirectory.getListOfDoctors()) {
            String hospitalName = doctor.getHospitalName();
            if(hospitalNames.contains(hospitalName)) {
                Object[] data = {doctor.getName(), doctor.getId(), doctor.getGender(), 
                    doctor.getHospitalName(), doctor.getHospitalDepartment(), doctor.getPhoneNumber()};
                getDoctorsTblModel.addRow(data);
            }
        }
        
    }//GEN-LAST:event_btnGetDoctorsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        JFrame patientFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        patientFrame.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetDoctors;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabelCommunity;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableGetDoctors;
    private javax.swing.JTextField tfCommunityName;
    private javax.swing.JTextField tfPatientName;
    // End of variables declaration//GEN-END:variables
}
