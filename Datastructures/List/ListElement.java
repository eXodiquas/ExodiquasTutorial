public class ListElement {
	private int value;
	ListElement next;
	
	public ListElement(int v) {
		this.value = v;
		this.next = null;
	}
	
	/*
	 * Gibt den Wert des Elements zur�ck.
	 * */
	public int getValue() {
		return this.value;
	}
	
	/*
	 * Gibt den Wert des Elements als String zur�ck.
	 * */
	public String toString() {
		return this.value + "";
	}
}
