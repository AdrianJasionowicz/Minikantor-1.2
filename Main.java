package Minikantor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println (" Witaj w Minikantorze ");
        System.out.println ("Wszystkie kursy będą bazowały na aktualnych kursach NBP");


        boolean shouldCountinue = true;
        Scanner scanner = new Scanner (System.in);

        while (shouldCountinue) {
            System.out.println ("Wybierz opcję: ");
            System.out.println ("1. Wymień na PLN");
            System.out.println ("2 Wymień na inna walutę");
            System.out.println ("3 Wymień walutę obca na inna walute obcą");
            System.out.println ("4 Stan konta");
            System.out.println ("5 Tabela walut");
            System.out.println ("6 Koniec");
            int userChoice = scanner.nextInt ();

            switch (userChoice) {
                case 1:
                    System.out.println ("Wymieniasz na PLN");
                    exchange.exchangeTo (2);


                    break;
                case 2:
                    System.out.println ("Wymiana na inna walutę: ");
                    exchange.exchangeTo (7);

                    break;
                case 3:
                    System.out.println ("Wymiana waluty obcej na obcą: ");
                    exchange.exchangeTo (10);
                    break;
                case 4:
                    System.out.println (" W trakcie tworzenia");

                    break;
                case 5:
                    Tablet ();
                    break;
                case 6:
                    shouldCountinue = false;
                    break;
            }

        }

    }
        public static void Tablet () {
            System.out.println ("Lista Walut oraz ich skrótów do Użytku");


            String[] Table = {"Tajlandia - THB", "Dolar Amerykański - USD", "Dolar Australijski - AUD", "Dolar Hongkongu - HKD", "Dolar Kanadyjski - CAD", "Dolar Nowozelandzki - NZD", "Dolar Singapurski - SGD", "Euro - EUR", "Forint (Węgry) -  HUF", "Frank Szwajcarski - CHF", "Funt Szterling -  GBP", "Hrywna (Ukraina) -  UAH", "Jen (Japonia) - JPY", "Korona Czeska - CZK", "Korona Duńska -  DKK", "Korona Islandzka -  ISK", "Korona Norweska - NOK", "Korona Szwedzka - SEK", "Kuna (Chorwacja) - HRK", "Lej Rumuński - RON", "Lew (Bułgaria) - BGN", "Lira Turecka - TRY", "Nowy Izraelski Szekel - ILS", "Peso Chilijskie - CLP", "Peso Filipińskie	- PHP", "Peso Meksykańskie - MXN", "Rand (Republika Południowej Afryki) - ZAR", "Real (Brazylia) - BRL", "Ringgit (Malezja)	- MYR", "Rupia Indonezyjska - IDR", "Rupia Indyjska - INR", "Won Południowokoreański - KRW", "Yuan Renminbi (Chiny) - CNY"};

            for (String i : Table) {
                System.out.println (i);
            }


        }

}