package ec.edu.espe.taxiScheduling.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class TaxiScheduling extends javax.swing.JFrame {

    /**
     * Creates new form taxiScheduling
     */
    public TaxiScheduling() {
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

        pnlAirportTaxiSheduling = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mnubAirportTaxiScheduling = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airport Taxi Scheduling");
        setAlwaysOnTop(true);

        pnlAirportTaxiSheduling.setBackground(new java.awt.Color(64, 65, 60));
        pnlAirportTaxiSheduling.setToolTipText("Taxi");

        jLabel1.setText("Team Progress for Sheduling your travels");

        javax.swing.GroupLayout pnlAirportTaxiShedulingLayout = new javax.swing.GroupLayout(pnlAirportTaxiSheduling);
        pnlAirportTaxiSheduling.setLayout(pnlAirportTaxiShedulingLayout);
        pnlAirportTaxiShedulingLayout.setHorizontalGroup(
            pnlAirportTaxiShedulingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAirportTaxiShedulingLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        pnlAirportTaxiShedulingLayout.setVerticalGroup(
            pnlAirportTaxiShedulingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAirportTaxiShedulingLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        mnubAirportTaxiScheduling.setToolTipText("Airport Taxi Scheduling");

        jMenu1.setText("Airport Taxi Sheduling");

        miAbout.setText("About");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        jMenu1.add(miAbout);

        miExit.setText("Exit");
        jMenu1.add(miExit);

        mnubAirportTaxiScheduling.add(jMenu1);

        jMenu4.setText("TaxiDriver");

        jMenuItem4.setText("Add driver");
        jMenu4.add(jMenuItem4);

        jMenuItem11.setText("View driver");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Update driver");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Delete driver");
        jMenu4.add(jMenuItem13);

        mnubAirportTaxiScheduling.add(jMenu4);

        jMenu5.setText("Traveler");

        jMenuItem1.setText("Add traveler");
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("View travelers");
        jMenu5.add(jMenuItem2);

        jMenuItem14.setText("Update traveler");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Delete travelers");
        jMenu5.add(jMenuItem15);

        mnubAirportTaxiScheduling.add(jMenu5);

        jMenu3.setText("Services");

        jMenuItem5.setText("Accounting");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Reminder");
        jMenu3.add(jMenuItem6);

        jMenuItem16.setText("Calculate trip price");
        jMenu3.add(jMenuItem16);

        jMenuItem19.setText("History");
        jMenu3.add(jMenuItem19);

        mnubAirportTaxiScheduling.add(jMenu3);

        jMenu2.setText("Help");

        jMenuItem17.setText("Contact Support");
        jMenu2.add(jMenuItem17);

        jMenuItem3.setText("Common Problems");
        jMenu2.add(jMenuItem3);

        mnubAirportTaxiScheduling.add(jMenu2);

        setJMenuBar(mnubAirportTaxiScheduling);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAirportTaxiSheduling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAirportTaxiSheduling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        FrmAbout about;
        about = new FrmAbout();
        about.setVisible(true);
    }//GEN-LAST:event_miAboutActionPerformed

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
            java.util.logging.Logger.getLogger(TaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiScheduling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuBar mnubAirportTaxiScheduling;
    private javax.swing.JPanel pnlAirportTaxiSheduling;
    // End of variables declaration//GEN-END:variables
}
