package pharmacy;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class billing extends javax.swing.JFrame {

    
    public billing() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy","root","password");
            String q = "select max(billnum) from salestwo";
            PreparedStatement pst = con.prepareStatement(q);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               billnum=rs.getInt("max(billnum)");
            }
            setDateandBill(billnum);
            setComboBox();
            
        } catch (SQLException ex) {
            Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private int billnum=200;
    String pName;
    int pid,qty,cost,qtyInStock;
    int totalCost;
    int sumtotal=0;
    String customername,phnum,emailid;
    
    public Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy","root","password");
            //JOptionPane.showMessageDialog(null, "Connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Suppliers.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        billlinglab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        billnotf = new javax.swing.JTextField();
        datetf = new javax.swing.JTextField();
        cnametf = new javax.swing.JTextField();
        phnolab = new javax.swing.JLabel();
        phnotf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        billnolab = new javax.swing.JLabel();
        cnamelab = new javax.swing.JLabel();
        emaillab = new javax.swing.JLabel();
        generateRec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        printRec = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inssales = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        totalfd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addcustomer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        costbill = new javax.swing.JTextField();
        qtybill = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        leftInStockTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addtotablebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        productCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        billlinglab.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        billlinglab.setText("BILLING");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Trebuchet EA", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        billnotf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        billnotf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        billnotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billnotfActionPerformed(evt);
            }
        });

        datetf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datetf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cnametf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cnametf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        phnolab.setFont(new java.awt.Font("Trebuchet EA", 0, 18)); // NOI18N
        phnolab.setText("Phone no.");

        phnotf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phnotf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        emailtf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        emailtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        billnolab.setFont(new java.awt.Font("Trebuchet EA", 0, 18)); // NOI18N
        billnolab.setText("Bill no.");

        cnamelab.setFont(new java.awt.Font("Trebuchet EA", 0, 18)); // NOI18N
        cnamelab.setText("Customer Name");

        emaillab.setFont(new java.awt.Font("Trebuchet EA", 0, 18)); // NOI18N
        emaillab.setText("Email id");

        generateRec.setText("Generate Receipt");
        generateRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phnolab, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnamelab)
                    .addComponent(emaillab, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailtf)
                    .addComponent(cnametf)
                    .addComponent(phnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(billnolab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(billnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(datetf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(generateRec)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnamelab)
                    .addComponent(billnolab)
                    .addComponent(cnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(datetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnolab))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillab)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateRec))
                .addContainerGap())
        );

        receiptArea.setColumns(20);
        receiptArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        receiptArea.setRows(5);
        jScrollPane1.setViewportView(receiptArea);

        printRec.setText("Print Receipt");
        printRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRecActionPerformed(evt);
            }
        });

        inssales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        inssales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Total Cost"
            }
        ));
        jScrollPane2.setViewportView(inssales);

        jLabel6.setFont(new java.awt.Font("Trebuchet EA", 0, 14)); // NOI18N
        jLabel6.setText("Total :");

        totalfd.setFont(new java.awt.Font("Trebuchet EA", 0, 14)); // NOI18N
        totalfd.setText("0");

        jButton1.setText("Exit to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addcustomer.setText("Add Customer");
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Trebuchet EA", 0, 16)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Trebuchet EA", 0, 16)); // NOI18N
        jLabel2.setText("Product Name");

        costbill.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        costbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costbillActionPerformed(evt);
            }
        });

        qtybill.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton2.setText("Fetch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        leftInStockTf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet EA", 0, 16)); // NOI18N
        jLabel4.setText("Cost");

        addtotablebtn.setText("Add");
        addtotablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtotablebtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet EA", 0, 16)); // NOI18N
        jLabel1.setText("Left in Stock");

        productCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(leftInStockTf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addComponent(productCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costbill, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtybill, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(addtotablebtn))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtybill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftInStockTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(costbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtotablebtn)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billlinglab, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(printRec, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addcustomer)
                        .addGap(385, 385, 385)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalfd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(billlinglab, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printRec))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcustomer)
                            .addComponent(jLabel6)
                            .addComponent(totalfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billnotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billnotfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billnotfActionPerformed

    private void printRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRecActionPerformed
        receiptArea.setText(receiptArea.getText()+"************************************\n");
        receiptArea.setText(receiptArea.getText()+"total:\t"+sumtotal);
        try{
            // TODO add your handling code here:
            receiptArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printRecActionPerformed

    private void generateRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRecActionPerformed
        // TODO add your handling code here:
        
        receiptArea.setText("************************************\n");
        receiptArea.setText(receiptArea.getText()+"*       Pharmacy Receipt           *\n");
        receiptArea.setText(receiptArea.getText()+"************************************\n");
        
        billnotf.setText(Integer.toString(billnum));
        receiptArea.setText(receiptArea.getText()+billnotf.getText()+"    ");
        receiptArea.setText(receiptArea.getText()+cnametf.getText()+"    ");
        receiptArea.setText(receiptArea.getText()+datetf.getText()+"\n");
        receiptArea.setText(receiptArea.getText()+"************************************\n");
        receiptArea.setText(receiptArea.getText()+"Name\tQty\tCost\n");
        receiptArea.setText(receiptArea.getText()+"************************************\n");
        
        
    }//GEN-LAST:event_generateRecActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pName=String.valueOf(productCombo.getSelectedItem());
        qty=Integer.parseInt(qtybill.getText());
        
        try{
            String q = "select productid,cost,quantity from inventory where productName=?";
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1, pName);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               pid=rs.getInt("productId");
               cost=rs.getInt("Cost");
               qtyInStock = rs.getInt("Quantity");
               costbill.setText(Integer.toString(cost));
               leftInStockTf.setText(Integer.toString(qtyInStock));
               
               totalCost=cost*qty;
               
               
            }
                    
 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void costbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costbillActionPerformed

    private void addtotablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtotablebtnActionPerformed
        try {
            // TODO add your handling code here:
           if(qtyInStock<qty){
                   JOptionPane.showMessageDialog(null, "Item Out of Stock!");
            } 
           else{
                String q = "insert into salestwo(ProductId,quantity,cost,TotalCost,billnum,purchasedate) values("+pid+","+qty+","+cost+","+totalCost+","+billnum+",now())";
                Connection con = getConnection();
                Statement st = con.createStatement();
                st.executeUpdate(q);

                sumtotal+=totalCost;
                totalfd.setText(Integer.toString(sumtotal));

                q = "select s.productId as `Product Id`, productName as `Product Name`,s.quantity as `Quantity`,TotalCost as `Cost` from salestwo s, inventory i where i.productId=s.productId and billnum="+billnum;
                PreparedStatement pst = con.prepareStatement(q);
                ResultSet rs = pst.executeQuery();
                inssales.setModel(DbUtils.resultSetToTableModel(rs));
                receiptArea.setText(receiptArea.getText()+pName+" \t"+qty+" \t"+totalCost+"\n");

                //Decrementing the quanity of each product after purchase
                q = "update inventory set quantity=quantity-"+qty+" where productId="+pid;
                pst = con.prepareStatement(q);
                pst.executeUpdate();
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addtotablebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //new billing().setVisible(false);
        this.dispose();
        //new pharmacy().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
        try {
            // TODO add your handling code here:
            customername=cnametf.getText();
            phnum=phnotf.getText();
            emailid = emailtf.getText();
            
            String q = "insert into customers(custname,phno,emailid) values(?,?,?)";
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1,customername);
            pst.setString(2,phnum);
            pst.setString(3,emailid);
            pst.executeUpdate();
            
            new Addnewcustomer(new javax.swing.JFrame(), true).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addcustomerActionPerformed

    public String getCustomerName(){
        return customername;
    }
    
    public int getBillNumber(){
        return billnum;
    }
    
    public void setDateandBill(int billno){
        billnum=billno+1;
        //System.out.println(billnum);
        billnotf.setText(Integer.toString(billnum));
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        //System.out.println(date);  
        datetf.setText(date.toString());
        
    }
    
    public void setComboBox(){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select productName from Inventory order by productName");
            while (rs.next()) {
                String pat = rs.getString("productName");
                productCombo.addItem(pat);
            }
            /**
             * @param args the command line arguments
             */
        } catch (SQLException ex) {
            Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcustomer;
    private javax.swing.JButton addtotablebtn;
    private javax.swing.JLabel billlinglab;
    private javax.swing.JLabel billnolab;
    private javax.swing.JTextField billnotf;
    private javax.swing.JLabel cnamelab;
    private javax.swing.JTextField cnametf;
    private javax.swing.JTextField costbill;
    private javax.swing.JTextField datetf;
    private javax.swing.JLabel emaillab;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton generateRec;
    private javax.swing.JTable inssales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField leftInStockTf;
    private javax.swing.JLabel phnolab;
    private javax.swing.JTextField phnotf;
    private javax.swing.JButton printRec;
    private javax.swing.JComboBox<String> productCombo;
    private javax.swing.JTextField qtybill;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JTextField totalfd;
    // End of variables declaration//GEN-END:variables
}
