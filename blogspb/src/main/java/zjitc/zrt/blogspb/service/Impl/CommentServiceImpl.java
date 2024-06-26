package zjitc.zrt.blogspb.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjitc.zrt.blogspb.dao.CommentMapper;
import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> seletAll(Integer contentid) {
        List<Comment>  list =  commentMapper.seletall(contentid);
        return list;
    }
}
