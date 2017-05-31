#language: zh-CN
  功能:163登录功能
      #场景: 打开163网站
          #当我打开163网站
      @p0
      场景: 测试正确的账号登录
          当我打开163网站
          并且我在email文本框输入"meyoungTester"
          并且我在密码框输入"meyoung123"
          当我点击登录按钮
          那么我登录成功
      @p1
      场景: 测试正确的账号登录2
          假如我打开163网站
          假如我用"meyoungTester"账号，密码"meyoung123"登录
          那么我登录成功

      @Automation @p1
      场景大纲:  搜狐登录登录
          当我打开搜狐网站
          并且我在email文本框输入"<username>"
          并且我在密码框输入"<pwd>"
          那么我登录搜狐网站成功

          例子:
              | username | pwd |
              | test1         | pw1 |
              | test2         | pw2 |
              | test3         | pw3 |
              | test4         | pw4 |

     # 场景: 关闭163网站
         # 当关闭163网站