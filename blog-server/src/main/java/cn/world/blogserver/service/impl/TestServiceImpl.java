package cn.world.blogserver.service.impl;

import cn.world.blogserver.dao.SysUserDao;
import cn.world.blogserver.entities.SysUser;
import cn.world.blogserver.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author bestlmc
 * @Date 2021/4/15 12:33
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public String sayHello() {
        return "hello world!";
    }

    @Override
    public SysUser getSysUser(Integer id) {
        return sysUserDao.getSysUserById(id);
    }
}
