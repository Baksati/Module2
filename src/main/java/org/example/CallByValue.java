package org.example;

public class CallByValue {
    public static void main(String[] args) {
        System.out.println(getTestMeth(2, 3).getClass());


        int a = 15, b = 20;
        System.out.println("a и b перед вызовом:"+a +""+b);
//        ob.meth(a,b);
        System.out.println("a и b после вызова:"+a +""+b);
    }

    public static Test getTestMeth(int a, int b) {
        Test test = new Test();
        test.meth(a , b);
        return test;
    }
}
