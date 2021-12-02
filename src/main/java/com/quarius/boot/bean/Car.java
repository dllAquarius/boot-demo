package com.quarius.boot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */

/**
 * 只有在容器中的组件，才拥有SpringBoot提供的强大的功能
 */
//@Component

@ToString
@Data
@AllArgsConstructor //无参构造器
@NoArgsConstructor //全参构造器
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

}
