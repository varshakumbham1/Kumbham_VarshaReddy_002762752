/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;

/**
 *
 * @author varshareddykumbham
 */
public class AddCityPanel extends javax.swing.JPanel {

    static Iterable<City> cities;

    /**
     * Creates new form AddCityPanel
     */
    DefaultTableModel tableModel;
    public static ArrayList<City> cityList = new ArrayList<City>();

    public AddCityPanel() {
        initComponents();
        tableModel = (DefaultTableModel) tableCityDetails.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCityName = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        btnSaveCity = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCityDetails = new javax.swing.JTable();
        btnViewCity = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        txtCityName_U = new javax.swing.JTextField();
        txtState_U = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditCity = new javax.swing.JButton();

        lblCityName.setText("City Name");

        lblState.setText("State");

        btnSaveCity.setText("Add City");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        tableCityDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City Name", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCityDetails);

        btnViewCity.setText("View City");
        btnViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCityActionPerformed(evt);
            }
        });

        btnUpdateCity.setText("Update City");
        btnUpdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCityActionPerformed(evt);
            }
        });

        txtState_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtState_UActionPerformed(evt);
            }
        });

        jLabel1.setText("City");

        jLabel2.setText("State");

        btnEditCity.setText("Edit City");
        btnEditCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateCity, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(btnViewCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState_U, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCityName_U, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityName_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditCity))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
        try {
            List<Community> communities = new ArrayList<Community>();
            String cityName = txtCityName.getText();
            String state = txtState.getText();
            if (cityName.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Enter all Fields",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                City city = new City(cityName, communities, state);
                cityList.add(city);
                Object[] data = {cityName, state};
                tableModel.addRow(data);
                JOptionPane.showMessageDialog(this,
                        "City Data Saved",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnSaveCityActionPerformed

    private void btnViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCityActionPerformed
        // TODO add your handling code here:
        try {
            int row = tableCityDetails.getSelectedRow();
            String city = tableModel.getValueAt(row, 0).toString();
            String state = tableModel.getValueAt(row, 1).toString();
            
            txtCityName_U.setText(city);
            txtCityName_U.setEditable(false);
            
            txtState_U.setText(state);
            txtState_U.setEditable(false);
        }
        catch(Exception ex){
            
        }

    }//GEN-LAST:event_btnViewCityActionPerformed

    private void txtState_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtState_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtState_UActionPerformed

    private void btnEditCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCityActionPerformed
        // TODO add your handling code here:
        txtCityName_U.setEditable(true);
        txtState_U.setEditable(true);
    }//GEN-LAST:event_btnEditCityActionPerformed

    private void btnUpdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCityActionPerformed
        // TODO add your handling code here:
        int row = tableCityDetails.getSelectedRow();
        String city = txtCityName_U.getText();
        String state = txtState_U.getText();
        
        if(city.isEmpty() || state.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Enter all Fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            List<Community> communities = new ArrayList<Community>();
            for(City c: cityList){
                if(cityList.indexOf(c) == row){
                    communities = c.getCommunities();
                    break;
                }
            }
            City updatedCity = new City(city, communities, state);
            cityList.remove(row);
            cityList.add(row, updatedCity);
            tableModel.removeRow(row);
            Object[] data = {city, state};
            tableModel.insertRow(row, data);
        }
    }//GEN-LAST:event_btnUpdateCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditCity;
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JButton btnViewCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tableCityDetails;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCityName_U;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtState_U;
    // End of variables declaration//GEN-END:variables
}
