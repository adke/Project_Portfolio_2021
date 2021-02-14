//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class BankAccountGUI extends javax.swing.JFrame { //creating JFrame for BankAccountGUI class
    BankDataLayer bd = new BankDataLayer();

    /**
     * Creates new form BankAccountGUI
     */
    public BankAccountGUI() {
        initComponents();
        bd.readTransaction();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        currentBalanceTextField = new javax.swing.JTextField();
        currentBalanceLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        withdrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        chequingSavingComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionList = new javax.swing.JList<>();
        startDateTextField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        dateRangeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankAccountGUI");
        setBackground(new java.awt.Color(204, 204, 204));
        setName("frame"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel.setBackground(new java.awt.Color(204, 204, 204));

        currentBalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentBalanceTextFieldActionPerformed(evt);
            }
        });

        currentBalanceLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        currentBalanceLabel.setText("Current Balance:");

        accountLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        accountLabel.setText("Account");

        withdrawButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        depositButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        chequingSavingComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chequingSavingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chequing", "savings" }));
        chequingSavingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chequingSavingComboBoxItemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(transactionList);

        startDateTextField.setToolTipText("Enter Date");
        startDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTextFieldActionPerformed(evt);
            }
        });

        startDateLabel.setText("Start Date:");

        endDateLabel.setText("End Date:");

        endDateTextField.setToolTipText("Enter Date");
        endDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateTextFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        dateRangeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateRangeLabel.setText("Enter a Date Range Below (as MM/DD/YYYY) to see your Transaction History");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDateLabel)
                            .addComponent(startDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateTextField)
                            .addComponent(endDateTextField))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(withdrawButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(depositButton))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(currentBalanceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chequingSavingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currentBalanceTextField)))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(dateRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addGap(183, 183, 183))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chequingSavingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentBalanceLabel)
                    .addComponent(currentBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawButton)
                    .addComponent(depositButton))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(dateRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel))
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentBalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentBalanceTextFieldActionPerformed
        
    }//GEN-LAST:event_currentBalanceTextFieldActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        new WithdrawGUI(this.getAccount(), bd).setVisible(true);  //will open the withdraw GUI      
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        new DepositGUI(this.getAccount(), bd).setVisible(true); //will open the deposit GUI
    }//GEN-LAST:event_depositButtonActionPerformed

    private void startDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTextFieldActionPerformed
        
    }//GEN-LAST:event_startDateTextFieldActionPerformed

    private void chequingSavingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chequingSavingComboBoxItemStateChanged
        checkBalance(); //will check for the balance of both accounts, chequing and savings
    }//GEN-LAST:event_chequingSavingComboBoxItemStateChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        checkBalance(); //will check for the balance of both accounts, chequing and savings
    }//GEN-LAST:event_formWindowGainedFocus

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
//start off the times with nothing until a transaction has been made       
        LocalDateTime start = null;
        LocalDateTime end = null;
        int month = 0;
        int day = 0;
        int year = 0;
        String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"; //matching the date as month/day/year
        DefaultListModel<String> dlm = new DefaultListModel<>(); //creating object for the list of transactions based on start and end dates
        transactionList.setModel(dlm); //setting dlm model to a transaction list
        
        if(startDateTextField.getText().isEmpty()){
            start = null; //Start will be nothing if the start text field is empty
            if(endDateTextField.getText().matches(regex)){ //if there is an end date, then the month, day , and year should match the string regex
                month = Integer.parseInt(endDateTextField.getText().substring(0,2)); 
                day = Integer.parseInt(endDateTextField.getText().substring(3,5)); 
                year = Integer.parseInt(endDateTextField.getText().substring(6,10));
                LocalDate d1 = LocalDate.of(year, month, day); //there will be a date included
                LocalTime t1 = LocalTime.of(23, 59); //time will also be included as part of the transaction search
                LocalDateTime dt1 = LocalDateTime.of(d1, t1);
                end = dt1; //end date will include date and time will also be considered
            }
            else if(endDateTextField.getText().isEmpty()){
                end = null; //end will be nothing if the end text field is empty 
              
            }
            else{
                JOptionPane.showMessageDialog(this.rootPane ,"Ensure that Date format on End Date should be MM/DD/YYYY"); //anything else would result in an error, telling the user to write the date in the proper format
            }
        }
        else if(endDateTextField.getText().isEmpty()){ 
            end = null; //end will be nothing if the end text field is empty 
            if(startDateTextField.getText().matches(regex)){ //if there is a start date, then the month, day , and year should match the string regex 
                month = Integer.parseInt(startDateTextField.getText().substring(0,2));
                day = Integer.parseInt(startDateTextField.getText().substring(3,5)); 
                year = Integer.parseInt(startDateTextField.getText().substring(6,10));
                LocalDate d2 = LocalDate.of(year, month, day); //there will be a date included
                LocalTime t2 = LocalTime.of(00, 00); //time will also be included as part of the transaction search
                LocalDateTime dt2 = LocalDateTime.of(d2, t2);
                start = dt2; //start date will include date and time will also be considered  
                
                
            }
            else if(startDateTextField.getText().isEmpty()){
                start = null; //Start will be nothing if the start text field is empty
               
            }
            else{
                JOptionPane.showMessageDialog(this.rootPane ,"Ensure that Date format on Start Date should be MM/DD/YYYY"); //anything else would result in an error, telling the user to write the date in the proper format
            }   
        }
        else{
            
            /*if there is a start date and an end date, then both dates must match the regex in the proper format/order as month, day, and year
            time will also be considered when searching for the transactions based on the dates*/
            if(startDateTextField.getText().matches(regex) && endDateTextField.getText().matches(regex)){
                month = Integer.parseInt(startDateTextField.getText().substring(0,2));
                day = Integer.parseInt(startDateTextField.getText().substring(3,5)); 
                year = Integer.parseInt(startDateTextField.getText().substring(6,10));
                
                int month2 = Integer.parseInt(endDateTextField.getText().substring(0,2));
                int day2 = Integer.parseInt(endDateTextField.getText().substring(3,5)); 
                int year2 = Integer.parseInt(endDateTextField.getText().substring(6,10));
                
                LocalDate d1 = LocalDate.of(year, month, day);
                LocalTime t1 = LocalTime.of(00, 00);
                LocalDateTime dt1 = LocalDateTime.of(d1, t1);
                start = dt1;
                
                LocalDate d2 = LocalDate.of(year, month, day);
                LocalTime t2 = LocalTime.of(23, 59);
                LocalDateTime dt2 = LocalDateTime.of(d2, t2);
                end = dt2;
              
            }
            else{
                JOptionPane.showMessageDialog(this.rootPane ,"Ensure that Date format on Start Date or End Date should be MM/DD/YYYY"); //anything else would result in an error, telling the user to write the date in the proper format
            }
          
        }
        
        ArrayList<Transaction> transactions = bd.getTransaction(this.getAccount(), start, end); //getting the transactions in a list depending on the start and end dates for the chequing and savings accounts
        
        for(int i = 0; i < transactions.size(); i++){
            dlm.addElement(transactions.get(i).toString()); //transactions will increase by 1 depending on the number of transactions made within a certain time period
            
        }
        transactionList.setModel(dlm); //setting dlm model to a transaction list
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void endDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateTextFieldActionPerformed

    
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAccountGUI().setVisible(true); //the program will show the main BankAccount GUI when it runs
            }
        });
    }
    public String getAccount(){
        //this method is to return the current selected account
        Object selectedAccount = chequingSavingComboBox.getSelectedItem();
        return selectedAccount.toString();
    }
    public void checkBalance(){
        //this method will check the balance for the selected/current account
        currentBalanceTextField.setBackground(Color.WHITE); //if the balance for the current account is positive including $0.0, the background color will be white
        String currentAccount = chequingSavingComboBox.getSelectedItem().toString(); //selecting the current account, chequing or savings
        double accountBalance = bd.getBalance(currentAccount); //will get the balance for the selected/current account
        currentBalanceTextField.setText("$" + accountBalance); // the current balance text field will include the dollar sign with the current account balance for the selected account
        if(bd.isNegative(currentAccount)){ 
        currentBalanceTextField.setBackground(Color.RED); //if the balance for the current account is negative(below $0.0), the background color will be red
        currentBalanceTextField.setEditable(false);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JComboBox<String> chequingSavingComboBox;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JTextField currentBalanceTextField;
    private javax.swing.JLabel dateRangeLabel;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    private javax.swing.JList<String> transactionList;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}
