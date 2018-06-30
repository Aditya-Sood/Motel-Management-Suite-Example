
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Print_Bill.java
 *
 * Created on Nov 24, 2014, 11:58:34 AM
 */

/**
 *
 * @author student
 */
public class Print_Bill extends javax.swing.JFrame {

    /** Creates new form Print_Bill */
    public Print_Bill() {
        initComponents();
        TxtFdRoomCharges.setEditable(false);
        TxtFdRestaurantBill.setEditable(false);
        TxtFdServiceCharges.setEditable(false);
        TxtFdVAT.setEditable(false);
        TxtFdNetBill.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtFdG_id = new javax.swing.JTextField();
        BtnGetBill = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArRemarks = new javax.swing.JTextArea();
        BtnPayBill = new javax.swing.JButton();
        TxtFdRoomCharges = new javax.swing.JTextField();
        TxtFdRestaurantBill = new javax.swing.JTextField();
        TxtFdMiscCharges = new javax.swing.JTextField();
        TxtFdClearAll = new javax.swing.JButton();
        TxtFdBackMainMenu = new javax.swing.JButton();
        TxtFdServiceCharges = new javax.swing.JTextField();
        TxtFdVAT = new javax.swing.JTextField();
        TxtFdNetBill = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtFdCheck_Out = new javax.swing.JTextField();
        BtnAddMiscCharges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Bill");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILL");

        jLabel2.setText("Guest Id         :");

        BtnGetBill.setText("Get Bill");
        BtnGetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGetBillActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("BILL DETAILS    :");

        jLabel4.setText("Room Charges               :");

        jLabel5.setText("Restaurant Bills              :");

        jLabel6.setText("Miscellaneous Charges");

        jLabel7.setText("Remarks                        :");

        TxtArRemarks.setColumns(20);
        TxtArRemarks.setRows(5);
        jScrollPane1.setViewportView(TxtArRemarks);

