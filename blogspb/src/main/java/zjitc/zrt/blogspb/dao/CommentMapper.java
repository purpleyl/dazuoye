package zjitc.zrt.blogspb.dao;

import org.apache.ibatis.annotations.Mapper;
import zjitc.zrt.blogspb.domain.Comment;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> seletall(Integer contentid);
}


