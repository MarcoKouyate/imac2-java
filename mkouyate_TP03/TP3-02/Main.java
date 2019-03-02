import java.util.ArrayList;

public class Main {
     public static void main(String[] args){
       var aBook = new Book(null, null);
       var anotherBook = new Book(null, null);
       var list = new ArrayList<Book>();
       list.add(aBook);
       System.out.println(list.indexOf(anotherBook));
     }
}