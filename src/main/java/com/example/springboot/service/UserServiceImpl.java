package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	    private UserMapper userMapper;
	    
	    
	    @Override
	    public boolean addUser(User user) {
	        boolean flag=false;
	        try{
	        	userMapper.addUser(user);
	            flag=true;
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return flag;
	    }

	    @Override
	    public boolean updateUser(User user) {
	        boolean flag=false;
	        try{
	        	userMapper.updateUser(user);
	            flag=true;
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return flag;
	    }

	    @Override
	    public boolean deleteUser(int id) {
	        boolean flag=false;
	        try{
	        	userMapper.deleteUser(id);
	            flag=true;
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return flag;
	    }

	    @Override
	    public User findUserByName(String userName) {
	        return userMapper.findByName(userName);
	    }

	    @Override
	    public User findUserById(int userId) {
	        return userMapper.findById(userId);
	    }

	    @Override
	    public User findByAddress(String address) {
	        return userMapper.findByAddress(address);
	    }
	    
	    @Override
	    public List<User> findUserList() {
	        return userMapper.findAll();
	    }
}
