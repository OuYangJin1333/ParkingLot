package cn.park.mapper;

import cn.park.pojo.PilVipUser;
import cn.park.pojo.PilVipUserExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilVipUserMapper {
    int countByExample(PilVipUserExample example);

    int deleteByExample(PilVipUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilVipUser record);

    int insertSelective(PilVipUser record);

    List<PilVipUser> selectByExample(PilVipUserExample example);

    PilVipUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilVipUser record, @Param("example") PilVipUserExample example);

    int updateByExample(@Param("record") PilVipUser record, @Param("example") PilVipUserExample example);

    int updateByPrimaryKeySelective(PilVipUser record);

    int updateByPrimaryKey(PilVipUser record);
    List<PilVipUser> getPilVipUser(@Param("id") Integer id,@Param("vid")String vid,
                                   @Param("name")String name,@Param("sex")String sex,
                                   @Param("identification")String identification,
                                   @Param("phone")String phone,@Param("car_number")String car_number,
                                   @Param("star")Date star,@Param("end") Date end);
}