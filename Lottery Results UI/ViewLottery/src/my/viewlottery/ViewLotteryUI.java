/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.viewlottery;

/**
 *
 * @author darthmaul
 */
public class ViewLotteryUI extends javax.swing.JFrame {
    String[] lotteryTypes = { "Powerball", "Mega Millions", "Super Lotto", "Fantasy 5", "Daily 4", "Daily 3" };
    LotteryScannerPB apower = new LotteryScannerPB();
    LotteryScannerMM amegam = new LotteryScannerMM();
    LotteryScannerSL asuper = new LotteryScannerSL();
    LotteryScannerF5 afant = new LotteryScannerF5();
    LotteryScannerD4 aday4 = new LotteryScannerD4();
    LotteryScannerD3 aday3 = new LotteryScannerD3();
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            DownloadFile adownload = new DownloadFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ViewLotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLotteryUI().setVisible(true);
//                try {
//                    DownloadFile adownload = new DownloadFile();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                try {
//                    Thread.sleep(1000);                 //1000 milliseconds is one second.
//                } catch(InterruptedException ex) {
//                    Thread.currentThread().interrupt();
//                }
            }    
        });    
    }
    
    /**
     * Creates new form ViewLotteryUI
     */
    public ViewLotteryUI() {
        initComponents();
        
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
        lotteryChoice = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Winning Numbers");

        jLabel1.setText("Lottery Choice:");

        jLabel2.setText("Num 1");

        lotteryChoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Powerball", "Mega Millions", "Super Lotto", "Fantasy 5", "Daily 4", "Daily 3" }));

        jLabel3.setText("Num 2");

        jLabel4.setText("Num 3");

        jLabel5.setText("Num 4");

        jLabel6.setText("Num 5");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Draw Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lotteryChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jTextField1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jTextField2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jTextField3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jTextField4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel6, jTextField5, jTextField6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lotteryChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String choice = lotteryChoice.getSelectedItem() + "";
        
        if (choice.equals(lotteryTypes[0])){
            jTextField1.setText(String.valueOf(apower.firNum));
            jTextField2.setText(String.valueOf(apower.secNum));
            jTextField3.setText(String.valueOf(apower.thNum));
            jTextField4.setText(String.valueOf(apower.forNum));
            jTextField5.setText(String.valueOf(apower.fifNum));
            jTextField6.setText(String.valueOf(apower.power));
            jLabel7.setText("Power");
            jLabel9.setText(apower.date + ".");
            jLabel10.setText(apower.month);
            jLabel11.setText(String.valueOf(apower.day) + ",");
            jLabel12.setText(String.valueOf(apower.year));
            
        }
        else if (choice.equals(lotteryTypes[1])) {
            jTextField1.setText(String.valueOf(amegam.firNum));
            jTextField2.setText(String.valueOf(amegam.secNum));
            jTextField3.setText(String.valueOf(amegam.thNum));
            jTextField4.setText(String.valueOf(amegam.forNum));
            jTextField5.setText(String.valueOf(amegam.fifNum));
            jTextField6.setText(String.valueOf(amegam.mega));
            jLabel7.setText("Mega");
            jLabel9.setText(amegam.date + ".");
            jLabel10.setText(amegam.month);
            jLabel11.setText(String.valueOf(amegam.day) + ",");
            jLabel12.setText(String.valueOf(amegam.year));
        }
        else if (choice.equals(lotteryTypes[2])) {
           jTextField1.setText(String.valueOf(asuper.firNum));
           jTextField2.setText(String.valueOf(asuper.secNum));
           jTextField3.setText(String.valueOf(asuper.thNum));
           jTextField4.setText(String.valueOf(asuper.forNum));
           jTextField5.setText(String.valueOf(asuper.fifNum));
           jTextField6.setText(String.valueOf(asuper.mega));
           jLabel7.setText("Mega");
           jLabel9.setText(asuper.date + ".");
           jLabel10.setText(asuper.month);
           jLabel11.setText(String.valueOf(asuper.day) + ",");
           jLabel12.setText(String.valueOf(asuper.year));
        }
                else if (choice.equals(lotteryTypes[3])) {
           jTextField1.setText(String.valueOf(afant.firNum));
           jTextField2.setText(String.valueOf(afant.secNum));
           jTextField3.setText(String.valueOf(afant.thNum));
           jTextField4.setText(String.valueOf(afant.forNum));
           jTextField5.setText(String.valueOf(afant.fifNum));
           jTextField6.setText("");
           jLabel7.setText("");
           jLabel9.setText(afant.date + ".");
           jLabel10.setText(afant.month);
           jLabel11.setText(String.valueOf(afant.day) + ",");
           jLabel12.setText(String.valueOf(afant.year));
        }
                else if (choice.equals(lotteryTypes[4])) {
           jTextField1.setText(String.valueOf(aday4.firNum));
           jTextField2.setText(String.valueOf(aday4.secNum));
           jTextField3.setText(String.valueOf(aday4.thNum));
           jTextField4.setText(String.valueOf(aday4.forNum));
           jTextField5.setText("");
           jTextField6.setText("");
           jLabel7.setText("");
           jLabel9.setText(aday4.date + ".");
           jLabel10.setText(aday4.month);
           jLabel11.setText(String.valueOf(aday4.day) + ",");
           jLabel12.setText(String.valueOf(aday4.year));
        }
                else if (choice.equals(lotteryTypes[5])) {
           jTextField1.setText(String.valueOf(aday3.firNum));
           jTextField2.setText(String.valueOf(aday3.secNum));
           jTextField3.setText(String.valueOf(aday3.thNum));
           jTextField4.setText("");
           jTextField5.setText("");
           jTextField6.setText("");
           jLabel7.setText("");
           jLabel9.setText(aday3.date + ".");
           jLabel10.setText(aday3.month);
           jLabel11.setText(String.valueOf(aday3.day) + ",");
           jLabel12.setText(String.valueOf(aday3.year));
        }
        //jTextField1.setText(apower.firNum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox lotteryChoice;
    // End of variables declaration//GEN-END:variables
}
