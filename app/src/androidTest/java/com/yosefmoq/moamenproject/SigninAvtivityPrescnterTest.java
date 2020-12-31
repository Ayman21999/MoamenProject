package com.yosefmoq.moamenproject;

import com.yosefmoq.moamenproject.TDD.SigninActivityViewPresnterInterfac;
import com.yosefmoq.moamenproject.TDD.SigninAvtivityPrescnter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class SigninAvtivityPrescnterTest {

    SigninAvtivityPrescnter prescnter;

    @Mock
    SigninActivityViewPresnterInterfac signinActivityViewPresnterInterfac ;



    @Before
    public void setup()throws Exception{
        prescnter = new SigninAvtivityPrescnter(signinActivityViewPresnterInterfac);
    }


    @Test
    public void test_isVaildEmail(){
        //given
        String email = "ayman@gmail.com";


        //when
        prescnter.IsVaildEmail(email);

        //Then
        Mockito.verify(signinActivityViewPresnterInterfac).setemail(email);
    }

}