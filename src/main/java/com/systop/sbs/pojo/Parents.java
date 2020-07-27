package com.systop.sbs.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Program: sbs
 * @Description: TODO
 * @Author: 贾小翠
 * @Date: 2020/7/27 16:01
 **/
@Data
public class Parents {
    //家长id
    private Integer parId;
    //家长姓名
    private String parName;
    //家长密码
    private String parPwd;
    //家长电话
    private String parPhone;
    //学生学号
    private Student student;
    //家长在线状态：0在线 1离线
    private Integer parOnlineStatus;
    //备注
    private String remark;
}
