package net.xdclass.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: xdclass-cloud
 * @description: 22
 * @packagename: net.xdclass.domain
 * @author: 姚泽宇
 * @date: 2022-05-12 13:09
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private String wechat;
}
