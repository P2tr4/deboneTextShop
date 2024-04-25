package tasks;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintProducts {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> products = readFile.run(fileName);

        PrintFile printFile = new PrintFile();
        printFile.run(products);
    }
}