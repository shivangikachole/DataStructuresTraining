/**
 * 
 */

/**
 * @author Shubham
 *
 */
public class LinkedList {
    private Node head;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	
	public void addAtHead(int value) {
		if(head == null)
			head = new Node(value,null);
		else {
			Node temp = new Node(value,head);
			head = temp;
		}
	}
	
	public void addAtEnd(int value) {
		if(head == null)
			head = new Node(value,null);
		else {
			Node n = new Node(value,null);
			Node temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setPtr(n);
		}
	}
	
	public void displayList() {
		if(head == null){
			System.out.println("The list is empty.");
		}
		else{
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
		}

	}

	public void addAtPos(int pos, int value){
		if(pos == 1){
			addAtHead(value);
		}
		else if(pos >= size()){
			addAtEnd(value);
		}
		else{
			Node node = head;
			for(int i = 1; i < pos - 1; i++){
				node = node.getNext();
			}
			Node newNode = new Node(value,node.getNext());
			node.setPtr(newNode);

		}
	}

	public void addMiddle(int value){
		int middle = size()/2;
		//Node node = head;
		//for(int i = 0; i < middle - 1; i++){
			//node = node.getNext();
		//}
		//Node newNode = new Node(value, node.getNext());
		//node.setPtr(newNode);
		addAtPos(middle + 1,value);
	}

	public int size(){
		int size = 0;
		Node current = head;
		while(current != null){
			size++;
			current = current.getNext();
		}
		return size;
	}
	
	public void deleteNode(int value) {
		if(head == null){
			System.out.println("SLL is empty");
			System.exit(0);
		}
		if( head.getData() == value) {
			head = head.getNext();
		}
		else {
			    Node prev = null;
				Node current = head;
				while(current!=null) {
					if(current.getNext().getData() == value) {
						prev = current;
						current = current.getNext();
						break;
					}
					current = current.getNext();
				}
				if(current == null && prev.getNext() == null)
					System.out.println("Node to be deleted not found !");
				else {
					prev.setPtr(current.getNext());
				}
		}
	}

	public void deleteHead(){
		if(head == null){
			System.out.println("SLL is empty, deletion cannot be performed");
		}
		else{
			head = head.getNext();
		}

	}

	public void deleteTail(){
		Node current = head;
		//Node tail = null;
		if(head == null){
			System.out.println("SLL is empty, deletion cannot be performed");
		}
		else if(head.getNext() == null){
			deleteHead();
			deleteHead();
		}
		else{
			while(current.getNext().getNext() != null){
				current = current.getNext();
			}
			current.setPtr(null);
		}
	}
	
	/**
	 * 
	 */
	public LinkedList() {
		head = null;
	}

}
