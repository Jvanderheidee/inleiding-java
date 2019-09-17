package H08;


import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;
import java.awt.*;
import java.awt.event.ActionEvent.*;


public class Btw extends Applet {
    Button Oke;
    Label label;
    TextField tekstvak;
    String s;
    double a = 1.21;
    double getal;


    @Override
    public void init() {
        label = new Label("voer hier het bedrag in");
        Oke = new Button("Oke");
        tekstvak = new TextField("",20);
        add(label);
        add(Oke);
        add(tekstvak);
        double getal;
        a = 1.21;
        Oke.addActionListener(new OkeActionListener());

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ (getal * a), 50,75);
    }

    class OkeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }

}







