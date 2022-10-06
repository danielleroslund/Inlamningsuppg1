import Växthotell.Kaktus;
import Växthotell.KöttätandeVäxt;
import Växthotell.Palm;
import Växthotell.Växt;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Palm p1 = new Palm("Laura", 5);
        Palm p2 = new Palm("Putte", 1);
        Kaktus k = new Kaktus("Igge", 0.2);
        KöttätandeVäxt kv = new KöttätandeVäxt("Meatloaf", 0.7);

        List<Växt> växter = new ArrayList<>();
        Collections.addAll(växter, p1, p2, k, kv);


        while (true) {

            String växtSomSkaHaVätska = JOptionPane.showInputDialog("Ange namnet på den växt som ska ha vätska:");

            if (växtSomSkaHaVätska == null) {
                System.exit(0);
            }

            boolean växtNamnFinns = false;

            for(Växt växt : växter){
                if(växtSomSkaHaVätska.equals(växt.getNamn())){
                    JOptionPane.showMessageDialog(null, växt);
                    växtNamnFinns = true;
                }
            }
            if(!växtNamnFinns){
                JOptionPane.showMessageDialog(null, "Kontrollera namnet, gör ett nytt försök");

            }

        }

    }
}