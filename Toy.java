
public class Toy{
    int id;
    int num;
    String name;
    double weight;

    public  Toy(int id, int num, String name, double weight){
        this.id = id;
        this.num = num;
        this.name = name;
        this.weight = weight;
    }

    public void set_weight(double new_weight){
        if (this.weight + new_weight > 1){
            this.weight = this.weight + new_weight;
        }
        else{
            this.weight = 1;
        }

    }

    public Boolean end_toy(){
        if(num == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        this.num = this.num - 1;
        return "Toy [id=" + id + ", name=" + name + "]";
    }    
}