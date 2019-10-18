package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class elementen extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    Button knopOK;
    int[] getalen = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10, 10};


    @Override
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("");
        knopOK = new Button("OK");
        knopOK.addActionListener(new OkKnopActionListener());
        add(tekstvak);
        add(knopOK);
        add(label);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);


    }

    public class OkKnopActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            tekst = "het getal is niet gevonden";
            s = tekstvak.getText();
            int cijfer = Integer.parseInt(s);
            for (int i = 0; i < getalen.length; i++) {
                int getal = getalen[i];
                if (cijfer == getal) {
                    tekst = "het getal is: " + getal + ",  de index is:" + i;

                }

            }
        }
    }
}


