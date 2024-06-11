public class StringExmaple {
  public static void main(String[] args) {
    
    String str = "hello everyone...";

    String word[] = str.split("\\s");

    String res = "";
    for(String words : word) {

      String first = words.substring(0,1);
      String rema = words.substring(1);
      res  +=first.toUpperCase()+rema+" ";
    }
    System.out.println(res);

  }
  
}
