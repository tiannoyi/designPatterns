package com.xj.designpatterns.templateMethod.networks;

/**
 * @author : xiongjun
 * @date : 2024/8/22 15:51
 */
public abstract class Network {

    String userName;
    String password;

    Network() {
    }


    /**
     * 将数据发布到任何网络。
     * @param msg
     * @return
     */
    public Boolean post(String msg){
        //验证用户,每个网络使用不同的验证方法
        if (login(this.userName,this.password)){
            //发送数据
            Boolean res = sendData(msg.getBytes());
            logout();
            return res;
        }
        return false;
    }

    abstract Boolean login(String userName,String password);

    abstract Boolean sendData(byte[] data);

    abstract void logout();


}
