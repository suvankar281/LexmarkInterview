public abstract class Document {

   String subject;
   String type;
public Document(){}

 public Document(String subject){
  this.subject=subject;
 };

   public String getName(){
     return subject;
   }

   public abstract String gettype();



}
