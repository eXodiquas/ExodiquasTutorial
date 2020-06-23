public class Stack {
	
	private List lst;
	
	public Stack() {
		this.lst = new List();
	}
	
	public void push(int value) {
		this.lst.prepend(value);
	}
	
	public int peek() {
		if(this.lst.size() == 0) {
			throw new EmptyStackException();
		}
		return this.lst.get(0);
	}
	
	public int pop() {
		if(this.lst.size() == 0) {
			throw new EmptyStackException();
		}
		int result = this.lst.get(0);
		this.lst.remove(0);
		return result;
	}
	
	public boolean isEmpty() {
		return this.lst.size() == 0;
	}
	
	public int size() {
		return this.lst.size();
	}
}
