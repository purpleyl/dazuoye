package zjitc.zrt.blogspb.service;


import zjitc.zrt.blogspb.domain.User;

public interface LoginService {

    User login(User user);


    void zhuce(User user);
}
