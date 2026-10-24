/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.zuj.vp.sem2;

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author heba zedan
 */
public class frmRegistration extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistration
     */
    public frmRegistration() {
        initComponents();
        btnGender.add(rdMale);
        btnGender.add(rdFemale);

    }

    public boolean CheckData() {

        String firstName = txtFirstName.getText().trim();

        if (firstName.equals("")) {
            txtFirstName.requestFocus();
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "First Name is required");
            return false;
        } else {
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String secondName = txtSecondName.getText().trim();

        if (secondName.equals("")) {
            txtSecondName.requestFocus();
            txtSecondName.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Second Name is required");
            return false;
        } else {
            txtSecondName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String thirdName = txtThirdName.getText().trim();

        if (thirdName.equals("")) {
            txtThirdName.requestFocus();
            txtThirdName.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Third Name is required");
            return false;
        } else {
            txtThirdName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String lastName = txtLastName.getText().trim();

        if (lastName.equals("")) {
            txtLastName.requestFocus();
            txtLastName.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Last Name is required");
            return false;
        } else {
            txtLastName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String dob = txtDOB.getText().trim();

        if (dob.equals("")) {
            txtDOB.requestFocus();
            txtDOB.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Date Of Birth is required");
            return false;
        } else {
            txtDOB.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String parentName = txtParentName.getText().trim();

        if (parentName.equals("")) {
            txtParentName.requestFocus();
            txtParentName.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Parent Name is required");
            return false;
        } else {
            txtParentName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String phone = txtPhoneNumber.getText().trim();

        if (phone.equals("")) {
            txtPhoneNumber.requestFocus();
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Phone Number is required");
            return false;
        } else {
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (!phone.matches("\\d{10}")) {
            txtPhoneNumber.requestFocus();
            txtPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Phone Number must contain 10 digits");
            return false;
        }

        String email = txtEmailAddress.getText().trim();

        if (email.equals("")) {
            txtEmailAddress.requestFocus();
            txtEmailAddress.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Email Address is required");
            return false;
        } else {
            txtEmailAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (!email.contains("@") || !email.contains(".")) {
            txtEmailAddress.requestFocus();
            txtEmailAddress.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Invalid Email Address");
            return false;
        }

        String address = txtAddress.getText().trim();

        if (address.equals("")) {
            txtAddress.requestFocus();
            txtAddress.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            JOptionPane.showMessageDialog(this, "Address is required");
            return false;
        } else {
            txtAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        JOptionPane.showMessageDialog(this, "Registration Saved Successfully");

        return true;
    }

    public void ClearData() {
        txtFirstName.setText("");
        txtSecondName.setText("");
        txtThirdName.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtParentName.setText("");
        txtPhoneNumber.setText("");
        txtEmailAddress.setText("");
        txtAddress.setText("");
        txtMidicalConditions.setText("");
        btnGender.clearSelection();
        cmbBloodType.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnGender = new javax.swing.ButtonGroup();
        pnlChildInformation = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        ChildInformatio = new javax.swing.JLabel();
        pnlName = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblSecondName = new javax.swing.JLabel();
        txtSecondName = new javax.swing.JTextField();
        lblThirdName = new javax.swing.JLabel();
        txtThirdName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        pnlPersonalInfo = new javax.swing.JPanel();
        lblGender = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lblBloodType = new javax.swing.JLabel();
        cmbBloodType = new javax.swing.JComboBox<>();
        lblMedicalConditions = new javax.swing.JLabel();
        spMedicalConditions = new javax.swing.JScrollPane();
        txtMidicalConditions = new javax.swing.JTextArea();
        pnlParent = new javax.swing.JPanel();
        lblParentName = new javax.swing.JLabel();
        txtParentName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnSaveRegistration = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Child Registration");
        setResizable(false);

        pnlChildInformation.setBackground(new java.awt.Color(102, 51, 0));
        pnlChildInformation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlChildInformation.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Child Registration");

        lblSubtitle.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setText("Register a new child in the child care management ");

        javax.swing.GroupLayout pnlChildInformationLayout = new javax.swing.GroupLayout(pnlChildInformation);
        pnlChildInformation.setLayout(pnlChildInformationLayout);
        pnlChildInformationLayout.setHorizontalGroup(
            pnlChildInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildInformationLayout.createSequentialGroup()
                .addGroup(pnlChildInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChildInformationLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblSubtitle))
                    .addGroup(pnlChildInformationLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChildInformationLayout.setVerticalGroup(
            pnlChildInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChildInformationLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ChildInformatio.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        ChildInformatio.setForeground(new java.awt.Color(102, 51, 0));
        ChildInformatio.setText("Child Information");

        pnlName.setBackground(new java.awt.Color(204, 204, 0));
        pnlName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12), new java.awt.Color(102, 51, 0))); // NOI18N
        pnlName.setForeground(new java.awt.Color(255, 255, 255));

        lblFirstName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("First");

        txtFirstName.setText(" ");
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblSecondName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblSecondName.setForeground(new java.awt.Color(255, 255, 255));
        lblSecondName.setText("Secound");

        txtSecondName.setText(" ");
        txtSecondName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecondNameActionPerformed(evt);
            }
        });

        lblThirdName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblThirdName.setForeground(new java.awt.Color(255, 255, 255));
        lblThirdName.setText("Third");

        txtThirdName.setText(" ");
        txtThirdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThirdNameActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Last");

        txtLastName.setText(" ");
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNameLayout = new javax.swing.GroupLayout(pnlName);
        pnlName.setLayout(pnlNameLayout);
        pnlNameLayout.setHorizontalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSecondName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThirdName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThirdName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNameLayout.setVerticalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName)
                    .addComponent(lblSecondName)
                    .addComponent(lblThirdName)
                    .addComponent(lblLastName)
                    .addComponent(txtSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThirdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlPersonalInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlPersonalInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12), new java.awt.Color(204, 204, 0))); // NOI18N
        pnlPersonalInfo.setForeground(new java.awt.Color(25, 25, 112));
        pnlPersonalInfo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                pnlPersonalInfoAncestorRemoved(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(204, 204, 0));
        lblGender.setText("Gender");

        rdMale.setBackground(new java.awt.Color(102, 51, 0));
        rdMale.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rdMale.setForeground(new java.awt.Color(204, 204, 0));
        rdMale.setText("Male");

        rdFemale.setBackground(new java.awt.Color(102, 51, 0));
        rdFemale.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rdFemale.setForeground(new java.awt.Color(204, 204, 0));
        rdFemale.setSelected(true);
        rdFemale.setText("Female");

        lblDOB.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(204, 204, 0));
        lblDOB.setText("Date Of Birth");

        lblBloodType.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblBloodType.setForeground(new java.awt.Color(204, 204, 0));
        lblBloodType.setText("Blood Type");

        cmbBloodType.setForeground(new java.awt.Color(204, 204, 0));
        cmbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O-", "O+", "B-", "B+", "AB-", "AB+", "A+", "A-" }));
        cmbBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodTypeActionPerformed(evt);
            }
        });

        lblMedicalConditions.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblMedicalConditions.setForeground(new java.awt.Color(204, 204, 0));
        lblMedicalConditions.setText("Midical Conditions");

        txtMidicalConditions.setColumns(20);
        txtMidicalConditions.setRows(5);
        spMedicalConditions.setViewportView(txtMidicalConditions);

        javax.swing.GroupLayout pnlPersonalInfoLayout = new javax.swing.GroupLayout(pnlPersonalInfo);
        pnlPersonalInfo.setLayout(pnlPersonalInfoLayout);
        pnlPersonalInfoLayout.setHorizontalGroup(
            pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addComponent(lblMedicalConditions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spMedicalConditions, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdFemale)
                        .addGap(18, 18, 18)
                        .addComponent(lblDOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBloodType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPersonalInfoLayout.setVerticalGroup(
            pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdMale)
                    .addComponent(rdFemale)
                    .addComponent(lblDOB)
                    .addComponent(lblBloodType)
                    .addComponent(cmbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spMedicalConditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicalConditions)))
        );

        pnlParent.setBackground(new java.awt.Color(102, 51, 0));
        pnlParent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlParent.setForeground(new java.awt.Color(102, 51, 0));

        lblParentName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblParentName.setForeground(new java.awt.Color(255, 255, 255));
        lblParentName.setText("Parent Name");

        txtParentName.setText(" ");
        txtParentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentNameActionPerformed(evt);
            }
        });
        txtParentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParentNameKeyTyped(evt);
            }
        });

        lblPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Phone Number");

        txtPhoneNumber.setText(" ");
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lblEmailAddress.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblEmailAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailAddress.setText("Email Address");

        txtEmailAddress.setText(" ");
        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        txtAddress.setText(" ");
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlParentLayout = new javax.swing.GroupLayout(pnlParent);
        pnlParent.setLayout(pnlParentLayout);
        pnlParentLayout.setHorizontalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblParentName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlParentLayout.setVerticalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlParentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParentName)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblEmailAddress)
                    .addComponent(lblAddress)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSaveRegistration.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSaveRegistration.setForeground(new java.awt.Color(102, 51, 0));
        btnSaveRegistration.setText("Save Registeration");
        btnSaveRegistration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRegistrationActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 51, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 51, 0));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnSaveRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlChildInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlPersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChildInformatio)
                            .addComponent(pnlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChildInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChildInformatio)
                .addGap(3, 3, 3)
                .addComponent(pnlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtParentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParentNameActionPerformed

    private void txtSecondNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecondNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecondNameActionPerformed

    private void txtThirdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThirdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThirdNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnSaveRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRegistrationActionPerformed
        if (CheckData()) {
            try {

                String record
                        = txtFirstName.getText() + ","
                        + txtSecondName.getText() + ","
                        + txtThirdName.getText() + ","
                        + txtLastName.getText() + "\n";
                System.out.println(new java.io.File("children.txt").getAbsolutePath());
                FileTestchild.writeToFile("children.txt", record);
                System.out.println("Data Saved Successfully");
                JOptionPane.showMessageDialog(this, "Registration Saved Successfully");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSaveRegistrationActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ClearData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frmAdminDashboard A = new frmAdminDashboard();
        A.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void pnlPersonalInfoAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnlPersonalInfoAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlPersonalInfoAncestorRemoved

    private void cmbBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBloodTypeActionPerformed

    private void txtParentNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParentNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParentNameKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChildInformatio;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnSaveRegistration;
    private javax.swing.JComboBox<String> cmbBloodType;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMedicalConditions;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSecondName;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblThirdName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlChildInformation;
    private javax.swing.JPanel pnlName;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlPersonalInfo;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JScrollPane spMedicalConditions;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtMidicalConditions;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSecondName;
    private javax.swing.JTextField txtThirdName;
    // End of variables declaration//GEN-END:variables
}
