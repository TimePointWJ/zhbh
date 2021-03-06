package com.jtzh.mapper;

import com.jtzh.entity.TbCamera;

import java.util.List;

public interface TbCameraMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCamera record);

    int insertSelective(TbCamera record);

    TbCamera selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCamera record);

    int updateByPrimaryKey(TbCamera record);

    TbCamera selectByCameraName(String cameraName);

    List<TbCamera> selectAll();
}