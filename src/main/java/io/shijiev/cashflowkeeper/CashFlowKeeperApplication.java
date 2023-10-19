package io.shijiev.cashflowkeeper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.shijiev.cashflowkeeper.mapper")
public class CashFlowKeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashFlowKeeperApplication.class, args);
    }

}
