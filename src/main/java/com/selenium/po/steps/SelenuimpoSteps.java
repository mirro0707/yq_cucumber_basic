package com.selenium.po.steps;

import com.selenium.po.pages.LoginPage;
import com.selenium.po.service.UtilsMail;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * 像原来的case层，这里由feature和step代替了
 *
 *  1）场景举例
 *  2）场景大纲举例， 场景大纲可以做数据驱动（例子：）
 * Created by YQ on 2017/5/31.
 *
 * feature是顺序执行的，用开始和结束的场景控制before和after之类的
 * 所以可以把数据准备，打开之类的放在第一个场景，所有浏览器关闭放在最后一个场景
 *
 *js ruby有全局的概念，可以全局控制
 */
public class SelenuimpoSteps {
    WebDriver driver;

    @当("^我打开163网站$")
    public void openURL()  {
//        System.out.println("step:我打开163网站");
        driver = new FirefoxDriver();
        driver.get("http://mail.163.com");
    }

    /**
     * ([^"]*)  =>  (.*?)
     */
    @并且("^我在email文本框输入\"(.*?)\"$")
    public void 我在email文本框输入(String name){
        System.out.println("step:我在email文本框输入"+name);
    }

    @并且("我在密码框输入\"(.*?)\"$")
    public void 我在密码框输入Meyoung(String password){
        System.out.println("step:我在密码框输入"+password);
    }

    @当("^我点击登录按钮$")
    public void 我点击登录按钮(){
        System.out.println("step:我点击登录按钮");

    }

    @那么("^我登录成功$")
    public void 我登录成功(){
//        System.out.println("step:我登录成功");
        String text = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/span[1]/span[1]")).getText();
        Assert.assertEquals(text,"meyoungtester");
    }

    @假如("^我用\"(.*?)\"账号，密码\"(.*?)\"登录$")
    public void 我用账号密码登录(String usrname, String pwd) throws InterruptedException {
//        System.out.println("step:"+usr+" "+pwd);
        UtilsMail.login(driver,usrname,pwd);
        driver.findElement(LoginPage.loginButton).click();//登录
        Thread.sleep(3000);

    }

    @当("^我打开搜狐网站$")
    public void openURL2()  {
        System.out.println("step:我打开搜狐网站");
    }

    @那么("^我登录搜狐网站成功$")
    public void 我登录成功2(){
        System.out.println("step:我登录搜狐网站成功");
    }

}
