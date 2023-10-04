package com.nootalp.simplelens;

public class SystemInfo implements Contract {

    @Override
    public String getJavaVersion() {
        return System.getProperty("java.version");
    }
    
    @Override
    public String getJavaFXVersion() {
        return System.getProperty("javafx.version");
    }

}