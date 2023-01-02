package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);


        Scanner sc = new Scanner(System.in);

        // 단어 하나를 읽어드린다.
        sc.next();
        // 단어, 숫자, 문자열등 다양하게 읽을 수 있음.


        /*
        InputStream - byte
        InputStreamReader - character
        BufferedReader - String

        Scanner 의 내장 메서드
        next - 단어
        nextLine - 라인
        nextInt - 정수

         */

        // 오류 매시지 출력할때 사용
        System.err.println();

    }
}
