import java.util.Arrays;
import java.util.Scanner;

public class Funkcija2 {

    static double[] pomnozenoSaPI(int[] brojevi){
        double[] brojeviPomnozeniSaPI = new double[brojevi.length];
        for (int i = 0; i < brojevi.length; i++) {
            brojeviPomnozeniSaPI[i] += brojevi[i] * Math.PI;
        }
        return brojeviPomnozeniSaPI;
    }

    public static void main(String[] args) {

        /*
         * 2) Napraviti funkciju koja prima niz celih brojeva i kao rezultat vraca nov niz gde je svaki
         * element pomnozen sa Pi.
         *
         * public static double[] pomnozenoSaPI(int[] brojevi)
         * */

        //test 1 - unapred definisan niz => PASS
        int[] celiBrojevi = {1, 11, 2, 10};
        System.out.println("Stari niz je: " + Arrays.toString(celiBrojevi));
        System.out.println("Novi niz je: " + Arrays.toString(pomnozenoSaPI(celiBrojevi)));

        System.out.println("===================2===================");

        //test 2 - niz uzet sa skenera => PASS
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        int duzina = sc.nextInt();

        System.out.println("Unesite " + duzina + " celih brojeva: ");
        int[] nizCelihBrojeva = new int[duzina];

        for (int i = 0; i < nizCelihBrojeva.length; i++) {
            nizCelihBrojeva[i] = sc.nextInt();
        }
        System.out.println("Stari niz je: " + Arrays.toString(nizCelihBrojeva));
        System.out.println("Novi niz je: " + Arrays.toString(pomnozenoSaPI(nizCelihBrojeva)));

    }
}
