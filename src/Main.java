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

        }

        while ((r--) > 0)
        {
            System.out.println("9: " + r);
            if (r % 9 == 0){
                System.out.print(r + "podzielne przez 9");
            }
        }
    }
}
