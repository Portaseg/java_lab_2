import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 Napisać program który 
                a) stworzy listę ArrayList<String> (lista tablicowa),
                  Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                  elementów i elementami mają być nazwy zwierząt (niech niektóre wartości dublują się).
                  -- podpowiedź: List<String> nazwaListy = new ArrayList<>();
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                  -- podpowiedź: for(String zmienna : List<String>) { }
                c) proszę usunąć 2 ostatnie elementy listy i drugi element, następnie dodać do niej 4 inne elementy,
                  następnie wyświetlić listę i wielkość listy,
                d) proszę wyświetlić posortowną listę, oraz odwrotniee posortowaną i znów użyć metody z punktu b) do wyświetlenia
                  elementów listy
          */
        Scanner scan = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("wpisz zwierzątko do listy: ");
            String zwierze = scan.next();
            lista.add(zwierze);
        }

        System.out.println(lista+"\n");


            lista.remove(lista.size() - 1);
            lista.remove(lista.size() - 1);
            lista.remove(1); //usuwa drugi element z listy

            for (int i = 0; i < 4; i++) {
                System.out.println("wpisz ponownie zwierzątko do listy: ");
                lista.add(scan.next());
            }
            read(lista);
            System.out.println("\nilość elementów listy: " + lista.size() + "\n");

            lista.sort(Collections.reverseOrder());
            read(lista);


         /* zad.2 Napisać program który :
                a) stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury, liczby mają się powtarzać,
                b) następnie wyświetlić zawartość set-a w konsoli,
                c) następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> liczby = new TreeSet<>();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Podaj liczbe: ");
            liczby.add(scan.nextInt());
        }
        System.out.println("zawartosc seta: " + liczby);

        for (Integer liczba : liczby) {
            System.out.print(liczba + ", ");
        }

    }

// zad 1

    public static void read(List<String> lista) {
        for (String element : lista) {
            System.out.print(element + " ");
        }
    }
        /* zad.3* Dla chętnych, nie będzie oceniane:
                Napisać podobny program jak w zad.1 zamiast zwierząt wprowadzć dowolne dane 
                np. imiona, nazwiska, miasta, samochody ... . (dowolność),
                Wykonać na TreeSet 
                -- podpowiedź: Set<String> nazwaSeta = new TreeSet<>();
        */


}
