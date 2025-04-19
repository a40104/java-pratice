// 학점 계산기 프로그램
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("과목은 몇 개 입니까? : ");
        int 과목수 = scanner.nextInt();
        scanner.nextLine();

        // 총 학점과 총 점수를 저장할 변수
        int 총학점 = 0;
        double 총점수 = 0.0;

        // 과목 수만큼 반복하면서 입력
        for (int i = 1; i <= 과목수; i++) {
            System.out.println(i + "번째 과목 입력하기");

            // 과목 이름 입력
            System.out.print("과목이름 : ");
            String 과목이름 = scanner.nextLine();

            // 과목 학점 입력
            System.out.print("학점 (숫자로 입력): ");
            int 학점 = scanner.nextInt();
            scanner.nextLine();

            // 성적 입력
            System.out.print("성적 (A, B, C, D, F) 중 입력: ");
            String 성적 = scanner.nextLine();

            // 성적을 점수로 바꾸기
            double 점수 = 0.0;
            if (성적.equals("A")) {
                점수 = 4.0;
            } else if (성적.equals("B")) {
                점수 = 3.0;
            } else if (성적.equals("C")) {
                점수 = 2.0;
            } else if (성적.equals("D")) {
                점수 = 1.0;
            } else if (성적.equals("F")) {
                점수 = 0.0;
            } else {
                System.out.println("성적을 잘못 입력해서 0점 처리입니다.");
                점수 = 0.0;
            }

            // 총 학점과 총 점수 누적하기
            총학점 += 학점;
            총점수 += (점수 * 학점);
        }

        // 평점 계산 (총점수 ÷ 총학점)
        double 평점 = 총점수 / 총학점;

        // 결과 출력
        System.out.println("-------------------------");
        System.out.printf("당신의 평점(GPA)은 " + 평점 + " 입니다.");
        System.out.println("-------------------------");
    }
}


