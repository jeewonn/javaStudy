package seven;

/*
RuntimeException: 실행시 발생하는 예외 (Unchecked Exception)
=> 발생할수도 안할수도 있는 경우에 작성
Exception은 컴파일시 발생하는 예외 (== Checked Exception)
=> 프로그램 작성시 예측가능한 예외를 작성

 */

class FoolException1 extends RuntimeException{

}

class FoolException2 extends Exception{
    // RuntimeException => Exeption으로 변경시 ExceptionSample 클래스에서 컴파일 오류가 발생.
    // 예측 가능한 Checked Exception 이기 떄문에
}

public class ExceptionSample {

    /*
    public void sayNick(String nick){
            try {
            if ("fool".equals(nick)) {
//            throw new FoolException1();
                throw new FoolException2();
            }
            System.out.println("당신은 멍청이 입니다!!!");
        }catch (FoolException2 e){
            System.out.println("에러 발생");
        }
    }
     */

    public void sayNick(String nick) throws FoolException2{
        if ("fool".equals(nick)) {
            throw new FoolException2();
        }
        System.out.println("당신은 멍청이 입니다!!!");
    }

    public static void main(String[] args){
        ExceptionSample sample1 = new ExceptionSample();
        try {
            sample1.sayNick("fool");
            sample1.sayNick("genious");
        } catch (FoolException2 e){
            System.out.println("error");
        }
    }
}
