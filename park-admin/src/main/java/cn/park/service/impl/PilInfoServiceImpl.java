package cn.park.service.impl;

import cn.park.mapper.PilInfoMapper;
import cn.park.mapper.PilNewPlaceMapper;
import cn.park.pojo.PilInfo;
import cn.park.pojo.PilInfoExample;
import cn.park.service.PilInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 停车场信息
 */
@Service
public class PilInfoServiceImpl implements PilInfoService{
    @Autowired
    PilInfoMapper PilInfoMapper;
    @Autowired
    PilNewPlaceMapper pilNewPlaceMapper;

    /**
     * 实时的车位信息列表（实时车位数判断，调用存储过程添加实时车位数）
     * @return
     */
    @Override
    public List<PilInfo> findAllPilInfo(Integer pageIndex,Integer pageSize) {
        //获取所以停车场信息
        List<PilInfo> pilInfoList = PilInfoMapper.selectByExample(null);
        //遍历停车场信息列表并且将id都添加到集合当中
        List<Integer> pids = new ArrayList<>();
        for (PilInfo pilInfo : pilInfoList) {
            //根据id调用添加的存储过程
            pilNewPlaceMapper.addPilNewPlaceByPidList(pilInfo.getId());
        }
        //设置分页
        PageHelper.startPage(pageIndex, pageSize);
        //查询实时的停车场信息列表(包含实时车位)
        pilInfoList = PilInfoMapper.selectAllByNow();
        return pilInfoList;
    }
}
