public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Петров";
        so1.wFirstName = "Дарья";
        so1.wLastName = "Петрова";

        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder 1: " + studentOrder.hFirstName + " " + studentOrder.hLastName);
        return answer;
    }

}
