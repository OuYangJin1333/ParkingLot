package cn.park.service.impl;

import cn.park.mapper.PilSystemMapper;
import cn.park.pojo.PilSystem;
import cn.park.service.PilSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PilSystemServiceImpl implements PilSystemService{

    @Autowired
    PilSystemMapper pilSystemMapper;
    @Override
    public List<PilSystem> pilSystemList(Integer id) {
        return pilSystemMapper.pilSystemslist(id);
    }

    @Override
    public PilSystem pilSystem(Integer id) {
        return pilSystemMapper.gepilSystem(id);
    }
}
