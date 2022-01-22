public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 10; i >= 0 ; i--) {
            if (i == 5)
                break;
            System.out.println("i=" + i);
        }
        System.out.println("\n");
        /*b*/
        for (int i = 4; i <= 6 ; i++) {
            if(i*5==25)
                continue;
            System.out.println("i="+ i);
        }
        System.out.println("\n");

        /*c*/
        for (int i = 0; i < 20; i++) {
            if (i == 13)
                return;
                System.out.println("i=" + i);
        }
        System.out.println("funkcja return nie pozwoli wyświetlic sie tej linijce");
    }
}