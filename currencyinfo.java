package Minikantor;

import java.util.Scanner;

public class currencyinfo {

    public double currencyInfo2() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Wybierz Walute z Ktorej chcesz dokonać wymiany ");
        String currencyCode = scanner.next ().toUpperCase ();
        double value = 1;
        switch (currencyCode) {
            case "THB":
                value = 0.1255;
                break;
            case "USD":
                value = 4.1978;
                break;
            case "AUD":
                value = 3.1538;
                break;
            case "HKD":
                value = 0.5358;
                break;
            case "CAD":
                value = 3.3584;
                break;
            case "NZD":
                value = 2.9115;
                break;
            case "SGD":
                value = 3.0948;
                break;
            case "EUR":
                value = 4.6428;
                break;
            case "HUF":
                value = 1.2634;
                break;
            case "CHF":
                value = 4.5431;
                break;
            case "GBP":
                value = 5.5114;
                break;
            case "UAH":
                value = 0.1467;
                break;
            case "JPY":
                value = 3.4247;
                break;
            case "CZK":
                value = 0.1906;
                break;
            case "DKK":
                value = 0.6241;
                break;
            case "ISK":
                value = 3.2696;
                break;
            case "NOK":
                value = 0.4785;
                break;
            case "SEK":
                value = 0.4487;
                break;
            case "HRK":
                value = 0.6129;
                break;
            case "RON":
                value = 0.9388;
                break;
            case "BGN":
                value = 2.3738;
                break;
            case "TRY":
                value = 0.2858;
                break;
            case "ILS":
                value = 1.3111;
                break;
            case "CLP":
                value = 0.5335;
                break;
            case "PHP":
                value = 0.0813;
                break;
            case "MXN":
                value = 0.2114;
                break;
            case "ZAR":
                value = 0.2876;
                break;
            case "BRL":
                value = 0.8857;
                break;
            case "MYR":
                value = 0.9970;
                break;
            case "IDR":
                value = 2.9218;
                break;
            case "INR":
                value = 5.5259;
                break;
            case "KRW":
                value = 0.3450;
                break;
            case "CNY":
                value = 0.6598;
                break;


            default:
        }

        return value;

    }
}
