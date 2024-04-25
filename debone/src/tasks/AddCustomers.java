package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddCustomers {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        //String title = scanner.nextLine();
        System.out.println("Введите имя покупателя");
        String productname = scanner.nextLine();
        System.out.println("Введите количество денег у покупателя");
        int price = scanner.nextInt();
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            String content = productname + "  " + price + "$";
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
