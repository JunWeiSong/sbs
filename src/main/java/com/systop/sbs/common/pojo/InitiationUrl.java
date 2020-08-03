package com.systop.sbs.common.pojo;

import lombok.Data;

/**
 * @Program: sbs
 * @Description: TODO
 * @Author: liumiao
 * @Date: 2020/8/3 16:11
 **/
@Data
public class InitiationUrl {
    //启蒙链接id
    private Integer initiationUrlId;
    //启蒙链接地址
    private String initiationUrl;
    //启蒙名称
    private String initiationUrlName;
    //启蒙标题
    private String initiationUrlTitle;
    //启蒙描述
    private String initiationUrlDescribe;
    //备注
    private String remark;
}
