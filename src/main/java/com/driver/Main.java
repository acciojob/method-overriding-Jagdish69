package com.driver;

class A {
    public static String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

    public static void main(String[] args) {
        B obj=new B();
        obj.meth();
        obj.meth();
    }
    public static String meth(){
        return  "Method is overridden in Extendend class B";
    }
}