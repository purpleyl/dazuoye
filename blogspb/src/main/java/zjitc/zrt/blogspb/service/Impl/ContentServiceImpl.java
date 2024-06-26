package zjitc.zrt.blogspb.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjitc.zrt.blogspb.dao.ContentMapper;
import zjitc.zrt.blogspb.domain.Content;
import zjitc.zrt.blogspb.service.ContentService;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<Content> finAll() {
        List<Content> contents =   contentMapper.findAll();
        return contents;
    }

    @Override
    public List<Content> findbyid(Integer id) {
        List<Content>  list = contentMapper.findbyid(id);
        return list;
    }
}
