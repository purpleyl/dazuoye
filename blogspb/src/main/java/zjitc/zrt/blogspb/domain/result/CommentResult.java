package zjitc.zrt.blogspb.domain.result;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zjitc.zrt.blogspb.domain.Comment;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentResult {
    private String msg;
    private String code;
    private List<Comment> data;
}
