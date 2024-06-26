package zjitc.zrt.blogspb.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;
import zjitc.zrt.blogspb.domain.User;

@Mapper
public interface LoginMapper {

    User Login(User user);



    void zhuce(User user);
}
