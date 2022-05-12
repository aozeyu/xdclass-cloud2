package net.xdclass.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: xdclass-cloud
 * @description: 22
 * @packagename: net.xdclass.domain
 * @author: 姚泽宇
 * @date: 2022-05-12 13:22
 **/
@Data
public class Video {
    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer  price;
    private Date createTime;
    private Double point;
    private String serverInfo;
}
