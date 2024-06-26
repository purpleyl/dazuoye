package zjitc.zrt.blogspb.service;

import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.domain.Content;

public interface AddService {

    int addblog(Content content);

    void addcomt(Comment comment);
}
