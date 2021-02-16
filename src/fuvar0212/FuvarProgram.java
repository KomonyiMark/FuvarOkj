package fuvar0212;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuvarProgram {

    public static void main(String[] args) throws IOException {

        /*. Hatérozza meg és írja ki a képernyőre a minta szerint, hogy hany utazás került
felj e gyzé sr e az áIlományb an*/
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList<Fuvar> fuvarok = new ArrayList<>();

        for (int i = 1; i < sorok.size(); i++) {
            fuvarok.add(new Fuvar(sorok.get(i)));
        }
        //     int db = 0;
        double osszeg = 0.0;

//        for (int i = 0; i < fuvarok.size(); i++) {
//            if (fuvarok.get(i).getTaxi_id() == 6185) {
//                db++;
//                osszeg += fuvarok.get(i).getViteldíj() + fuvarok.get(i).getBorravalo();
//            }
//        }
//        for (Fuvar fuvar : fuvarok) {
//             if (fuvar.getTaxi_id() == 6185) {
//            db++;
//            osszeg+=fuvar.getBorravalo();
//        }
//        }

        /* Hatérozza meg és írja ki a képernyőre a minta szerint, hogy a 6185-ös azonosítójú
taxisnak mennyi volt a bevétele, és ez hány fuvarból állt! FeltéteIezheti, hogy van ilyen
azonosítójú taxis.*/
        int db = 0;
        double bevetel = 0.0;
        for (Fuvar fuvar : fuvarok) {
            if (fuvar.getTaxi_id() == 6185) {
                db++;
                bevetel += fuvar.getViteldíj() + fuvar.getBorravalo();
            }
        }

        System.out.printf("3. Feladat: %d fuvar\n", fuvarok.size());
        System.out.println("4. Feladat: " + db + " fuvar alatt: " + bevetel + "$");

        /*Programjával hatátozza meg az áIlomány adataibő| a fizetési módokat, majd összesítse'
hogy aZ egyes fizetési módokat hányszot vá|asztották az utak során! Ezeket aZ
eredményeket a minta szerint írja a képernyőre! A kiírás során a fizetési módok sorrendje
bármilyen lehet.*/
        System.out.println("5. feladat");

        HashMap<String, Integer> fizModok = new HashMap<>();

        for (Fuvar fuvar : fuvarok) {
            String kulcs = fuvar.getFizetes_modja();
            if (!fizModok.containsKey(kulcs)) {
                fizModok.put(kulcs, 1);
            } else {
                int ertek = fizModok.get(kulcs);
                fizModok.put(kulcs, ++ertek);
            }
            //  System.out.println(fizModok);
        }
        // System.out.println(fizModok);
        for (Map.Entry<String, Integer> entry : fizModok.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
//            System.out.println(key + ":" + value + " db");
              System.out.printf("%10s: %4d db\n",key, value);
        }
        /* Határozza meg és írja ki a képernyőre a minta szerint, hogy osszesen hány km-t tettek
meg a taxisok (1 mérfold : 1,6 km)! Az eredményt két tizedesjegyre kerekítve jelenítse
meg a képernyőn!*/
        System.out.println("6.feladat");

    }

}
