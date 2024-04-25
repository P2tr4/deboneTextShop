package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ChangeUser {
    public void run(int id) {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> customers = readFile.run(fileName);

        System.out.println("Введите новое имя");
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите новый пароль");
        String pass = scanner.nextLine();

        customers.get(id).set(0,name);
        customers.get(id).set(1,pass);

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