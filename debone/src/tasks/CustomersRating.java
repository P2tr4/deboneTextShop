package tasks;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomersRating {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> customers = readFile.run(fileName);
        Collections.sort(customers, Comparator.comparingInt(row -> Integer.parseInt(row.get(2))));
        int i = customers.size();
        for (List<String> row : customers) {
            System.out.print(i+")");
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.print("$");
            System.out.println();
            i-=1;
        }
    }
}
