import APIExchangeRate.RequestApi;
import APIExchangeRate.Currency;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> save = new ArrayList<>();
        boolean running = true;
        Scanner read = new Scanner(System.in);

        while (running) {
            System.out.println("\nEXCHANGE RATE\n**********************************\n");
            int menu = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Choose one of the options\n" +
                            "(1) Currency Conversion\n" +
                            "(2) My conversion history\n" +
                            "(3) Exit\n-> ");
                    menu = read.nextInt();
                    read.nextLine();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    read.nextLine();
                }
            }
            validInput = false;


            switch (menu) {
                case 1:
                    int codes;
                    while (!validInput) {
                        try {
                            do {
                                System.out.print("\nWant to see the currency code list?\n (1) Yes\n (2) No\n-> ");
                                codes = read.nextInt();
                                read.nextLine();

                                if (codes == 1) {
                                    System.out.println(Currency.getRates() + "\n\n");
                                } else if (codes != 2) {
                                    System.out.println("\n ERROR \n Choose again");
                                }
                            } while (codes != 1 && codes != 2);
                            validInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("\n Invalid input. Please enter a number.");
                            read.nextLine();
                        }
                    }
                    validInput = false;

                    System.out.print("\nFrom: \n-> ");
                    String inputCurrency = read.nextLine();


                    Currency result = null;
                    double currency = 0;
                    while (!validInput) {
                        try {
                            System.out.print("Amount: \n-> ");
                            currency = read.nextDouble();
                            read.nextLine();
                            validInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("\n Invalid input. Please enter a number.");
                            read.nextLine();
                        }
                    }

                    System.out.print("To: \n-> ");
                    String outputCurrency = read.nextLine();


                    try {
                        result = RequestApi.getConversion(inputCurrency, outputCurrency, currency);


                        if ("success".equalsIgnoreCase(result.getResult())) {
                            System.out.println("\nConversion performed correctly!");
                            System.out.println("From: " + result.getBase_code());
                            System.out.println("To: " + result.getTarget_code());
                            System.out.println("Exchange rate(now): " + result.getConversion_rate());
                            System.out.println("Conversion: " + result.getConversion_result());

                            save.add(result.getBase_code() + " → " + result.getTarget_code()
                                    + " | Conversion: " + result.getConversion_result()
                                    + " | Rate: " + result.getConversion_rate());
                        } else {
                            System.out.println("ERROR");
                        }

                    } catch (IOException | InterruptedException e) {
                        System.out.println(" Error connecting to the API: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println(" Error during conversion.");
                    }

                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.print("\nDo you want to go back to the menu?\n (1)Yes\n (2)No\n-> ");
                            int backMenu = read.nextInt();
                            if (backMenu == 2) {
                                running = false;
                                System.out.println("\n...\nCLOSING\n...");
                            }
                            validInput = true;
                        } catch (InputMismatchException e) {
                            System.out.println("\n Invalid input. Please enter a number.");
                            read.nextLine();
                        }
                    }

                    break;
                case 2:
                    System.out.println("\nConversion history:");
                    if (save.isEmpty()) {
                        System.out.println("No conversions performed yet.");
                    } else {
                        for (String item : save) {
                            System.out.println(item);
                        }


                        while (!validInput) {
                            try {
                                System.out.print("\nDo you want to go back to the menu?\n (1)Yes\n (2)No\n-> ");
                                int backMenu2 = read.nextInt();
                                if (backMenu2 == 2) {
                                    running = false;
                                    System.out.println("\n...\nCLOSING\n...");
                                }
                                validInput = true;
                            } catch (InputMismatchException e) {
                                System.out.println("\n Invalid input. Please enter a number.");
                                read.nextLine();
                            }
                        }

                    }
                    break;

                case 3:
                    System.out.print("\n...\nCLOSING\n...");
                    running = false;
                    break;


                default:
                    System.out.println("\n ERROR \n Choose again");
                    break;
            }
        }
    }
}