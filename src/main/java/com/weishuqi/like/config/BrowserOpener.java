package com.weishuqi.like.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

@Component
public class BrowserOpener implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // 延迟5秒后执行打开浏览器的操作
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                openBrowser();
            }
        }, 5000);
    }

    private void openBrowser() {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
