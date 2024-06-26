package zjitc.zrt.blogspb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zjitc.zrt.blogspb.domain.Comment;
import zjitc.zrt.blogspb.domain.result.CommentResult;
import zjitc.zrt.blogspb.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/comt")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/list")
    public CommentResult list(@RequestParam Integer contentid){

         List<Comment> list = commentService.seletAll(contentid);
        return new CommentResult("查询成功","200000",list);
    }
}
