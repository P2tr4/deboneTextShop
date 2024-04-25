package tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuyProduct {
    public void run(int id) {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";
        ReadFile readFile1 = new ReadFile();
        List<List<String>> products = readFile1.run(fileName);
        choise_product(products, id);
    }
    public void choise_product(List<List<String>> products, int id) {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";
        ReadFile readFile = new ReadFile();
        List<List<String>> customers = readFile.run(fileName);

        System.out.println("Выберите продукт");
        PrintProducts printProducts = new PrintProducts();
        printProducts.run();

        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        int product = scanner.nextInt();
        product = product - 1;
        if (product!=-1 && product<=product) {
            if (Integer.parseInt(customers.get(id).get(3)) >=Integer.parseInt(products.get(product).get(2))) {
                    System.out.println("^_^");
                    add_money(Integer.parseInt(products.get(product).get(2)));
                    pay(Integer.parseInt(products.get(product).get(2)), id, product);
            }
            else{
                System.out.println("На счете недостаточно средств, пожалуйста, пополните счёт");
                return;
            }
        }
        else{
            System.out.println("такого товара не существует, попробуйте ещё раз");
            choise_product(products, id);
        }
        }
        public void add_money(int money){
            try {
                String filePath = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\magazine.txt";
                Scanner scanner = new Scanner(new File(filePath));
                int number = scanner.nextInt();
                int real_num=number+money;

                System.out.println("Прочитанное число: " + real_num);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(Integer.toString(real_num));

                } catch (IOException e) {
                    e.printStackTrace();
                }
                scanner.close();

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        public void pay(int money, int customer_id, int product_id){
            String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";
            ReadFile readFile = new ReadFile();
            List<List<String>> customers = readFile.run(fileName);

            String fileName1 = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";
            ReadFile readFile1 = new ReadFile();
            List<List<String>> products = readFile1.run(fileName1);
            System.out.println(customers);

            customers.get(customer_id).set(3, String.valueOf(Integer.parseInt(customers.get(customer_id).get(3))-money));
            customers.get(customer_id).set(2, String.valueOf(Integer.parseInt(customers.get(customer_id).get(2))+1));
            products.get(product_id).set(1, String.valueOf(Integer.parseInt(products.get(product_id).get(1))+1));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (List<String> customer : customers) {
                    String line = String.join("  ", customer);
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName1))) {
                for (List<String> product : products) {
                    String line = String.join("  ", product);
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }


