public class Element implements Sortable{
	private Element next;
	private Element prev;
	private static int valueGenerator = 0;
	private int value;

	public Element(){
		value = valueGenerator;
		valueGenerator++;
	}

	public int getValue(){
		return new Integer(value);
	}

	public Element getNext(){
		return next;
	}

	public void setNext(Element e){
		next = e;
	}

	public Element getPrev(){
		return prev;
	}

	public void setPrev(Element e){
		prev = e;
	}

