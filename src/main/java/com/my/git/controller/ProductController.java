package com.my.git.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: description of ProductController
 * Company: 联宝（合肥）电子科技有限公司
 *
 * @author: Honest.Zhao
 * Date: 2022/8/15 13:32
 */

public class ProductController {
    @GetMapping("/echoGit")
    public String echoGit(){
        System.out.println("echoGit");
        return "echoGit";
    }
}
