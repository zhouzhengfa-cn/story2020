package cn.zhouzhengfa.story2020.dao;

import cn.zhouzhengfa.story2020.entity.User2020;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author zhouzhengfa-china-2020
 */
@Repository
public interface User2020Dao {
    /**
     * jsa,获取所有用户信息，
     *
     * @return ArrayList<User2020> 所有用户数据，
     *
     */
    @Select("select * from user2020")
    ArrayList<User2020> getAll();

    /**
     * jsa 插入一条数据
     * @param user2020 data-value
     * @return int ,id ->success
     */
    @Insert("insert into user2020(name,email,password) values(#{name},#{email},#{password})")
    int insertOne(User2020 user2020);


    /**
     * 获取ID通过name
     * @param name
     * @return
     * 返回值为对象是避免为null时，无法转换。
     */
    @Select("select id from user2020 where name=#{name}")
    Integer getIdByName(String name);
}
