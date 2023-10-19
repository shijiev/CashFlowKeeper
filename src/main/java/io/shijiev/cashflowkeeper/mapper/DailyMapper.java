package io.shijiev.cashflowkeeper.mapper;

import io.shijiev.cashflowkeeper.bean.DailyConsume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DailyMapper {
    /**
     * 根据 ID 查询消费信息信息
     * */
    DailyConsume getDailyById(@Param("dailyId") Long dailyId);

    /**
     * 查询所有数据
     * */
    List<DailyConsume> getDailyAll(@Param("userName") String userName);


    /**
     * 新增消费记录
     * */
    Integer addDaily(DailyConsume daily);



}
