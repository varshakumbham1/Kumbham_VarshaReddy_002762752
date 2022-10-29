/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Systemadmin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.City;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;
import ui.Community.AddCityPanel;
import ui.Community.AddCommunityPanel;
import ui.Community.AddHousePanel;
import ui.HomeFrame;

/**
 *
 * @author varshareddykumbham
 */
public class SystemAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminFrame
     */
    Hospital hospital;
    DefaultTableModel tblModel;
    DefaultTableModel tblPatientModel;
    DefaultTableModel tblHospitalModel;
    DefaultTableModel tblEncounterModel;
    DefaultTableModel doctorTblModel;
    DefaultTableModel tblCityModel;
    DefaultTableModel tblCommunityModel;
    int flag;
    int patientRecordIndex;
    public static List<Community> communitiesListForCity;
    static HospitalDirectory listOfHospitals = new HospitalDirectory();
    DoctorDirectory listOfDoctors = new DoctorDirectory();
    Patient patient;
    Doctor doctor;
    static ArrayList<Patient> patients = new ArrayList<Patient>();
    PatientDirectory listOfPatients = new PatientDirectory();
    ArrayList<Long> existingHospitalCodes= new ArrayList<Long>();
    static ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
    public void setCityCombobox(){
        jComboBoxCity.removeAllItems();
        jComboBoxHospitalCity.removeAllItems();
        cbPatientCity.removeAllItems();
        jComboBoxHospitalCity_update.removeAllItems();
        cbPatientCity_update.removeAllItems();
        for(City city: AddCityPanel.cities){
            jComboBoxHospitalCity.addItem(city.getCityName());
            cbPatientCity.addItem(city.getCityName()); 
            cbPatientCity_update.addItem(city.getCityName()); 
            jComboBoxHospitalCity_update.addItem(city.getCityName());
            jComboBoxCity.addItem(city.getCityName());
        }
    }
    public void displayCityDetails(){
        tblCityModel = (DefaultTableModel)tableCities.getModel();   
        tblCityModel.setRowCount(0);
        for(City city: AddCityPanel.cities) {
            Object[] data = {city.getCityName(),city.getCityState()};
            tblCityModel.addRow(data);
        }
    }
    public void displayCommunityDetails(){
        tblCommunityModel = (DefaultTableModel)tableCommunities.getModel();   
        tblCommunityModel.setRowCount(0);
        for(Community c: AddCommunityPanel.communities) {
            Object[] data = {c.getCommunityName(),c.getCityName(),c.getPostalCode()};
            tblCommunityModel.addRow(data);
        }
    }
    
