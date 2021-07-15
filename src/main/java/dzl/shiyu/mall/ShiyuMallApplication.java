package dzl.shiyu.mall;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dzl.shiyu.mall.dao")
public class ShiyuMallApplication {
    public static void main(String[] args) {
        System.out.println("启动 Spring Boot...");
        SpringApplication.run(ShiyuMallApplication.class, args);
    }

}
