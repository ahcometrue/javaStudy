package app;

import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class App {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));

        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    private static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();

        } finally {
            System.out.println("END"); // 会在第9行输出前输出结果
        }
    }

    private static void process1() {
        try {
            process2();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }
}