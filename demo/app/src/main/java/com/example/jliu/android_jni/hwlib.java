package com.example.jliu.android_jni;

/**
 * Created by jliu on 3/19/2019.
 */


public class hwlib {
    public native static int ledOpen();
    public native static int ledCtrl(int whihc, int status);
    public native static void ledClose();

    static{
        try {
            System.loadLibrary("hwlib");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

