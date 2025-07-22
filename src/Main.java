import APIExchangeRate.RequestApi;
import APIExchangeRate.Currency;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);

        System.out.print("Moeda base \n-> ");
        String inputCurrency = read.nextLine();

        System.out.print("Quanto você deseja trocar? \n-> ");
        double currency = read.nextDouble();
        read.nextLine();

        System.out.print("Moeda pra troca \n-> ");
        String outputCurrency = read.nextLine();


    }
}