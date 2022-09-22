public class ReCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {2.3,4.6,2.8,5.9};
      double sumOfNumber=0;
      double theBiggestOne=myList[0];

        for(double number:myList){
            System.out.println(number);

        }
        System.out.println("************************");
        for (double number:myList){
            sumOfNumber=sumOfNumber+number;
            System.out.println("sum: " +sumOfNumber);
        }
        System.out.println("************************");
        for (double number:myList){
            if (theBiggestOne<number){
                theBiggestOne=number;
            }
        }
        System.out.println("************************");
        System.out.println(theBiggestOne);
    }

}
