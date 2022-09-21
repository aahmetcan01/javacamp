public class theBiggestOne {
    public static void main(String[] args) {
        int num1=10,num2=15,num3=20;

        if (num1>num2&&num1>num3){
            System.out.println("The biggest number1");
        } else if (num2>num1&&num2>num3) {
            System.out.println("The biggest number2");
        }
        else {
            System.out.println("The biggest number3");
        }
    }
}