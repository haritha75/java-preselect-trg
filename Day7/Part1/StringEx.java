public class StringEx {
  public static void main(String[] args) {
    
    String str = "hello everyone";

    String res = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 || str.charAt(i - 1) == ' ') {
        res += (char)(str.charAt(i)-32);
      } else {
        res += str.charAt(i);
      }
    }
    System.out.println(res);
  }
}
