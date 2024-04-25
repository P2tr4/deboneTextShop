package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<List<String>> run(String fileName) {
        List<String> customerss = readFileToList(fileName);
        List<List<String>> customers = new ArrayList<>();

        for (String row : customerss) {
            List<String> customer = new ArrayList<>();
            String[] elements = row.split("  ");
            for (String element : elements) {
                customer.add(element);
            }
            customers.add(customer);
        }
        return customers;
    }
    public static List<String> readFileToList(String filePath) {
        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Устанавливаем разделитель двух пробелов
            scanner.useDelimiter("\\s\\s");

            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
