import java.util.LinkedList;

public class PdfDocument extends Document {
  public PdfDocument(String subject){
    super(subject);
  }

  @Override
  public String gettype() {
    LinkedList linkedList=new LinkedList();
    linkedList.add(500);
    linkedList.add(1,4);
    return "pdf";
  }

}
