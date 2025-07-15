package com.mytests.spring.javaXml;


public class XmlOnlyBeanWithSingleConstructor {
    private final String firstConstructorArg;
    private final String secondConstructorArg;

    public XmlOnlyBeanWithSingleConstructor(String firstConstructorArg,
                                            String secondConstructorArg) {
        this.firstConstructorArg = firstConstructorArg;
        this.secondConstructorArg = secondConstructorArg;
    }

    @Override
    public String toString() {
        return "XmlOnlyBeanWithSingleConstructor{" +
               "firstConstructorArg='" + firstConstructorArg + '\'' +
               ", secondConstructorArg='" + secondConstructorArg + '\'' +
               '}';
    }
}
