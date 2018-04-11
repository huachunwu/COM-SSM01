package top.cms.utils;

import java.util.UUID;

/**
 * @author yhmi
 * UUID工具类
 */
public class UUIDUtils {
    /**
     * 生成uuid
     * @return 返回生成的UUID
     */
    public String uuid(){
        return UUID.randomUUID().toString();
    }
}
