package h11;

import java.applet.Applet;
import java.awt.*;


public class verticlelines extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 100;


        while(teller < 11) {
            x += 20;
            g.drawLine(x , 100, x, 200);
            teller++;
        }
    }
}

