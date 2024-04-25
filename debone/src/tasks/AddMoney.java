package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AddMoney {
    public void run(int id){
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> customers = readFile.run(fileName);

        System.out.println("Введите нужную сумму");
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        customers.get(id).set(3, String.valueOf(Integer.parseInt(customers.get(id).get(3))+money));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (List<String> customer : customers) {
                String line = String.join("  ", customer);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
