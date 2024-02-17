/* wap to swap two numbers */

import java.io.*;
public class Basic3 {
    public static void main(String[] args) {
        int temp;
        int a = 2;
        int b = 3;
        temp = a;
        a = b;
        b = temp;

        System.out.println(" the value of " + a + " " + b);
    }
}

/* another approach of swapping an element is to used and XOR to swap it  

import java.io.*;
public class Basic3{
    public static void main(String[ args]){
        int a , b;
        a = a ^ b; // here in between a and be we use the xor sign to calculte and put the value again to a
        b = a ^ b;
        a = a ^ b;
        System.out.println("the swapped value is " + a +" "+ b);
    }
}

*/