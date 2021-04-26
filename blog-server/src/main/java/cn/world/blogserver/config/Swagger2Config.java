package cn.world.blogserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Description: Swagger2配置类
 * @Author bestlmc
 * @Date 2021/4/15 13:34
 */
//swagger2的配置文件，在项目的启动类的同级文件建立
@Configuration
@EnableSwagger2
//是否开启swagger，正式环境一般是需要关闭的（避免不必要的漏洞暴露！），可根据springboot的多环境配置进行设置
//@ConditionalOnProperty(name = "swagger.enable",  havingValue = "true")
public class Swagger2Config {
    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apinfo())
                //是否启用swagger false不启用
                .enable(true)
                .groupName("test")
                .select()
                /*
                配置RequestHandlerSelectors 扫描接口的方式
                指定扫描的包basePackage
                any()扫描全部
                none()不扫描
                withClassAnnotation：扫描类上的注解
                */
                .apis(RequestHandlerSelectors.basePackage("cn.world.blogserver"))
                //过滤路径 比如PathSelectors.ant("login/**")
                // .paths(PathSelectors.ant(""))
                .build();
    }

    public ApiInfo apinfo(){
        Contact contact = new Contact(
                "憨居居-blog",
                "",
                "");
        return new ApiInfo("憨居居-blog的api文档",
                "接口文档",
                "1.0",
                "",
                contact, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
