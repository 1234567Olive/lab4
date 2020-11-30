# lab4
实验四
实验截图1：https://github.com/1234567Olive/lab4/blob/master/4.1.jpg
实验截图2：https://github.com/1234567Olive/lab4/blob/master/4.2.png
自定义WebView验证隐式Intent的使用
1.新建一个工程用来获取URL地址并启动Intent
（1）在activity_main中增加一个EditText组件和一个按钮组件
（2）为MainActivity指定视图，设置Intent的动作为ACTION_VIEW（查看指定数据），获取输入框的内容，作为Intent的data
2新建一个工程使用WebView来加载URL
（1）创建activity_webview.xml，添加一个WebView组件
（2）创建MyBrowser.java，获取对应的Intent的Data属性，作为Url对象的参数，设置WebView组件。
（3）在AndroidManifest.xml文件中注册MyBrowser，设置意图过滤器intent-filter， 设置uses-permission。
