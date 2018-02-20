public class WordDocument extends Document {

  public WordDocument(String subject){
    super(subject);
  }

  @Override
  public String gettype() {
    return "word";
  }
}
