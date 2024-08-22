package com.xj.designpatterns.templateMethod.networks;

/**
 * @author : xiongjun
 * @date : 2024/8/22 16:05
 */
public class Twitter extends Network{

    public Twitter(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    @Override
    Boolean login(String userName, String password) {
        System.out.println("\n检查用户参数");
        System.out.println("名称：" + this.userName);
        System.out.print("密码：");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nTwitter登录成功");
        return true;
    }

    @Override
    public Boolean sendData(byte[] data) {
        boolean msgPosted = true;
        if (msgPosted){
            System.out.println("消息：" + new String(data) + "已发布到Twitter");
            return true;
        }
        return false;
    }

    @Override
    void logout() {
        System.out.println("用户：" + this.userName + "已退出Twitter");
    }

    private void simulateNetworkLatency(){
        try {
            int i = 0;
            System.out.println();
            while (i < 10){
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
