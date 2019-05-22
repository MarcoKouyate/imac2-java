package fr.umlv.data;


class Link <T> {
	
	Link<T> next;
	T value;
	
	public Link(T value, Link<T> next) {
		this.value = value;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
