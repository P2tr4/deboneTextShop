package tasks;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductsRating {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> products = readFile.run(fileName);
        //Collections.sort(products, Comparator.comparingInt(row -> Integer.parseInt(row.get(1))).reversed());

        int i = products.size();
        for (List<String> row : products) {
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
