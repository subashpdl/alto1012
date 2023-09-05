import static java.lang.System.out;

class Stack {
	private static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node top;
	private int count;
	
	public Stack() {
		top = null;
		count = 0;
	}
	
	public void push(Node n) {
		if(n != null) {
			n.setNext(top);
			top = n;
			count++;
		}
	}
	
	public Node peek() {
		return top;
	}
	
	public Node pop() {
		Node k = top;
		if(top != null) {
			top = top.getNext();
			count--;
		}
		return k;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		
		for(int i = 0; i < 50; i++) {
			stack.push(new Node(i));
		}
		
		out.println("Count: " + stack.getCount());
		
		Node k;
		while((k = stack.pop()) != null) {
			out.println(k.getData() + " ");
		}
	}
}
