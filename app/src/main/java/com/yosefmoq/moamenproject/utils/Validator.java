package com.yosefmoq.moamenproject.utils;

public class Validator {
        public static boolean isEmailValid(String email){
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                return email.length() > 10 && email.contains("@") && email.contains(".") && email.matches(emailPattern);
        }

        public static boolean isValidUsername(String name){
                return name.length()>6;
        }
        public static boolean isValidPassword(String password){
                return password.length()>6;
        }
        public static boolean isValidConfirmPassword(String password,String confirmPassword){
                return password.equals(confirmPassword);
        };
}
