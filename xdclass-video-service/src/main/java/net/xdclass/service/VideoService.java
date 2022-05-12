package net.xdclass.service;

import net.xdclass.domain.Video;

/**
 * @program: xdclass-cloud
 * @description: 2333
 * @packagename: net.xdclass.service
 * @author: 姚泽宇()
 **/
public interface VideoService {
    Video findById(int videoId);
}
