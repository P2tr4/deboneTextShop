package tasks;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AddProduct {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        //String title = scanner.nextLine();
        System.out.println("Введите название продукта");
        String productname = scanner.nextLine();
        System.out.println("Введите цену продукта");
        int price = scanner.nextInt();
        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\products.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            String content = productname + "  " + price + "$";
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
