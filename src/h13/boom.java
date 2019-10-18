package h13;

import java.applet.Applet;
import java.awt.*;

public class boom extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {


        tekenboomstam(g,75,75,20,60);
        tekenboomblad(g,50,65,75,40);


    }
    void tekenboomstam( Graphics g, int x , int y, int width,int height) {
        g.fillRect(x,y,width,height);


   }
    void tekenboomblad( Graphics g, int x2 , int y2, int width2,int height2) {
        g.setColor(Color.green);
        g.fillOval(x2,y2,width2,height2);

}
}