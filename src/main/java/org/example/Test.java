package org.example;
// Объекты можно передавать методам.
public class Test {
    int a, b;
    Test (int i, int j) {
        a = i;
        b = j;
    }
    // Возвратить true, если объект o равен вызывающему объекту.
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
