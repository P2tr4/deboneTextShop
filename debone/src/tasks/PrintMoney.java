package tasks;

import java.util.List;

public class PrintMoney {
    public void run() {
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\magazine.txt";

        ReadFile readFile = new ReadFile();
        List<List<String>> money = readFile.run(fileName);

        PrintFile printFile = new PrintFile();
        printFile.run(money);
    }
}
