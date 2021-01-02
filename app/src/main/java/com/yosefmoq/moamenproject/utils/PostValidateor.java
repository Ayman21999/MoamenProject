package com.yosefmoq.moamenproject.utils;

public class PostValidateor {

    public static boolean IsVailedPost(String post) {
        if (post.equals("")) {
            return false;
        } else {
            return true;

        }
    }
    public static boolean longText(String post){
        if (post.length() < 40){
            return true ;

        }else
            return false ;
    }
    public static boolean isVailedImage(String url) {
        if (url.equals("")) {
            return false;
        } else if (url.endsWith(".jpg") || url.endsWith(".png") || url.endsWith(".eps")) {
            return true;
        } else
            return false;
    }
    public static boolean editPost(String oldpost ,String newpost ){
        if (oldpost.equals(newpost) || newpost.equals(""))
            return false ;
        else
        return true;
        }


}
