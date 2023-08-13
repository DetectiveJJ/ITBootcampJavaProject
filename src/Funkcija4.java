import java.util.Arrays;
import java.util.Scanner;

public class Funkcija4 {

    public static void replaceWith(String[] niz, String oldString, String newString) {
        oldString = oldString.trim();
        newString = newString.trim();
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = newString;
            }
        }
    }

    public static void main(String[] args) {

        /*
         * 4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo, i String
         * sa kojim zelimo da ga zamenimo u tom nizu.
         *
         * public static void replaceWith(String[] niz, String oldString, String newString)
         * */

        //test 1 - unapred definisani elementi => PASS
        String neispravno = "cetri";
        String ispravno = "cetiri";
        String[] brojevi = {"jedan", "dva", "tri", "cetri", "pet", "sest", "sedam", "osam", "devet", "deset"};
        System.out.println("Ovde postoji greska: " + Arrays.toString(brojevi));

        replaceWith(brojevi, neispravno, ispravno);
        System.out.println("Ovde je greska ispravljena: " + Arrays.toString(brojevi));

        System.out.println("===================2===================");

        //test 2 - uzimanje niza sa skenera => PASS
        String vanila = "vanila";
        String nemaVanile = "Nemamo trenutno vanilu";

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 3 omiljena ukusa sladoleda.");
        String[] ukusi = new String[3];
        for (int i = 0; i < ukusi.length; i++) {
            ukusi[i] = sc.next();
        }

        replaceWith(ukusi, vanila, nemaVanile);
        System.out.println("Od ukusa koje ste naveli, imamo: " + Arrays.toString(ukusi));

        System.out.println("===================3===================");
        sc.nextLine(); //praznjenje skenera

        //test 3 - uzimanje starog Stringa sa skenera => PASS
        String[] imena = {"Ana", "Nemanja", "Jovana", "Maja", "Jovana", "Maja",
                "Vladimir", "Vladimir", "Saska", "Nemanja", "Jovana", "Ana", "Ivan",
                "Strahinja", "Marko", "Saska", "Katarina", "Marko", "Ivan", "Vesna"};
        String zamena = "???";
        System.out.println("Ovo je nasa lista imena: " + Arrays.toString(imena));
        System.out.println("Izaberite neko ime sa liste: ");
        String izabranoIme = sc.nextLine();

        replaceWith(imena, izabranoIme, zamena);
        System.out.println("Sakrili smo ime koje ste izabrali " + Arrays.toString(imena));

        System.out.println("===================4===================");

        //test 4 - uzimanje novog Stringa sa skenera => PASS
        String[] cene = {"200", "500", "300", "400", "500", "200", "100", "300", "200", "500", "200", "300"};
        String staraCena = "500";
        System.out.println("Moramo da promenimo cenu svih artikala koji trenutno kostaju 500 dinara. Unesite novu cenu: ");
        String novaCena = sc.next();

        replaceWith(cene,staraCena,novaCena);
        System.out.println("Ovo je nas novi cenovnik: " + Arrays.toString(cene));

        System.out.println("===================5===================");

        //test 5 - uzimanje i starog i novog Stringa sa skenera => PASS
        String[] brojeviString = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("Izaberite neki od ponudjenih brojeva: " + Arrays.toString(brojeviString));
        String izabraniBroj = sc.next();
        System.out.println("Koliko iznosi vas broj pomnozen sa 2?");
        String brojPomnozenSaDva = sc.next();

        replaceWith(brojeviString, izabraniBroj, brojPomnozenSaDva);

        System.out.println("Uneli smo vas rezultat u niz! " + Arrays.toString(brojeviString));

        System.out.println("===================6===================");
        sc.nextLine();

        //test 6 - uzimanje niza i starog Stringa sa skenera => PASS
        String nasPredmet = "muzicko";
        System.out.println("Unesite 4 omiljena predmeta iz skole: ");
        String[] predmeti = new String[4];
        for (int i = 0; i < predmeti.length; i++) {
            predmeti[i] = sc.next();
        }
        System.out.println("Izdvojite jedan od tih koje ste uneli: ");
        String vasPredmet = sc.next();

        replaceWith(predmeti,vasPredmet,nasPredmet);
        System.out.println("Zamenili smo taj predmet sa nasim omiljenim predmetom " + Arrays.toString(predmeti));

        System.out.println("===================7===================");

        //test 7 - uzimanje niza i novog Stringa sa skenera => PASS
        String nasBroj = "6";
        System.out.println("Unesite brojeve od 1 do 11 koji su deljivi sa 2: ");
        String[] brojeviDeljiviSaDva = new String[5];
        for (int i = 0; i < brojeviDeljiviSaDva.length; i++) {
            brojeviDeljiviSaDva[i] = sc.next();
        }
        System.out.println("Unesite bilo koji broj po zelji: ");
        String vasBroj = sc.next();

        replaceWith(brojeviDeljiviSaDva,nasBroj,vasBroj);
        System.out.println("Vasim brojem smo zamenili jedan broj od 1 do 11 koji je deljiv sa 2. Koji smo broj zamenili? " + Arrays.toString(brojeviDeljiviSaDva));

    }
}
