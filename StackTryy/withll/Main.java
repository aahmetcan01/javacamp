package StackTryy.withll;

public class Main {
    public static void main(String[] args) {
        StackLL stackLL=new StackLL();

        stackLL.push(5);
        stackLL.top();
        stackLL.push(6);
        stackLL.top();
        stackLL.pop();
        stackLL.top();
    }
}
