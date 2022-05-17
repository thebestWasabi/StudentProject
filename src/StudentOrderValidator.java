public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        while (true) {
            if (so == null) {
                break;
            } else {
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if (!cityAnswer.success) {
                    //continue;
                    break;
                }

                AnswerWedding wedAnswer = checkWedding(so);
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);

                sendMail(so);
            }
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";

        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";

        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);

        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wv = new WeddingValidator();
        return wv.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        MailSender ms = new MailSender();
        ms.sendMail(so);
    }

}
