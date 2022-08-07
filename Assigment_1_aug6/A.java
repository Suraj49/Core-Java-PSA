package Assigment_1_aug6;
//// Unary operator : 1. Increment , 2. Decrement
////1. Increment : 1. post Increment (var++), 2. Pre Increment(++var)
////2. Decrement : 1. post Decrement (var--), 2. Pre Decrement(--var)
public class A {
    //increment
    //post increment
    public static void main(String[] args) {
        int i = 12;
        int j = i++; //post increment i++ when we see next i then increse the value by one
        System.out.println(i); // value incresed by 1: 12+1=13
        System.out.println(j); // but value of j =i++ it means j=12++ so j=12;
    }
}
