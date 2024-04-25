package tasks;

import java.util.List;

public class PrintFile {
    public void run(List<List<String>> ListName){
        int i = 1;
        for (List<String> row : ListName) {
            System.out.print(i+")");
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.print("$");
            System.out.println();
            i+=1;
        }
    }
}
