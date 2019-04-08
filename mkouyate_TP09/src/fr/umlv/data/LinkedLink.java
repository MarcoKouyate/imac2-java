package fr.umlv.data;

public class LinkedLink {
	
	Link link;
	
	public LinkedLink (int value) {
		add(value);
	}
	
	public void add(int value) {
		link = new Link(value, link);
	}
	
	@Override
	public String toString() {
		String str = "";
		Link currentLink = link;
		
		while (currentLink.next != null) {
			str = str + currentLink + " ";
			currentLink = currentLink.next;
		}
		
		str = str + currentLink;
		return str;
	}
	
}
