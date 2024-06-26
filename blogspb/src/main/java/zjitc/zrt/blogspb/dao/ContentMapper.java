package zjitc.zrt.blogspb.dao;

import org.apache.ibatis.annotations.Mapper;
import zjitc.zrt.blogspb.domain.Content;

import java.util.List;

@Mapper
public interface ContentMapper {

    List<Content> findAll();

    List<Content> findbyid(Integer id);

}
