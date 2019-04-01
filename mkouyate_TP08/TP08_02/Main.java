public class Main {
       public static void main(String[] args) {
         var apple1 = new Apple(20, "Golden");
         var apple2 = new Apple(40, "Pink Lady");
    
         var basket = new Basket();
         basket.add(apple1);
         basket.add(apple2);
         System.out.println(basket);
       }
    }