/*
Тестовый класс для операций
*/
package com.company.TestClasses;

public class TestClass implements TestInterface{
    private Integer numberField;
    private String stringField = "test string value";
    public String pubStrField = "This is public field";

    public TestClass() {
    }

    private TestClass(Integer numberField, String stringField, String pubStrField) {
        this.numberField = numberField;
        this.stringField = stringField;
        this.pubStrField = pubStrField;
    }

    public void interfaceMethod(){
        System.out.println("realization of interface method");
    }

    private void privMeth(){
        System.out.println("This is private method of TestClass");
    }

    public void pubMethod(){
        System.out.println("This is public method");
    }

    private void privMethParam(String s){
        System.out.println("This is private method with 1 parameter");
        System.out.println("Parameter is: " + s);
    }

    private void privMethParam(String s, Integer i, Character c){
        System.out.println("This is private method with 3 parameters");
        System.out.println("Parameter 1 is: " + s);
        System.out.println("Parameter 2 is: " + i);
        System.out.println("Parameter 3 is: " + c);
    }
}
