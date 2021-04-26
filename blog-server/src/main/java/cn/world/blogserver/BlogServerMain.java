package cn.world.blogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/4/26 14:24
 */
@SpringBootApplication
@MapperScan(basePackages="cn.world.blogserver.dao")
public class BlogServerMain {
    public static void main(String[] args) {
        SpringApplication.run(BlogServerMain.class,args);
    }
}
