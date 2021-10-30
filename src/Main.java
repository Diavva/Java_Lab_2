public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */



        for (int r = 0; r <= 5; r++) {
            if (r == 3)
            break;
            System.out.print(" " + r);
        }
        System.out.print("\n");

            for ( int q = 0; q < 10; q++){
                if (q == 6)
                continue;


                System.out.print(" " + q);
            }
        System.out.print("\n");

            for (int e = 0; e <= 15; e++){
                if (e >= 9)
                return;

                System.out.print(" "+ e);






        }
    }
}
