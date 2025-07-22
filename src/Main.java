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

        Currency result = RequestApi.getConversion(inputCurrency, outputCurrency, currency);

        if ("success".equalsIgnoreCase(result.getResult())) {
            System.out.println("Conversão realizada com sucesso!");
            System.out.println("De: " + result.getBase_code());
            System.out.println("Para: " + result.getTarget_code());
            System.out.println("Taxa de câmbio: " + result.getConversion_rate());
            System.out.println("Valor convertido: " + result.getConversion_result());
        } else {
            System.out.println("ERRO");
        }
    }
}