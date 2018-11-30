package com.kritter;

class Employee
{
    int salary=50000;
}

public class practice extends Employee
{
    void calc(int a , int b)
    {
        System.out.println("Sum from calc method:"+ String.valueOf(a+b));

    }
    void fibnoic( int a, int b)
    {
        System.out.print("Fibonnaci Series: "+a+" "+b+" ");
        int x=a, y=b;
        for(int i=0;i<10;i++)
        {
            int c = x + y;
            x = y;
            y = c;
            System.out.print(c + " ");
        }
    }
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int bonus=10000;
        System.out.println("Hello world by rajat...");

        practice p1=new practice();
        p1.calc(a,b);
        p1.fibnoic(a,b);
        System.out.println("\nEmployee salary from Inharitance: "+p1.salary);
        System.out.println("Bonus of Employee: "+ bonus);
    }
}
