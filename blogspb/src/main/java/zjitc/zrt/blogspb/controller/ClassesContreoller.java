package zjitc.zrt.blogspb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zjitc.zrt.blogspb.domain.Clas;
import zjitc.zrt.blogspb.domain.result.ClasResult;
import zjitc.zrt.blogspb.service.ClasService;

import java.util.List;

@RestController
@RequestMapping("/cs")
public class ClassesContreoller {


    @Autowired
    private ClasService clasService;

    @GetMapping("/getclass")
    public ClasResult getclass(){

        List<Clas> clasList = clasService.findAll();

        return new ClasResult("查询成功","200100",clasList);
    }


    @GetMapping("/csbyid")
    public ClasResult getcsbyid(@RequestParam("id") Integer id){
        List<Clas> clas = clasService.findcsbyid(id);

        return new ClasResult("查询成功","200100",clas);
    }


}
