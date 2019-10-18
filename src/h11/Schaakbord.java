package h11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {


    @Override
    public void init() {

        setSize(600, 600);
    }

    @Override
    public void paint(Graphics g) {
        int breedte = 50;
        int hoogte = 50;
        int y = 50;
        int x = 50;

        // RIJ 1
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        // RIJ 2
        x = 50;
        y += hoogte;


        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        // RIJ 3
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        // RIJ 4
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        // RIJ 5
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        // RIJ 6
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        // RIJ 7
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        // RIJ 8
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom % 2 == 0) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

    }
}





