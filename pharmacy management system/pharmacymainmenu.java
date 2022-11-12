package pharmacy;

import javax.swing.WindowConstants;

public class PharmacyMainMenu extends javax.swing.JFrame {

 
    public PharmacyMainMenu() {
        
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        parentpanel = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        snotip = new javax.swing.JPanel();
        snotilab = new javax.swing.JLabel();
        sreportlab = new javax.swing.JLabel();
        sreportp = new javax.swing.JPanel();
        sregcustlab = new javax.swing.JLabel();
        ssuplierlab = new javax.swing.JLabel();
        sbillp = new javax.swing.JPanel();
        ssuplierp = new javax.swing.JPanel();
        sstockp = new javax.swing.JPanel();
        sregsustp = new javax.swing.JPanel();
        sstocklab = new javax.swing.JLabel();
        sbilllab = new javax.swing.JLabel();
        child = new javax.swing.JPanel();
        billpanel = new javax.swing.JPanel();
        billlab = new javax.swing.JLabel();
        notipanel = new javax.swing.JPanel();
        notilab = new javax.swing.JLabel();
        reportpanel = new javax.swing.JPanel();
        reportlab = new javax.swing.JLabel();
        regcustpanel = new javax.swing.JPanel();
        regcustlab = new javax.swing.JLabel();
        supplierpanel = new javax.swing.JPanel();
        supplierlab = new javax.swing.JLabel();
        stockpanel = new javax.swing.JPanel();
        stocklab = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        parentpanel.setBackground(new java.awt.Color(255, 255, 255));
        parentpanel.setToolTipText("");

        sidepanel.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        snotip.setBackground(new java.awt.Color(0, 0, 153));

        snotilab.setBackground(new java.awt.Color(0, 0, 153));
        snotilab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        snotilab.setForeground(new java.awt.Color(255, 255, 255));
        snotilab.setText("NOTIFICATION");

        sreportlab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        sreportlab.setForeground(new java.awt.Color(255, 255, 255));
        sreportlab.setText("REPORT");

        javax.swing.GroupLayout snotipLayout = new javax.swing.GroupLayout(snotip);
        snotip.setLayout(snotipLayout);
        snotipLayout.setHorizontalGroup(
            snotipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snotipLayout.createSequentialGroup()
                .addGroup(snotipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snotipLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(sreportlab))
                    .addGroup(snotipLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(snotilab)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        snotipLayout.setVerticalGroup(
            snotipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snotipLayout.createSequentialGroup()
                .addComponent(snotilab)
                .addGap(18, 18, 18)
                .addComponent(sreportlab)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sreportp.setBackground(new java.awt.Color(0, 0, 153));

        sregcustlab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        sregcustlab.setForeground(new java.awt.Color(255, 255, 255));
        sregcustlab.setText("CUSTOMERS");

        ssuplierlab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        ssuplierlab.setForeground(new java.awt.Color(255, 255, 255));
        ssuplierlab.setText("SUPPLIERS");

        javax.swing.GroupLayout sreportpLayout = new javax.swing.GroupLayout(sreportp);
        sreportp.setLayout(sreportpLayout);
        sreportpLayout.setHorizontalGroup(
            sreportpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sreportpLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(sregcustlab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sreportpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ssuplierlab)
                .addGap(19, 19, 19))
        );
        sreportpLayout.setVerticalGroup(
            sreportpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sreportpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sregcustlab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ssuplierlab))
        );

        sbillp.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout sbillpLayout = new javax.swing.GroupLayout(sbillp);
        sbillp.setLayout(sbillpLayout);
        sbillpLayout.setHorizontalGroup(
            sbillpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sbillpLayout.setVerticalGroup(
            sbillpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        ssuplierp.setBackground(new java.awt.Color(0, 0, 153));

        sstockp.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout sstockpLayout = new javax.swing.GroupLayout(sstockp);
        sstockp.setLayout(sstockpLayout);
        sstockpLayout.setHorizontalGroup(
            sstockpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sstockpLayout.setVerticalGroup(
            sstockpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ssuplierpLayout = new javax.swing.GroupLayout(ssuplierp);
        ssuplierp.setLayout(ssuplierpLayout);
        ssuplierpLayout.setHorizontalGroup(
            ssuplierpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssuplierpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sstockp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ssuplierpLayout.setVerticalGroup(
            ssuplierpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssuplierpLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(sstockp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sregsustp.setBackground(new java.awt.Color(0, 0, 153));

        sstocklab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        sstocklab.setForeground(new java.awt.Color(255, 255, 255));
        sstocklab.setText("INVENTORY");

        javax.swing.GroupLayout sregsustpLayout = new javax.swing.GroupLayout(sregsustp);
        sregsustp.setLayout(sregsustpLayout);
        sregsustpLayout.setHorizontalGroup(
            sregsustpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sregsustpLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(sstocklab)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        sregsustpLayout.setVerticalGroup(
            sregsustpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sregsustpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sstocklab)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        sbilllab.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        sbilllab.setForeground(new java.awt.Color(255, 255, 255));
        sbilllab.setText("BILLING");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ssuplierp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(snotip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addComponent(sregsustp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sbillp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addComponent(sreportp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(sbilllab))
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbillp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sbilllab)
                .addGap(18, 18, 18)
                .addComponent(snotip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sreportp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(sregsustp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ssuplierp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        child.setBackground(new java.awt.Color(255, 255, 255));
        child.setForeground(new java.awt.Color(255, 255, 255));

        billpanel.setBackground(new java.awt.Color(0, 204, 204));
        billpanel.setForeground(new java.awt.Color(255, 255, 255));

        billlab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        billlab.setForeground(new java.awt.Color(255, 255, 255));
        billlab.setText("Billing");
        billlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billlabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout billpanelLayout = new javax.swing.GroupLayout(billpanel);
        billpanel.setLayout(billpanelLayout);
        billpanelLayout.setHorizontalGroup(
            billpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billpanelLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(billlab, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        billpanelLayout.setVerticalGroup(
            billpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        notipanel.setBackground(new java.awt.Color(0, 153, 51));
        notipanel.setForeground(new java.awt.Color(255, 255, 255));
        notipanel.setPreferredSize(new java.awt.Dimension(240, 50));
        notipanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notipanelMouseClicked(evt);
            }
        });

        notilab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        notilab.setForeground(new java.awt.Color(255, 255, 255));
        notilab.setText("Notification");

        javax.swing.GroupLayout notipanelLayout = new javax.swing.GroupLayout(notipanel);
        notipanel.setLayout(notipanelLayout);
        notipanelLayout.setHorizontalGroup(
            notipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notipanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(notilab, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        notipanelLayout.setVerticalGroup(
            notipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notilab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        reportpanel.setBackground(new java.awt.Color(255, 153, 153));
        reportpanel.setForeground(new java.awt.Color(255, 255, 255));

        reportlab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        reportlab.setForeground(new java.awt.Color(255, 255, 255));
        reportlab.setText("Report");
        reportlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportlabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reportpanelLayout = new javax.swing.GroupLayout(reportpanel);
        reportpanel.setLayout(reportpanelLayout);
        reportpanelLayout.setHorizontalGroup(
            reportpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportpanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(reportlab, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        reportpanelLayout.setVerticalGroup(
            reportpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportlab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        regcustpanel.setBackground(new java.awt.Color(204, 0, 102));
        regcustpanel.setForeground(new java.awt.Color(255, 255, 255));

        regcustlab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        regcustlab.setForeground(new java.awt.Color(255, 255, 255));
        regcustlab.setText("Customers");
        regcustlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regcustlabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout regcustpanelLayout = new javax.swing.GroupLayout(regcustpanel);
        regcustpanel.setLayout(regcustpanelLayout);
        regcustpanelLayout.setHorizontalGroup(
            regcustpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcustpanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(regcustlab)
                .addGap(60, 60, 60))
        );
        regcustpanelLayout.setVerticalGroup(
            regcustpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regcustpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regcustlab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        supplierpanel.setBackground(new java.awt.Color(153, 0, 153));
        supplierpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierpanelMouseClicked(evt);
            }
        });

        supplierlab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        supplierlab.setForeground(new java.awt.Color(255, 255, 255));
        supplierlab.setText("Suppliers");
        supplierlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierlabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout supplierpanelLayout = new javax.swing.GroupLayout(supplierpanel);
        supplierpanel.setLayout(supplierpanelLayout);
        supplierpanelLayout.setHorizontalGroup(
            supplierpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierpanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(supplierlab)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        supplierpanelLayout.setVerticalGroup(
            supplierpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplierlab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stockpanel.setBackground(new java.awt.Color(153, 153, 0));
        stockpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockpanelMouseClicked(evt);
            }
        });

        stocklab.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        stocklab.setForeground(new java.awt.Color(255, 255, 255));
        stocklab.setText("Inventory");

        javax.swing.GroupLayout stockpanelLayout = new javax.swing.GroupLayout(stockpanel);
        stockpanel.setLayout(stockpanelLayout);
        stockpanelLayout.setHorizontalGroup(
            stockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stockpanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(stocklab)
                .addGap(72, 72, 72))
        );
        stockpanelLayout.setVerticalGroup(
            stockpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stocklab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout childLayout = new javax.swing.GroupLayout(child);
        child.setLayout(childLayout);
        childLayout.setHorizontalGroup(
            childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regcustpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notipanel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        childLayout.setVerticalGroup(
            childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(childLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notipanel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(billpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regcustpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(childLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supplierpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout parentpanelLayout = new javax.swing.GroupLayout(parentpanel);
        parentpanel.setLayout(parentpanelLayout);
        parentpanelLayout.setHorizontalGroup(
            parentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentpanelLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(child, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        parentpanelLayout.setVerticalGroup(
            parentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentpanelLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(parentpanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(child, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(345, 345, 345))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockpanelMouseClicked
        // TODO add your handling code here:

        new Inventory().setVisible(true);
        new PharmacyMainMenu().setVisible(false);
    }//GEN-LAST:event_stockpanelMouseClicked

    private void supplierpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierpanelMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_supplierpanelMouseClicked

    private void supplierlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierlabMouseClicked
        // TODO add your handling code here:
        new PharmacyMainMenu().setVisible(false);
        new Suppliers().setVisible(true);
    }//GEN-LAST:event_supplierlabMouseClicked

    private void regcustlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regcustlabMouseClicked
        // TODO add your handling code here:
        new Customers().setVisible(true);
        new PharmacyMainMenu().setVisible(false);
    }//GEN-LAST:event_regcustlabMouseClicked

    private void reportlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlabMouseClicked
        // TODO add your handling code here:
        new Sales().setVisible(true);
        new PharmacyMainMenu().setVisible(false);
    }//GEN-LAST:event_reportlabMouseClicked

    private void notipanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notipanelMouseClicked
        // TODO add your handling code here:
        new NotificationPane().setVisible(true);
    }//GEN-LAST:event_notipanelMouseClicked

    private void billlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billlabMouseClicked
        // TODO add your handling code here:
        new PharmacyMainMenu().setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_billlabMouseClicked

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
            java.util.logging.Logger.getLogger(PharmacyMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyMainMenu().setVisible(true);
                new loginform().setVisible(false);
                new PharmacyMainMenu().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billlab;
    private javax.swing.JPanel billpanel;
    private javax.swing.JPanel child;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel notilab;
    private javax.swing.JPanel notipanel;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JLabel regcustlab;
    private javax.swing.JPanel regcustpanel;
    private javax.swing.JLabel reportlab;
    private javax.swing.JPanel reportpanel;
    private javax.swing.JLabel sbilllab;
    private javax.swing.JPanel sbillp;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel snotilab;
    private javax.swing.JPanel snotip;
    private javax.swing.JLabel sregcustlab;
    private javax.swing.JPanel sregsustp;
    private javax.swing.JLabel sreportlab;
    private javax.swing.JPanel sreportp;
    private javax.swing.JLabel sstocklab;
    private javax.swing.JPanel sstockp;
    private javax.swing.JLabel ssuplierlab;
    private javax.swing.JPanel ssuplierp;
    private javax.swing.JLabel stocklab;
    private javax.swing.JPanel stockpanel;
    private javax.swing.JLabel supplierlab;
    private javax.swing.JPanel supplierpanel;
    // End of variables declaration//GEN-END:variables
}
