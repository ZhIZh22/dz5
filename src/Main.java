public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Иванов Иван Иванович", 2, 92);
        Student mathStudent = new MathStudent("Петров Петр Петрович", 3, 85);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}