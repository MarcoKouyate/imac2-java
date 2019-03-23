
public class Main {
     public static void main(String[] args){
	    var p = new Point(1, 2);
	    var c = new Circle(p, 1);
	    c.getCenter().translate(1,1);
	    System.out.println(c);
	    System.out.println(c.contains(p));
     }
}

