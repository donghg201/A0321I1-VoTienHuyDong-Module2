package bai19_StringAndRegex.bai_tap.ValidatePhoneNumber;

import bai19_StringAndRegex.thuc_hanh.ValidateEmail.EmailExample;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[]{"(84)-(0123456789)", "(00)-(0123456789)", "(84)-(0111111111)"};
    public static final String[] invalidPhoneNumber = new String[]{"(8)-(0123456789)", "(84-(0123456789)", "(84)(0123456789)"};

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
    }
}
