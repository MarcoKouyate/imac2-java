import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;


public class Basket {
  private ArrayList<Apple> apples = new ArrayList<Apple>();
  
  public void add(Apple a){
    apples.add(a);
  }

  public double getPrice(){
    return apples.stream().mapToDouble(apple -> apple.getPrice()).sum();
  }


  @Override 
  public String toString(){
    String list = apples.stream().map(Object::toString).collect(Collectors.joining("\n"));
    return list + "\n" + "price "+ getPrice();
  }
}