package Aufgabe1;


import htl.In;

public class Fibonacci{

  public static void main(String[] args){

    System.out.print("Geben Sie ein Zahl an: ");

    int a = In.readInt();

    System.out.println("fib("+a+") = " + fibonacci(a));

  }

  private static int fibonacci(int a){

    if (a==1||a==2) return 1;

    else return fibonacci(a-1)+fibonacci(a-2);

  }

}