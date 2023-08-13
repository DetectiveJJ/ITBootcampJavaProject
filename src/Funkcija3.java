import java.util.Scanner;

public class Funkcija3 {

    public static String reverse(String rec) {
        rec = rec.trim();
        String obrnutaRec = "";
        char slovo;
        for (int i = 0; i < rec.length(); i++) {
            slovo = rec.charAt(i); //izvlacimo karakter i smestamo u slovo
            obrnutaRec = slovo + obrnutaRec;
        }
        return obrnutaRec;
    }


    public static void main(String[] args) {

        /*
         * 3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.
         *
         * public static String reverse(String rec)
         * */

        //test 1 - unapred definisana rec => PASS
        String nekaRec = "projekat";
        System.out.println(reverse(nekaRec));

        System.out.println("=============2=============");

        //test 2 - uzimanje reci/recenice sa skenera => PASS
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite rec ili recenicu po zelji: ");
        String recSaSkenera = sc.nextLine();
        System.out.println("Vas unos ispisan otpozadi: " + reverse(recSaSkenera));
    }
}
