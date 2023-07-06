package studentScoreProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentScoreProgram {

    private static Scanner sc = new Scanner(System.in);
    private static final MemoryStudentRepo repo = new MemoryStudentRepo();

    public static void main(String[] args) {

        // 샘플 데이터 입력
        putSampleData();

        System.out.println("===============================================");
        System.out.println("                <학생 점수 프로그램>              ");
        System.out.println("===============================================");

        while (true) {

            System.out.println("* 메뉴를 선택하세요");
            System.out.println("1 : 학생 데이터 입력 / 2 : 전체 학생 점수 리스트 / 3 : 학생 검색(미완) / 4 : 학생 정보 수정(미완) / 0 : 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    System.out.println("== 학생 데이터 입력 ==");
                    inputStudentInfo();
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("== 전체 학생 점수 리스트 ==");
                    studentScoreList();   // 오류
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("학생 검색");
                    searchStudent();  // 작성 예정
                    break;
                case 4 :
                    System.out.println("학생 정보 수정");
                    updateStudentInfo();  // 작성 예정
                    break;
                case 0 :
                    System.out.println("프로그램 종료 : 수고염 Bye😉~");
                    return;
                default:
                    System.out.println("메뉴 선택 오류 : 다시 선택해~");
            }
        }
    }


    public static void putSampleData() {
        StudentInfo studentInfo1 = new StudentInfo("홍길동", 89, 79, 95);
        StudentInfo studentInfo2 = new StudentInfo("이순신", 85, 66, 93);
        StudentInfo studentInfo3 = new StudentInfo("강감찬", 91, 71, 87);

        repo.save(studentInfo1);
        repo.save(studentInfo2);
        repo.save(studentInfo3);
    }

    public static void studentScoreList() {
        List<StudentInfo> allStudent = repo.findAll();
        for (StudentInfo studentInfo : allStudent) {
            System.out.println("studentInfo = " + studentInfo);
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println();
    }

    public static void inputStudentInfo() {
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("국어 점수 : ");
        int korScore = sc.nextInt();

        System.out.print("영어 점수 : ");
        int engScore = sc.nextInt();

        System.out.print("수학 점수 : ");
        int mathScore = sc.nextInt();

        StudentInfo studentInfo = new StudentInfo(name, korScore, engScore, mathScore);
        repo.save(studentInfo);

        System.out.println();
        System.out.println("<학생 정보가 입력되었습니다!>");
        System.out.print("입력한 학생 정보 : ");
        System.out.println(studentInfo);

        System.out.println();
        System.out.println("===============================================");
        System.out.println();
    }

    public static void searchStudent() {
    }

    public static void updateStudentInfo() {
    }


}
