import java.util.Arrays;
import java.util.Scanner;

public class Funkcija6 {

    public static int[] najveci(int[] niz1, int[] niz2) {
        int[] najveciNiz = {};
        if (niz1.length == niz2.length) {
            najveciNiz = new int[niz1.length];
            for (int i = 0; i < najveciNiz.length; i++) {
                najveciNiz[i] += Math.max(niz1[i], niz2[i]); //ovo mi je IntelliJ preporucio :)
            }
        } else if (niz1.length > niz2.length) {
            najveciNiz = new int[niz1.length];
            for (int i = 0; i < najveciNiz.length; i++) {
                najveciNiz[i] += niz1[i];
            }
            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] > niz2[i]) {  //i ovde je preporucio Math.max(), ali ostavljam prvobitni postupak
                    najveciNiz[i] = niz1[i];
                } else {
                    najveciNiz[i] = niz2[i];
                }
            }
        } else {
            najveciNiz = new int[niz2.length];
            for (int i = 0; i < najveciNiz.length; i++) {
                najveciNiz[i] += niz2[i];
            }
            for (int i = 0; i < niz1.length; i++) {
                if (niz2[i] > niz1[i]) {
                    najveciNiz[i] = niz2[i];
                } else {
                    najveciNiz[i] = niz1[i];
                }
            }
        }
        return najveciNiz;
    }

    public static void main(String[] args) {

        /*
         * 6) Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine).
         * Porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci niz.
         * Ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom,
         * samo ispisati preostale elemente.
         *
         * public static int[] najveci(int[] niz1, int[] niz2)
         * */

        //test 1 - nizovi iste duzine => PASS
        int[] nizD = {5, 4, 3, 2, 1};
        int[] nizK = {1, 2, 3, 4, 5};

        System.out.println("Niz nastao od nizova iste duzine: " + Arrays.toString(najveci(nizD, nizK)));

        System.out.println("============2============");

        //test 2 - nizovi razlicite duzine => PASS
        int[] nizJ = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] nizM = {12, 14, 4, 2, 20};
        System.out.println("Niz nastao od nizova razlicite duzine: " + Arrays.toString(najveci(nizJ, nizM)));

        System.out.println("============3============");

        //test 3 - uzimanje jednog niza sa skenera => PASS
        Scanner sc = new Scanner(System.in);
        int[] definisanNiz = {10, 9, 8, 7, 6};
        System.out.println("Unesite neki broj izmedju 5 i 20: ");
        int duzinaNiza = sc.nextInt();
        System.out.println("Unesite " + duzinaNiza + " brojeva po zelji: ");
        int[] nizSaSkenera = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            nizSaSkenera[i] = sc.nextInt();
        }
        System.out.println("Nas niz je: " + Arrays.toString(definisanNiz));
        System.out.println("Novi niz je: " + Arrays.toString(najveci(definisanNiz, nizSaSkenera)));

        System.out.println("============4============");
        sc.nextLine();

        //test 4 - uzimanje oba niza sa skenera => PASS
        System.out.println("Unesite neki broj izmedju 5 i 20: ");
        int duzinaNiza1 = sc.nextInt();
        System.out.println("Unesite " + duzinaNiza1 + " brojeva po zelji: ");
        int[] nizSaSkenera1 = new int[duzinaNiza1];
        for (int i = 0; i < duzinaNiza1; i++) {
            nizSaSkenera1[i] = sc.nextInt();
        }

        System.out.println("Unesite jos neki broj izmedju 5 i 20: ");
        int duzinaNiza2 = sc.nextInt();
        System.out.println("Unesite " + duzinaNiza2 + " brojeva po zelji: ");
        int[] nizSaSkenera2 = new int[duzinaNiza2];
        for (int i = 0; i < duzinaNiza2; i++) {
            nizSaSkenera2[i] = sc.nextInt();
        }
        System.out.println("Na osnovu brojeva koje ste uneli, osmislili smo ovaj niz: " + Arrays.toString(najveci(nizSaSkenera1, nizSaSkenera2)));

    }
}
