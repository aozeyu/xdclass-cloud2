package net.xdclass.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: xdclass-cloud
 * @description: 33
 * @packagename: net.xdclass.domain
 * @author: 姚泽宇
 * @date: 2022-05-12 13:23
 **/
@Data
public class VideoOrder {
    private Integer id;
    private String outTradeNo;
    private Integer state;
    private Date createTime;
    private  Integer totalFee;
    private Integer videoId;
    private String videoTitle;
    private String videoImg;
    private Integer userId;
}
