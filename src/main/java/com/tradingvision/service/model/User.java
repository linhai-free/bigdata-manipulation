package com.tradingvision.service.model;

/**
 * Created by luodejin on 17/2/7.
 */

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户表
 */
@Entity
public class User {

    @Id
    private int id;
    private int state;
    private String nickname;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
