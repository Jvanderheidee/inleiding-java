package H02;

import java.applet.Applet;
import java.awt.*;

public class Demo extends Applet {


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Hallo Justin!", 40, 40);
    }
}
