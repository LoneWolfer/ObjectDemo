package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Parent parent = new Parent();
        Child child = new Child(10001);
        System.out.println("parent的哈希码 = " + parent.hashCode());
        System.out.println("child的哈希码 = " + child.hashCode() + "\n");
        System.out.println("parent的文字描述 = " + parent.toString());
        System.out.println("child的文字描述 = " + child.toString() + "\n");
        System.out.println("parent所属的类 = " + parent.getClass().getName());
        System.out.println("child所属的类 = " + child.getClass().getName() + "\n");
    }
}

class Parent{

}

class Child extends Parent{
    int seriseNo;                       //序列号字段

    public Child(int seriseNo){       //构造方法
        this.seriseNo = seriseNo;
    }

    public int hashCode(){              //重写Object类的方法
        return seriseNo;
    }

    public String toString(){           //重写Object类的方法
        return "我的序列号是：" + seriseNo;
    }

}
