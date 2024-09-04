package com.xj.designpatterns.iterator.iterators;

import com.xj.designpatterns.iterator.profile.Profile;
import com.xj.designpatterns.iterator.social_network.LinkedIn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xiongjun
 * @date : 2024/9/4 17:54
 */
public class LinkedInIterator implements ProfileIterator{

    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();


    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }


    private void lazyLoad(){
        if (emails.size() == 0){
            List<String> profiles = linkedIn.requestProfileFriendsFromLinkedIn(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.contacts.add(null);
            }
        }
    }


    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()){
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null){
            friendContact = linkedIn.requestProfileFromLinkedIn(friendEmail);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
