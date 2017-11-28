package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Lost;
import pojo.LostExample;

public interface LostMapper {
    int countByExample(LostExample example);

    int deleteByExample(LostExample example);

    int deleteByPrimaryKey(Integer lostId);

    int insert(Lost record);

    int insertSelective(Lost record);

    List<Lost> selectByExample(LostExample example);

    Lost selectByPrimaryKey(Integer lostId);

    int updateByExampleSelective(@Param("record") Lost record, @Param("example") LostExample example);

    int updateByExample(@Param("record") Lost record, @Param("example") LostExample example);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);
}