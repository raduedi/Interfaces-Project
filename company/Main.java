package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone radusPhone;  // we assigned the instance of ITelephone type so we can use it with the both classes later
        radusPhone = new DeskPhone(1223456789);

        radusPhone.powerOn();
        radusPhone.callPhone(1223456789);
        radusPhone.answer();

        System.out.println("***********************");

        radusPhone = new MobilePhone(22334455);
        radusPhone.callPhone(22334455);
        radusPhone.powerOn();
        radusPhone.callPhone(22334455);
        radusPhone.isRinging();
        radusPhone.answer();
    }
}
