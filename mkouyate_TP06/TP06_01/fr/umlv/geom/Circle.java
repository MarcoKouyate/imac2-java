
import java.util.*;

public class Circle extends Point {
	final private Point center;
	final private int rayon;

	public Circle (Point pt, int r){
		center = pt;
		rayon = r;
	}

     @Override public String toString(){
     	return "Cercle de centre " + center + " et de rayon " + rayon;
     }	
}