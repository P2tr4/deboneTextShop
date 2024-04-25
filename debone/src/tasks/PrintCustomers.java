package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintCustomers {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> customers = readFile.run(fileName);

        PrintFile printFile = new PrintFile();
        printFile.run(customers);
    }
}