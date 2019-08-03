import javafx.stage.StageStyle;

public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        String msg = "hello";

        System.out.println(msg + num1);

        if (num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("num1 < num2");
        }
        if (num1 == 10) {
            System.out.println("num1 == 10");
        } 
        if (num2 != 10) {
            System.out.println("num2 != 10");
        }
        String text1 = "text";
        String text2 = "text";
        
        if (text1.equals(text2)) {
            System.out.println(text1 ==text2);
        }
    }

}