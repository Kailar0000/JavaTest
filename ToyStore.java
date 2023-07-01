
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }
    
    
    public Toy getToyForPrice() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        text = text + "\n";
        try( OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("Toys.txt", true), 
                Charset.forName("UTF-8").newEncoder()
            ))
        { 
            writer.write(text);
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        if (toy.end_toy() == false){
            toys.remove(toy);
        }
        
    }
}