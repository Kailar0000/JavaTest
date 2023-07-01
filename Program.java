
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("Toys.txt");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Toy toy1 = new Toy(0, 10, "Кукла", 25);
        Toy toy2 = new Toy(1, 15, "Машинка", 40);
        Toy toy3 = new Toy(2, 13, "Робот", 3);
        Toy toy4 = new Toy(4, 8, "Матрёшка", 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }
    
    
}