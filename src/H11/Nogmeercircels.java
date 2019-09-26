package H11;

import java.applet.Applet;
import java.awt.*;

public class Nogmeercircels extends Applet {
    @Override
    public void init() {
        setSize(1920,1080);


    }

    @Override
    public void paint(Graphics g) {

        int y = 75;
        int x = 300;
        int width = 50;
        int height = 50;

        for (int i = 1; i <101; i++) {
            g.drawOval(x,y,width,height);
            width += 10;
            height += 10;
            x -= 1;
            y -= 1;

        }

    }
}

