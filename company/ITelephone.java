package com.company;

public interface ITelephone {  // in the interface we only define the methods that the class implements

    public void powerOn();
    public void dial(int phoneNumber);
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
    public void answer();
}
