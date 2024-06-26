package zjitc.zrt.blogspb.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    private Integer id;
    private String title;
    private String auauthor;
    private String content;
    private Integer cid;


}
