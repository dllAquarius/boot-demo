package com.quarius.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */
@ToString
@Data
@AllArgsConstructor //无参构造器
@NoArgsConstructor //全参构造器
public class Pet {
    private String name;

}
