public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int i = 1000;
        int indeks = 57863;
        int x = indeks % 100;
        do {
            // System.out.println(i);
                if (i % x == 0) {
                    System.out.println("Liczba" + " " + i + " " + "jest podzielna przez" + " " + x);
            }
        } while (i-- >= 1);

        System.out.println("\n");
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        // a)

        int[] tab = new int[]{1, 3, 6, 7, 9};
        i = 0;
        while(i < tab.length) {
            System.out.println("tab[i]: " + tab[i]);
            i++;
        }

        System.out.println("\n");
        //b

        double[] tab2 = new double[]{21.5, 31.1, 2.2, 130.1, 22.2};
        i = 0;
        while (i < tab2.length) {
            System.out.println("tab2[i]: " + tab2[i]);
            i++;
        }

        System.out.println("\n");

        // c)

        String[] tab3 = new String[]{"raz", "dwa", "trzy", "cztery", "dzień" + " " + "dobry"};
        i = 0;
        while (i < tab2.length) {
            System.out.println("tab3[i]: " + tab3[i]);
            i++;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        while(true)
        {
            System.out.println("wykona się bez końca");
        }
        while(false)
        {
            System.out.println("to nigdy się nie wykona(IJ podkresla to rowniez)");
        }
    }
}