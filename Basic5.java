/* a program to add 2 binary strings */


import java.io.*;
public class Basic5 {

	static String add_Binary(String x, String y)
	{

		int num1 = Integer.parseInt(x, 2);
		
		int num2 = Integer.parseInt(y, 2);
		
		int sum = num1 + num2;
		
		String result = Integer.toBinaryString(sum); /* Converting that resultant decimal into binarystring */

		return result;
	}

	public static void main(String args[])
	{
		String x = "011011", y = "1010111";

		System.out.print(add_Binary(x, y));
	}
}

/* 2nd approach
   
 public class Basic5{
    public static String addBinary(String x, String y){
        int i = x.length()-1, j= y.length()- 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += x.charAt(i)-'0';
            }
            if(j>=0){
                sum+=y.charAt(j)-'0';
            }
            if(sum==0 || sum==1){
                result.append(sum);
                carry=0;
            }
            elseif (sum==2){
                result.append("0");
                carry=1;
            }
            else{
                result.append("0");
                carry=1;
            }
            i--;
            j--;
        }
        if (carry ==1){
            result.append("1");
        }
        return result.reverse().toString();
    }
    public  static void main(String[] args){
        String x = "011011";
        String y = "1010111";
        System.out.println(addBinary(x,y));
    }
}

 */
