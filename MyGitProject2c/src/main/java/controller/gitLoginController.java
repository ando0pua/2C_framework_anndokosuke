// GitLoginController.java
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class gitLoginController {

    @GetMapping("/gitpralogin")
    public ModelAndView loginPage() {
        return new ModelAndView("gitlogin");
    }

    @PostMapping("/gitpralogin")
    public ModelAndView login(@RequestParam String id, @RequestParam String pw) {
        ModelAndView modelAndView = new ModelAndView();

        // ユーザ認証などの実際の処理はここに実装する
        if ("gitlogin".equals(id) && "gitpw".equals(pw)) {
            modelAndView.addObject("message", "ログイン成功！");
        } else {
            modelAndView.addObject("message", "ログイン失敗！");
        }

        modelAndView.setViewName("result");
        return modelAndView;
    }
}
