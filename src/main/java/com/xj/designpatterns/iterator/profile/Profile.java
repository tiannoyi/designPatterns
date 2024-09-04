package com.xj.designpatterns.iterator.profile;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 社交档案
 * @author : xiongjun
 * @date : 2024/9/4 17:15
 */
@Getter
public class Profile {

    private String name;

    private String email;

    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contacts) {
        this.name = name;
        this.email = email;

        // 从“friend:email@gmail.com”中解析联系人列表。
        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend";
            String contactEmail;
            if (parts.length == 1) {
                contactEmail = parts[0];
            }else {
                contactType = parts[0];
                contactEmail = parts[1];
            }

            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            this.contacts.get(contactType).add(contactEmail);
        }
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }
}
