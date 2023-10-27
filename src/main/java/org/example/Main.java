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
        logger.info("Start of Execution");
        while(true)
        {
        System.out.println("Choose your operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        int type = myObj.nextInt();
        if(type == 5) 
        {
            logger.info("End of Execution");   
            break;
        }
        System.out.println("Enter the 1st operand");
        int a = myObj.nextInt();
        System.out.println("Enter the 2nd operand");
        int b = myObj.nextInt();
        int res = 0;
        if(type == 1)
        {
            logger.info("Start OP: Addition");
            res = add(a,b);
            logger.info("End OP: Addition");
        }    
        if(type == 2)
        {
            logger.info("Start OP: Subtraction");
            res = sub(a,b);
            logger.info("End OP: Subtraction");
        }
        if(type == 3)
        {
            logger.info("Start OP: Multiplication");
            res = mul(a,b);
            logger.info("End OP: Multiplication");
        }
        if(type == 4)
        {
            logger.info("Start OP: Division");
            res = div(a,b);
            logger.info("End OP: Addition");
        }

        System.out.println("result = " + res);
    }
    }
}