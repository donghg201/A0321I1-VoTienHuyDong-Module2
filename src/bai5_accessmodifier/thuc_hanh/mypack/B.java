package bai5_accessmodifier.thuc_hanh.mypack;

import bai5_accessmodifier.thuc_hanh.pack.*;

class B {
    public static void main(String args[]) {

        A obj = new A();//Compile Time Error

        obj.msg();//Compile Time Error

    }
}
