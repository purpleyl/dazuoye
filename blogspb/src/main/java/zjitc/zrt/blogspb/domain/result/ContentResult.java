package zjitc.zrt.blogspb.domain.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zjitc.zrt.blogspb.domain.Content;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentResult {
    private String msg;
    private String code;
    public List<Content> ContentList;

}
