package org.example;
import java.util.*;
import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static int add(int a,int b)
    {
        int res = a+b;
        return res;
    }
    public static int sub(int a,int b)
    {
        int res = a-b;
        return res;
    }
    public static int mul(int a,int b)
    {
        int res = a*b;
        return res;
    }
    public static int div(int a,int b)
    {
        int res = a/b;
        return res;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Calculator...");
        System.out.println("Choose your operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int type = myObj.nextInt();
        System.out.println("Enter the 1st operand");
        int a = myObj.nextInt();
        System.out.println("Enter the 2nd operand");
        int b = myObj.nextInt();
        int res = 0;
        if(type == 1)
        {
            res = add(a,b);
        }    
        if(type == 2)
        {
            res = sub(a,b);
        }
        if(type == 3)
        {
            res = mul(a,b);
        }
        if(type == 4)
        {
            res = div(a,b);
        }
        System.out.println("result = " + res);
    }
}