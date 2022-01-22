import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int i;
        int indeks = 57863;
        for (i = 100; i >= 0; i--) {
            if ((indeks % 10 != 0) && (i % (indeks % 10) == 0)) {
                System.out.println("Liczba" + " " + i + " " + "jest podzielna przez" + " " + (indeks % 10));
            }
        }

        System.out.println("\n");

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner scan = new Scanner(System.in);

        int[] tab = new int[5];
        int n;

        for (n=0 ; n<5; n++) {
            System.out.println("Podaj liczbe do elementu " + (n+1) + " tablicy");
            tab[n] = scan.nextInt();
        }

        for (int num: tab) {
            System.out.print(num + 11 + "\n");
        }
    }
}
