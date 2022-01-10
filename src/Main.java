public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* + zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        /* zad 1
         * numer indeksu/albumu 62489
         * */

        int i = 1000;
        while (i > 0) {
            System.out.println("i: " + i);
            i--;

            while ((i--) > 0) {
                {
                    System.out.println("89: " + i);
                    if (i % 89 == 0) {
                        System.out.println("Liczba podzielna przez 89");
                    }


                    /* zad 2 abc
                     */

                    int[] tab = {5, 10, 15, 20, 25};

                    int x = 0;

                    while (x < tab.length) ;
                    x++;

                    System.out.println(tab[x] + " ");



                    String[] stab = new String[]{"To", "jest", "nowa", "testowa", "tabela"};
                    for (int j = 0; j < stab.length; j++) {
                        System.out.print(stab[j] + " ");


                        double[] dtab = {4.21, 3.5, 1.4, 2.09, 4.87};

                        int z = 0;

                        while (z < dtab.length) ;
                        z++;

                        System.out.println(dtab[z] + " ");

                    /*
                    zad 3
                     */

                        int tor = 0;

                        while (true) {

                            System.out.println("Numer: " + tor);
                            tor ++;

                            if (false)
                            break;

                        }






                    }
                }
            }
        }
    }}