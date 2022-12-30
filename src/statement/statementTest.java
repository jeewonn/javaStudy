package statement;

public class statementTest {
    
    
    static void ex2(){
        // 2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
        int num = 0;
        int result1 = 0;

        while(num <= 1000) {
            if (num%3 == 0){
                result1+=num;
            }
            num++;
        }

        System.out.println(result1);
    }

    static void ex3(){
        // 3. 별찍기
        int i = 1;
        while(i<=5){
            for(int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
            i++;
        }

    }

    static void ex4(){
        // 4. for문을 사용해 1부터 100까지의 숫자를 출력해 보자.
        for (int i=1; i<101; i++){
            System.out.println(i);
        }
    }

    static void ex5(){
        // 5. 평균점수 구하기: A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

        int result=0;
        int count=0;
        for (int mark:marks) {
            result+=mark;
            count++;
        }
        System.out.println("result: " + result);
        System.out.println("count: " + count);
        result = result/count;
        System.out.println(result);

    }



    public static void main(String[] args) {
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }
}
