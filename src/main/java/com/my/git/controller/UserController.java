package com.my.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: description of UserControole
 * Company: 联宝（合肥）电子科技有限公司
 *
 * @author: Honest.Zhao
 * Date: 2022/8/15 9:37
 */
@RestController
@RequestMapping("/second")
public class UserController {
    @GetMapping("/printGit")
    public String printGit(){
        System.out.println("printGit");
        return "printGitEnd";
    }
}
