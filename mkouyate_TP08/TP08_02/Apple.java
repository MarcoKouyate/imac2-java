import java.util.Objects;

public class Apple {
  private String type;
  private int quantity = 1;
  private int weight;

  public Apple (int w, String t){
    weight = w;
    type = t;
  }

  public double getPrice(){
    return weight/2;
  }

  @Override 
  public String toString(){
    return type + " " + weight +"g x " + quantity;
  }
}