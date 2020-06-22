public class List {
	ListElement head;
	private int size;

	public List() {
		this.head = null;
		this.size = 0;
	}

	/*
	 * F�gt dem Ende der Liste ein neues Element hinzu.
	 */
	public void append(int value) {
		// Pr�ft ob Liste leer ist.
		if (this.head == null) {
			this.head = new ListElement(value);
			this.size += 1;
		} else {
			// Iteriert durch die Liste solange bis das letzte Element erreicht ist.
			ListElement iter = this.head;
			while (iter.next != null) {
				iter = iter.next;
			}

			// Setzt ein neues Element ganz hinten an die Liste.
			iter.next = new ListElement(value);
			this.size += 1;
		}
	}

	/*
	 * F�gt dem Anfang der Liste ein neues Element hinzu.
	 */
	public void prepend(int value) {
		// Pr�ft ob Liste leer ist.
		if (this.head == null) {
			this.head = new ListElement(value);
			this.size += 1;
		} else {
			// Setzt den Head der Liste zu newHead und l�sst newHead auf den alten Head
			// zeigen.
			ListElement newHead = new ListElement(value);
			newHead.next = this.head;
			this.head = newHead;
			this.size += 1;
		}
	}

	/*
	 * Entfernt das Element an Position n von der Liste.
	 */
	public void remove(int n) {
		// Wirft eine Exception sobald falsche Indexwerte eingegeben wurden.
		if (n < 0 || n >= this.size()) {
			throw new IndexOutOfBoundsException("Your index sucks!");
		}

		// Iteriert durch die Liste solange bis count < n-1.
		int count = 0;
		ListElement iter = this.head;
		while (count < n - 1) {
			count += 1;
			iter = iter.next;
		}

		// Setzt den Zeiger auf das �bern�chste Element sodass das Element an Stelle n
		// �bersprungen wird.
		iter.next = iter.next.next;
		this.size -= 1;
	}

	/*
	 * Gibt das Element an der Position n zur�ck.
	 */
	public int get(int n) {
		// Wirft eine Exception sobald falsche Indexwerte eingegeben wurden.
		if (n < 0 || n >= this.size()) {
			throw new IndexOutOfBoundsException("Your index sucks!");
		}

		// Iteriert durch die Liste solange bis count < n.
		int count = 0;
		ListElement iter = this.head;
		while (count < n) {
			count += 1;
			iter = iter.next;
		}

		return iter.getValue();
	}

	/*
	 * Gibt die L�nge der Liste zur�ck.
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Gibt einen String zur�ck der die Liste in menschen-lesbarer Form beinhaltet.
	 */
	public String toString() {
		String result = "";

		// Iteriert durch die Liste indem es iter immer wieder durch iter.next ersetzt.
		ListElement iter = this.head;
		while (iter != null) {
			result += iter.toString() + " ";
			iter = iter.next;
		}

		return result;
	}
}
