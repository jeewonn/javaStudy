package seven;

class HouseLee{
    /*
    객체마다 객체변수 lastname을 저장하기 위한 메모리가 별도로 할당된다.
    HouseLee클래스의 lastname은 어떤 객체이던지 동일한 값인 "이"가 되어야 한다.
    이렇게 값이 항상 변하지 않는 경우 static을 사용하면 메모리의 이점을 얻을 수 있다.
     */

    String lastname = "이"; // 객체변수: 항상 독립적인 값을 갖고 있음

    // static 키워드를 사용하면 자바는 메모리 할당을 딱 한번만 하게 된다.
    static String lastname1 = "이"; // static 변수
}

class Counter  {
    int count = 0;
    static int count1 = 0;

    Counter() {
        this.count++;
        count1++;
        System.out.println("count:"+this.count); // 객체 변수에 접근할때만 this 사용
        System.out.println("count1:"+ count1); // static 변수이기때문에 this 사용 x
    }

    // 스태틱 메서드
    public static int getCount(){
        // 스태틱 메서드 안에서는 객체변수 접근이 불가능하다.
        return count1;
    }
}

public class StaticSample{

    public static void main(String[] args){
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();

        // c1, c2의 값은 모두 동일하게 1이 나온다 => count 라는 객체변수는 서로 다른 메모리르 가리키고 있기때문이다.
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출한다.

    }

}
