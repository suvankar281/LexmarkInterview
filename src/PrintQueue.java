public class PrintQueue {
private Node head;
  public PrintQueue(Document doc) {
    Node nodeToAdd
        = new Node();
    nodeToAdd.setData(doc);
    nodeToAdd.setNode(null);

    if (this.head == null) {
      this.head = nodeToAdd;
    }
    Node temp = this.head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
  }
public  void push(Document doc) {


    Node newNode = new Node();
    newNode.setData(doc);
    newNode.setNode(null);

    if (this.head == null) {
      head = newNode;
    } else {
      Node temp = this.head;
      while (temp.getNext() != null) {
        temp = temp.getNext();

      }
      temp.setNode(newNode);

    }
  }
    public Document  pop() {
      if (this.head == null) {
        return null;
      } else {
        this.head = this.head.getNext();
        return this.head.getData();
      }
    }
      public void  displayContents(){
  Node temp=this.head;
       while(temp.getNext()!=null)
       {
     System.out.println(temp.getData().getName());
         System.out.println(temp.getData().gettype());
       temp=temp.getNext();
       }
        System.out.println(temp.getData().getName());
        System.out.println(temp.getData().gettype());
      }



public static void main(String args[]){
  PrintQueue printQueue=new PrintQueue(new WordDocument("newDoc"));
  printQueue.push(new PdfDocument("pdf"));
printQueue.displayContents();
System.out.println(printQueue.pop());
  printQueue.displayContents();

  }


}
