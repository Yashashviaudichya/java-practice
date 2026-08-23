 import javax.swing.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JRadioButton male, female;
    ButtonGroup bg;
    JCheckBox terms;
    JButton submit, reset;

    StudentRegistration() {

        setTitle("Student Registration");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Roll No");
        l4 = new JLabel("Branch");
        l5 = new JLabel("Gender");

        l1.setBounds(30,40,80,25);
        l2.setBounds(30,80,80,25);
        l3.setBounds(30,120,80,25);
        l4.setBounds(30,160,80,25);
        l5.setBounds(30,200,80,25);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        t1.setBounds(120,40,180,25);
        t2.setBounds(120,80,180,25);
        t3.setBounds(120,120,180,25);
        t4.setBounds(120,160,180,25);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(120,200,70,25);
        female.setBounds(190,200,80,25);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        terms = new JCheckBox("Accept Terms");
        terms.setBounds(90,240,180,25);

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        submit.setBounds(70,290,100,30);
        reset.setBounds(190,290,100,30);

        submit.addActionListener(this);
        reset.addActionListener(this);

        add(l1); add(l2); add(l3); add(l4); add(l5);
        add(t1); add(t2); add(t3); add(t4);
        add(male); add(female);
        add(terms);
        add(submit); add(reset);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reset) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            bg.clearSelection();
            terms.setSelected(false);
        }

        if (e.getSource() == submit) {

            String gender = male.isSelected() ? "Male" : "Female";

            JOptionPane.showMessageDialog(this,
                    "Registration Successful!\n\n" +
                    "Name : " + t1.getText() +
                    "\nAge : " + t2.getText() +
                    "\nRoll No : " + t3.getText() +
                    "\nBranch : " + t4.getText() +
                    "\nGender : " + gender);
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
    

