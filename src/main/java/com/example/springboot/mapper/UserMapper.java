package com.example.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.springboot.pojo.User;

@Mapper
public interface UserMapper {
	
	/**
     * 用户数据新增
     */
     @Insert("insert into user(id,name,address) values (#{id},#{name},#{address})")
      void addUser(User user); 
     
     /**	
      * 用户数据修改
      */
     @Update("update user set name=#{name},address=#{address} where id=#{id}")
      void updateUser(User user);

     /**
      * 用户数据删除
     */
     @Delete("delete from user where id=#{id}")
     void deleteUser(int id);
    
      /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT id,name,address FROM user where name=#{userName}")
    User findByName(@Param("userName") String userName);
   
    /**
     * 根据用户ID查询用户信息
     *
     */
    @Select("SELECT id,name,address FROM user where id=#{userId}")     
    User findById(@Param("userId") int userId);
    
    
    /**
     * 根据用户address查询用户信息
     */
    @Select("SELECT id,name,address FROM user where address = #{address}")     
    User findByAddress(@Param("address") String address);
    
    @Select("SELECT * FROM user")
    List<User> findAll();
}