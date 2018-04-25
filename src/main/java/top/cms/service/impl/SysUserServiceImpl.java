package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.SysUser;
import top.cms.dao.SysUserMapper;
import top.cms.service.SysUserService;

import java.util.List;

/**
 * @author yhmi
 * 用户操作实现Service
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;
    @Override
    public SysUser userLogin(String username) {
        return userMapper.findSysUserByUsername(username);
    }

    @Override
    public void updateSysUserSetLoginTimeByUid(SysUser sysUser) {
        userMapper.updateSysUserSetLoginTimeByUid(sysUser);
    }

    @Override
    public void updateSysUserSetLastTimeByUid(SysUser sysUser) {
        userMapper.updateSysUserSetLastTimeByUid(sysUser);
    }

    @Override
    public List<SysUser> findSysUserAll() {
        return userMapper.findSysUserAll();
    }

    @Override
    public SysUser findSysUserByUid(String uId) {
        return userMapper.findSysUserByUid(uId);
    }

    @Override
    public void updateSysUser(SysUser sysUser) {
        userMapper.updateSysUser(sysUser);
    }

    @Override
    public void delSysUserByUid(String uId) {
        userMapper.delSysUserByUid(uId);
    }

    @Override
    public void addSysUser(SysUser sysUser) {
        SysUser sysUserByUsernameA = userMapper.findSysUserByUsernameA(sysUser.getUsername());
        if (sysUserByUsernameA==null){
            userMapper.addSysUser(sysUser);
        }else {
            System.out.println("用户已经存在");
        }
        /**
         * Todo 日志后期添加用户存在
         */
    }

}
