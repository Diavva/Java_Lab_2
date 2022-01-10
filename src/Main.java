import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */



        int r = 100;
        while (r > 0){
           System.out.println(" " + r);
            r--;



        while ((r--) > 0)
        {
            System.out.println(" 9: " + r);
            if (r % 9 == 0){
                System.out.print( r + " jest podzielne przez 9 \n");
            }


            /*
            zad 2
             */

            Scanner scan = new Scanner(System.in);

            System.out.println("Podaj liczbę nr 1: ");
            int tab1 = scan.nextInt();
            System.out.println(tab1 + " Podaj liczbę nr 2: ");
            int tab2 = scan.nextInt();
            System.out.println(tab1 + ", " + tab2 + " Podaj liczbę nr 3: ");
            int tab3 = scan.nextInt();
            System.out.println(tab1 + ", " + tab2 + ", " + tab3 + " Podaj liczbę nr 4: ");
            int tab4 = scan.nextInt();
            System.out.println(tab1 + ", " + tab2 + ", " + tab3 + ", " + tab4 + " Podaj liczbę nr 5: ");
            int tab5 = scan.nextInt();

            int tab11 = tab1 * 11;
            int tab22 = tab2 * 11;
            int tab33 = tab3 * 11;
            int tab44 = tab4 * 11;
            int tab55 = tab5 * 11;


            int [] tab = {tab11, tab22, tab33, tab44, tab55};

            for (int x : tab)
            {
                System.out.print(x + ", ");
            }

        }
    }
}}
