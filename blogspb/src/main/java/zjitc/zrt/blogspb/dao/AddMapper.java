package zjitc.zrt.blogspb.dao;


import org.apache.ibatis.annotations.Mapper;
import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.domain.Content;

@Mapper
public interface AddMapper {
    int addblog(Content content);

    void addcomt(Comment comment);
}

