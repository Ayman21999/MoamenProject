package com.yosefmoq.moamenproject;

import com.yosefmoq.moamenproject.utils.PostValidateor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddPostTest {

    @Test
    public void test_post_not_null() {
        assertEquals(PostValidateor.IsVailedPost("asdsdsdsaa"),true);

    }


    @Test
    public void  test_post_long(){
        assertEquals(PostValidateor.longText("adsadasdasdasdasdasdadadadasdadasd") , true);
    }


    @Test
    public void test_image(){
        assertEquals(PostValidateor.IsVailedPost("123.png"),true);

    }
    @Test
    public void test_edit(){
        assertEquals(PostValidateor.editPost("aa","asdasdsa"),true);
    }


}
