package com.xj.designpatterns.iterator.spammer;

import com.xj.designpatterns.iterator.iterators.ProfileIterator;
import com.xj.designpatterns.iterator.social_network.SocialNetwork;

/**
 * 消息发送应用
 * @author : xiongjun
 * @date : 2024/9/4 17:59
 */
public class SocialSpammer {

    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message){
        System.out.println("\n迭代所有好友...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()){
            String profileEmail1 = iterator.getNext().getEmail();
            sendMessage(profileEmail1,message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail,String message){
        System.out.println("\n迭代所有同事...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()){
            String profileEmail1 = iterator.getNext().getEmail();
            sendMessage(profileEmail1,message);
        }
    }

    public void sendMessage(String email,String message){
        System.out.println("发送消息: " + email + ". 消息: " + message);
    }

}
