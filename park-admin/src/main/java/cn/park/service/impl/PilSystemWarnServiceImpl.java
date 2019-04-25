package cn.park.service.impl;

import cn.park.mapper.PilSystemWarnMapper;
import cn.park.pojo.PilSystem;
import cn.park.pojo.PilSystemWarn;
import cn.park.service.PilSystemWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PilSystemWarnServiceImpl implements PilSystemWarnService {

    @Autowired
    PilSystemWarnMapper pilSystemWarnMapper;
    @Override
    public List<PilSystemWarn> AllPilSystemWarn() {
        return pilSystemWarnMapper.AllPilSystemWarn();
    }

    @Override
    public PilSystemWarn pilSystemWarn(Integer id) {
        return pilSystemWarnMapper.pilSystemWarn(id);
    }
    @Override
    public List<PilSystemWarn> AllpilSystemWarnfy(String title) {
        return pilSystemWarnMapper.AllPilSystemWarnfy(title);
    }
}
