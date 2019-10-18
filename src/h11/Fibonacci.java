package h11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet {
    int a = 0;
    int b = 1;
    int c = a + b;
    int x;


    @Override
    public void init() {
        setSize(1024,768);
        x = 20;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + c,x, 20);
        for (int i = 0; i < 12; i++) {
            a = b;
            b = c;
            c = a + b;
            x += 50 ;
            g.drawString("" + c,x, 20);
        }


    }
}