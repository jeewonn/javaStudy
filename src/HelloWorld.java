import datatype.DataType;
import datatype.DataTypeTest;

// public 이 붙으면 클래스명은 파일명과 같아야 함.
public class HelloWorld {

    // 클래스 내의 함수는 보통 함수라고 말 안하고 메서드라고 한다. 자바는 모두 클래스 기반이라 자바에서 사용되는 함수 모두 메서드임.
    public static void main(DataType[] args) {
        // static : 인스턴스 생성 없이 실행 할 수 있음.
        // void : 리턴값이 없음.
        System.out.println("Hello World");

//        StringTest stringTest = new StringTest();
//        stringTest.printString();
//        DataTypeTest.getAverage();
    }


    // 접근제어자
    static class Sample {
        // private : 변수, 메서드, 클래스에서 사용 가능 하며, 해당 클래서에서만 접근이 가능하다.
        // default: 해당 패키지 내에서만 접근이 가능하다. (아무것도 안썼을 경우)
        // protected: 동일 패키지의 클래스, 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능하다.
        // public: 어떤 클래스에서라도 접근이 가능하다. (다른 패키지에서도 접근 가능)

        private DataType secret;
        private DataType getSecret(){
            return this.secret;
        }

    }



}


