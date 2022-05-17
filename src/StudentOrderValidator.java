public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        if (so == null) {
            return;
        } else {
            AnswerCityRegister cityRegister = checkCityRegister(so);
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("city проверяется");
        AnswerCityRegister asr = new AnswerCityRegister();
        return asr;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("wedding проверяется");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("children проверяется");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("student проверяется");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {

    }

}
