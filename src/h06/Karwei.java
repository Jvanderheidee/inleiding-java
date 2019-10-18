package h06;

import java.applet.*;
import java.awt.*;

public class Karwei extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;


    public void init() {
    a = 113;
    b = 0;
    c = 4;
    uitkomst = (a + b) / c;
        }

    @Override
    public void paint(Graphics g) {
        g.drawString("de uitkomst is:" + uitkomst,20,50);
        // som //
        g.drawString("113 : 4 = 28",20,30);

        // namen //
        g.drawString("jan krijgt 28 euro",20,70);
        g.drawString("ali krijgt 28 euro",20,85);
        g.drawString("Jeannette krijgt 28 euro",20,100);
        g.drawString("justin krijgt 28 euro",20,115);


    }
}
