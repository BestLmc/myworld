package cn.world.blogserver.controller;

import cn.world.blogserver.entities.SysUser;
import cn.world.blogserver.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description 测试接口
 * @Author bestlmc
 * @Date 2021/4/15 12:33
 */
@Api(value="测试controller",tags={"测试接口"})
@RequestMapping("/api/test")
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("sayHello")
    @ApiOperation(value="你好啊!")
    public String sayHello(){
        return testService.sayHello();
    }

    @GetMapping("getUser")
    @ApiOperation(value="获取用户信息")
    public SysUser getSysUser(@RequestParam(name = "id", required = true) Integer id){
        return testService.getSysUser(id);
    }
}
