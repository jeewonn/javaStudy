package datatype;

import java.util.*;

public class DataType {

    static void printString() {
//        String a = "hello";
//        String b = "java";
//        String c = "hello";
//
//        System.out.println(a.equals(b));

        String helloJava = "hello Java";

        // return 문자열이 시작되는 인덱스
        int result1;
        result1 = helloJava.indexOf("Java");

        // return 특정 문자열이 포함되어있는지의 여부
        boolean result2;
        result2 = helloJava.contains("Java");

        // return 특정 위치의 문자(char)을 리턴
        char result3;
        result3 = helloJava.charAt(2);

        // return 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할떄 사용
        String result4;
        result4 = helloJava.replaceAll("Java", "world");

        // return 문자열 중 특정 부분을 뽑아낼 경우에 사용 => 두번째 인자(끝위치)는 포함 안됨
        String result5;
        result5 = helloJava.substring(0, 4); // hell

        // return 모두 대문자로 바꿈
        String result6;
        result6 = helloJava.toUpperCase();

        String[] result7;
        result7 = helloJava.split(" ");
        System.out.println(result7);
        String result8 = result7[0];
        System.out.println(result7[0]+","+result7[1]);


        // %d => 숫자 입력
        String result9;
        result9 = String.format("I ate %d apples", 3);
        // %s => 문잔열 입력
        result9 = String.format("I ate %s apples", "three");

    }

    static void printStringBuffer(){
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(" java");

        String result1;
        result1 = sb1.toString(); // toString 메서드 이용해서 String 자료형으로 변경
        System.out.println(result1);

        // String 자료형은 immutable (값이 한번 생성되면 변경 할 수 없음) => trim 같은 String의 메서드를 사용할 경우 새로운 String 객체를 리턴함.
        // StringBuffer 자료형은 mutable 함.( 값 변경 가능), String 보다 무거움(String 보다 메모리 사용량도 많고 속도도 느림)
        // => 문자열 추가, 변경 등의 작업이 많을 경우 StringBuffer를 쓰고, 문자열 변경 작업이 거의 없을 경우 String 사용하는것이 유리

        // insert 특정 위치에 원하는 문자열을 삽입 할 수 있다.
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello Java");
        sb2.insert(0, "Hi, ");
        System.out.println(sb2);

        // subString => String 자료형의 substring 메서드와 동일하게 동작한다.
        // return String
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello Java33");
        sb3.append("ㅎㅎ");
        //result3 = sb.substring(0,4);

        System.out.println(sb3.substring(0,4));

    }

