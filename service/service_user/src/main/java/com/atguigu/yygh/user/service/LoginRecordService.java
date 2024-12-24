package com.atguigu.yygh.user.service;
import com.atguigu.yygh.model.user.UserLoginRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

public interface LoginRecordService extends IService<UserLoginRecord>{
    //用户登录日志
    void saveLoginRecord(Long userId, String ip);
}
