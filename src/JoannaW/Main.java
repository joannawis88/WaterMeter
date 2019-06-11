package JoannaW;


import java.text.*;
import java.util.*;

        public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in).useLocale(Locale.GERMAN);

                System.out.println("Enter amount of warm water: ");
                double warmWater = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter amount of cold water: ");
                double coldwater = scanner.nextInt();
                scanner.nextLine();
                scanner.close();

                double totalWater = (warmWater * 10.00) / 1000 + (coldwater * 9.85) / 1000;
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String numberAsString = decimalFormat.format(totalWater);

                System.out.println("The total cost is " + numberAsString + " zł");

            }
        }

