package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knoppen extends Applet {
    Button OKknop;
    Button Resetknop;
    Label label;
    TextField tekstvak;
    String s;

    @Override
    public void init() {
        OKknop = new Button("OK");
        Resetknop = new Button("Reset");
        label = new Label("typ hier iets in");
        tekstvak = new TextField("",30);
        add(tekstvak);
        add(OKknop);
        add(Resetknop);
        add(label);
        OKknop.addActionListener(new OKknopActionListener());
        Resetknop.addActionListener(new ResetknopActionListener());
    }

    @Override
    public void paint(Graphics g) {

    }
    class OKknopActionListener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            label.setText(s);
            repaint();

        }
    }
    class ResetknopActionListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("");
            repaint();
        }
    }
}
