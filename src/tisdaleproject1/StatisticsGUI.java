package tisdaleproject1;
/******************************************************
***  Class Name: StatisticsGUI
***  Class Author: Chris Tisdale 
******************************************************
*** Purpose of the class:
*** This class demonstrates error catching. It provides a GUI
*** for the user to enter ten numbers in text areas and displays
*** the mean and population standard deviation after pressing a button.
*** If there is an empty text area or one that cannot be parsed to 
*** a double, then it shows an error pop up.
****************************************************** 
*** September 5, 2017
******************************************************
*** August 30:  Reviewed assignment and created design for my program and
***             implemented with pseudocode.
*** August 30:  Created TisdaleProject1, StatisticsGUI and CalculateStatistics classes.
***             Tested the input and verified the output of the program, as well as error catching.
*** August 31:  Added comments and final testing.
******************************************************
***  
*******************************************************/
import javax.swing.JOptionPane;

public class StatisticsGUI extends javax.swing.JFrame {

    public StatisticsGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInstructions = new javax.swing.JLabel();
        tfNumber2 = new javax.swing.JTextField();
        tfNumber3 = new javax.swing.JTextField();
        tfNumber4 = new javax.swing.JTextField();
        tfNumber5 = new javax.swing.JTextField();
        tfNumber6 = new javax.swing.JTextField();
        tfNumber7 = new javax.swing.JTextField();
        tfNumber8 = new javax.swing.JTextField();
        tfNumber9 = new javax.swing.JTextField();
        tfNumber10 = new javax.swing.JTextField();
        meanLbl = new javax.swing.JLabel();
        standardDeviationLbl = new javax.swing.JLabel();
        tfMean = new javax.swing.JTextField();
        tfStandardDeviation = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        tfNumber1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInstructions.setText("Enter numbers in the boxes below and hit calculate to display the mean and standard deviation.");

        meanLbl.setText("Mean:");

        standardDeviationLbl.setText("Standard Deviation:");

        tfMean.setEditable(false);

        tfStandardDeviation.setEditable(false);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstructions)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(standardDeviationLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfStandardDeviation, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(meanLbl)
                            .addGap(96, 96, 96)
                            .addComponent(tfMean, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCalculate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblInstructions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meanLbl)
                    .addComponent(tfMean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardDeviationLbl)
                    .addComponent(tfStandardDeviation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*****************************************************
*** Method Name: btnCalculateActionPerformed
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: Tries to parse the text boxes to double values,
*** if there is an error, a pop-up window shows the error that occurred.
*** If they can be parsed to a double and added to the array list through
*** the method call to buildNumList then it will set the Mean and Standard
*** Deviation text areas to the corresponding values calculated with the
*** numbers from the boxes with functionality from the CalculateStatistics class
*** methods.
*** Method Inputs: none
*** Return value: void
******************************************************
*** Date: August 30
******************************************************/
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed

        CalculateStatistics Stats = new CalculateStatistics();
        
        try { // attempt to test if input is in double range and build arrayList parsing all text areas to double
            Stats.testInputFitInDouble(tfNumber1.getText());
            Stats.testInputFitInDouble(tfNumber2.getText());
            Stats.testInputFitInDouble(tfNumber3.getText());
            Stats.testInputFitInDouble(tfNumber4.getText());
            Stats.testInputFitInDouble(tfNumber5.getText());
            Stats.testInputFitInDouble(tfNumber6.getText());
            Stats.testInputFitInDouble(tfNumber7.getText());
            Stats.testInputFitInDouble(tfNumber8.getText());
            Stats.testInputFitInDouble(tfNumber9.getText());
            Stats.testInputFitInDouble(tfNumber10.getText());
            
            Stats.buildNumList(Double.parseDouble(tfNumber1.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber2.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber3.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber4.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber5.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber6.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber7.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber8.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber9.getText()));
            Stats.buildNumList(Double.parseDouble(tfNumber10.getText()));

            // set text areas to display mean and standard deviation
            tfMean.setText(Stats.getMean());
            tfStandardDeviation.setText(Stats.getStandardDeviation());

        } catch (NumberFormatException e) { // error message dialog pop-up if text areas fail to parse to double
            JOptionPane.showMessageDialog(null, "Error: \n" + e + "\nPlease enter a valid number in each box and try again.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(StatisticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel meanLbl;
    private javax.swing.JLabel standardDeviationLbl;
    public javax.swing.JTextField tfMean;
    private javax.swing.JTextField tfNumber1;
    private javax.swing.JTextField tfNumber10;
    private javax.swing.JTextField tfNumber2;
    private javax.swing.JTextField tfNumber3;
    private javax.swing.JTextField tfNumber4;
    private javax.swing.JTextField tfNumber5;
    private javax.swing.JTextField tfNumber6;
    private javax.swing.JTextField tfNumber7;
    private javax.swing.JTextField tfNumber8;
    private javax.swing.JTextField tfNumber9;
    public javax.swing.JTextField tfStandardDeviation;
    // End of variables declaration//GEN-END:variables
}
