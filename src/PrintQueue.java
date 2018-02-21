public class PrintQueue {
private Node head;

  public PrintQueue() {
  }

  public void PrintQueue(Document doc) {
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
  if (this.head==null){
    throw new NullPointerException();
  }

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






}
