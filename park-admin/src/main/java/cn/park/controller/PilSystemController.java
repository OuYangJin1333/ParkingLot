package cn.park.controller;

import cn.park.pojo.PilInfo;
import cn.park.pojo.PilSystem;
import cn.park.pojo.PilSystemType;
import cn.park.service.PilInfoService;
import cn.park.service.PilSystemService;
import cn.park.service.PilSystemtypeService;
import cn.park.util.RespBean;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pil/System")
@Api(value = "车位信息监控")
public class PilSystemController {
    @Autowired
    PilSystemService pilSystemService;
    @Autowired
    PilSystemtypeService pilSystemtypeService;

    @GetMapping("/pilSystemlist")
    @ApiOperation(value = "获取系统公告信息")
    public List AllPilSystem(Integer id) {
        int tid=0;
        if(id==2){
            tid=1;
        }else if(id==3){
            tid=2;
        }else if(id==4){
            tid=3;
        }else{
            tid=0;
        }
        List<PilSystem> allPilInfo = pilSystemService.pilSystemList(tid);
       return allPilInfo;
    }
    @GetMapping("/chaSystemlist")
    @ApiOperation(value = "获取详细公告信息")
    public PilSystem chaPilSystem(Integer id) {
        PilSystem system = pilSystemService.pilSystem(id);
        PilSystemType pilSystemType=pilSystemtypeService.pilSystemType(system.getTid());
        if(pilSystemType.getIsvip()==1){
            return system;
        }else{
            return null;
        }
    }
}
