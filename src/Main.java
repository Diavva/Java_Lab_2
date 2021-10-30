import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */


        /* zadanie 1 przykład a*/


        Scanner scan = new Scanner((System.in));
        System.out.println("Podaj liczbę: ");
        int a = (scan.nextInt());
        switch ( a % 2){
            case 0:
                System.out.println("Liczba parzysta");
                break;

            default:
                System.out.println("Liczba nieprzysta");
                break;

     }

     /* zad 1, przykład b */

        Scanner scann = new Scanner((System.in));
        System.out.println("Podaj liczbę: ");
        int r = (scann.nextInt());
        switch (r % 7){
            case 0:
                System.out.println("Liczba podzielna przez 7");
                break;

            default:
                System.out.println("Liczba nie podzielna przez 7");
                break;
        }



        /* zadanie 2 a i b */

        String tekst = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tab = {0,0,0,0,0};
        for (char zmienna : tekst.toCharArray()) {
            switch (zmienna) {
                case 'o':
                    ++tab[0];
                    break;

                case 'p':
                    ++tab[1];
                    break;

                case 'x':
                    ++tab[2];
                    break;

                case 'z':
                    ++tab[3];
                    break;

                case 'q':
                    ++tab[4];
                    break;
            }
        }

        System.out.printf("\n Liczba liter w stringu: \n o: %d \n p: %d \n x: %d \n z: %d \n q: %d",
                tab[0], tab[1], tab[2], tab[3], tab[4] );

    }
}
