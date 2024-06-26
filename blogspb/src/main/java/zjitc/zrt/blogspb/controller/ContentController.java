package zjitc.zrt.blogspb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zjitc.zrt.blogspb.domain.Content;
import zjitc.zrt.blogspb.domain.result.ContentResult;
import zjitc.zrt.blogspb.service.ContentService;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping("/list")
    public ContentResult list() {
        List<Content> contents = contentService.finAll();
        return new ContentResult("查询成功","200000",contents);
    }

    @GetMapping("/flist")
    public ContentResult flist(@RequestParam("id") Integer id) {
        List<Content>  contentList = contentService.findbyid(id);
        return new ContentResult("查询成功","200000",contentList);
    }

}
