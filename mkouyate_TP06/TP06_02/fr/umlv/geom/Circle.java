
import java.util.*;
import java.text.DecimalFormat;

public class Circle {
	final private Point center;
	final private int rayon;
  DecimalFormat df = new DecimalFormat("0.00"); 

	public Circle (Point pt, int r){
		center = new Point(pt.getX(), pt.getY());
		rayon = r;
	}

    @Override public String toString(){
     	return "Cercle de centre " + center + ", de rayon " + rayon + " et de surface " + df.format(surface()) + " m²";
    }

  public void translate(int dx, int dy) {
    center.translate(dx,dy);  
  }

  public double surface(){
    return Math.PI * rayon * rayon;
  }

  public Point getCenter() {
    return new Point(center.getX(), center.getY());
  }  

  public boolean contains(Point target) {
      double distance = Math.hypot(center.getX() - target.getX(), center.getY() - target.getY());
      return rayon > distance;
  } 

  public static boolean contains(Point target, Circle... circles) {
    var isContained = false;
    for (Circle circle: circles) {
      isContained = isContained || circle.contains(target) ;
    }

    return isContained;
  }   
}