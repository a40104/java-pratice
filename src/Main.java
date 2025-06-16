import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("2023001", "홍길동", "재학", "2001-05-10", "010-0000-0000");

        student2.addCourse("Java");
        student2.addCourse("Python");

       System.out.println("학생2의 정보");
       student2.printInfo();

       Professor professor = new Professor("P001","남교수","재직", "1160-05-11","010-0000-0000")
               professor.addLecture("Java");
               professor.addLecture("Application Security")

               System.out.println
    }
}
//    static String[][] students = new String[3][5];
//    static ArrayList<String>[] courseLists = new ArrayList[3];
//
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 3; i++)
//            courseLists[i] = new ArrayList<>();
//
//        setStudent(0, "20230001", "홍길동", "재학", "2001-05-10", "010-1234-5678");
//        setStudent(1, "20230002", "김영희", "휴학", "2000-03-22", "010-2345-6789");
//        setStudent(2, "20230003", "이철수", "재학", "2002-11-15", "010-3456-7890");
//
//
//        printAllStudents();
//    }
//
//    public static void setStudent(int index, String id, String name, String status, String birthDate, String contact) {
//        students[index][0] = id;
//        students[index][1] = name;
//        students[index][2] = status;
//        students[index][3] = birthDate;
//        students[index][4] = contact;
//    }
//
//    public static void addCourse(int studentIndex, String courseName) {
//        courseLists[studentIndex].add(courseName);
//    }
//
//    public static void printAllStudents() {
//        for (int i = 0; i < students.length; i++) {
//            printStudentInfo(i);
//            System.out.println();
//        }
//    }
//
//    public static void printStudentInfo(int index) {
//        System.out.println("====== 학생 " + (index + 1) + " 정보 ======");
//        System.out.println("ID: " + students[index][0]);
//        System.out.println("이름: " + students[index][1]);
//        System.out.println("상태: " + students[index][2]);
//        System.out.println("생년월일: " + students[index][3]);
//        System.out.println("연락처: " + students[index][4]);
//
//        System.out.println("<수강 교과목 목록>");
//        if (courseLists[index].isEmpty())
//            System.out.println("없음");
//         else
//            for (String course : courseLists[index])
//                System.out.println(course);}
//
//    }
