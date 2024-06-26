package zjitc.zrt.blogspb.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjitc.zrt.blogspb.dao.LoginMapper;
import zjitc.zrt.blogspb.domain.User;
import zjitc.zrt.blogspb.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(User user) {
        User login = loginMapper.Login(user);
        return login;
    }

    @Override
    public void zhuce(User user) {
        loginMapper.zhuce(user);
    }


}
