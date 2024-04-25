package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Log_In {

    public int run() {


        String fileName = "C:\\Users\\Petr Bibilov\\Documents\\art\\debone\\src\\files\\customers.txt";
        List<List<String>> customers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("  ");
                List<String> customer = Arrays.asList(parts);

                customers.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int id = 0;
        return log(customers);

    }
    public int log(List<List<String>> customers) {
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");

        String name = scanner.nextLine();
        name = name.replace("\n", "");
        int id = 0;
        int cus_len = customers.size();
        //System.out.println(cus_len);
        for (int i = 0; i < cus_len; i++) {
            if (name.equals(customers.get(i).get(0))){
                id = i;
                i=100;
                pass(customers, id);
            }
        }
        return id;
    }

    public void pass(List<List<String>> customers, int id) {
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.println(customers.get(id).get(1));
        if (pass.equals(customers.get(id).get(1))) {
            System.out.println("Добро пожаловать!");
        }
        else{
            System.out.println("Вы ввели не правильный пароль, попробуйте еще раз");
            pass(customers,id);
        }
    }
    }


