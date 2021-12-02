package com.quarius.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */

/**
 * 主程序类：所有启动的入口
 * @SpringBootApplication:这是个springboot应用
 */
@SpringBootApplication()
public class MainApplication {
    public static void main(String[] args) {
        // 返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 查看容器内所有组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

//        User user01 = run.getBean("user1", User.class);
//        User user02 = run.getBean("user1", User.class);
//        System.out.println("是否是单例："+(user01==user02));
//        // com.quarius.boot.config.MyConfig$$EnhancerBySpringCGLIB$$f05056e0@16727bf0
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查这个组件是否在容器中存在
//        // 保持组件单实例
//        User user = bean.user1();
//        User user2 = bean.user1();
//        System.out.println(user==user2);
//
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("宠物"+(tom==user.getPet()));
//
//        // 获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("=====");
//        for (String s : beanNamesForType) {
//
//            System.out.println(s);
//        }
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user1 = run.containsBean("user1");
        System.out.println("容器中User组件："+user1);

        boolean haha = run.containsBean("haha");
        System.out.println(haha);

    }
}
