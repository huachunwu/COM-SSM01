package top.cms.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.sql.SQLOutput;

/**
 * @author yhmi
 * 通知类
 */
@Aspect
public class Advice {
    /**
     * 前置通知
     */
    @Before("execution(* top.cms.service.*ServiceImpl.*(..))")
    public  void before(){
        /*TODO 后期改为日志*/
        System.out.println("--------方法开始执行--------");
    }

    /**
     * 后置通知（无异常）
     */
    @AfterReturning("execution(* top.cms.service.*ServiceImpl.*(..))")
    public void afterReturning(){
        System.out.println("--------方法执行结束--------");
    }

    /**
     * 环绕通知
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("execution(* top.cms.service.*ServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("--------方法开始执行--------");
        Object proceed = point.proceed();
        System.out.println("--------方法执行结束--------");
        return proceed;
    }

    /**
     * 异常通知
     */
    @AfterReturning("execution(* top.cms.service.*ServiceImpl.*(..))")
    public void afterException(){
        System.out.println("出事了！出现异常了！！");
    }
    /**
     *后置通知
     */
    @After("execution(* top.cms.service.*ServiceImpl.*(..))")
    public void after(){
        System.out.println("--------方法执行结束--------");
    }
}
