package net.xdclass.dao;

import net.xdclass.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @program: xdclass-cloud
 * @description: 333
 * @packagename: net.xdclass.dao
 * @author: 姚泽宇
 * @date: 2022-05-12 13:36
 **/
@Repository
public interface VideoMapper {
    @Select("select  * from video where id=#{videoId} ")
    Video findById(@Param("videoId") Integer videoId);
}
