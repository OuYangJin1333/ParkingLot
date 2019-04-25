package cn.park.mapper;

import cn.park.pojo.PilSystem;
import cn.park.pojo.PilSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilSystemMapper {
    int countByExample(PilSystemExample example);

    int deleteByExample(PilSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilSystem record);

    int insertSelective(PilSystem record);

    List<PilSystem> selectByExampleWithBLOBs(PilSystemExample example);

    List<PilSystem> selectByExample(PilSystemExample example);

    PilSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByExampleWithBLOBs(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByExample(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByPrimaryKeySelective(PilSystem record);

    int updateByPrimaryKeyWithBLOBs(PilSystem record);

    int updateByPrimaryKey(PilSystem record);

    /**
     * 根据当前权限进行公告显示
     * @param tid
     * @return
     */
    List<PilSystem> pilSystemslist(@Param("tid")Integer tid);

    /**
     * 根据公告id查询详细信息
     * @param id
     * @return
     */
    PilSystem gepilSystem(@Param("id")Integer id);

    /**
     * 根据权限以及标题进行分页查询
     * @param tid
     * @param title
     * @return
     */
    List<PilSystem> fenyechaxun(@Param("tid") Integer tid,@Param("title")String title);
}