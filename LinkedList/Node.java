class Node{
  int data;
  Node next;

  

  public Node(int data, Node next){
    
    this.data= data;
    this.next = next;
    
  }
  public void append(int data){

    Node current = this;
    while (current.next != null){
      current = current.next;
    }
    current.next = new Node(data, null);
  }

  public void append(int data, Node n){

    Node current = this;
    while (current.next != null){
      current = current.next;
    }
    current.next = new Node(data, n);
  }

  public void showList(Node node){

    while (node.next != null){
      System.out.println(node.data);
      node = node.next;
    }
  }


  public boolean hasCycle(Node head){
    if (head == null) return false;
    Node fast = head.next;
    Node slow = head;

    while (fast != null && fast.next != null && slow != null){
      if (fast == slow){
        return true;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    return false;

  }
}
