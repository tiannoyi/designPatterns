package com.xj.designpatterns.iterator.social_network;

import com.xj.designpatterns.iterator.iterators.LinkedInIterator;
import com.xj.designpatterns.iterator.iterators.ProfileIterator;
import com.xj.designpatterns.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xiongjun
 * @date : 2024/9/4 17:51
 */
public class LinkedIn implements SocialNetwork{


    /**
     * 联系人
     */
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null){
            this.contacts = cache;
        }else {
            this.contacts = new ArrayList<>();
        }
    }


    public Profile requestProfileFromLinkedIn(String profileEmail){
        simulateNetworkLatency();
        System.out.println("LinkedIn: 正在通过网络加载" + profileEmail + "个人资料");
        return findContact(profileEmail);
    }


    public List<String> requestProfileFriendsFromLinkedIn(String profileEmail,String contactType){
        simulateNetworkLatency();
        System.out.println("LinkedIn: 正在通过网络加载" + profileEmail + "的" + contactType);
        Profile profile = findContact(profileEmail);
        if (profile != null){
            return profile.getContacts(contactType);
        }
        return null;
    }


    private Profile findContact(String profileEmail){
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)){
                return profile;
            }
        }
        return null;
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
        return new LinkedInIterator(this,"friends",profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this,"coworkers",profileEmail);
    }
}
