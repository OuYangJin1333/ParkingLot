package cn.park.mapper;

import cn.park.pojo.PilSystemWarn;
import cn.park.pojo.PilSystemWarnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilSystemWarnMapper {
    int countByExample(PilSystemWarnExample example);

    int deleteByExample(PilSystemWarnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilSystemWarn record);

    int insertSelective(PilSystemWarn record);

    List<PilSystemWarn> selectByExampleWithBLOBs(PilSystemWarnExample example);

    List<PilSystemWarn> selectByExample(PilSystemWarnExample example);

    PilSystemWarn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilSystemWarn record, @Param("example") PilSystemWarnExample example);

    int updateByExampleWithBLOBs(@Param("record") PilSystemWarn record, @Param("example") PilSystemWarnExample example);

    int updateByExample(@Param("record") PilSystemWarn record, @Param("example") PilSystemWarnExample example);

    int updateByPrimaryKeySelective(PilSystemWarn record);

    int updateByPrimaryKeyWithBLOBs(PilSystemWarn record);

    int updateByPrimaryKey(PilSystemWarn record);

    /**
     * 查询所有告警
     * @return
     */
    List<PilSystemWarn> AllPilSystemWarn();

    /**
     * 根据id查询告警详细信息
     * @param id
     * @return
     */
    PilSystemWarn pilSystemWarn(@Param("id") Integer id);

    List<PilSystemWarn> AllPilSystemWarnfy(@Param("title")String title);
}