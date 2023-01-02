package oop;

// 인터페이스는 클래스처럼 단독파일로 저장하는것이 일반적인 방법
interface Predator{
    /*
     - 인터페이스에서 구현한 메서드는 implements한 클래스들이 구현 해야 한다.
     - 인터페이스는 규칙이다. 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다.
     - 인터페이스는 인터페이스의 메서드를 반드시 구현해야 하는 강제성을 지닌다.

     */

    String getFood();

    /*
    디폴트 메서드

    인터페이스의 메서드는 구현체(내부 로직)을 가질 수 없지만, 디폴츠 메서드를 사용하면
    실제 구현된 형태의 메서드를 가질 수 있다.

    앞에 default 라고 표기해야 한다.

    이렇게 디폴트 메서드로 선언하면
    Tiger 등의 실제 클래스는 printFood 메서드를 구현하지 않아도 사용가능 하다.
    오버라이딩도 가능하다.


     */
    default void printFood(){
        System.out.printf("my food is %s ", getFood());
    }



    int LEG_COUNT = 4;
    // 인터페이스에서도 스태틱 메서드가 사용 가능하다.
    static int speed(){
        return LEG_COUNT * 30;
    }
}

interface Barkable{
    void bark();
}

interface BarkablePredator extends Predator, Barkable{

}

// 인터페이스 구현
class Tiger extends Animal implements Predator, Barkable{

    // 인터페이스의 메서드는 항상 public 으로 구현해야 한다.
    public String getFood() {
        return "apple";
    } // 인터페이스의 메서드임으로 반드시 구현해야 하는 강제성을 띈다.

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator {
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("으르렁");
    }

}

class ZooKeeper{

    /*
    인터페이스 없이는 이렇게 작성했어야 함.

    void feed(Tiger tiger){
        System.out.println("feed apple");
    }

    void feed(Lion lion) {
        System.out.println("feed banana");
    }
     */


    // 인터페이스 적용 후
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());

        System.out.println(Predator.speed());
    }

}

class Bouncer{

    /*
    void barkAnimal(Animal animal){
        if (animal instanceof Tiger){
            System.out.println("어흥");
        } else if(animal instanceof Lion){
            System.out.println("으르렁");
        }
    }

    => 인터페이스
     */


    void barkAnimal(Barkable animal){
        animal.bark();
    }

}


public class Interface {

    // zooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 되었음.

    public static void main(String[] args){
        ZooKeeper zooKeeper = new ZooKeeper();

        // Tiger 클래스의 객체, Predator 인터페이스의 객체
        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        // Lion 클래스의 객체, Predator 인터페이스의 객체
        Lion lion = new Lion();
        zooKeeper.feed(lion);


        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        /*
        다형성: 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것

        tiger,lion 객체는
        각각 Tiger,Lion 클래스의 객체이면서
        Animal 클래스의 객쳉기도 하고
        Barkable, Predator 인터페이스의 객체이기도 하다

        이러한 이유로 barkAnimal 메서드의 입력 자료형을 Animal에서 Barkable 로 바꾸어서 사용할 수 있음.
        Barkable 인터페이스는 Tiger 이라는 class에 implement 되었으니깐
         */

        // 따라서 Tiger 클래스의 객체는 여러가지 자료형으로 표현이 가능하다.

        Tiger tiger1 = new Tiger();
        Animal animal1 = new Tiger();
        Predator predator = new Tiger();
        Barkable barkable = new Tiger();


        predator.getFood(); // Barkable 의 메서드인 bark는 사용이 불가능

        tiger1.bark();

        //
        BarkablePredator barkablePredator = new Lion();
        Barkable barkable1 = new Lion();

    }
}
