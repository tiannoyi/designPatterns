package com.xj.designpatterns.templateMethod;

import com.xj.designpatterns.templateMethod.networks.Facebook;
import com.xj.designpatterns.templateMethod.networks.Network;
import com.xj.designpatterns.templateMethod.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : xiongjun
 * @date : 2024/8/22 15:51
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("输入用户名：");
        String userName = reader.readLine();
        System.out.println("输入密码：");
        String password = reader.readLine();

        System.out.println("输入消息：");
        String message = reader.readLine();

        System.out.println("\n选择社交网络发送消息：\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }

}
