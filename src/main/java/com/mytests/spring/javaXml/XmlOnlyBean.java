package com.mytests.spring.javaXml;


public class XmlOnlyBean {
    private final String firstConstructorArg;
    private String someProperty;


    public XmlOnlyBean(String firstConstructorArg) {
        this.firstConstructorArg = firstConstructorArg;
    }

    public XmlOnlyBean(int secondConstructorArg1, String secondConstructorArg2) {
        this.firstConstructorArg = secondConstructorArg2 + secondConstructorArg1;
    }

    public String getSomeProperty() {
        return someProperty;
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

    public String getFirstConstructorArg() {
        return firstConstructorArg;
    }

    @Override
    public String toString() {
        return "XmlOnlyBean{" +
               "firstConstructorArg='" + firstConstructorArg + '\'' +
               ", someProperty='" + someProperty + '\'' +
               '}';
    }
}
