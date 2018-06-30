import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fat_Boy_Cafe.java
 *
 * Created on Nov 24, 2014, 11:24:02 AM
 */

/**
 *
 * @author student
 */
public class Fat_Boy_Cafe extends javax.swing.JFrame {

    /** Creates new form Fat_Boy_Cafe */
    public Fat_Boy_Cafe() {
        initComponents();
        TxtFdItemName.setEditable(false);
        TxtFdItemCost.setEditable(false);
        TxtFdBillAmt.setEditable(false);
        TxtFdBillAmt.setText("Rs.0");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgMenuCourse = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFdItemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtFdItemCost = new javax.swing.JTextField();
        TxtFdItemQuantity = new javax.swing.JTextField();
        BtnOrder = new javax.swing.JButton();
        BtnRemoveOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListBill = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        TxtFdBillAmt = new javax.swing.JTextField();
        BtnConfirmBill = new javax.swing.JButton();
        BtnClearAll = new javax.swing.JButton();
        TxtFdBackMainMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RbBeverage = new javax.swing.JRadioButton();
        RbMainCourse = new javax.swing.JRadioButton();
        RbDesserts = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMenu = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtFdG_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fat Boy Cafe");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THE FAT BOY CAFÉ");

        jLabel2.setText("Item Name           :");

        jLabel3.setText("Item Cost            :");

        jLabel4.setText("Quantity             :");

