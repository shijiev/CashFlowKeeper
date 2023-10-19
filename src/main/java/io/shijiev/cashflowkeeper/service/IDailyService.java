package io.shijiev.cashflowkeeper.service;

import io.shijiev.cashflowkeeper.bean.DailyConsume;

import java.util.List;

public interface IDailyService {
    public DailyConsume getDailyById(Long id);

    public List<DailyConsume> getDailyAll(String userName);

    public int addDaily(DailyConsume daily);


}
