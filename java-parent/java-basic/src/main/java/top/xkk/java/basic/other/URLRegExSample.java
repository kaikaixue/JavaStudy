package top.xkk.java.basic.other;

import java.io.IOException;

public class URLRegExSample {
    public static void main(String[] args) {
        try {
            GetImageUrlTool.getImageUrl("https://www.csdn.net/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
