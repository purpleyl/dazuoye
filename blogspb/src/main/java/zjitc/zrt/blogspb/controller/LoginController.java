package zjitc.zrt.blogspb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjitc.zrt.blogspb.domain.User;
import zjitc.zrt.blogspb.domain.result.UserResult;
import zjitc.zrt.blogspb.service.LoginService;


@RestController
@RequestMapping("/l")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public UserResult login(@RequestBody  User user){
        User login = loginService.login(user);
      if (login!=null){
          return new UserResult("登录成功","200100",login);
      }
          return new UserResult("登录失败,用户名或密码错误","400100",null);

    }

    @PostMapping("/zhuce")
    public UserResult zhuce(@RequestBody  User user){

        User login = loginService.login(user);
        if (login!=null){
            return new UserResult("注册失败，用户名已被占用","400200",null);
        }

        loginService.zhuce(user);
        return new UserResult("注册成功","200200",null);
    }


}
