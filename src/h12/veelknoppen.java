package h12;

import java.awt.*;
import java.applet.*;

public class veelknoppen extends Applet {
    Button [] knoppen;



    @Override
    public void init()  {
        knoppen = new Button[25];
        for (int i = 1; i <knoppen.length; i++) {
        knoppen [i] = new Button ( "" + i);
            add(knoppen[i]);



        }
    }
}
