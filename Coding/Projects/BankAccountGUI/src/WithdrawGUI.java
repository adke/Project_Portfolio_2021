//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1
import java.time.LocalDateTime;
import javax.swing.JOptionPane;



public class WithdrawGUI extends javax.swing.JFrame { //creating a JFrame for the WithdrawGUI class
    private BankDataLayer bd;
    String account;

    /**
     * Creates new form Withdraw1
     */
    public WithdrawGUI(String account, BankDataLayer bd) { //constructor for Withdraw GUI
        this.bd = bd;
        this.account = account;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        withdrawLabel = new javax.swing.JLabel();
        withdrawTextField = new javax.swing.JTextField();
        withdrawOkButton = new javax.swing.JButton();
        withdrawCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Withdraw");
        setResizable(false);

        withdrawLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        withdrawLabel.setText("Please provide the amount to be withdrawn:");

        withdrawTextField.setToolTipText("amount");

        withdrawOkButton.setText("OK");
        withdrawOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawOkButtonActionPerformed(evt);
            }
        });

        withdrawCancelButton.setText("Cancel");
        withdrawCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(withdrawTextField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(withdrawOkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawCancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawOkButton)
                    .addComponent(withdrawCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Action Listener for the withdraw cancel button
    private void withdrawCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawCancelButtonActionPerformed
        this.setVisible(false);//when the cancel button is pressed for the Withdraw GUI, the frame will be gone and will show the main BankAccount GUI 
    }//GEN-LAST:event_withdrawCancelButtonActionPerformed
//Action Listener for the withdraw ok button
    private void withdrawOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawOkButtonActionPerformed
        if(withdrawTextField.getText().isEmpty()){ //if withdraw text field is empty, an error message will pop up, telling the user to put in an appropriate value 
            JOptionPane.showMessageDialog(this.rootPane,"Invalid, please enter an appropriate value");
            
        }
        else{ //if the withdraw text field is not empty, the program will use the try and catch method for error checking
            try{
                double userInputNumber = Double.parseDouble(withdrawTextField.getText()); //converting string to double for the withdraw text field
                bd.addTransaction(account, userInputNumber, "withdraw", LocalDateTime.now(), false); //will add the transaction made to the bank data layer
                this.setVisible(false); //if user puts in an appropriate double value within the withdraw text field, an error frame will not show
                
            }
            //if user puts in an inappropriate value, the program will catch that error and an error message will show, telling the user to put in an appropriate value in the withdraw text field
              catch(NumberFormatException nfe){
                 JOptionPane.showMessageDialog(this.rootPane,"Invalid, please enter an appropriate value"); 
              }
              
        }
    }//GEN-LAST:event_withdrawOkButtonActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton withdrawCancelButton;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JButton withdrawOkButton;
    private javax.swing.JTextField withdrawTextField;
    // End of variables declaration//GEN-END:variables
}
