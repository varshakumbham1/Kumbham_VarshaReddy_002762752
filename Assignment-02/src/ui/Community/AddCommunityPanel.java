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
import model.House;
import static ui.Community.AddHousePanel.housesListForCommunity;

/**
 *
 * @author devikaboddu
 */
public class AddCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunityPanel
     */
    Community comm;
    int flag;
    DefaultTableModel tblModel;
    public static List<Community> communitiesListForCity;
    //= new ArrayList<>();
    
    public static List<Community> communities = new ArrayList<>();
    public void setCityCombobox(){
        jComboBoxCity.removeAllItems();
        jComboBoxCity_update.removeAllItems();
        for(City city: AddCityPanel.cities){
            jComboBoxCity.addItem(city.getCityName());
            jComboBoxCity_update.addItem(city.getCityName());
        }
    }
    public AddCommunityPanel() {
        initComponents();
        setCityCombobox();
        tblModel = (DefaultTableModel)tableCommunities.getModel();
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
        tfPostalCode = new javax.swing.JTextField();
        jLabelCommunityName = new javax.swing.JLabel();
        jLabelPostalCode = new javax.swing.JLabel();
        tfCommunityName = new javax.swing.JTextField();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jButtonAddCommunity = new javax.swing.JButton();
        jLabelCommunityName1 = new javax.swing.JLabel();
        jLabelCommunityName2 = new javax.swing.JLabel();
        jLabelCommunityName3 = new javax.swing.JLabel();
        tfCommunityName_update = new javax.swing.JTextField();
        jComboBoxCity_update = new javax.swing.JComboBox<>();
        tfPostalCode_update = new javax.swing.JTextField();
        btnCommunityView = new javax.swing.JButton();
        btnCommunityEdit = new javax.swing.JButton();
        btnCommunityUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCommunities = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabelCity.setText("City");

        jLabelCommunityName.setText("Community Name");

        jLabelPostalCode.setText("Postal Code");

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });

        jButtonAddCommunity.setText("Add Community");
        jButtonAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCommunityActionPerformed(evt);
            }
        });

        jLabelCommunityName1.setText("Community Name");

        jLabelCommunityName2.setText("City");

        jLabelCommunityName3.setText("Postal Code");

        jComboBoxCity_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCity_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCity_updateActionPerformed(evt);
            }
        });

        tfPostalCode_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPostalCode_updateActionPerformed(evt);
            }
        });

        btnCommunityView.setText("View");
        btnCommunityView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityViewActionPerformed(evt);
            }
        });

        btnCommunityEdit.setText("Edit");
        btnCommunityEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityEditActionPerformed(evt);
            }
        });

        btnCommunityUpdate.setText("Update");
        btnCommunityUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityUpdateActionPerformed(evt);
            }
        });

        tableCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Community Name", "City", "Postal Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCommunities);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel1.setText("Update Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCommunityName1)
                                    .addComponent(jLabelCommunityName2)
                                    .addComponent(jLabelCommunityName3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCommunityName_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCommunityView)
                            .addComponent(btnCommunityEdit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPostalCode)
                                .addGap(39, 39, 39)
                                .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCommunityName)
                                    .addComponent(jLabelCity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCommunityName, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButtonAddCommunity))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCommunityUpdate))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCommunityName)
                            .addComponent(tfCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCity)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPostalCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddCommunity))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCommunityName1)
                    .addComponent(tfCommunityName_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunityView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCommunityName2)
                    .addComponent(btnCommunityEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCommunityName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommunityUpdate)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCommunityActionPerformed
        flag=0;
        String community = tfCommunityName.getText();
        String city = (String) jComboBoxCity.getSelectedItem();
        Long postalCode = Long.valueOf(tfPostalCode.getText());
        
        if( tfCommunityName.getText().equals("")||tfPostalCode.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Community & Postal Code Data!");
            flag=1;
        }
        else{
            for(Community c : communities){
                if(c.getCommunityName().equals(community)||c.getPostalCode().equals(postalCode)){
                    JOptionPane.showMessageDialog(this, "Community already exists!");
                    flag=2;
                }
            }
        }
       if(flag==0){
           List<House> housesListForCommunity = new ArrayList();
            comm = new Community(community, postalCode,city,housesListForCommunity);
            //comm = new Community(community, postalCode, city);
            communities.add(comm);
            
            for(City c: AddCityPanel.cities) {
                 if(c.getCityName().equals(city)) {
                     communitiesListForCity =  c.getCommunities();
                     communitiesListForCity.add(new Community(community, postalCode, city, housesListForCommunity));
                     c.setCommunities(communitiesListForCity);  
                 }
                 else {
                     communitiesListForCity = new ArrayList();
                 }
             }
            Object[] data = {community,city, postalCode};
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Community information saved!");
       }
       tfCommunityName.setText("");
       tfPostalCode.setText("");
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void tfPostalCode_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPostalCode_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPostalCode_updateActionPerformed

    private void btnCommunityUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityUpdateActionPerformed
        // TODO add your handling code here:
        if(tfCommunityName_update.getText().equals("")||tfPostalCode_update.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Please enter All Data!");
        }
        String community = tfCommunityName_update.getText();
        String city = (String)jComboBoxCity_update.getSelectedItem();
        Long postalCode = Long.valueOf(tfPostalCode_update.getText());
        
        DefaultTableModel tableModel = (DefaultTableModel) tableCommunities.getModel();
        int row=tableCommunities.getSelectedRow();
        tableModel.removeRow(row);
        Object[] communityData = {community, city, postalCode }; 
        tableModel.insertRow(row, communityData);
        
        Community updatedCommunity = new Community(community,postalCode, city);
        for(Community c: AddCommunityPanel.communities){
            if(c.getCommunityName().equals(community)){
                int index = AddCommunityPanel.communities.indexOf(c);
                AddCommunityPanel.communities.remove(index);
                AddCommunityPanel.communities.add(index, updatedCommunity);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Community Information updated!");
    }//GEN-LAST:event_btnCommunityUpdateActionPerformed

    private void btnCommunityViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityViewActionPerformed
        // TODO add your handling code here:
        int row = tableCommunities.getSelectedRow();
        try{
            TableModel model = tableCommunities.getModel();
            String community = model.getValueAt(row, 0).toString();
            String city = model.getValueAt(row, 1).toString();
            String postalCode = model.getValueAt(row, 2).toString();
            tfCommunityName_update.setText(community);
            tfCommunityName_update.setEditable(false);
            jComboBoxCity_update.setEnabled(false);
            tfPostalCode_update.setText(postalCode);
            tfPostalCode_update.setEditable(false);   
        }
        catch(Exception e){
            if(row==-1) {
                JOptionPane.showMessageDialog(this,
                            "Please Select a row",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCommunityViewActionPerformed

    private void jComboBoxCity_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCity_updateActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jComboBoxCity_updateActionPerformed

    private void btnCommunityEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityEditActionPerformed
        // TODO add your handling code here:
        tfCommunityName_update.setEditable(true);
        tfPostalCode_update.setEditable(true);  
         jComboBoxCity_update.setEnabled(true);
    }//GEN-LAST:event_btnCommunityEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityEdit;
    private javax.swing.JButton btnCommunityUpdate;
    private javax.swing.JButton btnCommunityView;
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxCity_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelCommunityName;
    private javax.swing.JLabel jLabelCommunityName1;
    private javax.swing.JLabel jLabelCommunityName2;
    private javax.swing.JLabel jLabelCommunityName3;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCommunities;
    private javax.swing.JTextField tfCommunityName;
    private javax.swing.JTextField tfCommunityName_update;
    private javax.swing.JTextField tfPostalCode;
    private javax.swing.JTextField tfPostalCode_update;
    // End of variables declaration//GEN-END:variables
}