    static void printArr(){
        // 배열
        int[] odds = {1,3,5,7,9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 배열의 길이를 먼저 설정하여 배열 변수를 먼저 생성한 다음 그 값은 나중에 대입.
        // 초기값 없이 배열 변수를 만들때는 반드시 길이 대한 숫자값(2)가 필요
        String[] weeks1 = new String[2];
        weeks1[0] = "월";
        weeks1[1] = "화";


//        for (int i=0; i<weeks.length; i++){
//            System.out.println(weeks[i]);
//        }

    }

    static void printList(){
        // 리스트는 배열보다 편리한 기능을 제공함.

        /*
        리스트와 배열의 차이점
        - 배열은 크기가 정해져 있지만, 리스틑 크기가 정해져 있지 않고 동적으로 변함.

        => 동적으로 자료형의 갯수가 변하는 상황이라면 List 를 사용해야 함.

         */

        // add 리스트에 원하는 요소 더함 삽입
        ArrayList li1 = new ArrayList();
        li1.add("가");
        li1.add("나");
        li1.add("라");

        // 원하는 위치에 원하는 인자값 더하기
        li1.add(2, "다");

        System.out.println(li1);

        // getClass().getName() => 데이터 타입 확인
        System.out.println(li1.get(1).getClass().getName());
//        String result1 = li1.get(1);
        Object result1 = li1.get(1);
        String result2 = li1.get(1).toString();
        System.out.println(result1);
        System.out.println(result2);

        // return ArrayList 갯수
        int result3 = li1.size();
        System.out.println(result3);

        boolean result4 = li1.contains("가");
        System.out.println(result4);


        // remove -> 객체, 인덱스

        // 리스트에서 객체에 해당되는 항목을 삭제하고 그 결곽를 true,false 로 나타냄.
        li1.remove("가");
        System.out.println("1 : " + li1);

        li1.remove(0);
        System.out.println(li1);



        // 제네릭스(Generics)

        // 제네릭스를 사용하지 않은 경우 => ptiches 에 추가되는 객체가 모두 object 자료형으로 인식되어서, 값을 넣을때 문제는 없지만 값을 가져올때는
        // object 자료형에서 String 자료형으로 형변환(casting) 을 해야한다.
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");

        String one = (String) pitches.get(0);
        String two = pitches.get(1).toString();
        System.out.println(one);
        System.out.println(two);

        // 제네릭으로 사용하는 경우
        ArrayList<String> pitches2 = new ArrayList<>();
        pitches2.add("138");
        pitches2.add("129");

        String one2 = pitches2.get(0);  // 형 변환이 필요없다.
        String two2 = pitches2.get(1);  // 형 변환이 필요없다.

        ArrayList<String> li2 = new ArrayList<>();
        li2.add("1");
        li2.add("2");
        li2.add("3");

        System.out.println(li2);

        // asList 메서드를 사용하면 이미 존재하는 문자열을 배열로 ArrayList를 생성 할 수 있다.
        String[] data = {"138", "129", "142"};
        System.out.println(data);
        ArrayList<String> li3 = new ArrayList<>(Arrays.asList(data));
        System.out.println(li3);

        String result5 = String.join(",", li3);
        System.out.println("result5: " + result5); // 138,129,142

        li3.sort(Comparator.naturalOrder());
        System.out.println("정렬:" + li3);


        String[] arr = {"월", "화"}; // 배열
        List<String> list = Arrays.asList(arr);
        List<String> list2 = Arrays.asList("월","화");
        List<String> list3 = new ArrayList<>();
        List<String> list4;

        list4 = new ArrayList<>();
        list4 = new LinkedList<>();
        //ArrayList<String> list5 = new ArrayList<>();

        System.out.println(list2);
        System.out.println(list3);


    }

    static void printMap(){
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("가","가위");
        map1.put("나","나비");

        // get 을 이용해서 value 값을 얻어올 수 있다.
        String result1 = map1.get("가");
        System.out.println(result1);

        // 디폴트 값 얻고 싶을 경우
        String result2 = map1.getOrDefault("다", "없음");
        System.out.println(result2);

        // containsKey: 맵에 해당 키가 있는지? -> return true, false
        boolean result3 = map1.containsKey("다");
        System.out.println(result3);


        // remove: 맵의 항목을 삭제함. key 에 해당하는 아이쳄을 삭제 후 그 value를 리턴
        String result4 = map1.remove("나");
        System.out.println(result4);
        System.out.println(map1);

        // size(): map의 갯수를 리턴 (return int)
        int result5 = map1.size();
        System.out.println(result5);


        // keySet: 모든 key를 모아서 set 형태로 리턴한다.
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("people", "사람");
        map2.put("jee", "지원이");

        Set result6 = map2.keySet();
        System.out.println(result6);

//        LinkedHashMap: 입력된 순서대로 데이터를 저장, TreeMap: 입력된 key의 오름차순 순서로 데이터를 저장

    }

    static void printSet(){
        // HashSet: 중복을 허용하지 않음, 순서가 없음.
        HashSet<String> set1 = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set1);


        // set 은 중로 교집함, 합집합, 차집합을 구할때 사용
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3,4,6,7,8));

        System.out.println(s1);

        // 교집합
        HashSet<Integer> result1 = new HashSet<>(s1);
        result1.retainAll(s2); // 교집합 수행
        System.out.println(result1);

        // 합집합
        HashSet<Integer> result2 = new HashSet<>(s1);
        result2.addAll(s2);
        System.out.println("result2: "+ result2);

        // 차집합
        HashSet<Integer> result3 = new HashSet<>(s1);
        result3.removeAll(s2);
        System.out.println(result3);

        HashSet<Integer> result4 = new HashSet<>();
        result4.add(1);
        result4.add(2);
        result4.add(3);
        HashSet<Integer> result5 = result4;
        System.out.println("result5: " + result5);

        result4.addAll(Arrays.asList(4,5));

        result4.remove(1);
        System.out.println("결과물: " + result4);

    }

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    static void printEnum(){
        System.out.println(CoffeeType.AMERICANO);
    }

    static void changeDataType(){
        String num = "123";
        int result1 = Integer.parseInt(num);
        System.out.println(result1);

        int n = 12;
        String result2 = "" + n;
        String result3 = String.valueOf(n);
        String result4 = Integer.toString(n);

        System.out.println(result2.getClass().getName());
        System.out.println(result2);

        String num2 = "123.456";
        double d = Double.parseDouble(num2);

        int n1 = 123;
        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력


        // final : 재할당 불가능 (const 같은 존재)
        final int n3 = 123;

    }

    int make3 () {
        return 3;
    }


    public static void main(String[] args){
        printString();
        printStringBuffer();
        printArr();
        printList();
        printMap();
        printSet();
        changeDataType();
    }

}
