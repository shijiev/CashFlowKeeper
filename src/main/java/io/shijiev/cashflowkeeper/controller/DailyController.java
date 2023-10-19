package io.shijiev.cashflowkeeper.controller;

import io.shijiev.cashflowkeeper.bean.DailyConsume;
import io.shijiev.cashflowkeeper.service.impl.DailyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Controller
@RequestMapping("/daily")
public class DailyController {

    @Resource
    DailyServiceImpl iDailyService;

    @RequestMapping("/getDaily/{id}")
    public DailyConsume getDailyById(@PathVariable("id") Long id){
        return iDailyService.getDailyById(id);
    }

    @RequestMapping("/getDailyAll")
    public String getDailyAll(Model model, String userName){
        List<DailyConsume> dailyAll = iDailyService.getDailyAll(userName);
        log.info("查询数据成功"+dailyAll);
        model.addAttribute("dailyAll", dailyAll);
        return "DailyList";
    }

    @RequestMapping("/insertPage")
    public String insertPage() {
        return "AddDaily";
    }

    @RequestMapping("/addDaily")
    public String addDaily(DailyConsume daily){
        iDailyService.addDaily(daily);
        return "redirect:/daily/getDailyAll";

    }

    @RequestMapping("/getOK")
    public String getOK(){
        return "ok";
    }
}
