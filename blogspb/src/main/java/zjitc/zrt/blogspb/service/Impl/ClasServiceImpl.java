package zjitc.zrt.blogspb.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjitc.zrt.blogspb.dao.ClasMapper;
import zjitc.zrt.blogspb.domain.Clas;
import zjitc.zrt.blogspb.service.ClasService;

import java.util.List;

@Service
public class ClasServiceImpl implements ClasService {



    @Autowired
    private ClasMapper clasMapper;
    @Override
    public List<Clas> findAll() {

        List<Clas> clasList = clasMapper.findAll();
        return clasList;
    }

    @Override
    public List<Clas> findcsbyid(Integer id) {
        List<Clas> clas = clasMapper.findcsbyid(id);
        return clas;
    }
}
