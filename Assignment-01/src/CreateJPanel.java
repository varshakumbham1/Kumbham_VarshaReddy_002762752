
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    String chosenImagePath;
    Employee emp;
    static ArrayList<Employee> empObjs = new ArrayList<>();
    public CreateJPanel(Employee emp) {
        initComponents();
        this.emp = emp;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        tfName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelEmployeeId = new javax.swing.JLabel();
        tfEmployeeId = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabelStartDate = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        tfLevel = new javax.swing.JTextField();
        jLabelTeamInfo = new javax.swing.JLabel();
        tfTeamInfo = new javax.swing.JTextField();
        jLabelPositionTitle = new javax.swing.JLabel();
        tfPositionTitle = new javax.swing.JTextField();
        jLabelContactInfo = new javax.swing.JLabel();
        jLabelCellPhone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        tfCellPhone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jStartDate = new com.toedter.calendar.JDateChooser();
        btnUploadPhoto = new javax.swing.JButton();
        jLabelPhoto = new javax.swing.JLabel();

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabelName.setText("Name");

        jLabelEmployeeId.setText("Employee Id");

        tfEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmployeeIdActionPerformed(evt);
            }
        });

        jLabelAge.setText("Age");

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabelGender.setText("Gender");

        btnGenderGroup.add(rdMale);
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        btnGenderGroup.add(rdFemale);
        rdFemale.setText("Female");

        jLabelStartDate.setText("Start Date");

        jLabelLevel.setText("Level");

        tfLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLevelActionPerformed(evt);
            }
        });

        jLabelTeamInfo.setText("Team Info");

        tfTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTeamInfoActionPerformed(evt);
            }
        });

        jLabelPositionTitle.setText("Position Title");

        tfPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPositionTitleActionPerformed(evt);
            }
        });

        jLabelContactInfo.setText("Contact Info");

        jLabelCellPhone.setText("Cell Phone");

        jLabelEmail.setText("Email");

        tfCellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCellPhoneActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jStartDate.setDateFormatString("dd-MM-yyyy");

        btnUploadPhoto.setText("Upload Photo");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCellPhone)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdFemale)
                                            .addGap(13, 13, 13))
                                        .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmployeeId)
                    .addComponent(tfEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStartDate)
                    .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLevel)
                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeamInfo)
                    .addComponent(tfTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelPositionTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContactInfo)
                    .addComponent(jLabelCellPhone)
                    .addComponent(tfCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmployeeIdActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMaleActionPerformed

    private void tfLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLevelActionPerformed

    private void tfTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTeamInfoActionPerformed

    private void tfPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPositionTitleActionPerformed

    private void tfCellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCellPhoneActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String name = tfName.getText();
            String eid = tfEmployeeId.getText();
            int age = Integer.parseInt(tfAge.getText());
            rdMale.setActionCommand("Male");
            rdFemale.setActionCommand("Female");
            String gender = btnGenderGroup.getSelection().getActionCommand();
            
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");  
            String startDate = dateFormat.format(jStartDate.getDate());
            
            String level = tfLevel.getText();
            String teamInfo = tfTeamInfo.getText();
            String positionTitle = tfPositionTitle.getText();
            String cellPhone = tfCellPhone.getText();
            String email = tfEmail.getText();
            
            

            if(name.isEmpty() || eid.isEmpty() || gender.isEmpty() || startDate.isEmpty()|| 
                    tfAge.getText().equals("") || level.isEmpty() || teamInfo.isEmpty() || 
                    positionTitle.isEmpty() || cellPhone.isEmpty() || email.isEmpty() || chosenImagePath.isEmpty()){
                    
                JOptionPane.showMessageDialog(this,
                            "Please enter all fields",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);       
            }
            else if(!name.matches("^[A-Z][a-z]+[ ]*[A-Za-z]*$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Name",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else if(cellPhone.length()!= 10 || !cellPhone.matches("\\d{10}")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Phone Number",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else if(!email.matches("^[a-z0-9]+@[a-z]+\\.[a-z]+$")){
                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Email Address",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else {
                Employee emp = new Employee(name, eid, age, gender, startDate,
                                level, teamInfo, positionTitle, cellPhone, email, chosenImagePath);
                                    empObjs.add(emp);
                                    JOptionPane.showMessageDialog(this,
                            "Employee Data Saved",
                            "Done", 
                            JOptionPane.INFORMATION_MESSAGE);
//                 if (evt.getSource() == btnSave)
//                    {
//                        if(empObjs.size() > 0) {
//                            for(Employee e: empObjs) {
//                                //e.getEid()
//                                if(e.getEid().equals(eid)) {
//                                    JOptionPane.showMessageDialog(this,
//                            "Employee Data Already Exists!",
//                            "Try Again", 
//                            JOptionPane.ERROR_MESSAGE);
//                                    break;
//                                }
//                                
//                                else {
//                                    Employee emp = new Employee(name, eid, age, gender, startDate,
//                                level, teamInfo, positionTitle, cellPhone, email, chosenImagePath);
//                                    empObjs.add(emp);
//                                    JOptionPane.showMessageDialog(this,
//                            "Employee Data Saved",
//                            "Done", 
//                            JOptionPane.INFORMATION_MESSAGE);
//                                    break;
//                                }
//                            }
//                        }
//                        else {
//                                    Employee emp = new Employee(name, eid, age, gender, startDate,
//                                level, teamInfo, positionTitle, cellPhone, email, chosenImagePath);
//                                    empObjs.add(emp);
//                                    JOptionPane.showMessageDialog(this,
//                            "Employee Data Saved",
//                            "Done", 
//                            JOptionPane.INFORMATION_MESSAGE);
//                                   
//                                }
                        
                    }
            }
        catch(Exception ex) {
            
            JOptionPane.showMessageDialog(this,
                        "Enter all fields",
                        "Try Again", 
                        JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
              }

    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        JFileChooser l_ImageChooser = new JFileChooser();
        l_ImageChooser.setCurrentDirectory(new File("user.dir"));

        FileNameExtensionFilter imageExtensions = new FileNameExtensionFilter(" All Pic", "png", "jpeg","jpg","gif");
        l_ImageChooser.addChoosableFileFilter(imageExtensions);

        int a = l_ImageChooser.showSaveDialog(null);
        if(a == JFileChooser.APPROVE_OPTION)
        {
            File f = l_ImageChooser.getSelectedFile();
            chosenImagePath = f.getAbsolutePath();
            ImageIcon chosenImage = new ImageIcon(chosenImagePath);
            Image l_image = chosenImage.getImage().getScaledInstance(jLabelPhoto.getWidth(), 
                    jLabelPhoto.getHeight(), Image.SCALE_SMOOTH);
            jLabelPhoto.setIcon(new ImageIcon(l_image));
        }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCellPhone;
    private javax.swing.JLabel jLabelContactInfo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmployeeId;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPositionTitle;
    private javax.swing.JLabel jLabelStartDate;
    private javax.swing.JLabel jLabelTeamInfo;
    private com.toedter.calendar.JDateChooser jStartDate;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCellPhone;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmployeeId;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPositionTitle;
    private javax.swing.JTextField tfTeamInfo;
    // End of variables declaration//GEN-END:variables
}
