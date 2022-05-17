package com.maxdadude.studentorder;

import com.maxdadude.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so1 = new StudentOrder();
        so1.sethFirstName("Алексей");
        so1.sethLastName("Петров");
        so1.setwFirstName("Дарья");
        so1.setwLastName("Петрова");

        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder 1: " + studentOrder.gethFirstName() + " " + studentOrder.gethLastName());
        return answer;
    }

}
