package com.weishuqi.like;


import com.weishuqi.like.domain.Cardioid;
import com.weishuqi.like.domain.Heart;
import org.junit.jupiter.api.Test;
import static java.lang.Math.pow;


class LikeApplicationTests {

    public static void main(String[] args) {
      new Cardioid();
        // 这2个同时只能用一个,下面放开注释的话,上面的就得注释
      // new Heart();
    }

    // 这个看打印台
    @Test
    void aiXin() throws InterruptedException {
        int hx = 0;
        for (float i = 2.5f ; i > -2.5f; i -=0.12f){
            for (float j = -2.3f ; j <2.3f ; j +=0.041f){
                float k =j*j + i*i - 4f;
                if ((pow(k,3)-pow(j,2)*pow(i,3)) < -0.00f){
                    String str = "I like you!";
                    int num = hx % str.length();
                    System.out.print("\033[1;31m" +str.charAt(num) + "\033[0m");
                    hx++;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            Thread.sleep(300);
        }
    }


}
