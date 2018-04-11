package top.cms.job;

import java.util.Date;

/**
 * 定时任务
 * @author yhmi
 */
public class MyJob {
    public void sayHello(){
        System.out.println(new Date() + " -> Hello, 我是任务 1");
    }
}
