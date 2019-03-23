public class Ring extends Circle {
  private int inRadius;

  Ring(Point pt, int exr, int inr){
  	super(pt, exr);
    inRadius = inr;

  	if (inr > exr) {
    	throw new ExceptionInInitializerError("Le rayon interne ne peut être plus grand que le rayon du Ring !");
    }
  }

  public boolean contains(Point pt) {
    return super.contains(pt) && ! (new Circle(getCenter(), inRadius)).contains(pt);
  }

	public static boolean contains(Point target, Ring... rings) {
		var isContained = false;
		for (Ring ring: rings) {
			isContained = isContained || ring.contains(target);
		}
		return isContained;
	}

	@Override public String toString(){
		return super.toString() + " et de rayon interne " + inRadius;
	}
}