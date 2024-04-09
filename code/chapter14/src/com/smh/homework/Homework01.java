package com.smh.homework;

import java.util.ArrayList;

/**
 * ClassName: Homework01
 * Package: com.smh.homework
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/5 13:35
 * @Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\\\"圣浴\\\"引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList<News> arrayList = new ArrayList<>();
        arrayList.add(news1);
        arrayList.add(news2);
        for (int i = arrayList.size()-1;i>=0;i--){
            System.out.println(print_15(arrayList.get(i).getTitle()));
        }
    }
    public static String print_15(String str){
        if(str.length()>15){
            return str.substring(0,15)+"...";
        }
        return str;
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}