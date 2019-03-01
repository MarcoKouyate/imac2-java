import java.util.ArrayList;

public class Main {
     public static void main(String[] args){
       var b1 = new Book("Da Java Code", "Duke Brown");
       var b2 = b1;
       var b3 = new Book("Da Java Code", "Duke Brown");

       var list = new ArrayList();
       list.add(b1);
       System.out.println(list.indexOf(b2));
       System.out.println(list.indexOf(b3));
     }
}