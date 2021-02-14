//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1
import java.time.LocalDateTime;
import javax.swing.JOptionPane;


public class DepositGUI extends javax.swing.JFrame { //creating a JFrame for the DepositGUI class
    private BankDataLayer bd;
    String account;

    /**
     * Creates new form Deposit1GUI
     */
    public DepositGUI(String account, BankDataLayer bd ) { //constructor for Deposit GUI
        initComponents();
        this.account = account;
        this.bd = bd;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        depositLabel = new javax.swing.JLabel();
        depositTextField = new javax.swing.JTextField();
        depositOkButton = new javax.swing.JButton();
        depositCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit");
        setResizable(false);

        depositLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        depositLabel.setText("Please provide the amount to be deposited:");

        depositTextField.setToolTipText("amount");

        depositOkButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        depositOkButton.setText("OK");
        depositOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositOkButtonActionPerformed(evt);
            }
        });

        depositCancelButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        depositCancelButton.setText("Cancel");
        depositCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositTextField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(depositOkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositCancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositOkButton)
                    .addComponent(depositCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Action Listener for the deposit cancel button
    private void depositCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositCancelButtonActionPerformed
        this.setVisible(false); //when the cancel button is pressed for the Deposit GUI, the frame will be gone and will show the main BankAccount GUI 
    }//GEN-LAST:event_depositCancelButtonActionPerformed
//Action Listener for the deposit ok button
    private void depositOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositOkButtonActionPerformed
        if(depositTextField.getText().isEmpty()){ //if deposit text field is empty, an error message will pop up, telling the user to put in an appropriate value
            JOptionPane.showMessageDialog(this.rootPane,"Invalid, please enter an appropriate value");
            
        }
        else{ //if the deposit text field is not empty, the program will use the try and catch method for error checking
            try{
                double userInputNumber = Double.parseDouble(depositTextField.getText()); //converting string to double for the deposit text field
                bd.addTransaction(account, userInputNumber, "deposit", LocalDateTime.now(), false); //will add the transaction made to the bank data layer
                this.setVisible(false); //if user puts in an appropriate double value within the deposit text field, an error frame will not show
            }
            //if user puts in an inappropriate value, the program will catch that error and an error message will show, telling the user to put in an appropriate value in the deposit text field
              catch(NumberFormatException nfe){
                 JOptionPane.showMessageDialog(this.rootPane,"Invalid, please enter an appropriate value"); 
              }
              
        }
    }//GEN-LAST:event_depositOkButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositCancelButton;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JButton depositOkButton;
    private javax.swing.JTextField depositTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
