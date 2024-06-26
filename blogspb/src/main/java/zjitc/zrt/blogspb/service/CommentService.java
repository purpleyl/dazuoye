package zjitc.zrt.blogspb.service;

import zjitc.zrt.blogspb.domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> seletAll(Integer contentid);
}
