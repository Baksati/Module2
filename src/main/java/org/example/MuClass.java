package org.example;

public class MuClass
{
    private  Long id;
    private String name;

    public MuClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals is called:" + this + " : " + obj);
        MuClass other = (MuClass)obj;
        return id.equals(other.id) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode is called:" + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "MuClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
