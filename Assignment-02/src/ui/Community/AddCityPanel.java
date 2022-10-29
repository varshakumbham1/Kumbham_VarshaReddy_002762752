/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.City;
import model.Community;
import model.HospitalDirectory;
import model.House;
import static ui.Community.AddCommunityPanel.communitiesListForCity;
import ui.HomeFrame;

/**
 *
 * @author devikaboddu
 */
public class AddCityPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCityPanel
     */
    City city;
    int flag;
    DefaultTableModel tblModel;
    HomeFrame homeFrame;
    public static ArrayList<City> cities = new ArrayList<>();
    
    public AddCityPanel() {
        initComponents();
        tblModel = (DefaultTableModel)tableCities.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCity = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        btnAddCity = new javax.swing.JButton();
        jLabelState = new javax.swing.JLabel();
        tfState = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCities = new javax.swing.JTable();
        btnCityView = new javax.swing.JButton();
        btnCityEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCity_update = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfState_update = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCityUpdate = new javax.swing.JButton();

        jLabelCity.setText("City");

        btnAddCity.setText("Add City");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });

        jLabelState.setText("State");

        tableCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCities);

        btnCityView.setText("View");
        btnCityView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityViewActionPerformed(evt);
            }
        });

        btnCityEdit.setText("Edit");
        btnCityEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityEditActionPerformed(evt);
            }
        });

        jLabel1.setText("City");

        tfCity_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCity_updateActionPerformed(evt);
            }
        });

        jLabel2.setText("State");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel3.setText("Update Details :");

        btnCityUpdate.setText("Update");
        btnCityUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCityUpdate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAddCity))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(btnCityView, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfState_update, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(btnAddCity))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfState_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCityUpdate)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        flag=0;
        if(tfCity.getText().isEmpty()||tfState.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,
                        "Please enter City & State Data!",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
             flag=1;
        }
        else if(!tfCity.getText().matches("^[A-Z][a-z]+[ ]*[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid City Name",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
              flag=2;
        }
        else if(!tfState.getText().matches("^[A-Z][a-z]+[ ]*[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid State Name",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
                flag =3;
        }
        else{
            for(City c: AddCityPanel.cities){
            if(c.getCityName().equals(tfCity.getText())){
                JOptionPane.showMessageDialog(this, "City already exists!");
                flag =4;
            }
        }   
        }
        if(flag==0){
            String cityName = tfCity.getText();
            String cityState = tfState.getText();
            List<Community> communitiesListForCity = new ArrayList();
           
            city = new City(cityName, communitiesListForCity, cityState);
            cities.add(city);
            Object[] data = {cityName, cityState};
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "City information saved!");
        }   
        tfCity.setText("");
        tfState.setText("");
    }//GEN-LAST:event_btnAddCityActionPerformed

    private void btnCityViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityViewActionPerformed
        // TODO add your handling code here:
        int row = tableCities.getSelectedRow();
        try{
            TableModel model = tableCities.getModel();
            String city = model.getValueAt(row, 0).toString();
            String state = model.getValueAt(row, 1).toString();
            tfCity_update.setText(city);
            tfCity_update.setEditable(false);
            tfState_update.setText(state);
            tfState_update.setEditable(false);   
        }
        catch(Exception e){
            if(row==-1) {
                JOptionPane.showMessageDialog(this,
                            "Please Select a row",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCityViewActionPerformed

    private void btnCityEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityEditActionPerformed
        // TODO add your handling code here:
         tfCity_update.setEditable(true);
         tfState_update.setEditable(true);
    }//GEN-LAST:event_btnCityEditActionPerformed

    private void tfCity_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCity_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCity_updateActionPerformed

    private void btnCityUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityUpdateActionPerformed
        // TODO add your handling code here:
        flag=0;
        int row = tableCities.getSelectedRow();
        try{
             if(tfCity_update.getText().equals("")||tfState_update.getText().equals("")){
                 JOptionPane.showMessageDialog(this,
                        "Please enter All Data to Update!",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
                 flag=1;
           
            }
            else if(!tfCity.getText().matches("^[A-Z][a-z]+[ ]*[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid City Name",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
                  flag=2;
               
            }
            else if(!tfState.getText().matches("^[A-Z][a-z]+[ ]*[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid State Name",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
                flag=3;
        }
        }
        catch(Exception e){
            if(row==-1) {
                JOptionPane.showMessageDialog(this,
                            "Please Select a row",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
        if(flag==0){
        String city1 = tfCity_update.getText();
        String state = tfState_update.getText();
        
        DefaultTableModel tableModel = (DefaultTableModel) tableCities.getModel();
        tableModel.removeRow(row);
        Object[] cityData = { city1, state }; 
        tableModel.insertRow(row, cityData);
        
        ArrayList <City> cityList = AddCityPanel.cities;
        City updatedCity = new City( city1,state);
        for(City c: cityList){
            if(c.getCityName().equals(city1)){
                int index = cityList.indexOf(c);
                cityList.remove(index);
                cityList.add(index, updatedCity);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "City Information updated!");
        }
        tfCity_update.setText("");
        tfState_update.setText("");
    }//GEN-LAST:event_btnCityUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnCityEdit;
    private javax.swing.JButton btnCityUpdate;
    private javax.swing.JButton btnCityView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCities;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCity_update;
    private javax.swing.JTextField tfState;
    private javax.swing.JTextField tfState_update;
    // End of variables declaration//GEN-END:variables
}
