/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_batch2;

import demo_batch2.batch2_app;
import demo_batch2.pas1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Srilakshmi
 */
public class trains extends javax.swing.JFrame {
Connection con;
Statement st;
PreparedStatement ps2;
ResultSet rs;
    /**
     * Creates new form trains
     */
    public trains() {
        initComponents();
        try{
Class.forName("oracle.jdbc.OracleDriver");
JOptionPane.showMessageDialog(this,"Driver Loaded!");
try {
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
        "swetha","swetha");
JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
}
catch (SQLException ex) {
Logger.getLogger(batch2_app.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}
}
catch(ClassNotFoundException ex){
Logger.getLogger(batch2_app.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        src = new javax.swing.JComboBox<>();
        dst = new javax.swing.JComboBox<>();
        tsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TRAIN DETAILS");

        jLabel2.setText("FROM");

        jLabel3.setText("TO");

        src.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select station" }));
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });

        dst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select station" }));
        dst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstActionPerformed(evt);
            }
        });

        tsearch.setText("SEARCH TRAINS");
        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(tsearch)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(tsearch)
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        // TODO add your handling code here:
        String s1name= "select stationname from station";
        
        try
        {
            ps2=con.prepareStatement(s1name);
            System.out.println("before ps2");
            ResultSet rs=ps2.executeQuery();
            System.out.println("after ps2");
            
            while(rs.next()){
                String ss1name=rs.getString("stationname");
                src.addItem(ss1name);
               System.out.println(ss1name);
                
            }
            
            //setsource.setText(selectedsource);
                       

                
            }
         catch(SQLException e){
                 
                 }
    }//GEN-LAST:event_srcActionPerformed

    private void dstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstActionPerformed
        // TODO add your handling code here:
        String s2name= "select stationname from station";
        
         try
        {
            ps2=con.prepareStatement(s2name);
            System.out.println("before ps2");
            ResultSet rs=ps2.executeQuery();
            System.out.println("after exec");
            
            while(rs.next()){
                String ss2name=rs.getString("stationname");
                dst.addItem(ss2name);
            }
            
            
            //System.out.println(selecteddest);
            //sst.setText(selecteddest);                
            }
         catch(SQLException e){
                 
                 }
    }//GEN-LAST:event_dstActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "select * from train where (source_id=? and dest_id=?)";
        String selecteddest=dst.getSelectedItem().toString();
        String selectedsource=src.getSelectedItem().toString();
        ps2 = con.prepareStatement(sql);
        ps2.setString(1, selectedsource);
        ps2.setString(2, selecteddest);
        ResultSet rs = ps2.executeQuery();
        
        StringBuilder data = new StringBuilder();

            // Iterate over the result set and append data to the StringBuilder
            while (rs.next()) {
                String s1 = rs.getString("tname");
                String t1=rs.getString("trainid");
                String t2=rs.getString("class1");
                String t3=rs.getString("fare");
                
               
                data.append("TRAIN NAME: ").append(s1).append(" ").append("TRAIN ID: ").append(t1).append(" ").append("CLASS: ").append(t2).append(" ").append("FARE: ").append(t3).append("\n");
            }

            // Display the retrieved data in a dialog box
            JOptionPane.showMessageDialog(null, data.toString(), "---TRAIN DETAILS---", JOptionPane.INFORMATION_MESSAGE);
            
        
                
                
                //System.out.println(ssname);
            
            //Class.forName("")
            //Connection con= D
            //Statement stm= con.create                
            }
         catch(SQLException e){
             e.printStackTrace();
             
             
                 
                 }
        
    }//GEN-LAST:event_tsearchActionPerformed

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
            java.util.logging.Logger.getLogger(trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> src;
    private javax.swing.JButton tsearch;
    // End of variables declaration//GEN-END:variables
}
