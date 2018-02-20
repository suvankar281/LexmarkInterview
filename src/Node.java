public class Node {
private Document data;
private Node next;

public  void setData(Document data){
  this.data=data;
}

  public void setNode(Node next){
    this.next=next;
  }

  public Document getData(){return data;}



  public Node getNext(){return next;}
}