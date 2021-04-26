package cn.world.blogserver.service;

import cn.world.blogserver.entities.SysUser;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/4/15 12:33
 */
public interface TestService {

    public String sayHello();

    public SysUser getSysUser(Integer id);
}
