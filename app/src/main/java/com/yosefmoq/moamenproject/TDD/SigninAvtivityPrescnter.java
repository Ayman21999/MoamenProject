package com.yosefmoq.moamenproject.TDD;

import com.yosefmoq.moamenproject.utils.Validator;

public class SigninAvtivityPrescnter implements SigninActivityPresnterInterfac {


    private SigninActivityViewPresnterInterfac view;

    public SigninAvtivityPrescnter(SigninActivityViewPresnterInterfac signinActivityViewPresnterInterfac) {
        this.view = signinActivityViewPresnterInterfac;
    }


    @Override
    public boolean IsVaildEmail(String email) {
        String  emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            if (email.length()>10 && email.contains("@") && email.contains(".") && email.matches(emailPattern)){
                return true;
            }
        return false;
    }

    @Override
    public boolean IsVaildPassword(String password) {
        if (Validator.isEmailValid(password) == true) {
            System.out.println("True password");
            return true;
        }else {
            System.out.println("password Error");
            return false;
        }
    }

    @Override
    public void Login(String email, String password) {
    String useremail = "" ;
    String userpassword  = "";

    if (email.equals(useremail) && password.equals(userpassword)){
        System.out.println("Succsecfull Login ");
    }else {
        System.out.println("wrong  email or password");
    }
    }
}
