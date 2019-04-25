package cn.park.controller;

import cn.park.pojo.Pildepartment;
import cn.park.service.PildepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bm")
public class PildepartmentController {

    @Autowired
    PildepartmentService  pildepartmentService;
    @RequestMapping(value = "/getbm",produces = "application/json",method = RequestMethod.GET)
    @ResponseBody
    public Pildepartment recursiveTreeData(@RequestParam(name="id") int id) {
        //根据cid获取节点对象
        Pildepartment masterTreeNode = pildepartmentService.getMasterNode(id);
        //查询cid下的所有子节点
        List<Pildepartment> slaveTreeNodes = pildepartmentService.getSlaveNodes(id);
        //遍历子节点
        for (Pildepartment slave : slaveTreeNodes) {
            Pildepartment n = recursiveTreeData(slave.getId()); //递归
            masterTreeNode.getNodes().add(n);
        }
        return masterTreeNode;
    }

}
