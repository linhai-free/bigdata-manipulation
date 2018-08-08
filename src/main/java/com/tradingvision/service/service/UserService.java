package com.tradingvision.service.service;

import com.tradingvision.service.model.User;

import java.util.List;

/**
 * Created by luodejin on 2018/8/8.
 */
public interface UserService {

    public int insertUser(User user);
    public int updateUser (User user,int id);
    public int deleteUser(int id);
    public User selectUserById(int id);
    public List<User> selectAllUser();

}
