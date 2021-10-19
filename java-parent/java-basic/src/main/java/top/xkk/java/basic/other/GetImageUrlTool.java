package top.xkk.java.basic.other;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetImageUrlTool {
    private static final String IMG_PATTERN = "<img.*?>";
    private static final String HTTP_PATTERN = "\"https?(.*?)(\"|>|\\s+)";

    public static void getImageUrl(String url) throws IOException {
        // 创建站点URL
        URL site = new URL(url);
        URLConnection connection = site.openConnection();
        // 由连接的字节输入流 -> 字节字符转换流 -> 扫描流
        Scanner input = new Scanner(new InputStreamReader(connection.getInputStream()));
        // 用正则表达式<img.*?>提取<img src="">标签
        Pattern compile = Pattern.compile(IMG_PATTERN);
        // 匹配对象
        Matcher imgMatcher, httpsMatcher;
        // 定义一个链表存放图片地址
        ArrayList<String> imgList = new ArrayList<>();
        // 定义图片连接
        String imgUrl;
        int count = 0;
        while (input.hasNext()) {
            // 按行读取
            String line = input.nextLine();
            // 匹配正则，过滤出<img src="">运行
            imgMatcher = compile.matcher(line);
            if (imgMatcher.find()) {
                // 提取完成的img标签
                String imgElement = imgMatcher.group();
                // 这个正则用来从完整的img标签中提取到https地址
                httpsMatcher = Pattern.compile(HTTP_PATTERN).matcher(imgElement);
                if (httpsMatcher.find()) {
                    // 提取出https，包含双引号
                    imgUrl = httpsMatcher.group();
                    // 取字串，去除引号
                    imgList.add(imgUrl.substring(1, imgUrl.length() - 1));
                }
            }
        }
        System.out.println(imgList);
        System.out.println("img count of this site:" + imgList.size());

    }
}
