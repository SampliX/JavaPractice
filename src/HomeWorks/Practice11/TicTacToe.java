package HomeWorks.Practice11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame{
    private JFrame MyForm;
    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JTextArea textArea1;
    private JButton новаяИграButton;

    private Random rnd = new Random();
    private boolean win = false;
    private int[][] a = new int[3][3];
    private int x, y, it = 0;
    private int player = 1;
    private byte playerX, playerY, playerXY, playerYX;

    public TicTacToe()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,600);
        setContentPane(rootPanel);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 0; y = 0;
                TicTac(button1, x, y);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 1; y = 0;
                TicTac(button2, x, y);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 2; y = 0;
                TicTac(button3, x, y);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 0; y = 1;
                TicTac(button6, x, y);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 1; y = 1;
                TicTac(button8, x, y);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 2; y = 1;
                TicTac(button9, x, y);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 0; y = 2;
                TicTac(button11, x, y);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 1; y = 2;
                TicTac(button7, x, y);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 2; y = 2;
                TicTac(button10, x, y);
            }
        });
        новаяИграButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button1.setText(" ");
                button2.setText(" ");
                button3.setText(" ");
                button6.setText(" ");
                button7.setText(" ");
                button8.setText(" ");
                button9.setText(" ");
                button10.setText(" ");
                button11.setText(" ");

                player = 2 - rnd.nextInt(1);
                a = new int[3][3];

                playerX = 0;
                playerY = 0;
                playerXY = 0;
                playerYX = 0;

                it = 0;
                win = false;
            }
        });
    }

    public void TicTac(JButton btn, int x, int y)
    {
        if (btn.getText() == " " && win == false)
        {
            it++;
            if (player == 1) //Обработка хода игрока.
            {
                player = 2;
                btn.setText("");
                btn.setText("x");
                a[x][y] = player;
                textArea1.append(Integer.toString(it) + " ход: Ходит первый игрок\n");
                SearchWinner(x, y);
            }
            else
            {
                player = 1;
                btn.setText(null);
                btn.setText("o");
                a[x][y] = player;
                textArea1.append(Integer.toString(it) + " ход: Ходит второй игрок\n");
                SearchWinner(x, y);
            }
        }
    }
    public void SearchWinner(int x, int y)
    {
        y = 0;
        while (y < 3)
        {
            x = 0;
            while (x < 3)
            {
                if ((playerX != 2) && (playerY != 2) && (playerXY != 2))
                {
                    if( x == 0 && a[x][y] == a[x+1][y] && a[x+2][y] == a[x][y] && a[x][y] == player) playerX = 2;
                    else if (y == 0 && a[x][y] == a[x][y+1] && a[x][y+2] == a[x][y] && a[x][y] == player) playerY = 2;
                    else if (x == 0 && y == 0 && a[x][y] == a[x+1][y+1] && a[x][y] == a[x+2][y+2] && a[x][y] == player) playerXY = 2;
                    else if (x == 2 && y == 0 && a[x][y] == a[x-1][y+1] && a[x][y] == a[x-2][y+2] && a[x][y] == player) playerYX = 2;
                }

                if ((playerX == 2) || (playerY == 2) || (playerXY == 2) || (playerYX == 2))
                {
                    if (player == 2) textArea1.append("Первый игрок победил\n"); else textArea1.append("Второй игрок победил\n");

                    win = true;
                    x = 3;
                    y = 3;
                }
                else if (it == 9)
                {
                    textArea1.append("Ничья\n");
                    x = 3;
                    y = 3;
                }
                x++;
            }
            y++;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe();
            }
        });
    }
}