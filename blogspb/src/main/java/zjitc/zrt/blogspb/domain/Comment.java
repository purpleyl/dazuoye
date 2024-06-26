package zjitc.zrt.blogspb.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private Integer id;
    private String username;
    private String Comment;
    private Integer contentid;
}
