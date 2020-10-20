package cn.zhouzhengfa.story2020.view;

import cn.zhouzhengfa.story2020.dao.User2020Dao;
import cn.zhouzhengfa.story2020.entity.User2020;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author zhouzhengfa-china-2020
 * 直接
 */
@Controller
public class SingleController {

    @RequestMapping("/")
    public String homePage2020oct14() {
        return "homePage2020oct14";
    }

    @RequestMapping("/about-project")
    public String informationAboutProject() {
        return "aboutProjectThis/projectAbout2020oct14";
    }

    @Autowired
    User2020Dao user2020Dao;

    @RequestMapping("/all-user-2020")
    @ResponseBody
    public ArrayList<User2020> allUser2020() {
        return user2020Dao.getAll();
    }

    @RequestMapping("/add-one-2020")
    public String addOnePageStart2020() {
        return "account-operation/insertOneUser2020";
    }

    @RequestMapping("/insert-one-account-2")
    @ResponseBody
    public int insertOne(@Param("name") String name, @Param("email") String email, String password) {
        if (name == null ||
                email == null ||
                password == null ||
                name.trim().equals("") ||
                email.trim().equals("") ||
                password.trim().equals("")) {
            return -1;
        }
        return user2020Dao.insertOne(new User2020(name, email, password));
    }

    @RequestMapping("/login2020")
    public String login2020(){
        return "account-operation/login";
    }

    @RequestMapping("/snake-greedy-2020")
    public String snakeGreedyHomePage(){
        return "game/snake-greedy/homePage-snakeGreedy";
    }
}
