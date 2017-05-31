package com.selenium.po.testngrun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 方法体不需要写任何东西
 * 注解：
 * features：跑哪些feature,指向文件或文件夹
 * json：跑jenkins需要用到，target/cucumberjson.json生成的位置
 * tag：指定需要运行的case，~@Automation表示取反
 * glue: steps的包名
 *
 * case级别：p0,p1,p2,......
 */
@CucumberOptions(
        features = "src/main/java/com/selenium/po/steps/selenuimpo.feature",
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumberjson.json"},
        tags = {"@Automation"},
        glue = {"com.selenium.po.steps"}
)
public class RunDemo extends AbstractTestNGCucumberTests {
}
