package oop;

class Dog extends Animal{
    // Sample 에 있는 Animal 상속 받았음.
    void sleep(){
        System.out.println(this.name + " zzz");
    }

    // 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 더 많은 기능을 갖도록 작성한다.
}

class HouseDog extends Dog{

    @Override
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

//    void sleep(){
//        /*
//        - 메서드 오버라이딩 (method overriding)
//
//        Dog 클래스와 동일한 형태의 sleep 메서드를 구현하면
//        HouseDog 클래스의 sleep 메서드가 Dog 클래스의 sleep 메서드보다 더 높은 우선순위를 갖게 됨.
//        => HouseDog 의 sleep() 메서드가 실행 됨.
//
//         */
//        System.out.println(this.name + " zzz in house");
//    }


    void sleep(int hour){
        /*
        - 메서드 오버로딩 (method overloading)
        이미 HouseDog 안에 sleep 이라는 메서드가 있지만, 동일한 이름을 또 생성이 가능하다.
        단, 메서드의 매개변수값이 다를 경우만 가능하다.

        입력항목이 다른 경우 동일한 이름의 메서드를 만들 수 있다.
         */
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }

    // 생성자
    HouseDog(String name){
        /*
        생성자

        생성자의 규칙
        1. 클래스명과 메서드 명이 동일하다
        2. 리턴타입을 정의하지 않는다.

        생성자는 객체가 생성될때 호출된다.
        즉, 생성자는 new 키워드가 사용될때 호출된다.

        생서자가 선언된 class의 경우 인스턴스화 시킬때 생성자의 규칙대로만 객체를 생성할 수 있다.
         */

        this.setName(name);
    }

    // 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
    HouseDog(int type){
        if (type == 1){
            this.setName("one");
        }else if(type ==2){
            this.setName("two");
        }
    }

}

public class Inheritance {
    public static void main(String[] args){
        Dog dog = new Dog();

        // 상속관계에 있을 경우 자식 클래스의 객체는 부모 클래스의 자료형인것처럼 사용 할 수있다.
        Animal dog1 = new Dog(); // Dog is a Animal

        // 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로는 사용이 불가능.
//        Dog dog = new Animal(); // 부모 클래스 (Animal is a Dog)

        dog.setName("chorong");
        System.out.println(dog.name);
        dog.sleep();

        HouseDog houseDog = new HouseDog("yeppi");
//        houseDog.setName("yeppi");
        houseDog.sleep();
        houseDog.sleep(3);

        HouseDog houseDog2 = new HouseDog(1);
        System.out.println(houseDog2.name);
    }
}
