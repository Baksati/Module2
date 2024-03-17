package org.example;
// Один интерфейс может расширять другой.
public interface AB {
    void meth1();
    void meth2();
}

// Интрефейс BA теперь включает meth1() и meth2() - он добовляет meth3().
interface BA extends AB {
    void meth3();
}
