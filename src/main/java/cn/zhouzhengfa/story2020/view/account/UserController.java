package cn.zhouzhengfa.story2020.view.account;

import cn.zhouzhengfa.story2020.dao.User2020Dao;
import cn.zhouzhengfa.story2020.entity.ValueConstantCurrentProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 *
 */
@Controller
public class UserController {



    @RequestMapping("/register")
    public String userRegister(@RequestParam(value = "email",defaultValue = "hsaj") String email,@RequestParam(defaultValue = "123") String password ){
        return "account-operation/register-doing-first";
    }

    /**
     * 首页account-btn点击后，发送请求给服务器，服务器通过查询session中登陆状态，来判断如何跳转，
     * 1.personal center
     * 2.login page
     * */
    @RequestMapping("/account-status-doing-2020")
    public String accountButtonRequest(HttpSession session){
        Object a =  session.getAttribute(ValueConstantCurrentProject.USER_LOGIN_STATUS_KEY);
        if (a != null) {
            boolean loginStatus = (boolean) a;
            if (loginStatus) {
                return "account-operation/personal-center";
            }
        }
        return "account-operation/login2020";
    }

    @Autowired
    private User2020Dao user2020Dao;
    /**
     *
     * @return 判断结果，
     */
    @RequestMapping("/judge-user-is-exist-by-name2020")
    @ResponseBody
    public boolean judgeNameExist(@RequestParam(value = "name") String name01){
        if (name01 != null && !name01.trim().equals("")){
//            向数据库对比
            Object a=user2020Dao.getIdByName(name01);
            System.out.println("id:"+a);
            return a==null?false:true;
        }
        return false;
    }
}
