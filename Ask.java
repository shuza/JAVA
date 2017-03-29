import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ask extends JApplet implements ActionListener
{
private JTextField tboxResponse;
private final String submit = "Answer";
public JLabel lblQuestion;
private JTextField Result;

String[] strA = new String[3];
String[] strQ = new String[3];
int iQ;

public void init()
{

//get two random numbers between 0 and 9
int digit1 = ( int ) ( Math.random() * 10 );
int digit2 = ( int ) ( Math.random() * 10 );
int answer;

answer = digit1 * digit2;

strQ[0] = "Who was the first U.S. President?";
strQ[1] = "Who developed the theory of relativity?";
strQ[2] = "what is " + digit1 + " * " +  digit2 + " ?";
strA[0] = "Washington";
strA[1] = "Einstein";
strA[2] = String.valueOf(answer);

// Create user interface
Container c = getContentPane();

c.setLayout(new BorderLayout(12,12));
JLabel gameTitle = new JLabel("My text game");
c.add(gameTitle, BorderLayout.NORTH);
JPanel workPanel = new JPanel();

lblQuestion = new JLabel(strQ[0]);

workPanel.add(lblQuestion);
tboxResponse = new JTextField(16);
workPanel.add(tboxResponse);

Result = new JTextField(16);
Result.setEditable( false );
c.add(Result);
c.add(workPanel, BorderLayout.CENTER);

// create buttons
JPanel pnlButtons = new JPanel();
JButton btnSubmit = new JButton(submit);
btnSubmit.addActionListener(this);
pnlButtons.add(btnSubmit);
c.add(pnlButtons, BorderLayout.SOUTH);

// add buttons panel to user interface
c.add(pnlButtons, BorderLayout.SOUTH);

setSize (400,300);

}

public void actionPerformed(ActionEvent e)

{

String command = e.getActionCommand();

if ( strA[iQ].equals ( tboxResponse.getText() ) )

{
tboxResponse.setText( "That is correct!" );
}

else

{
tboxResponse.setText( "That is incorrect!" );
}

iQ = iQ + 1;
lblQuestion.setText(strQ[iQ]);

}

}