package cn.world.blogserver.dao;


import cn.world.blogserver.entities.SysUser;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * @Description: 系统用户Dao
 * @Author bestlmc
 * @Date 2020/4/12 12:20
 */
@Mapper
public interface SysUserDao {

    public int createSysUser(SysUser payment);

    public SysUser getSysUserById(@Param("id") Integer id);

}
