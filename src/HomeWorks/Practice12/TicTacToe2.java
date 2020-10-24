package HomeWorks.Practice12;

import HomeWorks.Practice11.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe2 extends JFrame
{
    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JTextArea textArea1;

    private boolean check = false;
    private Random rnd = new Random();
    private boolean win = false;
    private int[][] a = new int[3][3];
    private JButton[][] butt = new JButton[][]{{button2, button5, button8},{button3,button6, button9},{button4, button7, button10}};
    private int player = 1,it = 0;
    private byte playerX, playerY, playerXY, playerYX;

    public TicTacToe2()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,450);
        setContentPane(rootPanel);
        setVisible(true);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button2, 0, 0);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button5, 0, 1);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button8, 0, 2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button3, 1, 0);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button6, 1, 1);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button9, 1, 2);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button4, 2, 0);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button7, 2, 1);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TicTac(button10, 2, 2);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button4.setText(" ");
                button2.setText(" ");
                button3.setText(" ");
                button6.setText(" ");
                button7.setText(" ");
                button8.setText(" ");
                button9.setText(" ");
                button10.setText(" ");
                button5.setText(" ");

                a = new int[3][3];

                playerX = 0;
                playerY = 0;
                playerXY = 0;
                playerYX = 0;

                it = 0;
                win = false;

                textArea1.setText("");
            }
        });
    }

    public void TicTac(JButton btn, int x, int y)
    {
        if (btn.getText() == " " && !win)
        {
            player = 1;
            it++;
            btn.setText("x");
            a[x][y] = player;
            textArea1.append(Integer.toString(it) + " ход: Ходит первый игрок\n");
            SearchWinner();

            if(!win)
            {
                it++;
                player = 10;
                textArea1.append(Integer.toString(it) + " ход: Ходит бот\n");
                SearchMove();
                SearchWinner();
            }
        }
    }
    public void SearchStroka(int b, int x, int y)
    {
        if(a[x][0] == 0)
            b = 0;
        else if(a[x][1] == 0)
            b = 1;
        else if(a[x][2] == 0)
            b = 2;

        if(a[x][b] == 0)
        {
            butt[x][b].setText("o");
            a[x][b] = 10;
            x = 3;
            y = 3;
            check = true;
        }
    }
    public void SearchStolbec(int b,int x, int y)
    {
        if(a[0][y] == 0)
            b = 0;
        else if(a[1][y] == 0)
            b = 1;
        else if(a[2][y] == 0)
            b = 2;

        if(a[b][y] == 0)
        {
            butt[b][y].setText("o");
            a[b][y] = 10;
            x = 3; y = 3;
            check = true;
        }
    }

    public void SearchMove()
    {
        check = false;
        int b;
        if(it > 2)
        {
            for(int x = 0; x < 3; x++)
            {
                b = -1;
                for(int y = 0; y < 3; y++)
                {
                    if (y == 0 && a[x][y] + a[x][y + 1] + a[x][y + 2] == 20) {
                        SearchStroka(b, x, y);
                        x = 3; y = 3;
                    } else if (x == 0 && a[x][y] + a[x + 1][y] + a[x + 2][y] == 20) {
                        SearchStolbec(b, x, y);
                        x = 3; y = 3;
                    }
                    else if (x == 2 && y == 0 && a[x-1][y+1] + a[x][y] == 2 && it == 4)
                    {
                        butt[0][0].setText("o");
                        a[0][0] = 10;
                        x = 3;
                        y = 3;
                        check = true;
                    }
                    else if (x == 2 && y == 0 && a[x-1][y+1] + a[x][y] + a[x - 2][y + 2] == 12 && it == 4)
                    {
                        butt[2][1].setText("o");
                        a[2][1] = 10;
                        x = 3;
                        y = 3;
                        check = true;
                    }
                }
            }

            if(check == false)
            {
                for(int x = 0; x < 3; x++)
                {
                    b = -1;
                    for(int y = 0; y < 3; y++)
                    {
                        if(y == 0 && a[x][y] + a[x][y+1] + a[x][y+2] == 2)
                        {
                            SearchStroka(b,x,y);
                            x = 3;
                            y = 3;
                        }
                        else if(x == 0 && a[x][y] + a[x+1][y] + a[x+2][y] == 2)
                        {
                            SearchStolbec(b,x,y);
                            x = 3;
                            y = 3;
                        }
                        else if(x == 0 && y == 0 && a[x][y] + a[x+1][y+1] + a[x+2][y+2] == 2)
                        {
                            if(a[0][0] == 0)
                                b = 0;
                            else if(a[1][1] == 0)
                                b = 1;
                            else if(a[2][2] == 0)
                                b = 2;

                            butt[b][b].setText("o");
                            a[b][b] = 10;
                            x = 3;
                            y = 3;

                            check = true;
                        }
                    }
                }
            }
        }
        else
        {
            if(a[1][1] == 0)
            {
                butt[1][1].setText("o");
                a[1][1] = 10;
            }
            else
            {
                butt[0][2].setText("o");
                a[0][2] = 10;
            }
            check = true;
        }

        if(check == false)
        {
            int i = rnd.nextInt(2), k = rnd.nextInt(2);
            while(a[i][k] != 0)
            {
                i = rnd.nextInt(2);
                k = rnd.nextInt(2);
            }
            butt[i][k].setText("o");
            a[i][k] = 10;
        }
    }

    public void SearchWinner()
    {
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                if ((playerX != 2) && (playerY != 2) && (playerXY != 2))
                {
                    if (y == 0 && a[x][y] == a[x][y+1] && a[x][y+2] == a[x][y] && a[x][y] == player) playerX = 2;
                    else if (x == 0 && a[x][y] == a[x+1][y] && a[x+2][y] == a[x][y] && a[x][y] == player) playerY = 2;
                    else if (x == 0 && y == 0 && a[x][y] == a[x+1][y+1] && a[x][y] == a[x+2][y+2] && a[x][y] == player) playerXY = 2;
                    else if (x == 2 && y == 0 && a[x][y] == a[x-1][y+1] && a[x][y] == a[x-2][y+2] && a[x][y] == player) playerYX = 2;
                }

                if ((playerX == 2) || (playerY == 2) || (playerXY == 2) || (playerYX == 2))
                {
                    if (player == 1) textArea1.append("Первый игрок победил\n"); else textArea1.append("Второй игрок победил\n");
                    win = true;
                    x = 3;
                    y = 3;
                }
                else if (it == 9)
                {
                    win = true;
                    textArea1.append("Ничья\n");
                    x = 3;
                    y = 3;
                }
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe2();
            }
        });
    }
}
