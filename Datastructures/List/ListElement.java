public class ListElement {
	private int value;
	ListElement next;
	
	public ListElement(int v) {
		this.value = v;
		this.next = null;
	}
	
	/*
	 * Gibt den Wert des Elements zurück.
	 * */
	public int getValue() {
		return this.value;
	}
	
	/*
	 * Gibt den Wert des Elements als String zurück.
	 * */
	public String toString() {
		return this.value + "";
	}
}
