package h01;


import java.applet.Applet;
import java.awt.*;

public class mondriaan extends Applet {


    public void paint(Graphics g) {

        g.drawRect(100,100,300,300);
        g.drawRect(100,100,100,100);
        g.setColor(Color.red);
        g.fillRect(100,200,60,100);
        g.fillRect(250,300,150,100);
        g.setColor(Color.yellow);
        g.fillRect(150,200,150,100);
        g.setColor(Color.blue);
        g.fillRect(200,350,50,50);
        g.fillRect(250,100,100,200);
        g.setColor(Color.black);
        g.fillRect(200,100,15,300);
        g.fillRect(350,100,15,300);
        g.fillRect(250,100,15,300);
        g.fillRect(100,200,250,15);
        g.drawRect(250,300,150,100);
        g.fillRect(100,300,300,15);
        g.fillRect(100,300,100,100);


    }

}
