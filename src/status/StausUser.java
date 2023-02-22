/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author Jordan
 */
public class StausUser {
    public enum UserStatus {
        ZERO("REJECTED"),
        ONE("PENDING"),
        TWO("PROCESSING"),
        THREE("APPROVED");

        private final String statusDetail;

        UserStatus(String statusDetail) {
            this.statusDetail = statusDetail;
        }

        public String getStatusDetail() {
            return statusDetail;
        }
    }

    public void statusDetail(UserStatus code) {
        System.out.println(code.getStatusDetail());
    }
}
