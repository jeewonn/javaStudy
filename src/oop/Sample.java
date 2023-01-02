package oop;

class Animal {
    // 객체 변수: 클래스에 선언한 변수 (인스턴스 변수, 멤버 변수, 속성)
    String name;

    public void setName(String name){
        // this: Animal 클래스에 의해서 생성된 객체를 지칭
        // setName 메서드 내부에 선언된 this는 cat 객체를 지칭한다.
        this.name = name;
    }

//    String getName() {
//        return this.name;
//    }
}

public class Sample {

    // 메소드
    // 매개변수: 메서드에 입력으로 전달되는 값을 받는 변수 (메서드에 전달되는 값을 저장하는 변수)
    int sum(int a, int b){ // a,b 가 매개 변수
        return a+b;
    }

    public static void main(String[] args){

        /*
        객체와 인스턴스

        객체 == 인스턴스

        인스턴스라는 말은 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를 관계위주로 설명할 때 사용된다

         */

        Animal cat = new Animal();

        // 객체 변수에 접근 하는 방법
        // 값이 할당 되어있지 않은 경우 = null
        System.out.println(cat.name);

        // 객체 변수에 값을 대입
        cat.setName("julia");
        System.out.println(cat.name);

        // 객체 변수는 공유되지 않는다.
        Animal dog = new Animal();
        dog.setName("rui");
        System.out.println(dog.name);


        // 자기 자신의 객체를 생성함. => 작성한 클래스를 단독으로 실행시켜 테스트 할때 주로 사용
        Sample sample = new Sample();
        int c = sample.sum(1,2); // 인수: 메서드를 호출할때 전달하는 입력 값 (1,2)
        System.out.println(c);





    }

}
