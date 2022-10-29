/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;
import ui.HomeFrame;

/**
 *
 * @author varshareddykumbham
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    int flag;
    int patientRecordIndex;
    DefaultTableModel tblEncounterModel;
    //static ArrayList<Patient> patients = new ArrayList<Patient>();
    //PatientDirectory listOfPatients = new PatientDirectory(patients);
    static ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
    public DoctorPanel(Doctor d) {
        initComponents();
        txtEncounterDoctorName.setText(d.getName());
        tblEncounterModel = (DefaultTableModel)tableEncounterHistory.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatientID = new javax.swing.JTextField();
        btnGetPatientID = new javax.swing.JButton();
        lblEncounterPatientName = new javax.swing.JLabel();
        txtEncounterPatientName = new javax.swing.JTextField();
        lblEncounterPatientAge = new javax.swing.JLabel();
        txtEncounterPatientAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        lblHR = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtHR = new javax.swing.JTextField();
        lblEncounterDoctorName = new javax.swing.JLabel();
        btnAddEncounter = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEncounterHistory = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        lblEncountePatientName_U = new javax.swing.JLabel();
        txtEncounterPatientName_U = new javax.swing.JTextField();
        lblEncounterPatientAge_U = new javax.swing.JLabel();
        txtEncounterPatientAge_U = new javax.swing.JTextField();
        lblEncounterId_U = new javax.swing.JLabel();
        txtEncounterId_U = new javax.swing.JTextField();
        lblEncounterDate_U = new javax.swing.JLabel();
        txtTemperature_U = new javax.swing.JTextField();
        lblTemperature_U = new javax.swing.JLabel();
        lblBP_U = new javax.swing.JLabel();
        txtBP_U = new javax.swing.JTextField();
        lblHeartRate_U = new javax.swing.JLabel();
        txtHeartRate_U = new javax.swing.JTextField();
        lblEncounterDoctorName_U = new javax.swing.JLabel();
        txtEncounterDoctorName_U = new javax.swing.JTextField();
        btnViewEncounter = new javax.swing.JButton();
        btnEditEncounter = new javax.swing.JButton();
        btnUpdateEncounter = new javax.swing.JButton();
        dcEncounterDate = new com.toedter.calendar.JDateChooser();
        dcEncounterDate_U = new com.toedter.calendar.JDateChooser();
        txtEncounterDoctorName = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();

        btnGetPatientID.setText("Get Patient");
        btnGetPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPatientIDActionPerformed(evt);
            }
        });

        lblEncounterPatientName.setText("Patient Name");

        lblEncounterPatientAge.setText("Patient Age");

        jLabel1.setText("Encounter ID");

        jLabel2.setText("Encounter Date");

        lblTemperature.setText("Temperature");

        lblBP.setText("Blood Pressure");

        lblHR.setText("Heart Rate");

        lblEncounterDoctorName.setText("Doctor Name");

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        tableEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter Id", "Encounter Date", "Name", "Age", "Temperature", "BP", "Heart Rate", "Doctor Name"
            }
        ));
        jScrollPane4.setViewportView(tableEncounterHistory);

        jLabel25.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel25.setText(" View & Update Encounter");

        lblEncountePatientName_U.setText("Patient Name");

        lblEncounterPatientAge_U.setText("Patient Age");

        lblEncounterId_U.setText("Encounter ID");

        lblEncounterDate_U.setText("Encounter Date");

        txtTemperature_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperature_UActionPerformed(evt);
            }
        });

        lblTemperature_U.setText("Temperature");

        lblBP_U.setText("Blood Pressure");

        lblHeartRate_U.setText("Heart Rate");

        txtHeartRate_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRate_UActionPerformed(evt);
            }
        });

        lblEncounterDoctorName_U.setText("Doctor Name");

        txtEncounterDoctorName_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterDoctorName_UActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnEditEncounter.setText("Edit");
        btnEditEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEncounterActionPerformed(evt);
            }
        });

        btnUpdateEncounter.setText("Update");
        btnUpdateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncounterActionPerformed(evt);
            }
        });

        dcEncounterDate.setDateFormatString("dd-MM-yyyy");

        dcEncounterDate_U.setDateFormatString("dd-MM-yyyy\n");

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEncounterPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEncounterPatientAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(lblTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEncounterPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146)
                                        .addComponent(lblEncountePatientName_U))
                                    .addComponent(dcEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnGetPatientID)
                                            .addComponent(txtEncounterPatientAge)
                                            .addComponent(txtEncounterID)
                                            .addComponent(txtTemperature)
                                            .addComponent(txtBP)
                                            .addComponent(txtHR)
                                            .addComponent(txtEncounterDoctorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(btnViewEncounter)
                                                .addGap(41, 41, 41)
                                                .addComponent(btnEditEncounter)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnUpdateEncounter))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblTemperature_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblBP_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblHeartRate_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblEncounterDoctorName_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblEncounterPatientAge_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblEncounterDate_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblEncounterId_U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(27, 27, 27)
                                                .addComponent(dcEncounterDate_U, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(301, 301, 301)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtBP_U, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                    .addComponent(txtHeartRate_U)
                                                    .addComponent(txtEncounterDoctorName_U)
                                                    .addComponent(txtTemperature_U)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEncounterPatientAge_U, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEncounterPatientName_U, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEncounterId_U, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnAddEncounter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGetPatientID))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogOut)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterPatientName)
                            .addComponent(txtEncounterPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEncountePatientName_U))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEncounterPatientName_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEncounterPatientAge)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEncounterPatientAge_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEncounterPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEncounterPatientAge_U))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncounterId_U)
                    .addComponent(txtEncounterId_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(lblEncounterDate_U))
                            .addComponent(dcEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(dcEncounterDate_U, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature_U)
                    .addComponent(txtTemperature_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBP)
                        .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBP_U))
                    .addComponent(txtBP_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHR)
                        .addComponent(txtHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHeartRate_U))
                    .addComponent(txtHeartRate_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEncounterDoctorName)
                        .addComponent(lblEncounterDoctorName_U)
                        .addComponent(txtEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEncounterDoctorName_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEncounter)
                    .addComponent(btnViewEncounter)
                    .addComponent(btnEditEncounter)
                    .addComponent(btnUpdateEncounter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPatientIDActionPerformed
        // TODO add your handling code here:
        try {
            patientRecordIndex = 0;
                String patientId = txtPatientID.getText();
                int val = PatientDirectory.getPatients().size();
                System.out.print("PatientDirectory" + val);
                if (patientId.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Enter Patient Id",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    
                    
                    for (Patient p : PatientDirectory.getPatients()) {
                        if (p.getId().equals(patientId)) {
                            txtEncounterPatientName.setText(p.getName());
                            int age = p.getAge();
                            txtEncounterPatientAge.setText(String.valueOf(age));
                            patientRecordIndex = 1;
                            break;
                        }
                    }
                    if (patientRecordIndex == 0) {
                        JOptionPane.showMessageDialog(this,
                                "No Patient Record Found for Patient Id : " + " " + patientId,
                                "Try Again",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        tblEncounterModel.setRowCount(0);
                        System.out.print("Patient Directory" + PatientDirectory.getPatients().size());
                        for(Patient p : PatientDirectory.getPatients()){
                            if (p.getId().equals(patientId)){
                                for(Encounter en : p.getEncounterHistory().getEncounters()){
                                    SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
                                    String date = dateformat.format(en.getEncounterDate());
                                    Object[] data = {en.getEncounterId(), date, en.getPatientName(), en.getPatientAge(),
                                        en.getVitalSigns().getTemperature(), en.getVitalSigns().getBloodPressure(),
                                        en.getVitalSigns().getHeartRate(), en.getDoctorName()};
                                    tblEncounterModel.addRow(data);
                                    System.out.println(en.getPatientId());
                                }
                            }
                        }
                    }
                }
        } catch (Exception ex) {
            System.out.print(ex.toString());
       }
    }//GEN-LAST:event_btnGetPatientIDActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        try {
            String patientId = txtPatientID.getText();
            String patientName = txtEncounterPatientName.getText();
            String patientAge = txtEncounterPatientAge.getText();
            String encounterId = txtEncounterID.getText();
            Date encounterDate = dcEncounterDate.getDate();
            String temperature = txtTemperature.getText();
            String bloodPressure = txtBP.getText();
            String heartRate = txtHR.getText();
            String doctorName = txtEncounterDoctorName.getText();
            if (patientId.isEmpty() || patientName.isEmpty() || patientAge.isEmpty() || encounterId.isEmpty()
                    || encounterDate.toString().isEmpty() || temperature.isEmpty() || bloodPressure.isEmpty() || heartRate.isEmpty() //|| doctorName.isEmpty()
                    ) {
                JOptionPane.showMessageDialog(this,
                        "Enter all Fields",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int age = Integer.parseInt(patientAge);
                VitalSigns vitalSigns = new VitalSigns(temperature, bloodPressure, heartRate);
                Encounter encounter = new Encounter(encounterId, patientName, age, patientId, vitalSigns, doctorName, encounterDate);
                for(Patient p: PatientDirectory.getPatients()){
                    if(p.getId().equals(patientId)){
                        p.getEncounterHistory().getEncounters().add(encounter);
                    }
                }
                encounterList.add(encounter);
                System.out.println(patientId);
                JOptionPane.showMessageDialog(this,
                        "Encounter Saved",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void txtTemperature_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperature_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperature_UActionPerformed

    private void txtHeartRate_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRate_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRate_UActionPerformed

    private void txtEncounterDoctorName_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterDoctorName_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterDoctorName_UActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        try{
            int row = tableEncounterHistory.getSelectedRow();

            String encounterID = tblEncounterModel.getValueAt(row, 0).toString();
            String encounterDate = tblEncounterModel.getValueAt(row, 1).toString();
            String name = tblEncounterModel.getValueAt(row, 2).toString();
            String age = tblEncounterModel.getValueAt(row, 3).toString();
            String temperature = tblEncounterModel.getValueAt(row, 4).toString();
            String bloodPressure = tblEncounterModel.getValueAt(row, 5).toString();
            String heartRate = tblEncounterModel.getValueAt(row, 6).toString();
            String doctorName = tblEncounterModel.getValueAt(row, 7).toString();

            txtEncounterPatientName_U.setText(name);
            txtEncounterPatientName_U.setEditable(false);

            txtEncounterPatientAge_U.setText(age);
            txtEncounterPatientAge_U.setEditable(false);

            txtEncounterId_U.setText(encounterID);
            txtEncounterId_U.setEditable(false);

            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(encounterDate);
            dcEncounterDate_U.setDate(date);
            dcEncounterDate_U.setEnabled(false);

            txtTemperature_U.setText(temperature);
            txtTemperature_U.setEditable(false);

            txtBP_U.setText(bloodPressure);
            txtBP_U.setEditable(false);

            txtHeartRate_U.setText(heartRate);
            txtHeartRate_U.setEditable(false);

            txtEncounterDoctorName_U.setText(doctorName);
            txtEncounterDoctorName_U.setEditable(false);

        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnEditEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEncounterActionPerformed
        // TODO add your handling code here:
        txtEncounterPatientName_U.setEditable(true);
        txtEncounterPatientAge_U.setEditable(true);
        dcEncounterDate_U.setEnabled(true);
        txtTemperature_U.setEditable(true);
        txtBP_U.setEditable(true);
        txtHeartRate_U.setEditable(true);
        txtEncounterDoctorName_U.setEditable(true);
    }//GEN-LAST:event_btnEditEncounterActionPerformed

    private void btnUpdateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncounterActionPerformed
        // TODO add your handling code here:
        String encounterId = txtEncounterId_U.getText();
        Date encounterDate = dcEncounterDate_U.getDate();
        String name = txtEncounterPatientName_U.getText();
        String age = txtEncounterPatientAge_U.getText();
        String temperature = txtTemperature_U.getText();
        String bloodPressure = txtBP_U.getText();
        String heartRate = txtHeartRate_U.getText();
        String doctorName = txtEncounterDoctorName_U.getText();

        if (name.isEmpty() || age.isEmpty()
            || encounterDate.toString().isEmpty() || temperature.isEmpty() || bloodPressure.isEmpty() ||
            heartRate.isEmpty() || doctorName.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Enter all Fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Encounter en: encounterList){
                if(en.getEncounterId().equals(txtEncounterId_U.getText())){
                    VitalSigns vitalSigns = new VitalSigns(temperature, bloodPressure,heartRate);
                    Encounter encounter = new Encounter(encounterId, name, Integer.parseInt(age),
                        en.getPatientId(), vitalSigns, doctorName, encounterDate);
                    int index = encounterList.indexOf(en);
                    encounterList.remove(index);
                    encounterList.add(index, encounter);
                }
            }
            int row = tableEncounterHistory.getSelectedRow();
            tblEncounterModel.removeRow(row);
            SimpleDateFormat dateformat = new SimpleDateFormat("dd / MM / yy");
            String date = dateformat.format(encounterDate);
            Object[] data = {encounterId, date, name, age,
                temperature, bloodPressure,
                heartRate, doctorName};
            tblEncounterModel.insertRow(row, data);
        }
    }//GEN-LAST:event_btnUpdateEncounterActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        JFrame doctorFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        doctorFrame.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnEditEncounter;
    private javax.swing.JButton btnGetPatientID;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdateEncounter;
    private javax.swing.JButton btnViewEncounter;
    private com.toedter.calendar.JDateChooser dcEncounterDate;
    private com.toedter.calendar.JDateChooser dcEncounterDate_U;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblBP_U;
    private javax.swing.JLabel lblEncountePatientName_U;
    private javax.swing.JLabel lblEncounterDate_U;
    private javax.swing.JLabel lblEncounterDoctorName;
    private javax.swing.JLabel lblEncounterDoctorName_U;
    private javax.swing.JLabel lblEncounterId_U;
    private javax.swing.JLabel lblEncounterPatientAge;
    private javax.swing.JLabel lblEncounterPatientAge_U;
    private javax.swing.JLabel lblEncounterPatientName;
    private javax.swing.JLabel lblHR;
    private javax.swing.JLabel lblHeartRate_U;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTemperature_U;
    private javax.swing.JTable tableEncounterHistory;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtBP_U;
    private javax.swing.JTextField txtEncounterDoctorName;
    private javax.swing.JTextField txtEncounterDoctorName_U;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtEncounterId_U;
    private javax.swing.JTextField txtEncounterPatientAge;
    private javax.swing.JTextField txtEncounterPatientAge_U;
    private javax.swing.JTextField txtEncounterPatientName;
    private javax.swing.JTextField txtEncounterPatientName_U;
    private javax.swing.JTextField txtHR;
    private javax.swing.JTextField txtHeartRate_U;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTemperature_U;
    // End of variables declaration//GEN-END:variables
}
