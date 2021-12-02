package com.quarius.boot.bean;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */

@ToString
@Data
//@AllArgsConstructor // 全参构造器
@NoArgsConstructor //无参构造器
@EqualsAndHashCode
public class User {
    private String name;
    private Integer age;
    private Pet pet;
    public User(String name,Integer age){
        this.name=name;
        this.age=age;
    }
}
