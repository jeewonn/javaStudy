package oop.Ex5;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    boolean isOdd(int val){
        if(val%2 == 0){
            return false;
        } else {
            return true;
        }
    }

    int avg(int[] val){
        int total = val.length;
        int sum = 0;
        for(int i: val){
            sum += i;
        }

        return sum/total;
    }

    int avg(ArrayList<Integer> val){
        int total = val.size();
        int sum = 0;
        for(int i: val){
            sum += i;
        }

        return sum/total;
    }


    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator{
    void add(int val){
        this.value += val;

        if (this.value >=100){
            this.value = 100;
        }
    }
}



public class OopTest {

    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력

        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println(cal1.getValue());

        MaxLimitCalculator cal2 = new MaxLimitCalculator();
        cal2.add(50);  // 50 더하기
        cal2.add(60);  // 60 더하기
        System.out.println(cal2.getValue());  // 100 출력

        Calculator cal3 = new Calculator();
        System.out.println(cal3.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal3.isOdd(4));  // 4는 짝수이므로 false 출력

        int[] data = {1, 3, 5, 7, 9};
        Calculator cal4 = new Calculator();
        int result = cal4.avg(data);
        System.out.println(result);  // 5 출력

        ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal5 = new Calculator();
        int result1 = cal5.avg(data1);
        System.out.println(result1);  // 5 출력

    }
}
