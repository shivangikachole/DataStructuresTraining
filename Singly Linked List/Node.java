/**
 * 
 */

/**
 * @author Shubham
 *
 */
public class Node {
    private int data;
    private Node ptr;
      
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPtr() {
		return ptr;
	}
	public void setPtr(Node ptr) {
		this.ptr = ptr;
	}
	public Node(int data, Node ptr) {
		super();
		this.data = data;
		this.ptr = ptr;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", ptr=" + ptr + "]";
	}
	public Node() {
		super();
		data = 0;
		ptr = null;
		// TODO Auto-generated constructor stub
	}
    
	public Node getNext() {
		return this.ptr;
	}
          
}
