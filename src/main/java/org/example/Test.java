package org.example;
// Объекты можно передавать методам.
public class Test {
    int a, b;


    int meth(int i, int j){
        this.a = a;
        this.b = b;
        return a + b;
    }



    // Возвратить true, если объект o равен вызывающему объекту.
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
