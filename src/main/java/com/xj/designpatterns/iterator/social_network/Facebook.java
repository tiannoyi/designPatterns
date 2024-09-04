package com.xj.designpatterns.iterator.social_network;

import com.xj.designpatterns.iterator.iterators.FacebookIterator;
import com.xj.designpatterns.iterator.iterators.ProfileIterator;
import com.xj.designpatterns.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xiongjun
 * @date : 2024/9/4 17:25
 */
public class Facebook implements SocialNetwork {
    /**
     * 简介
     */
    private List<Profile> profiles;


    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }


    public Profile requestProfileFromFacebook(String profileEmail) {
        //模拟网络延迟
        simulateNetworkLatency();
        System.out.println("Facebook: 正在通过网络加载" + profileEmail + "个人资料");
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail,String contactType){
        simulateNetworkLatency();
        System.out.println("Facebook: 正在通过网络加载" + profileEmail + "的" + contactType);

        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }


    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return findProfile(profileEmail);
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this,"coworkers", profileEmail);
    }
}