//    public void setCommunityCombobox(){
//        jComboBoxHospitalCommunity.removeAllItems();
//        cbPatientCommunity.removeAllItems();
//        jComboBoxHospitalCommunity_update.removeAllItems();
//        cbPatientCommunity_update.removeAllItems();
//        for(Community community: AddCommunityPanel.communities){
//            jComboBoxHospitalCommunity.addItem(community.getCommunityName());
//            cbPatientCommunity.addItem(community.getCommunityName());
//            jComboBoxHospitalCommunity_update.addItem(community.getCommunityName());
//             cbPatientCommunity_update.addItem(community.getCommunityName());
//        }
//    }
//    public void setHouseCombobox(){
//        jComboBoxPatientHouseNo.removeAllItems();
//        jComboBoxPatientHouseNo_update.removeAllItems();
//        for(House house: AddHousePanel.houses){
//            jComboBoxPatientHouseNo.addItem(house.getHouseNo());  
//             jComboBoxPatientHouseNo_update.addItem(house.getHouseNo());  
//        }
//    }
    public void setHospitalNameComboBox() {
        jComboBoxHospitalName.removeAllItems();
        for(Hospital hsptl:listOfHospitals.getListOfHospitals()) {
            jComboBoxHospitalName.addItem(hsptl.getHospitalName());
        }
    }
    public void setDoctorNameComboBox() {
        cmbBoxEncounterDoctorName.removeAllItems();
        for(Doctor doctor:listOfDoctors.getListOfDoctors()) {
            cmbBoxEncounterDoctorName.addItem(doctor.getName());
        }
    }
    public void displayHospitalDetails(){
        tblHospitalModel = (DefaultTableModel)tableHospitals.getModel();   
        tblHospitalModel.setRowCount(0);
        for(Hospital h: HospitalDirectory.getListOfHospitals()){
            Object[] data = {h.getHospitalName(),h.getHospitalCode(),h.getHospitalCity(),h.getHospitalCommunity(),h.getPostalCode()};
            tblHospitalModel.addRow(data);
        }
    }


    public SystemAdminFrame() {
        initComponents();
        setCityCombobox();
        displayHospitalDetails();
        displayCityDetails();
        displayCommunityDetails();
        //setCommunityCombobox();
       // setHouseCombobox();
        //this.existingHospitalCodes=existingHospitalCodes;
        tblCityModel = (DefaultTableModel)tableCities.getModel();
        tblCommunityModel = (DefaultTableModel)tableCommunities.getModel();
        tblHospitalModel = (DefaultTableModel)tableHospitals.getModel();
        tblPatientModel = (DefaultTableModel)tablePatientDetails.getModel();
        doctorTblModel = (DefaultTableModel)tableDoctors.getModel();
        tblEncounterModel = (DefaultTableModel)tableEncounters.getModel();
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
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelAddCity = new javax.swing.JPanel();
        jLabelCity = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        btnAddCity = new javax.swing.JButton();
        jLabelState = new javax.swing.JLabel();
        tfState = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableCities = new javax.swing.JTable();
        btnCityView = new javax.swing.JButton();
        btnCityEdit = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        tfCity_update = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfState_update = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnCityUpdate = new javax.swing.JButton();
        jPanelAddCommunity = new javax.swing.JPanel();
        jLabelCity1 = new javax.swing.JLabel();
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
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCommunities = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jPanelAddHospitals = new javax.swing.JPanel();
        jLabelHospitalName = new javax.swing.JLabel();
        jLabelHospitalCommunity = new javax.swing.JLabel();
        jLabelHospitalCity = new javax.swing.JLabel();
        jLabelHospitalPostalCode = new javax.swing.JLabel();
        jLabelHospitalCode = new javax.swing.JLabel();
        tfHospitalCode = new javax.swing.JTextField();
        tfHospitalName = new javax.swing.JTextField();
        tfHospitalPostalCode = new javax.swing.JTextField();
        btnAddHospital = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHospitals = new javax.swing.JTable();
        jComboBoxHospitalCity = new javax.swing.JComboBox<>();
        jComboBoxHospitalCommunity = new javax.swing.JComboBox<>();
        btnHospitalView = new javax.swing.JButton();
        btnHospitalEdit = new javax.swing.JButton();
        jLabelHospitalCode1 = new javax.swing.JLabel();
        jLabelHospitalName1 = new javax.swing.JLabel();
        jLabelHospitalCommunity2 = new javax.swing.JLabel();
        jLabelHospitalCommunity3 = new javax.swing.JLabel();
        tfHospitalName_update = new javax.swing.JTextField();
        tfHospitalPostalCode_update = new javax.swing.JTextField();
        btnHospitalUpdate = new javax.swing.JButton();
        jComboBoxHospitalCity_update = new javax.swing.JComboBox<>();
        jComboBoxHospitalCommunity_update = new javax.swing.JComboBox<>();
        jLabelHospitalName2 = new javax.swing.JLabel();
        tfHospitalCode_update = new javax.swing.JTextField();
        jPaneladdDoctors = new javax.swing.JPanel();
        jLabelDoctoreName = new javax.swing.JLabel();
        jLabelDoctorId = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelHospitalNameDoctorPanel = new javax.swing.JLabel();
        jLabelDepartment = new javax.swing.JLabel();
        tfDoctorId = new javax.swing.JTextField();
        tfDoctorName = new javax.swing.JTextField();
        rdButtonMale = new javax.swing.JRadioButton();
        rdButtonFemale = new javax.swing.JRadioButton();
        jButtonAddDoctor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDoctors = new javax.swing.JTable();
        rdButtonOther = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDoctorUsername = new javax.swing.JTextField();
        tfDoctorPassword = new javax.swing.JTextField();
        jLabelDoctoreName1 = new javax.swing.JLabel();
        jLabelDoctorId1 = new javax.swing.JLabel();
        jLabelDoctorId2 = new javax.swing.JLabel();
        jLabelHospitalNameDoctorPanel1 = new javax.swing.JLabel();
        jLabelDepartment1 = new javax.swing.JLabel();
        jLabelPhoneNum1 = new javax.swing.JLabel();
        tfDoctorName_update = new javax.swing.JTextField();
        tfDoctorAge_update = new javax.swing.JTextField();
        tfHospitalNamer_update = new javax.swing.JTextField();
        cbHospitalDepartment_update = new javax.swing.JComboBox<>();
        tfPhoneNumber_update = new javax.swing.JTextField();
        cbHospitalDepartment = new javax.swing.JComboBox<>();
        rdButtonMale_update = new javax.swing.JRadioButton();
        rdButtonFemale_update = new javax.swing.JRadioButton();
        rdButtonOther_update = new javax.swing.JRadioButton();
        jButtonDoctorView = new javax.swing.JButton();
        jButtonDoctorEdit = new javax.swing.JButton();
        btnDoctorUpdate = new javax.swing.JButton();
        jLabelDoctoreName2 = new javax.swing.JLabel();
        tfDoctorId_update = new javax.swing.JTextField();
        jComboBoxHospitalName = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jPanelAddEncounters = new javax.swing.JPanel();
        txtPatientID = new javax.swing.JTextField();
        btnGetPatientID = new javax.swing.JButton();
        lblEncounterPatientName = new javax.swing.JLabel();
        txtEncounterPatientName = new javax.swing.JTextField();
        lblEncounterPatientAge = new javax.swing.JLabel();
        txtEncounterPatientAge = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        lblHR = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtHR = new javax.swing.JTextField();
        lblEncounterDoctorName = new javax.swing.JLabel();
        cmbBoxEncounterDoctorName = new javax.swing.JComboBox<>();
        btnAddEncounter = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEncounters = new javax.swing.JTable();
        dcEncounterDate = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jPanelAddPatients = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfPatientName = new javax.swing.JTextField();
        tfPatientId = new javax.swing.JTextField();
        tfPatientAge = new javax.swing.JTextField();
        rbPatientGenderMale = new javax.swing.JRadioButton();
        rbPatientGenderFemale = new javax.swing.JRadioButton();
        rbPatientGenderOther = new javax.swing.JRadioButton();
        tfPatientCellPhone = new javax.swing.JTextField();
        tfPatientUserName = new javax.swing.JTextField();
        tfPatientPassword = new javax.swing.JTextField();
        cbPatientCommunity = new javax.swing.JComboBox<>();
        cbPatientCity = new javax.swing.JComboBox<>();
        btnAddPatient = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePatientDetails = new javax.swing.JTable();
        tfPatientPostalCode = new javax.swing.JTextField();
        btnPatientView = new javax.swing.JButton();
        btnPatientEdit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfPatientName_update = new javax.swing.JTextField();
        tfCellPhone_update = new javax.swing.JTextField();
        tfAge_update = new javax.swing.JTextField();
        rdMale_update = new javax.swing.JRadioButton();
        rdFemale_update = new javax.swing.JRadioButton();
        rdOther_update = new javax.swing.JRadioButton();
        tfPatientPostalCode_update = new javax.swing.JTextField();
        cbPatientCity_update = new javax.swing.JComboBox<>();
        cbPatientCommunity_update = new javax.swing.JComboBox<>();
        btnPatientUpdate = new javax.swing.JButton();
        jComboBoxPatientHouseNo = new javax.swing.JComboBox<>();
        jComboBoxPatientHouseNo_update = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btnLogoutHospitalAdminFrame = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane5.setViewportView(tableCities);

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

        jLabel27.setText("City");

        tfCity_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCity_updateActionPerformed(evt);
            }
        });

        jLabel28.setText("State");

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel31.setText("Update Details :");

        btnCityUpdate.setText("Update");
        btnCityUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddCityLayout = new javax.swing.GroupLayout(jPanelAddCity);
        jPanelAddCity.setLayout(jPanelAddCityLayout);
        jPanelAddCityLayout.setHorizontalGroup(
            jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCityLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCityUpdate)
                    .addGroup(jPanelAddCityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddCityLayout.createSequentialGroup()
                                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAddCity))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddCityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAddCityLayout.createSequentialGroup()
                                .addComponent(tfCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(btnCityView, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddCityLayout.createSequentialGroup()
                                .addComponent(tfState_update, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel31))
                .addContainerGap(556, Short.MAX_VALUE))
        );
        jPanelAddCityLayout.setVerticalGroup(
            jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCityLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddCityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(btnAddCity))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tfState_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCityUpdate)
                .addContainerGap(1817, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add City", jPanelAddCity);

        jLabelCity1.setText("City");

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
        jScrollPane6.setViewportView(tableCommunities);

        jLabel32.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel32.setText("Update Details:");

        javax.swing.GroupLayout jPanelAddCommunityLayout = new javax.swing.GroupLayout(jPanelAddCommunity);
        jPanelAddCommunity.setLayout(jPanelAddCommunityLayout);
        jPanelAddCommunityLayout.setHorizontalGroup(
            jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCommunityName1)
                                    .addComponent(jLabelCommunityName2)
                                    .addComponent(jLabelCommunityName3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCommunityName_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32))
                        .addGap(54, 54, 54)
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCommunityView)
                            .addComponent(btnCommunityEdit)))
                    .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                                .addComponent(jLabelPostalCode)
                                .addGap(39, 39, 39)
                                .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCommunityName)
                                    .addComponent(jLabelCity1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCommunityName, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButtonAddCommunity))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCommunityUpdate))
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanelAddCommunityLayout.setVerticalGroup(
            jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddCommunityLayout.createSequentialGroup()
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCommunityName)
                            .addComponent(tfCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCity1)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPostalCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddCommunity))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCommunityName1)
                    .addComponent(tfCommunityName_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunityView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCommunityName2)
                    .addComponent(btnCommunityEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCommunityName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommunityUpdate)
                .addContainerGap(1755, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Community", jPanelAddCommunity);

        jLabelHospitalName.setText("Hospital Name");

        jLabelHospitalCommunity.setText("Hospital Community");

        jLabelHospitalCity.setText("Hospital City");

        jLabelHospitalPostalCode.setText("Hospital PostalCode");

        jLabelHospitalCode.setText("Hospital Code");

        tfHospitalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalCodeActionPerformed(evt);
            }
        });

        tfHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalNameActionPerformed(evt);
            }
        });

        tfHospitalPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalPostalCodeActionPerformed(evt);
            }
        });

        btnAddHospital.setText("Add Hospital");
        btnAddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalActionPerformed(evt);
            }
        });

        tableHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "City", "Community", "Postal Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableHospitals);

        jComboBoxHospitalCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospitalCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospitalCityActionPerformed(evt);
            }
        });

        jComboBoxHospitalCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospitalCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospitalCommunityActionPerformed(evt);
            }
        });

        btnHospitalView.setText("View");
        btnHospitalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalViewActionPerformed(evt);
            }
        });

        btnHospitalEdit.setText("Edit");
        btnHospitalEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalEditActionPerformed(evt);
            }
        });

        jLabelHospitalCode1.setText("Hospital Community");

        jLabelHospitalName1.setText("Hospital Name");

        jLabelHospitalCommunity2.setText("Hospital City");

        jLabelHospitalCommunity3.setText("Hospital PostalCode");

        btnHospitalUpdate.setText("Update");
        btnHospitalUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalUpdateActionPerformed(evt);
            }
        });

        jComboBoxHospitalCity_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospitalCity_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospitalCity_updateActionPerformed(evt);
            }
        });

        jComboBoxHospitalCommunity_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospitalCommunity_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospitalCommunity_updateActionPerformed(evt);
            }
        });

        jLabelHospitalName2.setText("Hospital Code");

        javax.swing.GroupLayout jPanelAddHospitalsLayout = new javax.swing.GroupLayout(jPanelAddHospitals);
        jPanelAddHospitals.setLayout(jPanelAddHospitalsLayout);
        jPanelAddHospitalsLayout.setHorizontalGroup(
            jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                        .addComponent(btnHospitalUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddHospital)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddHospitalsLayout.createSequentialGroup()
                                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelHospitalName)
                                            .addComponent(jLabelHospitalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelHospitalCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelHospitalPostalCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfHospitalPostalCode)
                                    .addComponent(jComboBoxHospitalCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxHospitalCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfHospitalCode)
                                    .addComponent(tfHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                .addComponent(jLabelHospitalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHospitalName_update))
                            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                .addComponent(jLabelHospitalCommunity3)
                                .addGap(4, 4, 4)
                                .addComponent(tfHospitalPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelHospitalCode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelHospitalName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelHospitalCommunity2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHospitalCode_update)
                                    .addComponent(jComboBoxHospitalCity_update, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxHospitalCommunity_update, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                                .addComponent(btnHospitalView)
                                .addGap(30, 30, 30)
                                .addComponent(btnHospitalEdit))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146))))
        );
        jPanelAddHospitalsLayout.setVerticalGroup(
            jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHospitalName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalCode)
                            .addComponent(tfHospitalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHospitalCity)
                            .addComponent(jComboBoxHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHospitalCommunity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalPostalCode)
                            .addComponent(tfHospitalPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddHospital))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHospitalView)
                    .addComponent(btnHospitalEdit))
                .addGap(20, 20, 20)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalName1)
                    .addComponent(tfHospitalName_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalName2)
                    .addComponent(tfHospitalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalCommunity2)
                    .addComponent(jComboBoxHospitalCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalCode1)
                    .addComponent(jComboBoxHospitalCommunity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalCommunity3)
                    .addComponent(tfHospitalPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHospitalUpdate)
                .addContainerGap(1695, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Hospital", jPanelAddHospitals);

        jLabelDoctoreName.setText("Doctor name");

        jLabelDoctorId.setText("Doctor Id");

        jLabelGender.setText("Gender");

        jLabelHospitalNameDoctorPanel.setText("Hospital Name");

        jLabelDepartment.setText("Department");

        btnGenderGroup.add(rdButtonMale);
        rdButtonMale.setSelected(true);
        rdButtonMale.setText("Male");
        rdButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonMaleActionPerformed(evt);
            }
        });

        btnGenderGroup.add(rdButtonFemale);
        rdButtonFemale.setText("Female");
        rdButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonFemaleActionPerformed(evt);
            }
        });

        jButtonAddDoctor.setText("Add Doctor");
        jButtonAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDoctorActionPerformed(evt);
            }
        });

        tableDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Age", "Gender", "Hospital name", "Department", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDoctors);

        rdButtonOther.setText("Other");

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        tfDoctorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDoctorPasswordActionPerformed(evt);
            }
        });

        jLabelDoctoreName1.setText("Doctor name");

        jLabelDoctorId1.setText("Age");

        jLabelDoctorId2.setText("Gender");

        jLabelHospitalNameDoctorPanel1.setText("Hospital Name");

        jLabelDepartment1.setText("Department");

        jLabelPhoneNum1.setText("Phone Number");

        cbHospitalDepartment_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infant", "Adult", "OldAge" }));
        cbHospitalDepartment_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHospitalDepartment_updateActionPerformed(evt);
            }
        });

        cbHospitalDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infant", "Adult", "OldAge" }));
        cbHospitalDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHospitalDepartmentActionPerformed(evt);
            }
        });

        rdButtonMale_update.setText("Male");
        rdButtonMale_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonMale_updateActionPerformed(evt);
            }
        });

        rdButtonFemale_update.setText("Female");

        rdButtonOther_update.setText("Other");
        rdButtonOther_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonOther_updateActionPerformed(evt);
            }
        });

        jButtonDoctorView.setText("View");
        jButtonDoctorView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorViewActionPerformed(evt);
            }
        });

        jButtonDoctorEdit.setText("Edit");

        btnDoctorUpdate.setText("Update");

        jLabelDoctoreName2.setText("Doctor Id");

        jComboBoxHospitalName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospitalNameActionPerformed(evt);
            }
        });

        jLabel29.setText("Doctor Age");

        jLabel30.setText("CellPhone");

        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneladdDoctorsLayout = new javax.swing.GroupLayout(jPaneladdDoctors);
        jPaneladdDoctors.setLayout(jPaneladdDoctorsLayout);
        jPaneladdDoctorsLayout.setHorizontalGroup(
            jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfHospitalNamer_update, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                    .addComponent(jLabelDoctorId2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdButtonMale_update)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdButtonFemale_update))
                                .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                    .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDepartment1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbHospitalDepartment_update, 0, 121, Short.MAX_VALUE)
                                        .addComponent(tfPhoneNumber_update)))
                                .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                    .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDoctorId1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDoctoreName2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfDoctorName_update)
                                        .addComponent(tfDoctorAge_update)
                                        .addComponent(tfDoctorId_update, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdButtonOther_update)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelDoctoreName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelHospitalNameDoctorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelDoctoreName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelHospitalNameDoctorPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addComponent(jLabelDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(6, 6, 6)))
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                    .addComponent(tfDoctorId)))
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(rdButtonMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdButtonFemale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdButtonOther))
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfPhoneNumber)
                                                    .addComponent(tfAge)
                                                    .addComponent(cbHospitalDepartment, 0, 115, Short.MAX_VALUE)))
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfDoctorUsername)
                                            .addComponent(tfDoctorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                .addComponent(jButtonAddDoctor)
                                .addGap(272, 272, 272)
                                .addComponent(jButtonDoctorView)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDoctorEdit))
                            .addComponent(btnDoctorUpdate))
                        .addGap(0, 86, Short.MAX_VALUE))))
        );
        jPaneladdDoctorsLayout.setVerticalGroup(
            jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDoctoreName)
                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDoctorId)
                            .addComponent(tfDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDepartment)
                            .addComponent(cbHospitalDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGender)
                            .addComponent(rdButtonMale)
                            .addComponent(rdButtonFemale)
                            .addComponent(rdButtonOther))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHospitalNameDoctorPanel)
                            .addComponent(jComboBoxHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDoctorView)
                            .addComponent(jButtonDoctorEdit)))
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddDoctor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDoctoreName1)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addComponent(tfDoctorName_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDoctorId_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDoctoreName2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDoctorId1)
                    .addComponent(tfDoctorAge_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDoctorId2)
                    .addComponent(rdButtonMale_update)
                    .addComponent(rdButtonFemale_update)
                    .addComponent(rdButtonOther_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHospitalNameDoctorPanel1)
                    .addComponent(tfHospitalNamer_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDepartment1)
                    .addComponent(cbHospitalDepartment_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNum1)
                    .addComponent(tfPhoneNumber_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDoctorUpdate)
                .addContainerGap(1548, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Doctor", jPaneladdDoctors);

        btnGetPatientID.setText("Get Patient Details");
        btnGetPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPatientIDActionPerformed(evt);
            }
        });

        lblEncounterPatientName.setText("Patient Name");

        lblEncounterPatientAge.setText("Patient Age");

        jLabel24.setText("Encounter ID");

        jLabel25.setText("Encounter Date");

        lblTemperature.setText("Temperature");

        lblBP.setText("Blood Pressure");

        lblHR.setText("Heart Rate");

        lblEncounterDoctorName.setText("Doctor Name");

        cmbBoxEncounterDoctorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        tableEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter Id", "Encounter Date", "Name", "Temperature", "BP", "Heart Rate"
            }
        ));
        jScrollPane4.setViewportView(tableEncounters);

        jLabel26.setText("Enter PatientID :");

        javax.swing.GroupLayout jPanelAddEncountersLayout = new javax.swing.GroupLayout(jPanelAddEncounters);
        jPanelAddEncounters.setLayout(jPanelAddEncountersLayout);
        jPanelAddEncountersLayout.setHorizontalGroup(
            jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                                .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblEncounterPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEncounterPatientAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(lblTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblHR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEncounterPatientAge)
                                    .addComponent(txtEncounterID)
                                    .addComponent(txtTemperature)
                                    .addComponent(txtBP)
                                    .addComponent(txtHR)
                                    .addComponent(cmbBoxEncounterDoctorName, 0, 105, Short.MAX_VALUE)
                                    .addComponent(txtEncounterPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(dcEncounterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnAddEncounter))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetPatientID)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanelAddEncountersLayout.setVerticalGroup(
            jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetPatientID)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddEncountersLayout.createSequentialGroup()
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterPatientName)
                            .addComponent(txtEncounterPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEncounterPatientAge)
                            .addComponent(txtEncounterPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(dcEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemperature)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBP)
                            .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHR)
                            .addComponent(txtHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterDoctorName)
                            .addComponent(cmbBoxEncounterDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddEncounter))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1826, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Encounter", jPanelAddEncounters);

        jLabel4.setText("Patient Name :");

        jLabel5.setText("Patient ID :");

        jLabel6.setText("Age : ");

        jLabel7.setText("Gender :");

        jLabel8.setText("Cell Phone : ");

        jLabel9.setText("House No:");

        jLabel10.setText("City :");

        jLabel11.setText("Community : ");

        jLabel12.setText("Postal Code :");

        jLabel13.setText("UserName :");

        jLabel14.setText("Password :");

        btnGenderGroup.add(rbPatientGenderMale);
        rbPatientGenderMale.setText("Male");
        rbPatientGenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientGenderMaleActionPerformed(evt);
            }
        });

        btnGenderGroup.add(rbPatientGenderFemale);
        rbPatientGenderFemale.setText("Female");

        btnGenderGroup.add(rbPatientGenderOther);
        rbPatientGenderOther.setText("Other");
        rbPatientGenderOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientGenderOtherActionPerformed(evt);
            }
        });

        tfPatientUserName.setToolTipText("Cannot be modified");
        tfPatientUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPatientUserNameActionPerformed(evt);
            }
        });

        tfPatientPassword.setToolTipText("Cannot be modified");

        cbPatientCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPatientCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientCommunityActionPerformed(evt);
            }
        });

        cbPatientCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPatientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientCityActionPerformed(evt);
            }
        });

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        tablePatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Patient ID", "Age", "Gender", "House No.", "Community", "City", "PostalCode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablePatientDetails);

        btnPatientView.setText("View");
        btnPatientView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientViewActionPerformed(evt);
            }
        });

        btnPatientEdit.setText("Edit");
        btnPatientEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientEditActionPerformed(evt);
            }
        });

        jLabel16.setText("Patient Name ");

        jLabel17.setText("Cell Phone");

        jLabel18.setText("Age");

        jLabel19.setText("Gender");

        jLabel20.setText("House No");

        jLabel21.setText("City");

        jLabel22.setText("Community");

        jLabel23.setText("Postal Code");

        tfCellPhone_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCellPhone_updateActionPerformed(evt);
            }
        });

        rdMale_update.setText("Male");

        rdFemale_update.setText("Female");

        rdOther_update.setText("Other");

        cbPatientCity_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbPatientCommunity_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPatientUpdate.setText("Update");

        jComboBoxPatientHouseNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPatientHouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPatientHouseNoActionPerformed(evt);
            }
        });

        jComboBoxPatientHouseNo_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelAddPatientsLayout = new javax.swing.GroupLayout(jPanelAddPatients);
        jPanelAddPatients.setLayout(jPanelAddPatientsLayout);
        jPanelAddPatientsLayout.setHorizontalGroup(
            jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8))
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPatientUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addComponent(rbPatientGenderMale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPatientGenderFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPatientGenderOther))
                                    .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfPatientPostalCode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPatientCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxPatientHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfPatientCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addComponent(btnAddPatient))))
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnPatientView)
                                .addGap(18, 18, 18)
                                .addComponent(btnPatientEdit))
                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addGap(27, 27, 27)
                                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfPatientName_update)
                                                .addComponent(tfCellPhone_update)
                                                .addComponent(tfAge_update)
                                                .addComponent(tfPatientPostalCode_update, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                                                .addComponent(rdMale_update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdFemale_update)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdOther_update, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxPatientHouseNo_update, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbPatientCommunity_update, javax.swing.GroupLayout.Alignment.LEADING, 0, 104, Short.MAX_VALUE)
                                        .addComponent(cbPatientCity_update, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(btnPatientUpdate))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanelAddPatientsLayout.setVerticalGroup(
            jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(rbPatientGenderMale)
                                .addComponent(rbPatientGenderFemale)
                                .addComponent(rbPatientGenderOther))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfPatientCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cbPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxPatientHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfPatientPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(tfPatientUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tfPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPatientView)
                        .addComponent(btnPatientEdit))
                    .addComponent(btnAddPatient))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfPatientName_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfCellPhone_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfAge_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(rdMale_update)
                    .addComponent(rdFemale_update)
                    .addComponent(rdOther_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddPatientsLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cbPatientCity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cbPatientCommunity_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tfPatientPostalCode_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPatientUpdate))
                    .addComponent(jComboBoxPatientHouseNo_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1473, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Patient", jPanelAddPatients);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel15.setFont(new java.awt.Font("Kefa", 0, 18)); // NOI18N
        jLabel15.setText("System Admin");

        btnLogoutHospitalAdminFrame.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btnLogoutHospitalAdminFrame.setText("LOG OUT");
        btnLogoutHospitalAdminFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutHospitalAdminFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogoutHospitalAdminFrame)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogoutHospitalAdminFrame)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHospitalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalCodeActionPerformed

    private void tfHospitalPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalPostalCodeActionPerformed

    private void btnAddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalActionPerformed
        // TODO add your handling code here:
        if(tfHospitalName.getText().equals("")||tfHospitalPostalCode.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter All Data!");
        }
        else{
                if(tfHospitalCode.getText().length() == 5){ 
                    if(this.existingHospitalCodes.contains(Long.valueOf(tfHospitalCode.getText()))){
                        JOptionPane.showMessageDialog(this, "Please enter a unique Hospital Code!");
                        System.out.println(existingHospitalCodes+"Hi");
                        return; 
                    }else{
                        Long temp = Long.valueOf(tfHospitalCode.getText());
                        existingHospitalCodes.add( temp);
                        System.out.println(existingHospitalCodes);
                    }   
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please enter a valid Hospital Code - it has to be a 5 digit character code of letters and numbers!");
                    return;
                }
            
        }
        if(flag==0){
            String name = tfHospitalName.getText();
            Long code = Long.valueOf(tfHospitalCode.getText());
            String community = (String)jComboBoxHospitalCommunity.getSelectedItem();
            String city = (String) jComboBoxHospitalCity.getSelectedItem();
            Long postalCode = Long.valueOf(tfHospitalPostalCode.getText());
            hospital = new Hospital(name, community, code, city, postalCode);
            listOfHospitals.getListOfHospitals().add(hospital);
            Object[] data = {name, code, city, community, postalCode};
            tblHospitalModel.addRow(data);
            setHospitalNameComboBox();
            JOptionPane.showMessageDialog(this, "Hospital Information saved!"); 
        }
        tfHospitalName.setText("");
        tfHospitalCode.setText("");
        //displayHospitalDetails();
    }//GEN-LAST:event_btnAddHospitalActionPerformed

    private void rdButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButtonMaleActionPerformed

    private void rdButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButtonFemaleActionPerformed

    private void btnLogoutHospitalAdminFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutHospitalAdminFrameActionPerformed

        this.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogoutHospitalAdminFrameActionPerformed

    private void rbPatientGenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientGenderMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPatientGenderMaleActionPerformed

    private void rbPatientGenderOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientGenderOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPatientGenderOtherActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        flag=0;
        if(tfPatientName.getText().equals("") || tfPatientId.getText().equals("")||tfPatientAge.getText().equals("")||
               tfPatientCellPhone.getText().equals("")||tfPatientPostalCode.getText().equals("")||
                tfPatientUserName.getText().equals("")||tfPatientPassword.getText().equals(""))       
            JOptionPane.showMessageDialog(this, "Please enter All Data!");
        else{
            for(Patient p : listOfPatients.getListOfPatients()){
                if(p.getId().equals(tfPatientId.getText())){
                    JOptionPane.showMessageDialog(this, "Patient already exists!");
                    flag=1;
                }
            }
        } 
        if(flag==0){
            String name = tfPatientName.getText();
            String id = tfPatientId.getText();
            int age = Integer.parseInt(tfPatientAge.getText());
            String houseNo = (String)jComboBoxPatientHouseNo.getSelectedItem();

            rbPatientGenderMale.setActionCommand("Male");
            rbPatientGenderFemale.setActionCommand("Female");
            rbPatientGenderOther.setActionCommand("Other");
            String gender = btnGenderGroup.getSelection().getActionCommand();

            String cellphone = (tfPatientCellPhone.getText());
            String community = (String)cbPatientCommunity.getSelectedItem();
            String city = (String)cbPatientCity.getSelectedItem();
            Long postalcode = Long.valueOf(tfPatientPostalCode.getText());
            String username = tfPatientUserName.getText();
            String password = tfPatientPassword.getText();
            EncounterHistory encounterHistory = new EncounterHistory();

            patient = new Patient(cellphone,houseNo,community, city, postalcode, name,id,age,gender,username,password,encounterHistory );
            listOfPatients.getListOfPatients().add(patient);
            Object[] data = {name, id, age, gender, houseNo, community, city, postalcode };
            tblPatientModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Patient Information saved!"); 
        }
               
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void cbPatientCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientCommunityActionPerformed
        jComboBoxPatientHouseNo.removeAllItems();
        String chosenCity = String.valueOf(cbPatientCity.getSelectedItem());
        String chosenCommunity = String.valueOf(cbPatientCommunity.getSelectedItem());
        System.out.println(chosenCity);
        System.out.println(chosenCommunity);
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    if(comm.getCommunityName().equals(chosenCommunity)) {
                        System.out.println(comm.getPostalCode());
                        tfPatientPostalCode.setText(comm.getPostalCode().toString());
                    }

                    for(House h:comm.getHousesList()) {
                        if(h.getCommunityName().equals(chosenCommunity)) {
                            System.out.println("Hello"+h.getHouseNo());
                            jComboBoxPatientHouseNo.addItem(h.getHouseNo()); 
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_cbPatientCommunityActionPerformed

    private void tfDoctorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDoctorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDoctorPasswordActionPerformed

    private void btnPatientEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientEditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPatientEditActionPerformed

    private void btnHospitalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalViewActionPerformed

        int row = tableHospitals.getSelectedRow();
        try{
            TableModel model = tableHospitals.getModel();
            String hospitalName = model.getValueAt(row, 0).toString();
            String code = model.getValueAt(row, 1).toString();
            String city = model.getValueAt(row, 2).toString();
            String community = model.getValueAt(row, 3).toString();
            String postalCode = model.getValueAt(row, 4).toString();
            
            tfHospitalName_update.setText(hospitalName);
            tfHospitalName_update.setEditable(false);
            tfHospitalCode_update.setText(code);
            tfHospitalCode_update.setEditable(false);
            jComboBoxHospitalCity_update.setEnabled(false);
            jComboBoxHospitalCommunity_update.setEnabled(false);
            tfHospitalPostalCode_update.setText(postalCode);
            tfHospitalPostalCode_update.setEditable(false);
        }
        catch(Exception e){
            if(row==-1) {
                JOptionPane.showMessageDialog(this,
                            "Please Select a row",
                            "Try Again",
                            JOptionPane.ERROR_MESSAGE);
            }
        }   
    }//GEN-LAST:event_btnHospitalViewActionPerformed

    private void tfHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalNameActionPerformed

    private void tfCellPhone_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCellPhone_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCellPhone_updateActionPerformed

    private void btnPatientViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientViewActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPatientViewActionPerformed

    private void btnHospitalEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalEditActionPerformed
        // TODO add your handling code here:
         tfHospitalName_update.setEditable(true);
         jComboBoxHospitalCity_update.setEnabled(true);
         jComboBoxHospitalCommunity_update.setEnabled(true);
         tfHospitalPostalCode_update.setEditable(true);
         
        
    }//GEN-LAST:event_btnHospitalEditActionPerformed

    private void rdButtonMale_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonMale_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButtonMale_updateActionPerformed

    private void rdButtonOther_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonOther_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButtonOther_updateActionPerformed

    private void jButtonDoctorViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctorViewActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonDoctorViewActionPerformed

    private void btnHospitalUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalUpdateActionPerformed
        // TODO add your handling code here:
        String hospitalName = tfHospitalName_update.getText();
        Long code = Long.valueOf(tfHospitalCode_update.getText());
        String hospitalCity = (String)jComboBoxHospitalCity_update.getSelectedItem();
        String hospitalCommunity = (String)jComboBoxHospitalCommunity_update.getSelectedItem();
        String hospitalPostalCode = tfHospitalPostalCode_update.getText();
        
        DefaultTableModel tableModel = (DefaultTableModel) tableHospitals.getModel();
        int row=tableHospitals.getSelectedRow();
        tableModel.removeRow(row);
        Object[] hospitalData = {hospitalName, code, hospitalCity, hospitalCommunity, hospitalPostalCode }; 
        tableModel.insertRow(row, hospitalData);
        
        ArrayList <Hospital> hospitalList = HospitalDirectory.listOfHospitals;
        Hospital updatedHospital = new Hospital(hospitalName, hospitalCommunity,code, hospitalCity, Long.valueOf(hospitalPostalCode) );
        for(Hospital h : HospitalDirectory.listOfHospitals){
            if(h.getHospitalCode().equals(code)){
                int index = HospitalDirectory.listOfHospitals.indexOf(h);
                HospitalDirectory.listOfHospitals.remove(index);
                HospitalDirectory.listOfHospitals.add(index, updatedHospital);
                break;
            }
        }   
        JOptionPane.showMessageDialog(this, "Hospital Information updated!"); 
        
    }//GEN-LAST:event_btnHospitalUpdateActionPerformed

    private void cbHospitalDepartment_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHospitalDepartment_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHospitalDepartment_updateActionPerformed

    private void btnGetPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPatientIDActionPerformed
        // TODO add your handling code here:
        try {
            patientRecordIndex = 0;
            String patientId = txtPatientID.getText();
            if (patientId.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Enter Patient Id",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
            } else {
                for (Patient p : listOfPatients.getListOfPatients()) {
                    if (p.getId().equals(patientId)) {
                        txtEncounterPatientName.setText(p.getName());
                        int age = p.getAge();
                        txtEncounterPatientAge.setText(String.valueOf(age));
                        patientRecordIndex = 1;
                        break;
                    }

                }
                if(patientRecordIndex == 0){

                    JOptionPane.showMessageDialog(this,
                        "No Patient Record Found for Patient Id : " + " " + patientId,
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
                }
                else if(!encounterList.isEmpty() && patientRecordIndex == 1) {
                    tblEncounterModel.setRowCount(0);
                    for (Encounter en : encounterList) {
                        if (en.getPatientId().equals(patientId)) {
                            SimpleDateFormat dateformat = new SimpleDateFormat("dd / MM / yy");
                            String date = dateformat.format(en.getEncounterDate());
                            Object[] data = {en.getEncounterId(), date, en.getPatientName(), en.getPatientAge(),
                                en.getVitalSigns().getTemperature(), en.getVitalSigns().getBloodPressure(), en.getVitalSigns().getHeartRate()};

                            tblEncounterModel.addRow(data);
                            System.out.println(en.getPatientId());
                        }
                    }
                }
            }
        } catch (Exception ex) {
                System.out.println(ex);
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
            String doctorName = (String) cmbBoxEncounterDoctorName.getSelectedItem();
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

    private void cbPatientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientCityActionPerformed
        // TODO add your handling code here:
        cbPatientCommunity.removeAllItems();
        String chosenCity = String.valueOf(cbPatientCity.getSelectedItem());
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    cbPatientCommunity.addItem(comm.getCommunityName());
                }
            }
        }
    }//GEN-LAST:event_cbPatientCityActionPerformed

    private void tfPatientUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPatientUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPatientUserNameActionPerformed

    private void cbHospitalDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHospitalDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHospitalDepartmentActionPerformed

    private void jButtonAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDoctorActionPerformed
        // TODO add your handling code here:
       
            String name = tfDoctorName.getText();
            String id = tfDoctorId.getText();
            int age = Integer.parseInt((tfAge.getText()));
            rdButtonMale.setActionCommand("Male");
            rdButtonFemale.setActionCommand("Female");
            String gender = btnGenderGroup.getSelection().getActionCommand();
            String hospitalName = (String) jComboBoxHospitalName.getSelectedItem();
            String department = (String)cbHospitalDepartment.getSelectedItem();
            String phoneNumber = tfPhoneNumber.getText();
            String userName = tfDoctorUsername.getText();
            String passWord = tfDoctorPassword.getText();
            doctor = new Doctor(hospitalName, department, phoneNumber, name, id, age, gender, userName, passWord);
            listOfDoctors.getListOfDoctors().add(doctor);
            Object[] data = {name, id, age, gender, hospitalName, department, phoneNumber};
            doctorTblModel.addRow(data);
            setDoctorNameComboBox();
        
    }//GEN-LAST:event_jButtonAddDoctorActionPerformed

    private void jComboBoxHospitalCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospitalCommunityActionPerformed
        // TODO add your handling code here:
        String chosenCity = String.valueOf(jComboBoxHospitalCity.getSelectedItem());
        String chosenCommunity = String.valueOf(jComboBoxHospitalCommunity.getSelectedItem());
        System.out.println(chosenCity);
        System.out.println(chosenCommunity);
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    if(comm.getCommunityName().equals(chosenCommunity)) {
                        System.out.println(comm.getPostalCode());
                        tfHospitalPostalCode.setText(comm.getPostalCode().toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBoxHospitalCommunityActionPerformed

    private void jComboBoxHospitalCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospitalCityActionPerformed
        // TODO add your handling code here:
        jComboBoxHospitalCommunity.removeAllItems();
        String chosenCity = String.valueOf(jComboBoxHospitalCity.getSelectedItem());
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    jComboBoxHospitalCommunity.addItem(comm.getCommunityName());
                }
            }
        }
    }//GEN-LAST:event_jComboBoxHospitalCityActionPerformed

    private void jComboBoxHospitalCity_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospitalCity_updateActionPerformed
        // TODO add your handling code here:
        jComboBoxHospitalCommunity_update.removeAllItems();
        String chosenCity = String.valueOf(jComboBoxHospitalCity_update.getSelectedItem());
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    jComboBoxHospitalCommunity_update.addItem(comm.getCommunityName());
                }
            }
        }
    }//GEN-LAST:event_jComboBoxHospitalCity_updateActionPerformed

    private void jComboBoxHospitalCommunity_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospitalCommunity_updateActionPerformed
        // TODO add your handling code here:
        String chosenCity = String.valueOf(jComboBoxHospitalCity_update.getSelectedItem());
        String chosenCommunity = String.valueOf(jComboBoxHospitalCommunity_update.getSelectedItem());
        System.out.print(chosenCity+" ");
        System.out.print(" "+chosenCommunity);
        for(City obj :  AddCityPanel.cities) {
            if(obj.getCityName().equals((chosenCity))) {
                for(Community comm: obj.getCommunities()) {
                    if(comm.getCommunityName().equals(chosenCommunity)) {
                        System.out.print(" "+comm.getPostalCode()+" ");
                        tfHospitalPostalCode_update.setText(comm.getPostalCode().toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBoxHospitalCommunity_updateActionPerformed

    private void jComboBoxPatientHouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPatientHouseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPatientHouseNoActionPerformed

    private void tfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNumberActionPerformed

    private void jComboBoxHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHospitalNameActionPerformed

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        flag=0;
        if(tfCity.getText().isEmpty()||tfState.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter City & State Data!");
            flag=1;
        }
        else{
            for(City c: AddCityPanel.cities){
                if(c.getCityName().equals(tfCity.getText())){
                    JOptionPane.showMessageDialog(this, "City already exists!");
                    flag =2;
                }
            }
        }
        if(flag==0){
            String cityName = tfCity.getText();
            String cityState = tfState.getText();
            List<Community> communitiesListForCity = new ArrayList();

            City city = new City(cityName, communitiesListForCity, cityState);
            AddCityPanel.cities.add(city);
            Object[] data = {cityName, cityState};
            tblCityModel.addRow(data);
            JOptionPane.showMessageDialog(this, "City informatiom saved!");
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
        int row = tableCities.getSelectedRow();
        try{
            if(tfCity_update.getText().equals("")||tfState_update.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter All Data to Update!");

            }}
            catch(Exception e){
                if(row==-1) {
                    JOptionPane.showMessageDialog(this,
                        "Please Select a row",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
                }
            }

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
            tfCity_update.setText("");
            tfState_update.setText("");
    }//GEN-LAST:event_btnCityUpdateActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed

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
            for(Community c : AddCommunityPanel.communities){
                if(c.getCommunityName().equals(community)||c.getPostalCode().equals(postalCode)){
                    JOptionPane.showMessageDialog(this, "Community already exists!");
                    flag=2;
                }
            }
        }
        if(flag==0){
            List<House> housesListForCommunity = new ArrayList();
            Community comm = new Community(community, postalCode,city,housesListForCommunity);
            //comm = new Community(community, postalCode, city);
            AddCommunityPanel.communities.add(comm);

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
            tblCommunityModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Community information saved!");
        }
        tfCommunityName.setText("");
        tfPostalCode.setText("");
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jComboBoxCity_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCity_updateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxCity_updateActionPerformed

    private void tfPostalCode_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPostalCode_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPostalCode_updateActionPerformed

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

    private void btnCommunityEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityEditActionPerformed
        // TODO add your handling code here:
        tfCommunityName_update.setEditable(true);
        tfPostalCode_update.setEditable(true);
        jComboBoxCity_update.setEnabled(true);
    }//GEN-LAST:event_btnCommunityEditActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnAddHospital;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnCityEdit;
    private javax.swing.JButton btnCityUpdate;
    private javax.swing.JButton btnCityView;
    private javax.swing.JButton btnCommunityEdit;
    private javax.swing.JButton btnCommunityUpdate;
    private javax.swing.JButton btnCommunityView;
    private javax.swing.JButton btnDoctorUpdate;
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnGetPatientID;
    private javax.swing.JButton btnHospitalEdit;
    private javax.swing.JButton btnHospitalUpdate;
    private javax.swing.JButton btnHospitalView;
    private javax.swing.JButton btnLogoutHospitalAdminFrame;
    private javax.swing.JButton btnPatientEdit;
    private javax.swing.JButton btnPatientUpdate;
    private javax.swing.JButton btnPatientView;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbHospitalDepartment;
    private javax.swing.JComboBox<String> cbHospitalDepartment_update;
    private javax.swing.JComboBox<String> cbPatientCity;
    private javax.swing.JComboBox<String> cbPatientCity_update;
    private javax.swing.JComboBox<String> cbPatientCommunity;
    private javax.swing.JComboBox<String> cbPatientCommunity_update;
    private javax.swing.JComboBox<String> cmbBoxEncounterDoctorName;
    private com.toedter.calendar.JDateChooser dcEncounterDate;
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JButton jButtonAddDoctor;
    private javax.swing.JButton jButtonDoctorEdit;
    private javax.swing.JButton jButtonDoctorView;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxCity_update;
    private javax.swing.JComboBox<String> jComboBoxHospitalCity;
    private javax.swing.JComboBox<String> jComboBoxHospitalCity_update;
    private javax.swing.JComboBox<String> jComboBoxHospitalCommunity;
    private javax.swing.JComboBox<String> jComboBoxHospitalCommunity_update;
    private javax.swing.JComboBox<String> jComboBoxHospitalName;
    private javax.swing.JComboBox<String> jComboBoxPatientHouseNo;
    private javax.swing.JComboBox<String> jComboBoxPatientHouseNo_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelCity1;
    private javax.swing.JLabel jLabelCommunityName;
    private javax.swing.JLabel jLabelCommunityName1;
    private javax.swing.JLabel jLabelCommunityName2;
    private javax.swing.JLabel jLabelCommunityName3;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelDepartment1;
    private javax.swing.JLabel jLabelDoctorId;
    private javax.swing.JLabel jLabelDoctorId1;
    private javax.swing.JLabel jLabelDoctorId2;
    private javax.swing.JLabel jLabelDoctoreName;
    private javax.swing.JLabel jLabelDoctoreName1;
    private javax.swing.JLabel jLabelDoctoreName2;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHospitalCity;
    private javax.swing.JLabel jLabelHospitalCode;
    private javax.swing.JLabel jLabelHospitalCode1;
    private javax.swing.JLabel jLabelHospitalCommunity;
    private javax.swing.JLabel jLabelHospitalCommunity2;
    private javax.swing.JLabel jLabelHospitalCommunity3;
    private javax.swing.JLabel jLabelHospitalName;
    private javax.swing.JLabel jLabelHospitalName1;
    private javax.swing.JLabel jLabelHospitalName2;
    private javax.swing.JLabel jLabelHospitalNameDoctorPanel;
    private javax.swing.JLabel jLabelHospitalNameDoctorPanel1;
    private javax.swing.JLabel jLabelHospitalPostalCode;
    private javax.swing.JLabel jLabelPhoneNum1;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAddCity;
    private javax.swing.JPanel jPanelAddCommunity;
    private javax.swing.JPanel jPanelAddEncounters;
    private javax.swing.JPanel jPanelAddHospitals;
    private javax.swing.JPanel jPanelAddPatients;
    private javax.swing.JPanel jPaneladdDoctors;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblEncounterDoctorName;
    private javax.swing.JLabel lblEncounterPatientAge;
    private javax.swing.JLabel lblEncounterPatientName;
    private javax.swing.JLabel lblHR;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JRadioButton rbPatientGenderFemale;
    private javax.swing.JRadioButton rbPatientGenderMale;
    private javax.swing.JRadioButton rbPatientGenderOther;
    private javax.swing.JRadioButton rdButtonFemale;
    private javax.swing.JRadioButton rdButtonFemale_update;
    private javax.swing.JRadioButton rdButtonMale;
    private javax.swing.JRadioButton rdButtonMale_update;
    private javax.swing.JRadioButton rdButtonOther;
    private javax.swing.JRadioButton rdButtonOther_update;
    private javax.swing.JRadioButton rdFemale_update;
    private javax.swing.JRadioButton rdMale_update;
    private javax.swing.JRadioButton rdOther_update;
    private javax.swing.JTable tableCities;
    private javax.swing.JTable tableCommunities;
    private javax.swing.JTable tableDoctors;
    private javax.swing.JTable tableEncounters;
    private javax.swing.JTable tableHospitals;
    private javax.swing.JTable tablePatientDetails;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfAge_update;
    private javax.swing.JTextField tfCellPhone_update;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCity_update;
    private javax.swing.JTextField tfCommunityName;
    private javax.swing.JTextField tfCommunityName_update;
    private javax.swing.JTextField tfDoctorAge_update;
    private javax.swing.JTextField tfDoctorId;
    private javax.swing.JTextField tfDoctorId_update;
    private javax.swing.JTextField tfDoctorName;
    private javax.swing.JTextField tfDoctorName_update;
    private javax.swing.JTextField tfDoctorPassword;
    private javax.swing.JTextField tfDoctorUsername;
    private javax.swing.JTextField tfHospitalCode;
    private javax.swing.JTextField tfHospitalCode_update;
    private javax.swing.JTextField tfHospitalName;
    private javax.swing.JTextField tfHospitalName_update;
    private javax.swing.JTextField tfHospitalNamer_update;
    private javax.swing.JTextField tfHospitalPostalCode;
    private javax.swing.JTextField tfHospitalPostalCode_update;
    private javax.swing.JTextField tfPatientAge;
    private javax.swing.JTextField tfPatientCellPhone;
    private javax.swing.JTextField tfPatientId;
    private javax.swing.JTextField tfPatientName;
    private javax.swing.JTextField tfPatientName_update;
    private javax.swing.JTextField tfPatientPassword;
    private javax.swing.JTextField tfPatientPostalCode;
    private javax.swing.JTextField tfPatientPostalCode_update;
    private javax.swing.JTextField tfPatientUserName;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfPhoneNumber_update;
    private javax.swing.JTextField tfPostalCode;
    private javax.swing.JTextField tfPostalCode_update;
    private javax.swing.JTextField tfState;
    private javax.swing.JTextField tfState_update;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtEncounterPatientAge;
    private javax.swing.JTextField txtEncounterPatientName;
    private javax.swing.JTextField txtHR;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
