package com.driver;

public class Main {
    public static class Product
    {
        public int product(int x, int y)
        {
            int c=x*y;
            return c;
        }
        public int product(int x, int y,int z)
        {
            int c=x+y+z;
            return c;
        }
        public  double product(double x,double y)
        {
            double c=x+y;
            return c;
        }
    }
    public static void main(String args[])
    {
        Product p=new Product();
        System.out.println(
        p.product(10,2));
       System.out.println( p.product(10,5,3));
        System.out.println(p.product(123456.0,12345.0));


    }
}