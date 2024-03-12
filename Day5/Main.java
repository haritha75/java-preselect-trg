public class Main {
  public static void main(String[] args) {
    LambdaExpress lbd = (num1, num2, operator) -> {
        if ("+".equals(operator)) {
            return num1 + num2;
        } else if ("-".equals(operator)) {
            return num1 - num2;
        } else if ("*".equals(operator)) {
            return num1 * num2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    };

    System.out.println(lbd.arthmeticOperation(2, 4, "+"));
    System.out.println(lbd.arthmeticOperation(2, 4, "-"));
    System.out.println(lbd.arthmeticOperation(2, 4, "*"));
 }
  
}
