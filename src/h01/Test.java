package h01;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends Applet {
    Button knoprood,knopgrijs;

    public void init() {
        // rode muur
        knoprood = new Button("klik hier voor de rode muur");
        add(knoprood);
        knoprood.addActionListener(new knoproodActionListener());

    }
    class knoproodActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public void paint(Graphics g) {

    }



}
