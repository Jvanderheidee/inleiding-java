package h01;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class horeca extends Applet {
    double frisdrank = 2.25;
    double bier = 2.50;
    double wijn = 2.75;
    double koffie = 2.00;
    double binnelands = 3.00;
    double buitenlands = 3.75;
    Button frisknop;
    Button bierknop;
    Button wijnknop;
    Button koffieknop;
    Button binnenlandsknop;
    Button buitenlandsknop;
    Button resetknop;
    String totaal;
    String dagomzet;
    double bestellintotaal =  0;
    double dagomzettotaal = 0;



    public void init() {
        setSize(1980,1080);
        totaal = "bestellintotaal =";
        dagomzet = "dagomzettotaal =";

        //frisdrank
        frisknop = new Button("fris");
        add(frisknop);
        frisknop.addActionListener( new FrisListener() );

        //bier
        bierknop = new Button("bier");
        add(bierknop);
        bierknop.addActionListener( new BierListener() );

        //wijn
        wijnknop = new Button("wijn");
        add(wijnknop);
        wijnknop.addActionListener( new WijnListener() );

        //koffie
        koffieknop = new Button("koffie");
        add(koffieknop);
        koffieknop.addActionListener( new KoffieListener() );

        //binnenlandse
        binnenlandsknop = new Button("binnenlands gedestileerd");
        add(binnenlandsknop);
        binnenlandsknop.addActionListener( new BinnenlandseListener() );

        //buitenlandse
        buitenlandsknop = new Button("buitenlands gedestileerd");
        add(buitenlandsknop);
        buitenlandsknop.addActionListener( new BuitenlandseListener() );

        //reset
        resetknop = new Button("nieuwe bestelling");
        add(resetknop);
        resetknop.addActionListener( new ResetListener() );



    }



    public void paint(Graphics g) {
        g.drawString(totaal +bestellintotaal,200,100);
        g.drawString(dagomzet + dagomzettotaal,200,125);
    }

    class FrisListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double prijsfris = frisdrank + bestellintotaal;
            bestellintotaal = prijsfris;
            double dagtotaalprijsfris = frisdrank + dagomzettotaal;
            dagomzettotaal = dagtotaalprijsfris;
            repaint();

        }
    }


    class BierListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijsbier = bier + bestellintotaal;
            bestellintotaal = prijsbier;
            double dagtotaalprijsbier = bier + dagomzettotaal;
            dagomzettotaal = dagtotaalprijsbier;
            repaint();

        }
    }


    class WijnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijswijn = wijn + bestellintotaal;
            bestellintotaal = prijswijn;
            double dagtotaalprijswijn = wijn + dagomzettotaal;
            dagomzettotaal = dagtotaalprijswijn;
            repaint();

        }
    }

    class KoffieListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijskoffie = koffie + bestellintotaal;
            bestellintotaal = prijskoffie;
            double dagtotaalprijskoffie = koffie + dagomzettotaal;
            dagomzettotaal = dagtotaalprijskoffie;
            repaint();

        }
    }

    class BinnenlandseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijsbinnenlandse = binnelands + bestellintotaal;
            bestellintotaal = prijsbinnenlandse;
            double dagtotaalprijsbinnenlandse = binnelands + dagomzettotaal;
            dagomzettotaal = dagtotaalprijsbinnenlandse;
            repaint();

        }
    }

    class BuitenlandseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double prijsbuitenlands = buitenlands + bestellintotaal;
            bestellintotaal = prijsbuitenlands;
            double dagtotaalprijsbuitenladse = buitenlands + dagomzettotaal;
            dagomzettotaal = dagtotaalprijsbuitenladse;
            repaint();

        }
    }

    class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bestellintotaal = 0;
            repaint();

        }
    }

    }




