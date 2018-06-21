import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class money extends JFrame{
    private JLabel []money = new JLabel[10];
    private ImageIcon coin = new ImageIcon("money.png");
    private Timer t1 , t2 , go ;
    private Container cp ;
    private JPanel jpn = new JPanel();
    private Random rdn = new Random();
    private int num , count = 0;
    private boolean [] show = new boolean[10];

    public money () {
        this.init();
    }

    private void init (){
        this.setBounds(30,30,1280,960);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpn);
        jpn.setLayout(null);

        Image img = coin.getImage();
        Image img2 = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        coin.setImage(img2);

        for (int i = 0 ; i < 10 ; i ++){
            show[i] = false;

        }

        go = new Timer(2, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (show[0]){
                    money[0].setLocation(money[0].getX() - 1 , money[0].getY());
                    if (money[0].getX() <= -50){
                        jpn.remove(money[0]);
                        repaint();
                        show[0] = false;
                    }
                }
                if (show[1]){
                    money[1].setLocation(money[1].getX() - 1 , money[1].getY());
                    if (money[1].getX() <= -50){
                        jpn.remove(money[1]);
                        repaint();
                        show[1] = false;
                    }
                }
                if (show[2]){
                    money[2].setLocation(money[2].getX() - 1 , money[2].getY());
                    if (money[2].getX() <= -50){
                        jpn.remove(money[2]);
                        repaint();
                        show[2] = false;
                    }
                }
                if (show[3]){
                    money[3].setLocation(money[3].getX() - 1 , money[3].getY());
                    if (money[3].getX() <= -50){
                        jpn.remove(money[3]);
                        repaint();
                        show[3] = false;
                    }
                }
                if (show[4]){
                    money[4].setLocation(money[4].getX() - 1 , money[4].getY());
                    if (money[4].getX() <= -50){
                        jpn.remove(money[4]);
                        repaint();
                        show[4] = false;
                    }
                }
                if (show[5]){
                    money[5].setLocation(money[5].getX() - 1 , money[5].getY());
                    if (money[5].getX() <= -50){
                        jpn.remove(money[5]);
                        repaint();
                        show[5] = false;
                    }
                }
                if (show[6]){
                    money[6].setLocation(money[6].getX() - 1 , money[6].getY());
                    if (money[6].getX() <= -50){
                        jpn.remove(money[6]);
                        repaint();
                        show[6] = false;
                    }
                }
                if (show[7]){
                    money[7].setLocation(money[7].getX() - 1 , money[7].getY());
                    if (money[7].getX() <= -50){
                        jpn.remove(money[7]);
                        repaint();
                        show[7] = false;
                    }
                }
                if (show[8]){
                    money[8].setLocation(money[8].getX() - 1 , money[8].getY());
                    if (money[8].getX() <= -50){
                        jpn.remove(money[8]);
                        repaint();
                        show[8] = false;
                    }
                }
                if (show[9]){
                    money[9].setLocation(money[9].getX() - 1 , money[9].getY());
                    if (money[9].getX() <= -50){
                        jpn.remove(money[9]);
                        repaint();
                        show[9] = false;
                    }
                }
            }
        });

        t1 = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = rdn.nextInt(4) + 1;
                if (num % 2 == 0){
                    if (!show[0]) {
                        money[0] = new JLabel();
                        jpn.add(money[0]);
                        money[0].setIcon(coin);
                        money[0].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[0] = true;
                    }else if (!show[1]) {
                        money[1] = new JLabel();
                        jpn.add(money[1]);
                        money[1].setIcon(coin);
                        money[1].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[1] = true;
                    }else if (!show[2]) {
                        money[2] = new JLabel();
                        jpn.add(money[2]);
                        money[2].setIcon(coin);
                        money[2].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[2] = true;
                    }else if (!show[3]) {
                        money[3] = new JLabel();
                        jpn.add(money[3]);
                        money[3].setIcon(coin);
                        money[3].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[3] = true;
                    }else if (!show[4]) {
                        money[4] = new JLabel();
                        jpn.add(money[4]);
                        money[4].setIcon(coin);
                        money[4].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[4] = true;
                    }else if (!show[5]) {
                        money[5] = new JLabel();
                        jpn.add(money[5]);
                        money[5].setIcon(coin);
                        money[5].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[5] = true;
                    }else if (!show[6]) {
                        money[6] = new JLabel();
                        jpn.add(money[6]);
                        money[6].setIcon(coin);
                        money[6].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[6] = true;
                    }else if (!show[7]) {
                        money[7] = new JLabel();
                        jpn.add(money[7]);
                        money[7].setIcon(coin);
                        money[7].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[7] = true;
                    }else if (!show[8]) {
                        money[8] = new JLabel();
                        jpn.add(money[8]);
                        money[8].setIcon(coin);
                        money[8].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[8] = true;
                    }else if (!show[9]) {
                        money[9] = new JLabel();
                        jpn.add(money[9]);
                        money[9].setIcon(coin);
                        money[9].setBounds(1280, rdn.nextInt(780) + 20, 50, 50);
                        show[9] = true;
                    }
                }
            }
        });

        t1.start();

        go.start();
    }
}
