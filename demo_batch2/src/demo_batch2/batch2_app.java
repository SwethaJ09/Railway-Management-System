/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_batch2;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Administrator
 */
public class batch2_app extends javax.swing.JFrame {
    
    Connection con;
Statement st;
PreparedStatement ps;
ResultSet rs;


    /**
     * Creates new form batch2_app
     */
    public batch2_app() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        emp_id = new javax.swing.JTextField();
        emp_name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        basic = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        checktrains = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        passenger = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });

        basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicActionPerformed(evt);
            }
        });

        jLabel1.setText("Emp_ID");

        jLabel2.setText("emp_name");

        jLabel4.setText("dob");

        jLabel5.setText("sex");

        jLabel3.setText("designation");

        jLabel6.setText("basic");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert.setText("insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        checktrains.setText("check trains");
        checktrains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checktrainsActionPerformed(evt);
            }
        });

        reservation.setText("reservation");
        reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationActionPerformed(evt);
            }
        });

        passenger.setText("passenger sign up/in");
        passenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerActionPerformed(evt);
            }
        });

        jLabel7.setText("    RAILWAY RESERVATION SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(reservation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(passenger)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(checktrains)
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(insert)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checktrains)
                    .addComponent(passenger))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservation)
                    .addComponent(insert))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        
          try {
String sql = "insert into emp_payroll values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
ps = con.prepareStatement(sql);
ps.setString(1, emp_id.getText());
ps.setString(2, emp_name.getText());
ps.setString(3, dob.getText());
ps.setString(4, sex.getText());
ps.setString(5, designation.getText());
ps.setDouble(6, Double.parseDouble(basic.getText()));
ps.setDouble(7, 0);
ps.setDouble(8, 0);
ps.setDouble(9, 0);
ps.setDouble(10, 0);
ps.setDouble(11, 0);
ps.setDouble(12, 0);
ps.setDouble(13, 0);
ps.execute();
JOptionPane.showMessageDialog(this,"Inserted!");
}
catch (SQLException ex) {
Logger.getLogger(batch2_app.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}
        
        
    }//GEN-LAST:event_insertActionPerformed

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_nameActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        
    }//GEN-LAST:event_sexActionPerformed

    private void checktrainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checktrainsActionPerformed
           
            trains t=new trains();
            t.show();
            dispose();
            
    }//GEN-LAST:event_checktrainsActionPerformed

    private void reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationActionPerformed
        res r=new res();
        r.show();
        dispose();
       
    }//GEN-LAST:event_reservationActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         try {
        String sql = "SELECT * from emp_payroll where eid = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, emp_id.getText());
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()) {
            String ename = resultSet.getString("ename");
            String dob = resultSet.getString("dob");
            String sex = resultSet.getString("sex");
            String designation = resultSet.getString("designation");
            Double basic = resultSet.getDouble("basic");
            Double da = resultSet.getDouble("da");
            Double hra = resultSet.getDouble("hra");
            Double pf = resultSet.getDouble("pf");
            Double mc = resultSet.getDouble("mc");
            Double gross = resultSet.getDouble("gross");
            Double tot_deduc = resultSet.getDouble("tot_deduc");
            Double net_pay = resultSet.getDouble("net_pay");
            String result = "Result:\nName:"+ename+"\nDOB:"+dob+"\nSex:"+sex+"\nDesignation:"+designation+"\nBasic:"+basic+"\nDA:"+da+"\nHRA:"+hra+"\nPF:"+pf+"\nMC:"+mc+"\nGross:"+gross+"\nTotal Deduction:"+tot_deduc+"\nNet Pay:"+net_pay;
            
            JOptionPane.showMessageDialog(this,result);
        }

}
catch (SQLException ex) {
Logger.getLogger(batch2_app.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}
    }//GEN-LAST:event_searchActionPerformed

    private void passengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerActionPerformed
        //System.exit(0);
        
        pass p=new pass();
        p.show();
        dispose();
    }//GEN-LAST:event_passengerActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        try {
CallableStatement statement = con.prepareCall("{call CalculateNetPay(?,?)}");
        statement.setString(1, emp_id.getText());
        statement.setDouble(2, Double.parseDouble(basic.getText()));
        statement.execute();
JOptionPane.showMessageDialog(this,"Calculated!");
}
catch (SQLException ex) {
Logger.getLogger(batch2_app.class.getName()).log(Level.SEVERE,null, ex);
JOptionPane.showMessageDialog(this,ex.getMessage());
}
     
    }//GEN-LAST:event_calculateActionPerformed

    private void basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basicActionPerformed

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
            java.util.logging.Logger.getLogger(batch2_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(batch2_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(batch2_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(batch2_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new batch2_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField basic;
    private javax.swing.JButton calculate;
    private javax.swing.JButton checktrains;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField emp_name;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton passenger;
    private javax.swing.JButton reservation;
    private javax.swing.JButton search;
    private javax.swing.JTextField sex;
    // End of variables declaration//GEN-END:variables
}
