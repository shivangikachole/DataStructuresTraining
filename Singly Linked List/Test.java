/**
 * 
 */

/**
 * @author Shubham
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addAtHead(10);
		l1.addAtHead(20);
		l1.addAtHead(30);
		l1.addAtHead(40);
		l1.addAtHead(50);
		l1.addAtHead(60);
		l1.displayList();
		System.out.println("\nAfter deletion of 10");
		l1.deleteNode(10);
		l1.displayList();
		System.out.println("\nAfter insertion at certain positions");
		l1.addAtPos(1,1);
		l1.addAtPos(2,100);
		l1.addAtPos(6,200);
		l1.addAtPos(8,400);
		l1.displayList();
		System.out.println("\nAfter insertion at middle positions");
		l1.addMiddle(150);
		l1.displayList();
		System.out.println("\nDelete head");
		l1.deleteHead();
		l1.displayList();
		System.out.println("\nDelete tail");
		l1.deleteTail();
		l1.displayList();
		System.out.println("\nnew list");
		l2.addAtHead(20);
		l2.displayList();
		System.out.println("\ndelete tail list");
		l2.deleteTail();
		l2.displayList();
	}

}