        BtnPayBill.setText("PAY BILL");
        BtnPayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPayBillActionPerformed(evt);
            }
        });

        TxtFdMiscCharges.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtFdMiscChargesFocusLost(evt);
            }
        });
        TxtFdMiscCharges.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtFdMiscChargesInputMethodTextChanged(evt);
            }
        });
        TxtFdMiscCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFdMiscChargesActionPerformed(evt);
            }
        });
        TxtFdMiscCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFdMiscChargesKeyTyped(evt);
            }
        });

        TxtFdClearAll.setText("CLEAR ALL");
        TxtFdClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFdClearAllActionPerformed(evt);
            }
        });

        TxtFdBackMainMenu.setText("BACK TO MAIN MENU");
        TxtFdBackMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFdBackMainMenuActionPerformed(evt);
            }
        });

        jLabel9.setText("Service Charges           :");

        jLabel10.setText("VAT                               :");

        jLabel11.setText("NET PAYABLE AMOUNT  :");

        jLabel8.setText("( in Rupees)                  :");

        jLabel12.setText("Check-Out Date (YYYY/MM/DD) :");

        BtnAddMiscCharges.setText("Add to Bill");
        BtnAddMiscCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMiscChargesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnPayBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtFdMiscCharges)
                                    .addComponent(TxtFdRestaurantBill)
                                    .addComponent(jScrollPane1)
                                    .addComponent(TxtFdRoomCharges)
                                    .addComponent(TxtFdServiceCharges))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnAddMiscCharges))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtFdClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFdBackMainMenu))
                            .addComponent(TxtFdVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFdCheck_Out))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxtFdG_id)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnGetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtFdNetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdG_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtFdCheck_Out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnGetBill, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFdRoomCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdRestaurantBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdMiscCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAddMiscCharges))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFdNetBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPayBill)
                    .addComponent(TxtFdClearAll)
                    .addComponent(TxtFdBackMainMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPayBillActionPerformed
        String G_id, Date, Remarks;
        double misc, room;
        
        G_id = TxtFdG_id.getText();
        Date = TxtFdCheck_Out.getText();
        Remarks  = TxtArRemarks.getText();
        misc = Double.parseDouble(TxtFdMiscCharges.getText());
        room  = Double.parseDouble(TxtFdRoomCharges.getText().substring(3));
                
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");
            
            Statement stmt = con.createStatement();
            String Q1 ="Update Bill set room='" + room +"', Miscellaneous='" + misc + "', Remarks='" + Remarks +"' WHERE Bill_Id='" + G_id + "'" ;
            String Q2 ="Update Guest_details set Check_Out='" + Date +"' WHERE G_Id='" + G_id + "'";
            String Q3 ="Update Room set Status='N' where Status='" + G_id + "'";
            stmt.executeUpdate(Q1);
            stmt.executeUpdate(Q2);
            stmt.executeUpdate(Q3);
            
            JOptionPane.showMessageDialog(this, "Billing Completed.");

            (new Main_Menu()).setVisible(true);
             this.setVisible(false);

            }
         
         catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
}//GEN-LAST:event_BtnPayBillActionPerformed

    private void BtnGetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGetBillActionPerformed
        String G_id, Chk_out, remarks=null, Q1, Q2, Q3, Q4, Q5;
        double stay=1, service=0, vat=0, restaurant=0, netroom, misc, sum, srvopt, vatopt;
        int dur=1;
        float rcost=1, msccost=1;
        Calendar Check_in, Check_out;

        Check_out = Calendar.getInstance();
        Check_in = Calendar.getInstance();
        Check_in.setLenient(true);
        Check_out.setLenient(true);
        {
            Chk_out = TxtFdCheck_Out.getText();
            int year, month, date;
            year = Integer.parseInt(Chk_out.substring(0,4 ));
            month = Integer.parseInt(Chk_out.substring(5,7 ));
            date = Integer.parseInt(Chk_out.substring(8));
            Check_out.clear();
            Check_out.set(year, month, date, 0, 0, 0);
        }

        G_id = TxtFdG_id.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya_sud?user="+"root"+"&password="+"MYSQL");

            Statement stmt = con.createStatement();
            ResultSet rs1, rs2, rs3, rs4;

            Q1 ="Select * from bill where Bill_Id='" + G_id + "'" ;
            rs1 = stmt.executeQuery(Q1);
            if(rs1.next())
            {
                restaurant = rs1.getInt("Restaurant");
                TxtFdRestaurantBill.setText("Rs." + restaurant);
                rcost = rs1.getFloat("Room");
                msccost = rs1.getFloat("Miscellaneous");
                remarks = rs1.getString("Remarks");
            }

            Q2 ="Select * from additional_charges";
            rs2 = stmt.executeQuery(Q2);
            if(rs2.next())
            {
                service = (rs2.getDouble("Service_Charges")/100);
                vat = (rs2.getDouble("VAT")/100);
            }

            Q3 ="Select * from Room where Status='" + G_id + "'";
            rs3 = stmt.executeQuery(Q3);
            if(rs3.next())
            {
                stay = rs3.getDouble("Charges");
            }

            Q4 ="Select * from Guest_Details where G_Id='" + G_id + "'";
            rs4 = stmt.executeQuery(Q4);
            if (rs4.next())
            {
                String Date = rs4.getString("Check_In");
                int year, month, date;
                year = Integer.parseInt(Date.substring(0,4 ));
                month = Integer.parseInt(Date.substring(5,7 ));
                date = Integer.parseInt(Date.substring(8));
                Check_in.clear();
                Check_in.set(year, month, date, 0, 0, 0);
            }

           
            if(rcost==0) 
            {
            Duration:
            { for(;dur<100;dur++)
                {
                    if(Check_out.equals(Check_in))
                    {
                        break Duration;
                    }

                    Check_in.add(Check_in.DAY_OF_MONTH, +1);
                }
            }

            netroom =(stay * dur);
            TxtFdRoomCharges.setText("Rs." + netroom);

            sum = netroom + restaurant;
            srvopt = (sum*service);
            vatopt = (sum*vat);
            TxtFdMiscCharges.setText("0");
            TxtFdServiceCharges.setText("Rs." + srvopt);
            TxtFdVAT.setText("Rs." +vatopt);
            TxtFdNetBill.setText("Rs." + (sum + (srvopt + vatopt)));
            TxtFdG_id.setEditable(false);
            TxtFdCheck_Out.setEditable(false);
            BtnGetBill.setEnabled(false);
            }

            else
            {
            sum = rcost + restaurant;
            srvopt = (sum*service);
            vatopt = (sum*vat);
            
            TxtFdRoomCharges.setText("Rs." + rcost);
            TxtFdMiscCharges.setText("Rs." + msccost);
            TxtArRemarks.setText(remarks);
            TxtFdServiceCharges.setText("Rs." + srvopt);
            TxtFdVAT.setText("Rs." +vatopt);
            TxtFdNetBill.setText("Rs." + (sum + (srvopt + vatopt)));

            TxtFdG_id.setEditable(false);
            TxtFdCheck_Out.setEditable(false);
            BtnGetBill.setEnabled(false);
            BtnPayBill.setEnabled(false);
            BtnAddMiscCharges.setEnabled(false);
            TxtFdMiscCharges.setEditable(false);
            TxtArRemarks.setEditable(false);

            JOptionPane.showMessageDialog(this, "The bill of guest " + G_id + " has already been cleared.");
            }

            }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_BtnGetBillActionPerformed

    private void TxtFdMiscChargesInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtFdMiscChargesInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFdMiscChargesInputMethodTextChanged

    private void TxtFdMiscChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFdMiscChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFdMiscChargesActionPerformed

    private void TxtFdMiscChargesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtFdMiscChargesFocusLost
        // TODO add your handling code here:       
    }//GEN-LAST:event_TxtFdMiscChargesFocusLost

    private void TxtFdMiscChargesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFdMiscChargesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFdMiscChargesKeyTyped

    private void BtnAddMiscChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddMiscChargesActionPerformed
        double misc, net;
        
        misc = Double.parseDouble(TxtFdMiscCharges.getText());
        net = Double.parseDouble((TxtFdNetBill.getText()).substring(3));
        
        net = net + misc;
        
        TxtFdNetBill.setText("Rs." + net);
        TxtFdMiscCharges.setEditable(false);
        BtnAddMiscCharges.setEnabled(false);
        TxtArRemarks.setEditable(false);
        
    }//GEN-LAST:event_BtnAddMiscChargesActionPerformed

    private void TxtFdClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFdClearAllActionPerformed
        // TODO add your handling code here:
        TxtFdG_id.setText("");
        TxtFdCheck_Out.setText("");
        TxtFdRoomCharges.setText("");
        TxtFdRestaurantBill.setText("");
        TxtFdMiscCharges.setText("");
        TxtFdServiceCharges.setText("");
        TxtFdVAT.setText("");
        TxtFdNetBill.setText("");
        
        TxtArRemarks.setText("");

        TxtArRemarks.setEditable(true);
        BtnPayBill.setEnabled(true);
        TxtFdG_id.setEditable(true);
        TxtFdCheck_Out.setEditable(true);
        TxtFdMiscCharges.setEditable(true);
        BtnGetBill.setEnabled(true);
        BtnAddMiscCharges.setEnabled(true);
        
    }//GEN-LAST:event_TxtFdClearAllActionPerformed

    private void TxtFdBackMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFdBackMainMenuActionPerformed
        // TODO add your handling code here:
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
                new Print_Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddMiscCharges;
    private javax.swing.JButton BtnGetBill;
    private javax.swing.JButton BtnPayBill;
    private javax.swing.JTextArea TxtArRemarks;
    private javax.swing.JButton TxtFdBackMainMenu;
    private javax.swing.JTextField TxtFdCheck_Out;
    private javax.swing.JButton TxtFdClearAll;
    private javax.swing.JTextField TxtFdG_id;
    private javax.swing.JTextField TxtFdMiscCharges;
    private javax.swing.JTextField TxtFdNetBill;
    private javax.swing.JTextField TxtFdRestaurantBill;
    private javax.swing.JTextField TxtFdRoomCharges;
    private javax.swing.JTextField TxtFdServiceCharges;
    private javax.swing.JTextField TxtFdVAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}