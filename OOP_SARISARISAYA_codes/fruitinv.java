/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

        
/**
 *
 * @author ADMIN
 */
public class inv extends javax.swing.JFrame {
   Connection con; 

    /**
     * Creates new form inv
     */
    public inv() {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/sarisarisaya";
        String user = "root";
        String pass = "";
        try{
            con = DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sarisarisaya = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productID = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sarisarisaya.setBackground(new java.awt.Color(231, 198, 179));
        sarisarisaya.setFont(new java.awt.Font("Cooper Black", 0, 15)); // NOI18N
        sarisarisaya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "DATE"
            }
        ));
        jScrollPane1.setViewportView(sarisarisaya);

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel5.setText("INVENTORY");

        jButton4.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        jButton5.setText("VIEW TABLE");
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(251, 255, 194));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jButton2.setText("EDIT");
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(43, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(43, 23));
        jButton2.setOpaque(false);
        jButton2.setPreferredSize(new java.awt.Dimension(43, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(251, 255, 194));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(251, 255, 194));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel1.setText("PRODUCT ID");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel2.setText("PRODUCT NAME");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel3.setText("QUANTITY");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel4.setText("DATE");

        productID.setFont(new java.awt.Font("Cooper Black", 0, 15)); // NOI18N
        productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDActionPerformed(evt);
            }
        });

        productName.setFont(new java.awt.Font("Cooper Black", 0, 15)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Cooper Black", 0, 15)); // NOI18N

        date.setFont(new java.awt.Font("Cooper Black", 0, 15)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\BG\\FRUITINV.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(760, 760, 760)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1320, 1320, 1320)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6)
        );

        jButton4.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        seller seller = new seller();
        seller.setVisible(true);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String sql ="INSERT INTO inventory"
        + "(`ProductID`, `ProductName`, `Quantity`, `StockDate`)"
        +"VALUES (?,?,?,?)";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);

            DefaultTableModel model = (DefaultTableModel) sarisarisaya.getModel();

            pst.setString(1,productID.getText());
            pst.setString(2,productName.getText());
            pst.setString(3,quantity.getText());
            pst.setString(4,date.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         String sql ="UPDATE inventory SET ProductName =?, Quantity =?, StockDate =? WHERE ProductID =?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            DefaultTableModel model = (DefaultTableModel) sarisarisaya.getModel();
            
            pst.setString(4,productID.getText());
            pst.setString(1,productName.getText());
            pst.setString(2,quantity.getText());
            pst.setString(3,date.getText());
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "UPDATE Successfully");
        } catch (HeadlessException | SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 String sql ="DELETE FROM `inventory` WHERE  ProductID =?";
        try{

            PreparedStatement pst  = con.prepareStatement(sql);

            DefaultTableModel model = (DefaultTableModel) sarisarisaya.getModel();

            pst.setString(1,productID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "DELETED Successfully");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }        // TODO add your handling code here:
    }                                        

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void productIDActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         String sql = "SELECT * FROM  inventory";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) sarisarisaya.getModel();
            model.setRowCount(0);

            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        }catch(Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }                                        

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
            java.util.logging.Logger.getLogger(inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void Run() {
                new inv().setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField quantity;
    private javax.swing.JTable sarisarisaya;
    // End of variables declaration                   
}
