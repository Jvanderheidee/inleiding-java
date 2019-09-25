package H06;

import java.applet.*;
import java.awt.*;

public class Secondensom extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;

    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    @Override
    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 3600;
        e = 86400;
        uitkomst1 = (a * b);
        uitkomst2 = (a * b * c);
        uitkomst3 = (a * b * c * d);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("de uitkomst is " + uitkomst1,20,50);
        g.drawString("de uitkomst is " + uitkomst2,20,100);
        g.drawString("de uitkosmt is " + uitkomst3, 20,150);
        g.drawString("seconden in een uur", 20,40);
        g.drawString("seconden in een dag",20,90);
        g.drawString("seconden in een jaar",20,140);


    }
}
