package net.xdclass.controller;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: xdclass-cloud
 * @description: 222
 * @packagename: net.xdclass.controller
 * @author: 姚泽宇
 * @date: 2022-05-12 13:35
 **/
@RestController
@RequestMapping("api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("find_by_id")
    public Object findVideo(Integer videoId) {
        return videoService.findById(videoId);
    }

}
