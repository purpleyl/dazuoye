package zjitc.zrt.blogspb.domain.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zjitc.zrt.blogspb.domain.Clas;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasResult {
    private String msg;
    private String code;
    private List<Clas> clas;
}
