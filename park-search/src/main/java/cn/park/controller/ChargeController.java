package cn.park.controller;

import cn.park.service.ChargeService;
import cn.park.vo.Charge;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import cn.park.util.RespBean;

@RestController
@RequestMapping("/search/charge")
@Api(value = "停车收费统计")
public class ChargeController {
    @Autowired
    ChargeService chargeService;
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public RespBean findListByPage(@RequestBody Charge charge, @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex, @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        Page<Charge> listByEs = chargeService.findListByEs(pageIndex,pageSize,charge);
        return new RespBean().pageSuccess(listByEs);
    }
}
