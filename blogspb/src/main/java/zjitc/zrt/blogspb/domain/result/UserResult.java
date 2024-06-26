package zjitc.zrt.blogspb.domain.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zjitc.zrt.blogspb.domain.User;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResult {
    private String msg;
    private String code;
    private User data;

}
