public class Ring extends Circle {
  int inradius;

  Ring(Point pt, int exr, int inr){
    super(pt, exr);
    inradius = inr;
  }
}