package zjitc.zrt.blogspb.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjitc.zrt.blogspb.dao.AddMapper;
import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.domain.Content;
import zjitc.zrt.blogspb.service.AddService;

@Service
public class AddServiceImpl implements AddService {
    @Autowired
    AddMapper addMapper;

    @Override
    public int addblog(Content content) {
        int i =addMapper.addblog(content);
        return i;
    }

    @Override
    public void addcomt(Comment comment) {
        addMapper.addcomt(comment);
    }
}
