public class CityRegisterValidator {

    String hostName;

    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("city проверяется " + hostName);
        AnswerCityRegister asr = new AnswerCityRegister();
        asr.success = false;
        return asr;
    }
}
