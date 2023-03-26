/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package foodordering;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Anwar Misbah
 */
public class customerFrame extends JFrame {
    

    String orders="";
    public customerFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedReader reader = null;
        try {
            initComponents();
            String filename = "foods.txt";
            reader = new BufferedReader(new FileReader(filename));
            String line;
            String lines = "";
            while ((line=reader.readLine())!=null){
                lines+=line+"_foods_";
            }
            String foodList[]=lines.split("_foods_");
            for (String food : foodList){
                jComboBox12.addItem(food);
            }
            filename = "drinks.txt";
            reader = new BufferedReader(new FileReader(filename));
            lines = "";
            while ((line=reader.readLine())!=null){
                lines+=line+"_";
            }
            String drinkList[]=lines.split("_");
            for (String drink : drinkList){
                jComboBox13.addItem(drink);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Any Food You Want");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to FO App");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -2, -1, -1));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodordering/images/logout.png"))); // NOI18N
        jButton2.setText("Logout");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<No Drink Selected>" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 70));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setToolTipText("");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 20));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("$   Quantity: ");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 20));

        jSpinner2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner2KeyReleased(evt);
            }
        });
        jPanel3.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 50, 30));

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 630, 270));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<No Food Selected>" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 70));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("$   Quantity: ");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 20));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setToolTipText("");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 20));

        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner1KeyReleased(evt);
            }
        });
        jPanel6.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 50, 30));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 630, 270));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTextField26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Entered Cash");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Change");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(539, 539, 539))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 1300, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 60, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        String food=jComboBox12.getSelectedItem().toString();
        String foodInfo[] = food.split("~");
        jLabel47.setText(foodInfo[1]);
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new loginFrame().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyReleased
        try{
            int quantity = (int) jSpinner1.getValue();
            int price = Integer.parseInt(jLabel47.getText());
            int amount = price * quantity;
           
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jSpinner1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ords[] = orders.split("--");
        int price = 0;
        for (String order: ords){
            System.out.println(order);
            price+=(Integer.parseInt(order.split("~")[1])*Integer.parseInt(order.split("~")[2]));
        }
        jTextArea1.setText(String.valueOf(price)+".00");
        int cash;
        while (true){
            cash = Integer.parseInt( JOptionPane.showInputDialog(null,"Enter amount of cash","Recipt", JOptionPane.PLAIN_MESSAGE));
            if (cash-price<0 ){
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }else{
                break;
            }
        }
        
        jTextField25.setText(String.valueOf(cash));
        jTextField26.setText(String.valueOf(cash-price));
        try{
            File file = new File("orders.txt");
            if(!file.exists()){
                file.createNewFile();
                
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(orders+"\n");
            orders = "";
            bw.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Total Amount:"+String.valueOf(price)+"\nEntered Cash:"+String.valueOf(cash)+"\nTotal Change:"+String.valueOf(cash-price));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String food = jComboBox12.getSelectedItem().toString();
        if (food.equals("<No Food Selected>")){
            JOptionPane.showMessageDialog(null, "No food Was Selected", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            if (((int)jSpinner1.getValue())==0){
                JOptionPane.showMessageDialog(null, "Quantity can not be zero", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                String order = food + "~" + jSpinner1.getValue().toString();
                orders += order + "--";
                JOptionPane.showMessageDialog(null, "Added "+ jSpinner1.getValue().toString()+" "+jComboBox12.getSelectedItem().toString().split("~")[0]+" To orders");
                jSpinner1.setValue(0);
                jComboBox12.setSelectedIndex(1);
                jLabel47.setText("");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        String food=jComboBox13.getSelectedItem().toString();
        String foodInfo[] = food.split("~");
        jLabel48.setText(foodInfo[1]);
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jSpinner2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String food = jComboBox13.getSelectedItem().toString();
        if (food.equals("<No Food Selected>")){
            JOptionPane.showMessageDialog(null, "No food Was Selected", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            if (((int)jSpinner2.getValue())==0){
                JOptionPane.showMessageDialog(null, "Quantity can not be zero", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                String order = food + "~" + jSpinner2.getValue().toString();
                orders += order + "--";
                JOptionPane.showMessageDialog(null, "Added "+ jSpinner2.getValue().toString()+" "+jComboBox13.getSelectedItem().toString().split("~")[0]+" To orders");
                jSpinner2.setValue(0);
                jComboBox13.setSelectedIndex(1);
                jLabel48.setText("");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(customerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    // End of variables declaration//GEN-END:variables
}
