/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FoodBankAdminWorkArea;

import business.enterprise.Enterprise;
import business.enterprise.FoodBankEnterprise;
import business.foodItem.FoodItem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class FoodAdditionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodAdditionJPanel
     */
    private JPanel userProcessContainer;
    private FoodBankEnterprise foodBankEnterprise;
    private FoodItem toBeEdited;

    FoodAdditionJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        foodBankEnterprise = (FoodBankEnterprise) enterprise;
        setInitial();
        populateTable();
        this.setBackground(new Color(255, 255, 255));
        this.setSize(1440, 900);
    }

    public void setInitial() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        updateBtn.setVisible(false);
        CancelBtn.setVisible(false);
        SubmitBtn.setVisible(false);
        quantityjSpinner.setVisible(false);
        itemTxtField.setVisible(false);
        itemTxtField.setText("");

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        model.setRowCount(0);
        for (FoodItem foodItem : foodBankEnterprise.getFoodDirectory().getFoodList()) {
            if (foodItem.getQuantity() != 0) {
                Object[] row = new Object[2];
                row[0] = foodItem;
                row[1] = foodItem.getQuantity();
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemTxtField = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        quantityjSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Quantity (Pounds)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(foodTable);
        if (foodTable.getColumnModel().getColumnCount() > 0) {
            foodTable.getColumnModel().getColumn(0).setResizable(false);
            foodTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Item Name*:");

        jLabel2.setText("Quantity*:");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete Item");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit Item");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        addBtn.setText("Add Item");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        quantityjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Food Inventory");

        refreshTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshTestJButton.setBorder(null);
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack2)
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3)
                        .addGap(236, 236, 236))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itemTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityjSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(itemTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(quantityjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubmitBtn)
                            .addComponent(CancelBtn)
                            .addComponent(updateBtn)))
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2))
                .addGap(560, 560, 560))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = foodTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            FoodItem foodItem = (FoodItem) foodTable.getValueAt(selectedRow, 0);
            toBeEdited = foodItem;
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            updateBtn.setVisible(true);
            CancelBtn.setVisible(true);
            SubmitBtn.setVisible(false);
            quantityjSpinner.setVisible(true);
            itemTxtField.setVisible(true);
            itemTxtField.setText(foodItem.getName());
            JFormattedTextField formattedTextField = ((JSpinner.DefaultEditor) quantityjSpinner.getEditor()).getTextField();
            formattedTextField.setText(foodItem.getQuantity() + "");
            formattedTextField.setEditable(false);
            formattedTextField.setBackground(Color.white);

        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        setInitial();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        updateBtn.setVisible(false);
        CancelBtn.setVisible(true);
        SubmitBtn.setVisible(true);
        quantityjSpinner.setVisible(true);
        JFormattedTextField formattedTextField = ((JSpinner.DefaultEditor) quantityjSpinner.getEditor()).getTextField();
        formattedTextField.setEditable(false);
        formattedTextField.setBackground(Color.white);
        formattedTextField.setText(new Integer(1) + "");
        itemTxtField.setVisible(true);
        itemTxtField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = foodTable.getSelectedRow();
        setInitial();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            FoodItem foodItem = (FoodItem) foodTable.getValueAt(selectedRow, 0);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + foodItem + " ?", "Message", dialogButton);
            if (dialogValue == JOptionPane.YES_OPTION) {
                foodBankEnterprise.getFoodDirectory().deleteFoodItem(foodItem);
                populateTable();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if (itemTxtField.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please enter item name.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            toBeEdited.setName(itemTxtField.getText().trim());
            int quantity = (Integer) quantityjSpinner.getValue();
            toBeEdited.setQuantity(quantity);
            setInitial();
            populateTable();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        if (itemTxtField.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please enter item name.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            int quantity = (Integer) quantityjSpinner.getValue();
            foodBankEnterprise.getFoodDirectory().addFoodItem(itemTxtField.getText().trim(), quantity);
            setInitial();
            populateTable();
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable foodTable;
    private javax.swing.JTextField itemTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantityjSpinner;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
