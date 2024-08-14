/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import view.Login;

/**
 *
 * @author
 */
public class Test {

    public static void main(String[] args) {
        String password = "admin";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        System.out.println("BCrypt hash: " + hash);
        boolean valuate = BCrypt.checkpw(password, "$2a$12$2sUzkhN9y/GV8URHOR1oaOySH0S7Dgkg.491EZHksECEqsA8WyHRK");
        System.out.println(valuate);
        SendEmailSMTP.sendOTP("6351070134@st.utc2.edu.vn","12345");
        new Login();
    }
}
