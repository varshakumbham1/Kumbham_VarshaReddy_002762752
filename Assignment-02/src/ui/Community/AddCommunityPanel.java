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
public class AddCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunityPanel
     */
    public static List<Community> communities;
    DefaultTableModel tableModel;
    public static ArrayList<Community> communityList = new ArrayList<Community>();
    public AddCommunityPanel() {
        initComponents();
        tableModel = (DefaultTableModel)tableCommunityDetails.getModel();
        loadComboBoxData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCommunityName = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        lblSelectCity = new javax.swing.JLabel();
        cmbBoxSelectCity = new javax.swing.JComboBox<>();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        btnAddCommunity = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCommunityDetails = new javax.swing.JTable();
        btnViewCommunity = new javax.swing.JButton();
        btnEditCommunity = new javax.swing.JButton();
        btnUpdateCommunity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCommunityName_U = new javax.swing.JTextField();
        txtZipCode_U = new javax.swing.JTextField();

        setBackground(new java.awt.Color(205, 216, 231));

        lblCommunityName.setText("Community Name");

        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        lblSelectCity.setText("Select City");

        cmbBoxSelectCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBoxSelectCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxSelectCityActionPerformed(evt);
            }
        });

        lblZipCode.setText("Zip Code");

        btnAddCommunity.setBackground(new java.awt.Color(51, 102, 255));
        btnAddCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCommunity.setText("Add Community");
        btnAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityActionPerformed(evt);
            }
        });

        tableCommunityDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Community Name", "ZipCode", "City"
            }
        ));
        jScrollPane1.setViewportView(tableCommunityDetails);

        btnViewCommunity.setBackground(new java.awt.Color(51, 102, 255));
        btnViewCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCommunity.setText("View");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });

        btnEditCommunity.setBackground(new java.awt.Color(51, 102, 255));
        btnEditCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCommunity.setText("Edit");
        btnEditCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCommunityActionPerformed(evt);
            }
        });

        btnUpdateCommunity.setBackground(new java.awt.Color(51, 102, 255));
        btnUpdateCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCommunity.setText("Update");
        btnUpdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommunityActionPerformed(evt);
            }
        });

        jLabel2.setText("Community");

        jLabel3.setText("Zip Code");

        txtZipCode_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCode_UActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblSelectCity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbBoxSelectCity, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCommunityName_U, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZipCode_U, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxSelectCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCommunityName_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtZipCode_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxSelectCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxSelectCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoxSelectCityActionPerformed

    private void btnAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityActionPerformed
        // TODO add your handling code here:
        try{
            String communityName = txtCommunityName.getText();
        String zipCode = txtZipCode.getText();
        String city = (String)cmbBoxSelectCity.getSelectedItem();
        System.out.println(city);
        if(communityName.isEmpty() || zipCode.isEmpty() || city.isEmpty()){
            JOptionPane.showMessageDialog(this,
                        "Enter all Fields",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
        }
        else if(!communityName.matches("[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Community",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
        }
        else if(zipCode.length()!= 5 || !zipCode.matches("\\d{5}")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter 5 digit Zipcode",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
        }
        else {
            Community community = new Community(communityName, Long.parseLong(zipCode), city);
            communityList.add(community);
            for(City c: AddCityPanel.cityList) {
            if(c.getCityName().equals(city)) {
                communities = c.getCommunities();
                communities.add(community);
                c.setCommunities(communities);  
            }
            else {
                communities = new ArrayList();
            }
            
        }
            Object[] data = {communityName, zipCode, city};
            tableModel.addRow(data);
            //System.out.println(communityList.size());
            JOptionPane.showMessageDialog(this,
                        "Community Data Saved",
                        "Success", 
                        JOptionPane.INFORMATION_MESSAGE);
        }
        }
        catch(Exception ex){
            
        }      
    }//GEN-LAST:event_btnAddCommunityActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        try {
            int row = tableCommunityDetails.getSelectedRow();
            String community = tableModel.getValueAt(row, 0).toString();
            String zipcode = tableModel.getValueAt(row, 1).toString();
            String city = tableModel.getValueAt(row, 2).toString();
            txtCommunityName_U.setText(community);
            txtCommunityName_U.setEditable(false);

            txtZipCode_U.setText(zipcode);
            txtZipCode_U.setEditable(false);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this,
                        "Please select a row to view",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnEditCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCommunityActionPerformed
        // TODO add your handling code here:
        txtCommunityName_U.setEditable(true);
        txtZipCode_U.setEditable(true);
    }//GEN-LAST:event_btnEditCommunityActionPerformed

    private void btnUpdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommunityActionPerformed
        // TODO add your handling code here:
        try {
            int row = tableCommunityDetails.getSelectedRow();
            String community = txtCommunityName_U.getText();
            String zipcode = txtZipCode_U.getText();
            
            if(community.isEmpty() || zipcode.isEmpty()){
                JOptionPane.showMessageDialog(this,
                    "Enter all Fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
            }
            else if(!community.matches("[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Community",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else if(zipcode.length()!= 5 || !zipcode.matches("\\d{5}")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter 5 digit Zipcode",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                Community selectedCommunity = communityList.get(row);
                Community updatedCommunity = new Community(community, Long.parseLong(zipcode), selectedCommunity.getCityName());
                communityList.remove(row);
                communityList.add(row, updatedCommunity);
                tableModel.removeRow(row);
                Object[] data = {community, zipcode, selectedCommunity.getCityName()};
                tableModel.insertRow(row, data);
                for(City c: AddCityPanel.cityList) {
                    if(c.getCityName().equals(selectedCommunity.getCityName())) {
                        //communities = c.getCommunities();
                        for(Community comm:c.getCommunities()) {
                            if(comm.getCommunityName().equals(selectedCommunity.getCommunityName())){
                                comm.setCommunityName(community);
                                comm.setCityName(selectedCommunity.getCityName());
                                comm.setZipCode(Long.parseLong(zipcode));
                                break;
                            }
                        }
                    }
                    else {
                        communities = new ArrayList();
                    }
                }
            JOptionPane.showMessageDialog(this,
                        "Community Data Updated",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception ex) { 
        }

    }//GEN-LAST:event_btnUpdateCommunityActionPerformed

    private void txtZipCode_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCode_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCode_UActionPerformed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void loadComboBoxData(){
        cmbBoxSelectCity.removeAllItems();
        for(City city: AddCityPanel.cityList){
            cmbBoxSelectCity.addItem(city.getCityName());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunity;
    private javax.swing.JButton btnEditCommunity;
    private javax.swing.JButton btnUpdateCommunity;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JComboBox<String> cmbBoxSelectCity;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblSelectCity;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tableCommunityDetails;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtCommunityName_U;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtZipCode_U;
    // End of variables declaration//GEN-END:variables
}
