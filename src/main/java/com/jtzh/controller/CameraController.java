package com.jtzh.controller;

import com.jtzh.common.ResultObject;
import com.jtzh.entity.TbCamera;
import com.jtzh.service.Impl.CameraServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "87视频管理")
@RestController
@RequestMapping("/camera")
public class CameraController {

    @Resource
    private CameraServiceImpl cameraServiceImpl;

    @ApiOperation(value="获取视频资源")
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public void getTotal(){
        cameraServiceImpl.getPointList();
    }

    @ApiOperation(value="获取视频资源坐标")
    @RequestMapping(value = "/getXY", method = RequestMethod.POST)
    public void getXY(){
        cameraServiceImpl.readExcelOrigin();
    }

    @ApiOperation(value="获取所有视频资源坐标")
    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    public List<TbCamera> getAll(){
        return cameraServiceImpl.selectAll();
    }
}
