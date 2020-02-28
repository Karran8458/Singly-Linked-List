public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        Node iNode = head;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node aNode = new Node(value);
        if(head == null) {
            head = aNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = aNode;
        }
    }
	public void printValues() 
    { 
        Node inode = head; 
        while (inode != null) 
        { 
            System.out.print(inode.value+" "); 
            inode = tnode.next; 
        } 
    }
	public Node remove() 
    { 
        if (this.head == null) {
           return null; 
        } 
           
        if (this.head.next == null) { 
            return null; 
        } 
  
        Node last = this.head; 
        while (last.next.next != null) 
		{
			last = last.next; 
		}
            

        last.next = null; 
    } 
	
}
