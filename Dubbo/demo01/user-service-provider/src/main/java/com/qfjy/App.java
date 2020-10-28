package com.qfjy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        new String[]{"classpath:provider.xml"}
        );
        context.start();
        System.in.read(); // 按任意键退出
    }
}
