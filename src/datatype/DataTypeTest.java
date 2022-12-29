package datatype;

import java.util.*;

public class DataTypeTest {

    // 평균점수 구하기
    static int getAverage(){
        int korean = 80;
        int english = 75;
        int math = 55;

        int result = (korean + english + math) / 3;
        System.out.println(result);
        return result;
    }

    static boolean findOddNumber(int num){
        return num % 2 == 1;
    }

    static void splitString(String num) {
        String result1 = num.substring(0, 6);
        String result2 = num.substring(7, 14);
        System.out.println(result1);
        System.out.println(result2);
    }

    static void getSex(String nnn){
        char sex = nnn.charAt(7);
        System.out.println(sex);
    }

    static void changeChar(){
        String a = "a:b:c:d";
        a = a.replaceAll(":", "#");
        System.out.println(a);
    }

    static void reverseOrder(){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
//        HashSet<Integer> result = new HashSet<>(myList); // 기본 정렬

//        myList.sort(Comparator.naturalOrder());
//        ArrayList<Integer> a = myList;
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

    }

    static void convertListToString(){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
    }

    static void getValueFromMap(){
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int result = grade.get("B");
        String result1 = grade.get("B").toString();
        System.out.println(result);
        System.out.println(result1);

        // 앞에서 형변환을 하는 경우는 언제인지?
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");

        String one = (String) pitches.get(0);
        String two = pitches.get(1).toString();
        System.out.println(one);
        System.out.println(two);

    }

    static void removeSameNum(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));

        HashSet<Integer> result = new HashSet<>(numbers);
        System.out.println(result);
    }

    enum CoffeeType{
        AMERICANO(3500),
        ICE_AMERICANO(4000),
        CAFE_LATTE(5000);

        int price;

        CoffeeType(int price){
            this.price = price;
        }

        public int getPrice(){
            return this.price;
        }
    }

    static void printCoffeePrice(CoffeeType type) {
        // 위 코드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        int count1;
        priceMap.put(CoffeeType.AMERICANO, CoffeeType.AMERICANO.getPrice());  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, CoffeeType.ICE_AMERICANO.getPrice());  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, CoffeeType.CAFE_LATTE.getPrice());  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));

    }




    public static void main(String[] args){
        getAverage();
        System.out.println(findOddNumber(13));
        splitString("881120-1068234");
        getSex("881120-1068234");
        changeChar();
        reverseOrder();
        convertListToString();
        getValueFromMap();
        removeSameNum();
        printCoffeePrice(CoffeeType.AMERICANO);
    }

}
