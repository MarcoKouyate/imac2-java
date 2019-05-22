package fr.umlv.data;

public class LinkedLink {
	
	Link link;
	
	public LinkedLink (int value) {
		add(value);
	}
	
	public void add(int value) {
		link = new Link(value, link);
	}
	
	public int getIndex (int index) {
		Link current = link;
		for (int i= 0; i < index; i++) {
			current= current.next;
		}
		return current.value;
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
