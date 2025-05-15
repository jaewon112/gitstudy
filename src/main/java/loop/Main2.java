package loop;

import java.util.List;

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }



    public int getScore() {
        return score;
    }



    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
public class Main2 {
    // 학생 리스트에서 점수가 85점 이상인 한생의 이름을 출력
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("김재원",80),
                new Student("김재투",94),
                new Student("김재쓰리",75),
                new Student("김재포",99),
                new Student("김재파이브",85)
        );
        for (Student student : students) {

            if (student.getScore() >= 85) {
                System.out.println(student.getName());
            }
        }
    }
}
