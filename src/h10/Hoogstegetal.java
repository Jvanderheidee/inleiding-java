package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoogstegetal extends Applet {

    TextField Tekstvak;
    String s;
    Label label;
    int HoogsteGetal;
    int Laagstegetal;

    @Override
    public void init() {
        label = new Label("typ hier uw getal");
        add(label);

        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new TekstvakListener());
        add(Tekstvak);
        ;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + HoogsteGetal, 50, 45);
        g.drawString("" + Laagstegetal, 60, 45);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            int Getal = Integer.parseInt(s);
            if (Getal > HoogsteGetal) {

                HoogsteGetal = Getal;

                s = Tekstvak.getText();
                if (Getal > Laagstegetal) {

                    repaint();
                }

            }
        }
    }
}
