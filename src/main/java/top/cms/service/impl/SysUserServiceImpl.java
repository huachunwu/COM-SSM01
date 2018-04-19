package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.SysUser;
import top.cms.dao.SysUserMapper;
import top.cms.service.SysUserService;

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
}
