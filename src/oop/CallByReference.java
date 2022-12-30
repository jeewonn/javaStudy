package oop;

class Updater {
    void update(int count) {
        count++;
        System.out.println(count);
    }

    void update1(Counter counter){
        counter.count++;
    }
}

class Counter {
    int count = 0;  // 객체변수
}

public class CallByReference {
    public static void main(String[] args) {
        Updater myUpdater = new Updater();

        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);

        myUpdater.update(myCounter.count);
        System.out.println("after update:"+myCounter.count); // 값:0 => update 메서드는 primitive 값을 전달 받았기 때문에
        /*
        메서드의 입력항목이 값인지 객체인지를 구별하는 기준은 입력항목의 자료형이 primitve 자료형인지 아닌지에 따라 나뉜다.
        int 자료형과 같은 primitve 자료형인 경우 값이 전달되고 그 이외의 경우에는 객체가 전달된다.
         */


        Counter myCounter1 = new Counter();
        myUpdater.update1(myCounter1);
        System.out.println("after update1: "+ myCounter1.count);

        /*
        메서드의 입력으로 객체를 전달 받는 경우,
        메서드가 입력받은 객체를 그대로 사용하기 때문에
        메서드가 객체의 속성값을 변경하면 메서드 수행후에도 객체의 변경된 속성값이 유지된다.

         */
    }
}