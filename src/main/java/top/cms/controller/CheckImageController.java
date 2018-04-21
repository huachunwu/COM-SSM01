package top.cms.controller;

import org.apache.shiro.authz.annotation.RequiresGuest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;


/**
 * @author yhmi
 * 验证码生成
 */
@Controller
public class CheckImageController {
    @RequiresGuest
    @RequestMapping(value = "CheckImage.cms")
    public void checkImage(HttpSession session, HttpServletResponse response) throws IOException {
        Random random=new Random();
        /**
         * 字体宽度
         */
        int fontWidth=40;
        /**
         * 字体高度
         */
        int fontHeight = 35;
        int codeY = 32;
        /**
         * 图像buffer
         */
        BufferedImage bufferedImage=new BufferedImage(160,40,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        /**
         * 设置背景色
         */
        Color color=new Color(200+random.nextInt(250-200),200+random.nextInt(250-200),200+random.nextInt(250-200));
        graphics.setColor(color);
        graphics.fillRect(0,0,160,40);
        /**
         * 设置字体
         */
        Font font=new Font("Fixedsys",Font.BOLD,fontHeight);
        graphics.setFont(font);

        /**
         * 设置干扰线
         */
        for (int i=0;i<20;i++){
            int xs=random.nextInt(160);
            int ys=random.nextInt(40);
            int xe=xs+random.nextInt(160);
            int ye=ys+random.nextInt(40);
            graphics.setColor(new Color(1+random.nextInt(255-1),1+random.nextInt(255-1),1+random.nextInt(255-1)));
            graphics.drawLine(xs,ys,xe,ye);
        }

        /**
         * 添加噪点
         */
        /**
         * 噪声率
         */
        float yawpRate=0.01f;
        int area=(int)(yawpRate*160*40);
        for (int i=0;i<area;i++){
            int x=random.nextInt(160);
            int y=random.nextInt(40);
            bufferedImage.setRGB(x,y,random.nextInt(255));
        }
        /**
         * 得到随机字符串
         */
        char[] chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuffer str2=new StringBuffer();
        int len=chars.length;
        int r;
        for (int i=0;i<4;i++){
            r=random.nextInt(len);
            str2.append(chars[r]);
        }
        for (int i=0;i<4;i++){
            String strRand=str2.toString().substring(i,i+1);
            graphics.setColor(new Color(1+random.nextInt(255-1),1+random.nextInt(255-1),1+random.nextInt(255-1)));
            graphics.drawString(strRand,i*fontWidth+3,codeY);
        }
        session.setAttribute("piccode",str2.toString().toLowerCase());
        ImageIO.write(bufferedImage,"JPG",response.getOutputStream());
        System.out.println(str2.toString().toLowerCase());
    }
}