        BtnOrder.setText("ORDER");
        BtnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderActionPerformed(evt);
            }
        });

        BtnRemoveOrder.setText("REMOVE ORDER");
        BtnRemoveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveOrderActionPerformed(evt);
            }
        });

        ListBill.setModel(new DefaultListModel());
        ListBill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ListBill);

        jLabel5.setText("BILL AMOUNT    :");

        BtnConfirmBill.setText("ORDER BILL");
        BtnConfirmBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmBillActionPerformed(evt);
            }
        });

        BtnClearAll.setText("CLEAR ALL");
        BtnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearAllActionPerformed(evt);
            }
        });

        TxtFdBackMainMenu.setText("BACK TO MAIN MENU");
        TxtFdBackMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFdBackMainMenuActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Section :"));

        BgMenuCourse.add(RbBeverage);
        RbBeverage.setText("Beverages");
        RbBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbBeverageActionPerformed(evt);
            }
        });

        BgMenuCourse.add(RbMainCourse);
        RbMainCourse.setText("Main Course");
        RbMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbMainCourseActionPerformed(evt);
            }
        });

        BgMenuCourse.add(RbDesserts);
        RbDesserts.setText("Desserts");
        RbDesserts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbDessertsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbBeverage)
                    .addComponent(RbMainCourse)
                    .addComponent(RbDesserts))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RbBeverage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RbMainCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RbDesserts))
        );

        ListMenu.setModel(new DefaultListModel());
        ListMenu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListMenu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListMenuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListMenu);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bill Particulars");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Guest Id       :");

        TxtFdG_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFdG_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtFdBackMainMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFdItemQuantity)
                            .addComponent(TxtFdItemCost)
                            .addComponent(TxtFdBillAmt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtFdItemName)
                            .addComponent(TxtFdG_id)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnRemoveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnConfirmBill, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFdItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFdItemCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFdItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnOrder)
                                    .addComponent(BtnRemoveOrder))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFdBillAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFdG_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnClearAll)
                                    .addComponent(BtnConfirmBill))
                                .addGap(0, 27, Short.MAX_VALUE)))))
                .addGap(14, 14, 14)
                .addComponent(TxtFdBackMainMenu)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmBillActionPerformed
        String G_id;
        int bill;
        
        G_id = TxtFdG_id.getText();
        bill = Integer.parseInt((TxtFdBillAmt.getText()).substring(3));
        
        String Q = ("Update Bill set Restaurant=Restaurant+" + bill + " where Bill_Id='" + G_id + "'");

        if(!(G_id.isEmpty()))
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");
            
                Statement stmt = con.createStatement();
            
                stmt.executeUpdate(Q);
                JOptionPane.showMessageDialog(this, "Billing Completed." + '\n' + "Your bill amount was Rs." + bill);

                (new Main_Menu()).setVisible(true);
                this.setVisible(false);

               }
        
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Please enter the Guest_Id first, & then order the bill.");
        }

    }//GEN-LAST:event_BtnConfirmBillActionPerformed

    private void RbBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbBeverageActionPerformed
        ListMenu.clearSelection();
        DefaultListModel ListMenuModel = (DefaultListModel) ListMenu.getModel();
        ListMenuModel.clear();
        
        String Q = "Select * from Menu where Category='Beverage'";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(Q);
            while(rs.next())
            {
                String name = rs.getString("Item_Name");
                String cost = rs.getString("Cost");
                ListMenuModel.addElement(name + " - Rs." + cost);
            }
            
            ListMenu.setModel(ListMenuModel);
            
            }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_RbBeverageActionPerformed

    private void RbMainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbMainCourseActionPerformed
        // TODO add your handling code here:
        ListMenu.clearSelection();
        DefaultListModel ListMenuModel = (DefaultListModel) ListMenu.getModel();
        ListMenuModel.clear();
        
        String Q = "Select * from Menu where Category='Main Course'";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(Q);
            while(rs.next())
            {
                String name = rs.getString("Item_Name");
                String cost = rs.getString("Cost");
                ListMenuModel.addElement(name + " - Rs." + cost);
            }
            
            ListMenu.setModel(ListMenuModel);
            
            }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_RbMainCourseActionPerformed

    private void RbDessertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbDessertsActionPerformed
        // TODO add your handling code here:
        ListMenu.clearSelection();
        DefaultListModel ListMenuModel = (DefaultListModel) ListMenu.getModel();
        ListMenuModel.clear();
        
        String Q = "Select * from Menu where Category='Dessert'";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(Q);
            while(rs.next())
            {
                String name = rs.getString("Item_Name");
                String cost = rs.getString("Cost");
                ListMenuModel.addElement(name + " - Rs." + cost);
            }
            
            ListMenu.setModel(ListMenuModel);
            
            }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_RbDessertsActionPerformed

    private void ListMenuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListMenuValueChanged
        String item, name = "", cost = "";
        int i;
        
        item = (String) ListMenu.getSelectedValue();
        
        if(!ListMenu.isSelectionEmpty())
        {
            i = item.indexOf("Rs.");
            cost = item.substring(i);
            name = item.substring(0,i-3);
        }
        
        TxtFdItemName.setText(name);
        TxtFdItemCost.setText(cost);
        TxtFdItemQuantity.setText("");
        
    }//GEN-LAST:event_ListMenuValueChanged

    private void BtnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderActionPerformed
        String name;
        int cost, qty, bill;
        
        name=TxtFdItemName.getText();
        
        cost=Integer.parseInt((TxtFdItemCost.getText()).substring(3));
        qty=Integer.parseInt(TxtFdItemQuantity.getText());
        bill=Integer.parseInt((TxtFdBillAmt.getText()).substring(3));
        
        TxtFdBillAmt.setText("Rs." + (bill + (cost*qty)));
        
        DefaultListModel ListBillModel = (DefaultListModel) ListBill.getModel();
        ListBillModel.addElement(name + " - Rs." + (cost*qty));
        
    }//GEN-LAST:event_BtnOrderActionPerformed

    private void BtnRemoveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveOrderActionPerformed
        String item;
        int i, cost, bill;
        
        DefaultListModel ListBillModel = (DefaultListModel) ListBill.getModel();
        item = (String) ListBill.getSelectedValue();
        
        i = item.indexOf("Rs.");
        cost = Integer.parseInt(item.substring(i+3));
        bill = Integer.parseInt((TxtFdBillAmt.getText()).substring(3));
        
        TxtFdBillAmt.setText("Rs." + (bill - cost));
        ListBillModel.removeElement(item);
        
    }//GEN-LAST:event_BtnRemoveOrderActionPerformed

    private void TxtFdG_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFdG_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFdG_idActionPerformed

    private void BtnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearAllActionPerformed
        TxtFdItemName.setText("");
        TxtFdItemCost.setText("");
        TxtFdItemQuantity.setText("");
        TxtFdG_id.setText("");
        TxtFdBillAmt.setText("Rs.0");
        
        DefaultListModel ListBillModel = (DefaultListModel) ListBill.getModel();
        ListBillModel.clear();
        ListBill.setModel(ListBillModel);
        RbBeverage.doClick();
        
    }//GEN-LAST:event_BtnClearAllActionPerformed

    private void TxtFdBackMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFdBackMainMenuActionPerformed
        (new Main_Menu()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TxtFdBackMainMenuActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Additional_Charges_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Additional_Charges_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Additional_Charges_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Additional_Charges_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fat_Boy_Cafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgMenuCourse;
    private javax.swing.JButton BtnClearAll;
    private javax.swing.JButton BtnConfirmBill;
    private javax.swing.JButton BtnOrder;
    private javax.swing.JButton BtnRemoveOrder;
    private javax.swing.JList ListBill;
    private javax.swing.JList ListMenu;
    private javax.swing.JRadioButton RbBeverage;
    private javax.swing.JRadioButton RbDesserts;
    private javax.swing.JRadioButton RbMainCourse;
    private javax.swing.JButton TxtFdBackMainMenu;
    private javax.swing.JTextField TxtFdBillAmt;
    private javax.swing.JTextField TxtFdG_id;
    private javax.swing.JTextField TxtFdItemCost;
    private javax.swing.JTextField TxtFdItemName;
    private javax.swing.JTextField TxtFdItemQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
