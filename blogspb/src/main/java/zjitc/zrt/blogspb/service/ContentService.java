package zjitc.zrt.blogspb.service;


import zjitc.zrt.blogspb.domain.Content;

import java.util.List;

public interface ContentService {
    List<Content> finAll();

    List<Content> findbyid(Integer id);
}
