# springAction
最简单的java配置spring的方式

 采用零XML配置方式 配置java EE项目
 
 注意事项：
  1 在配置Mulipart 文件上传时：使用配置DispatcherServlet 时 重写customizeRegistration（）方法 ，
    设置registration.setMultipartConfig(new MultipartConfigElement("G:/temp/uploads")); 注意"G:/temp/uploads"路径要真是存在 否则会把报错
