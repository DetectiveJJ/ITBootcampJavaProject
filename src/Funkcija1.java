import java.util.Scanner;

public class Funkcija1 {

    static boolean find(String rec, String[] niz) {
        boolean nadjiRec = false;
        rec = rec.trim();
        for (int i = 0; i < niz.length; i++) {
            String s = niz[i];
            if (rec.equalsIgnoreCase(s)) {
                nadjiRec = true;
                break;
            }
        }
        return nadjiRec;
    }


    public static void main(String[] args) {

        /*
         * 1) Napraviti funkciju koja kao argument prima niz Stringova, i String koji zelimo da lociramo
         * u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.
         *
         * public static boolean find(String rec, String[] niz)
         * */

        //test 1 - unapred definisan niz Stringova i unapred definisan String => PASS
        String[] radniDaniUNedelji = {"Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak"};
        String dan = "ponedeljak";
        if (find(dan, radniDaniUNedelji)) {
            System.out.println("Danas radimo.");
        } else {
            System.out.println("Ne radimo vikendom.");
        }

        System.out.println("==================2====================");

        //test 2 - uzimanje Stringa sa skenera uz unapred definisan niz Stringova => PASS
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vas omiljeni dan u sedmici: ");
        String danSaSkenera = sc.next();

        if (find(danSaSkenera, radniDaniUNedelji)) {
            System.out.println("Vas omiljeni dan je radni dan.");
        } else {
            System.out.println("Vas omiljeni dan pripada vikendu i neradan je.");
        }

        System.out.println("==================3====================");

        //test 3 - uzimanje niza Stringova sa skenera uz unapred definisan String => PASS
        String unapredDefinisanaRec = "sladoled";
        String[] nizSaSkenera = new String[200]; //zdravorazumna pretpostavka da korisnik nece uneti vise od 200 poslastica
        System.out.println("Unesite sve poslastice koje volite. Kada zavrsite sa unosom, unesite \"STOP\".");
        for (int i = 0; i < nizSaSkenera.length; i++) {
            nizSaSkenera[i] = sc.next();
            if (nizSaSkenera[i].equalsIgnoreCase("stop")) {
                break;
            }
        }

        if (find(unapredDefinisanaRec, nizSaSkenera)) {
            System.out.println("I mi volimo " + unapredDefinisanaRec + "!");
        } else {
            System.out.println("Mi volimo i " + unapredDefinisanaRec + ". Obavezno probajte ukoliko vec niste!");
        }

        System.out.println("==================4====================");

        //test 4 - uzimanje i niza Stringova i Stringa sa skenera => PASS
        System.out.println("Unesite vase ime:");
        String imeKorisnika = sc.next();
        String[] imena = new String[100]; //zdravorazumna pretpostavka da u jednom odeljenju ne moze biti vise od 100 djaka (realno ih ne moze biti ni 50, al ajde)
        System.out.println("Unesite imena drugara iz vaseg odeljenja. Kada zavrsite sa unosom, unesite \"STOP\".");
        for (int i = 0; i < imena.length; i++) {
            imena[i] = sc.next();
            if (imena[i].equalsIgnoreCase("stop")) {
                break;
            }
        }

        if (find(imeKorisnika, imena)) {
            System.out.println("Vase ime nije jedinstveno u odeljenju.");
        } else {
            System.out.println("Vase ime je jedinstveno u odeljenju.");
        }

    }
}
