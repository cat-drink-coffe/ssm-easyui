package com.yuan.dao;

import com.yuan.domain.User;

import java.util.List;
import java.util.Map;


/**
 * 用户DAO接口
 * @author Administrator
 *
 */
public interface UserDao {
    /**
     * 用户登录
     * @param user
     * @return
     */
     User login(User user);
    /**
     * 查询所有用户
     * @return
     */
     List<User> getAll();
    /**
     * 根据条件查询用户
     * @param user
     * @return
     */
     User getUser(User user);
    /**
     * 删除用户
     * @param id
     * @return
     */
     int delete(int id);
    /**
     * 更新用户
     * @param user
     * @return
     */
     int update(User user);
    /**
     * 添加用户
     * @param user
     * @return
     */
     int add(User user);
    /**
     * 用户查询
     * @param map
     * @return
     */
    List<User> find(Map<String,Object> map);
    /**
     * 获取总记录数
     * @param map
     * @return
     */
    Long getTotal(Map<String,Object> map);
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);
}