public class ElementCollection{
	Element head;
	Element current;

	public Element getHead(){
		return head;
	}

	public Element get(boolean forward){
		if(current == null){
			current = head;
		} try {
			if (forward == true){
				current = current.getNext();
			} else {
				current = current.getPrev();
			}
			return current;
		} catch (NullPointerException e){
			throw new NoException();
		}
	}

	public void add(Element o){
		if(head == null){
			head = o;
		} else {
			Element temp = head;
			boolean found = false;
			while (temp.getNext() != null && !found){
				if (o.getValue() < temp.getValue()){
					temp.getPrev().setNext(o);
					o.setPrev(temp.getPrev());
					o.setNext(temp);
					temp.setPrev(o);
					found = true;
				} else {
					temp = temp.getNext();
				}
				if (temp == head){
					head = o;
				}
			}
		}
	}

	public int size(){
		int ctr = 0;
		Element temp = head;
		while(temp != null){
			ctr++;
			temp = temp.getNext();
		}
		return ctr;
	}
}
