package com.quarius.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.quarius.boot.bean.Car;
import com.quarius.boot.bean.Pet;
import com.quarius.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */

/**
 * 配置类里面使用@Bean 标注在方法上给容器注册组件，默认也是单实例的
 * 配置类本身也是组件
 * proxyBeanMethods:代理bean的方法 默认是true
 *    Full(proxyBeanMethods = true),
 *    Lite(proxyBeanMethods = false)
 *    处理组件依赖
 * @Import({User.class, DBHelper.class})
 *    导入组件，给容器中自动创建出这两个类型的组件,默认组件名字就是全类名
 * @ImportResource("classpath:beans.xml")导入Spring配置文件
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true) //告诉springboot这是一个配置类 == 配置文件
//@ConditionalOnBean(name = "user1")
@ConditionalOnMissingBean(name = "user1")
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
//开启Car配置绑定功能
// 把这个Car这个组件自动注册到容器中
public class MyConfig {

    /**
     * 外部无论对配置类的这个组件注册方法调用多少次获取到的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean //给容器添加组件，已方法名作为组件id,返回类型就是组件类型。返回的值就是组件在容器中的实例
    public User user1(){
        //User组件依赖了Pet组件
        User tpm = new User("tpm", 18);
        tpm.setPet(pet1());
        return tpm;
    }

//    @Bean("tom")
    public Pet pet1(){
        return new Pet("tom");
    }
}
