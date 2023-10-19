package io.shijiev.cashflowkeeper.service.impl;

import io.shijiev.cashflowkeeper.bean.DailyConsume;
import io.shijiev.cashflowkeeper.mapper.DailyMapper;
import io.shijiev.cashflowkeeper.service.IDailyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DailyServiceImpl implements IDailyService {
    @Resource
    DailyMapper dailyMapper;

    @Override
    public DailyConsume getDailyById(Long id) {
        return dailyMapper.getDailyById(id);
    }

    @Override
    public List<DailyConsume> getDailyAll(String userName) {
        return dailyMapper.getDailyAll(userName);
    }

    @Override
    public int addDaily(DailyConsume daily) {
        return dailyMapper.addDaily(daily);
    }
}
