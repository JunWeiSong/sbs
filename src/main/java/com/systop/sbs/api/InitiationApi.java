package com.systop.sbs.api;

import com.systop.sbs.common.util.SbsResult;
import com.systop.sbs.service.InitiationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: sbs
 * @Description: TODO
 * @Author: liumiao
 * @Date: 2020/8/3 16:31
 **/
@RestController
@CrossOrigin
@RequestMapping("/api")
public class InitiationApi {
    @Autowired
    private InitiationService initiationService;

    @RequestMapping("/selectAllInitiationByType")
    public SbsResult selectAllInitiationByType(@RequestParam("initiationTypeId") Integer initiationTypeId){
        return SbsResult.success(initiationService.selectAllInitiationByType(initiationTypeId));
    }
}
