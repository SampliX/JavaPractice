package HomeWorks.Practice10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame
{
    private double First = Double.MAX_VALUE;
    private double Second = Double.MAX_VALUE;
    private String Line;
    private char Sign = 'e';

    private JPanel MyForm;
    private JButton a1Button;
    private JButton button4;
    private JButton button5;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton button1;
    private JButton button2;
    private JButton button11;
    private JButton CEButton;
    private JButton cButton;
    private JTextArea textArea1;
    private JButton a0Button;
    private JPanel rootPanel;
    private JButton button3;

    private double Summ()
    {
        return First + Second;
    }

    private double Minus()
    {
        return First - Second;
    }

    private double Multiple()
    {
        return First * Second;
    }

    private double Divide()
    {
        return First / Second;
    }

    public MyForm() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);
        setContentPane(rootPanel);
        setVisible(true);

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("2");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                First = Double.MAX_VALUE;
                Second = Double.MAX_VALUE;
                Sign = 'e';

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("1");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("0");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("9");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textArea1.toString() != "" && Second == Double.MAX_VALUE && Sign != 'e')
                {
                    Second = Double.parseDouble(textArea1.getText());
                    textArea1.setText("");
                    if(Sign == '+')
                        textArea1.setText(Double.toString(Summ()));
                    else if(Sign == '-')
                        textArea1.setText(Double.toString(Minus()));
                    else if(Sign == '*')
                        textArea1.setText(Double.toString(Multiple()));
                    else if(Sign == '/')
                        textArea1.setText(Double.toString(Divide()));
                    First = Double.MAX_VALUE;
                    Second = Double.MAX_VALUE;
                    Sign = 'e';
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFirst(button5);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFirst(button1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFirst(button2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append(".");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFirst(button11);
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = "";
                Line = textArea1.getText();
                for(int i = 0; i < Line.length() - 1; i++)
                    a += "" + Line.charAt(i);
                textArea1.setText(a);
            }
        });
    }

    private void SaveFirst(JButton g)
    {
        if(textArea1.toString() != "" && First == Double.MAX_VALUE && Sign == 'e')
        {
            First = Double.parseDouble(textArea1.getText());
            textArea1.setText("");
            Line = g.getText();
            Sign = Line.charAt(0);
            Line = "";
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyForm();
            }
        });
    }
}
