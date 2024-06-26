package zjitc.zrt.blogspb.dao;

import org.apache.ibatis.annotations.Mapper;
import zjitc.zrt.blogspb.domain.Clas;

import java.util.List;

@Mapper
public interface ClasMapper {
    List<Clas> findAll();

    List<Clas> findcsbyid(Integer id);
}
