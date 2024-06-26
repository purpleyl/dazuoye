package zjitc.zrt.blogspb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.domain.Content;
import zjitc.zrt.blogspb.domain.result.CommentResult;
import zjitc.zrt.blogspb.domain.result.ContentResult;
import zjitc.zrt.blogspb.service.AddService;

@RestController
@RequestMapping("/add")
public class AddController {
    @Autowired
    private AddService addService;

    @PostMapping("/addblog")
    public ContentResult addblog(@RequestBody Content content) {
        int i = 0;
        i = addService.addblog(content);
        if (i!=0){
            return new ContentResult("发布成功","200300",null);
        }
        return new ContentResult("发布失败", "400300", null);
    }

    @PostMapping("/comt")
    public CommentResult comt(@RequestBody Comment comment) {

        addService.addcomt(comment);

        return new CommentResult("发表成功","200300",null);
    }

}
