package H11;

import java.applet.Applet;
import java.awt.*;

public class Tafels extends Applet {
    int a = 3;
    int b = 1;
    int c = a * b;
    int x;


    @Override
    public void init() {
        setSize(1920, 1080);
        x = 20;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + c, x, 20);
        for (int i = 1; i < 11; i++) {

            g.drawString("" + c, x, 20);
        }
    }
}