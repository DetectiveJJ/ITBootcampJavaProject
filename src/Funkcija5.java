import java.util.Scanner;

public class Funkcija5 {

    public static void deljivSa(String broj) {
        broj = broj.trim();
        int brojInt = Integer.parseInt(broj);
        System.out.print("Broj " + broj + " je deljiv sa sledecim brojevima: ");
        for (int i = 1; i <= brojInt; i++) {
            if (brojInt % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /*
         * 5) Napraviti funkciju koja prima String.
         * String zapis ce biti u vidu nekog broja(npr "123", "741",...).
         * Funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv sa tim brojem.
         *
         * public static void deljivSa(String broj)
         * */

        //test 1 - unapred definisan String => PASS
        String brProba = "24";
        deljivSa(brProba);

        System.out.println("===================2===================");

        //test 2 - unos Stringa preko skenera => PASS
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        String brSkener = sc.nextLine();
        deljivSa(brSkener);


    }
}
