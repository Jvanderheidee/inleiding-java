package H05;

import java.applet.*;
import  java.awt.*;

public class kutopdracht extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(20,50,150 ,50);
        g.drawRect(20,60,130,60);
        g.drawRoundRect(180,60,130,60,130,90);
        g.setColor(Color.green);
        g.fillRect(180,60,130,60);
        g.setColor(Color.black);
        g.drawRoundRect(180,60,130,60,130,99);
        g.setColor(Color.yellow);
        g.fillRoundRect(180,150,130,60,130,99);
        g.setColor(Color.black);
        g.drawRoundRect(20,150,130,60,10,10);
        g.setColor(Color.red);
        g.fillArc(330,60,130,60,0,45);
        g.setColor(Color.black);
        g.drawRoundRect(330,60,130,60,130,99);
        g.drawArc(370,155, 50,50,45,360);





    }
}
