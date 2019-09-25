package H08;

import java.awt.event.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Teller extends Applet {
    Button jongensKnop;
    Button meisjesKnop;
    Button mannenKnop;
    Button vrouwenKnop;
    int tellerjongens = 0;
    int tellermeisjes = 0;
    int tellermannen = 0;
    int tellervrouwen = 0;
    int tellertotaal = 0;

    @Override
    public void init() {
        jongensKnop = new Button("jongensKnop");
        meisjesKnop = new Button("meisjesKnop");
        mannenKnop = new Button("mannenKnop");
        vrouwenKnop = new Button("vrouwenKnop");
        add(jongensKnop);
        add(meisjesKnop);
        add(mannenKnop);
        add(vrouwenKnop);
        jongensKnop.addActionListener(new JongensActionListener());
        meisjesKnop.addActionListener(new MeisjesActionListener());
        mannenKnop.addActionListener(new MannenActionListener());
        vrouwenKnop.addActionListener(new VrouwenActionListener());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("aantal jongens:" + tellerjongens, 50, 50);
        g.drawString("aantal meisjes:" + tellermeisjes, 50, 100);
        g.drawString("aantal mannen" + tellermannen, 50, 150);
        g.drawString("aantal vrouwen" + tellervrouwen, 50, 200);
        g.drawString("aantal totaal:" + tellertotaal + (tellerjongens + tellermeisjes + tellermannen + tellervrouwen), 50, 250);
    }

    class JongensActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellerjongens++;
            repaint();
        }

    }

    class MeisjesActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellermeisjes++;
            repaint();
        }

    }

    class MannenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellermannen++;
            repaint();
        }

    }

    class VrouwenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellervrouwen++;
            repaint();
        }
    }
}




