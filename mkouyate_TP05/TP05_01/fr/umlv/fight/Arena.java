package fr.umlv.fight;


public class Arena { 
	public static Robot fight(Robot rob1, Robot rob2) {
		boolean first = false;

		while(!rob1.isDead() && !rob2.isDead()){
			first = !first;
			if (first) {
				rob1.fire(rob2);
			}  else  {
				rob2.fire(rob1);
			}
		}

		return first ? rob1 : rob2;
	}
}