package tasks;

import java.util.Scanner;
public class MainTask {


    Scanner scanner = new Scanner(System.in);

    public MainTask() {
        this.scanner = new Scanner(System.in);
    }
    public void run() {
        Log_In Log_in = new Log_In();
        int id = Log_in.run();
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продаваемых продуктов");
            System.out.println("3. добавить покупателся");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить товар");
            System.out.println("6. Оборот магазина");
            System.out.println("7. Пополнить счёт");
            System.out.println("8. Рейтинг покупателей");
            System.out.println("9. Рейтинг продуктов");
            System.out.println("10. Изменить пользователя");
            System.out.println("11. Изменить товар");
            System.out.println("12. Войти в другой аккаунт");
            int task = scanner.nextInt(); scanner.nextLine();

            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    AddProduct addProduct = new AddProduct();
                    addProduct.run();
                    break;
                case 2:
                    PrintProducts printProducts = new PrintProducts();
                    printProducts.run();
                    break;
                case 3:
                    AddCustomers addCustomers = new AddCustomers();
                    addCustomers.run();
                    break;
                case 4:
                    PrintCustomers printCustomers = new PrintCustomers();
                    printCustomers.run();
                    break;
                case 5:
                    BuyProduct buyProduct = new BuyProduct();
                    buyProduct.run(id);
                    break;
                case 6:
                    PrintMoney printMoney = new PrintMoney();
                    printMoney.run();
                    break;
                case 7:
                    AddMoney addMoney= new AddMoney();
                    addMoney.run(id);
                    break;
                case 8:
                    CustomersRating customersRating= new CustomersRating();
                    customersRating.run();
                    break;
                case 9:
                    ProductsRating productsRating= new ProductsRating();
                    productsRating.run();
                    break;
                case 10:
                    ChangeUser changeUser= new ChangeUser();
                    changeUser.run(id);
                    break;
                case 11:
                    ChangeProduct changeProduct= new ChangeProduct();
                    changeProduct.run();
                    break;
                case 12:
                    Log_in = new Log_In();
                    id = Log_in.run();
                default:
                    break;

            }
        }while(repeat);
        System.out.println("До свидания!");
    }
}
