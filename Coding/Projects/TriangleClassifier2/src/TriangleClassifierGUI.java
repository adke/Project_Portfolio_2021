//Adish Shah
//Computer Science 20
//Henry Wise Wood High School
//2020-2021 Semester 1

//adding GUI packages to the class
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//variables for the layout of the GUI from the TriangleClassifierGUI.form
public class TriangleClassifierGUI {
    private JPanel mainPanel;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton classifyButton;
    private JLabel angleA;
    private JLabel angleB;
    private JLabel angleC;
    private JTextArea classifierResult;
    //input variables when entering all 3 angles(A, B, and C) for the triangle
    public int inputAngleA;
    public int inputAngleB;
    public int inputAngleC;
    //result variable for giving the type of triangle classified from the 3 angles
    public String result;

    //constructor for the function of the classify button
    public TriangleClassifierGUI() {
        classifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this function is converting the string for the input angles A, B, and C to an integer within the text field for all 3 inputs
                inputAngleA = Integer.parseInt(textFieldA.getText());
                inputAngleB = Integer.parseInt(textFieldB.getText());
                inputAngleC = Integer.parseInt(textFieldC.getText());
                /*this line of code is referring back to the TriangleClassifier.java class where it is going to classify the triangle from the getClassification method
                * from the given input for all 3 angles*/
                result = TriangleClassifier.getClassification(inputAngleA, inputAngleB, inputAngleC);
                classifierResult.setText(result); //the result will be shown as a text in the classifierResult text area of the GUI

            }
        });
    }

    //program will run the codes under this main function
    public static void main(String[] args) {
        JFrame frame = new JFrame("TC"); //making the GUI frame, naming it "TC" as mentioned in the assignment
        //code will refer back to the mainPanel to set the content of the frame and it will also refer back to the constructor to set the functions of the classify button
        frame.setContentPane(new TriangleClassifierGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //causes the frame to close when receiving the close window from the operating system
        frame.setSize(200,230); //setting the size of the frame based on width and height
        frame.setResizable(false); //setting a fixed frame size that is not adjustable
        frame.setVisible(true); //showing the actual frame by making it visible to the user
    }
}

