import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //zad 1b

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody


        zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        int[] tab = new int[20];
        metoda1(tab);
        metoda2(tab);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] tab1 = new String[6];
        metoda3(tab1);
        metoda4(tab1);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        String imie = "Piotr", nazwisko = "Podwojski";
        int wiek = 26;
        metoda5(imie);
        metoda5(imie,nazwisko);
        metoda5(imie,nazwisko,wiek);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int a = 5, b = 4, c = 10, suma1 = metoda6(a, b), suma2 = metoda6(a, b, c);
        System.out.println("wynik: " + (suma1 + suma2));
    }

    //zad 1

    public static void metoda1(int[] tab) {

        for (int i = 0; i < 20; i++) {
            tab[i] = 40 - i;
        }
    }

    public static void metoda2(int[] tab) {
        for (int i = 0; i < 20; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    //zad 2

    public static void metoda3(String[] tab1) {
        Scanner scan = new Scanner(System.in);

        for (int i = tab1.length - 1; i >= 0; i--) {
            System.out.println("Wpisz slowo: ");
            String tekst = scan.next();
            tab1[i] = tekst;
        }
    }

    public static void metoda4(String[] tab1) {
        for (int i = tab1.length - 6; i < tab1.length; i++) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println();
    }

// zad 3

    public static void metoda5(String imie) {
        System.out.println("imie: " + imie);
    }
    public static void metoda5(String imie, String nazwisko) {
        System.out.println("imie: " + imie + ", " + "nazwisko: " + nazwisko);
    }
    public static void metoda5(String imie, String nazwisko, int wiek) {
        System.out.println("imie: " + imie + ", " + "nazwisko: " + nazwisko + ", " + "wiek: " + wiek);
    }

// zad 4

    public static int metoda6(int a, int b) {
        return a + b;
    }
    public static int metoda6(int a, int b, int c) {
        return a + b + c;
    }
}