package cn.zhouzhengfa.story2020.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouzhengfa-china-2020
 */
@Controller
public class SingleController {

    @RequestMapping("/")
    public String homePage2020oct14(){
        return "homePage2020oct14";
    }
}
