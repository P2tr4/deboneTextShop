package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ChangeProduct {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> products = readFile.run(fileName);

        System.out.println("Выберите продукт");
        PrintProducts printProducts = new PrintProducts();
        printProducts.run();
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        int product = scanner.nextInt();
        product = product - 1;
        if (product!=-1 && product<=product) {
            System.out.println("Введите новое название товара");
            scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("Введите новую цену");
            int pass = scanner.nextInt();

            products.get(product).set(0,name);
            products.get(product).set(1, String.valueOf(pass));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (List<String> product1 : products) {
                    String line = String.join("  ", product1);
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Такого товара не существует");
        }


    }
}
