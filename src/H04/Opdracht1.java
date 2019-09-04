package H04;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(200,120,350,400);
        g.drawLine(50,400,350,400);
        g.drawLine(200,120,50,400);
    }
}

