package com.cestpasdur;


public enum FooBarQix {
    Foo("Foo",3),Bar("Bar",5), Qix("Qix",7);

    private final int value;
    private final String key;

    private FooBarQix(String key,int value) {
        this.key = key;
        this.value = value;
    }

    public String getStringValue() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
    
    
}
