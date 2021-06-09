class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Node secondNode = new Node(1, null);
    Node firstNode = new Node(1, null);
    
    firstNode.append(7);
    firstNode.append(8);
    firstNode.append(9);

    
    System.out.println(firstNode.hasCycle(firstNode));
    System.out.println(firstNode.next.data);
    firstNode.showList(firstNode);
   
  }
}
