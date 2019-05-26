package com.jsj.service;

import com.jsj.bean.Page;
import com.jsj.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

//    List<User> getUser(User user);

    Page getUserPage(User user,int pageIndex, int pageSize);

    Map<String,Object> insertUser(User user);

    Map<String,Object> deleteUser(Integer id);

    Map<String,Object> updateUser(User user);
}
