import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    GameFrame(){
        ImageIcon icon = new ImageIcon("assets/Ping_Pong.jpg");

        panel = new GamePanel();
        this.add(panel);
        this.setIconImage(icon.getImage());
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}