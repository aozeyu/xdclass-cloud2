package net.xdclass.service.impl;

import net.xdclass.dao.VideoMapper;
import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: xdclass-cloud
 * @description: 233
 * @packagename: net.xdclass.service.impl
 * @author: 姚泽宇
 * @date: 2022-05-12 13:36
 **/
@Service
public class VideoServiceIml implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public Video findById(Integer videoId) {
        return videoMapper.findById(videoId);
    }
}
