class MathStudent extends Student {
    public MathStudent(String fullName, int course, int mark) {
        super(fullName, course, mark);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " с курса " + course + " направления Математика сдаёт экзамен.");
    }
}