package fr.umlv.data;

class Link {
	
	int value;
	Link next;
	
	public Link(int value, Link next) {
		this.value = value;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value);
	}
}
