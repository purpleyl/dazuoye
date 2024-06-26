package zjitc.zrt.blogspb.service;

import zjitc.zrt.blogspb.domain.Clas;

import java.util.List;

public interface ClasService {
    List<Clas> findAll();

    List<Clas> findcsbyid(Integer id);
}
