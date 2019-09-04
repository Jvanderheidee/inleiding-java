package H02;

import java.applet.Applet;
import java.awt.*;

public class Demo extends Applet {


    @Override
    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.blue);
        g.drawString("Justin", 40, 40);
        g.setColor(Color.red);
        g.drawString("van der Heide",40,50);

    }
}
