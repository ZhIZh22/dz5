class IUStudent extends Student {
    public IUStudent(String fullName, int course, int mark) {
        super(fullName, course, mark);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " с курса " + course + " направления ИУ сдаёт экзамен.");
    }
}