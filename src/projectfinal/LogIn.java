/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfinal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.stage.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Nafis
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }
    
    
    String choice;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectfinal/sp.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setText("Sign IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Director", "Employee", "Guest" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jPasswordField1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(704, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    String conString ="jdbc:mysql://localhost:3306/nafis";
    String username ="root";
    String passward ="";
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        choice = jComboBox1.getSelectedItem()+"";
        
        
        
        String pass = String.valueOf(jPasswordField1.getPassword());
        
        if(jTextField1.getText().equalsIgnoreCase("") && pass.equalsIgnoreCase("")  && !choice.equalsIgnoreCase("guest")){
            
            JOptionPane.showMessageDialog(null,"Enter Username or Password", "Access Denied",JOptionPane.ERROR_MESSAGE);
            
        }
        
        //System.out.println(pass);
        else if(choice.equalsIgnoreCase("guest")){
            
            SellPage sell = new SellPage(-1,2);
            sell.jLabel13.setText(choice);
            sell.jButton4.setEnabled(false);
            sell.jButton12.setEnabled(false);
            sell.jButton3.setEnabled(false);
            sell.jButton1.setEnabled(false);
            sell.jButton13.setEnabled(false);
            //sell.jButton7.setEnabled(false);
            sell.jButton2.setEnabled(false);
            sell.setVisible(true);
            setVisible(false);
        }
        else if(choice.equalsIgnoreCase("Manager")){
            
            
            
            String sql="SELECT * FROM  `employee` WHERE  `First name` LIKE  '"+jTextField1.getText()+"' AND `Post` LIKE  'Manager' AND  `password` =  '"+pass+"'";
        
            try{
            
                Connection con= (Connection) DriverManager.getConnection(conString, username, passward);
            
                Statement s =(Statement) con.prepareStatement(sql);
            
            
            
                ResultSet rs=s.executeQuery(sql);
            
                if(rs.next()){
                    
                    int id = Integer.parseInt( rs.getString(1));
                    
                    System.out.println(id);
                    
                    SellPage sell = new SellPage(id,2);
                    sell.setVisible(true);
                    setVisible(false);
                
                }
                else{
                
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password", "Access Denied",JOptionPane.ERROR_MESSAGE);
                
                }
            
            
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(choice.equalsIgnoreCase("Director")){
            
            
            
            String sql="SELECT * FROM  `employee` WHERE  `First name` LIKE  '"+jTextField1.getText()+"' AND `Post` LIKE  'Director' AND  `password` =  '"+pass+"'";
        
            try{
            
                Connection con= (Connection) DriverManager.getConnection(conString, username, passward);
            
                Statement s =(Statement) con.prepareStatement(sql);
            
            
            
                ResultSet rs=s.executeQuery(sql);
            
                if(rs.next()){
                    
                    int id = Integer.parseInt( rs.getString(1));
                    
                    System.out.println(id);
                    
                    SellPage sell = new SellPage(id,1);
                    sell.setVisible(true);
                    setVisible(false);
                
                }
                else{
                
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password", "Access Denied",JOptionPane.ERROR_MESSAGE);
                
                }
            
            
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            
            
            //for employee login
            String sql="SELECT * FROM  `employee` WHERE  `First name` LIKE  '"+jTextField1.getText()+"' AND  `password` =  '"+pass+"'";
        
            try{
                
                //System.out.println(jPasswordField1.getPassword());
                Connection con= (Connection) DriverManager.getConnection(conString, username, passward);
            
                Statement s =(Statement) con.prepareStatement(sql);
            
            
            
                ResultSet rs=s.executeQuery(sql);
            
                if(rs.next()){
                    
                    int id = Integer.parseInt( rs.getString(1));
                    
                    System.out.println(id);
                    
                    SellPage sell = new SellPage(id,2);
                    sell.jButton3.setEnabled(false);
                    sell.jButton1.setEnabled(false);
                    sell.jButton13.setEnabled(false);
                    sell.setVisible(true);
                    setVisible(false);
                
                }
                else{
                
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password", "Access Denied",JOptionPane.ERROR_MESSAGE);
                
                }
            
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

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
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
