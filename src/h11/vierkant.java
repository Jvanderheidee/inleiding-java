package h11;

import java.applet.Applet;
import java.awt.*;


public class vierkant extends Applet {


    @Override
    public void init() {
        setSize(1920,1080);


    }

    @Override
    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int width = 50;
        int height = 50;

        for (int i = 1; i <6; i++) {
           g.drawRect(x,y,width,height);
           x += width;
           y += height;
            
        }

    }
}
