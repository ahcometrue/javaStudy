package com.imooc.user;

import com.imooc.music.Play;
import java.util.Arrays;

public class User {
    public static void main(String[] args) throws Exception {
        Play play = new Play();
        String[] array = play.getPlayList();
        System.out.println(Arrays.toString(array));
        for (String item : array) {
            System.out.println(item);
        }
        System.out.println("say com.imooc.user User.java");
    }
}