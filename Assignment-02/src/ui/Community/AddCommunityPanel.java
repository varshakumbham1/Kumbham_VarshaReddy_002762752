/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import java.util.ArrayList;
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
    Community comm;
    DefaultTableModel tblModel;
    static ArrayList<Community> communities = new ArrayList<>();
    public void setCityCombobox(){
        jComboBoxCity.removeAllItems();
        for(City city: AddCityPanel.cities){
            jComboBoxCity.addItem(city.getCityName());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCommunities = new javax.swing.JTable();
        jButtonAddCommunity = new javax.swing.JButton();

        jLabelCity.setText("City");

        jLabelCommunityName.setText("Community Name");

        jLabelPostalCode.setText("Postal Code");

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });

        tableCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Community Name", "Postal Code", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCommunities);

        jButtonAddCommunity.setText("Add Community");
        jButtonAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPostalCode)
                            .addComponent(jLabelCity))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonAddCommunity)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCommunityName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCommunityName)
                            .addComponent(tfCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPostalCode)
                            .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCity))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddCommunity))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCommunityActionPerformed
        // TODO add your handling code here:
        String community = tfCommunityName.getText();
        String city = (String) jComboBoxCity.getSelectedItem();
        Long postalCode = Long.valueOf(tfPostalCode.getText());
        comm = new Community(community, postalCode, city);
        communities.add(comm);
        Object[] data = {community, postalCode, city};
        tblModel.addRow(data);
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelCommunityName;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCommunities;
    private javax.swing.JTextField tfCommunityName;
    private javax.swing.JTextField tfPostalCode;
    // End of variables declaration//GEN-END:variables
}
