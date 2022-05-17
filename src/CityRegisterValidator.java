public class CityRegisterValidator {

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("city проверяется");
        AnswerCityRegister asr = new AnswerCityRegister();
        asr.success = false;
        return asr;
    }
}
