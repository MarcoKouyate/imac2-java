package fr.umlv.data;

public class LinkedLink<T> {
	
	Link<T> link;
	
	public LinkedLink (T value) {
		add(value);
	}
	
	public void add(T value) {
		link = new Link<T>(value, link);
	}
	
	public T getIndex (int index) {
		Link<T> current = link;
		for (int i= 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}
	
	@Override
	public String toString() {
		String str = "";
		Link<T> currentLink = link;
		
		while (currentLink.next != null) {
			str = str + currentLink + " ";
			currentLink = currentLink.next;
		}
		
		str = str + currentLink;
		return str;
	}
	
}
