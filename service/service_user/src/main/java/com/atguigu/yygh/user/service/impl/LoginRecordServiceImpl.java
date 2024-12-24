package com.atguigu.yygh.user.service.impl;

import com.atguigu.yygh.model.user.UserLoginRecord;
import com.atguigu.yygh.user.mapper.LoginRecordMapper;
import com.atguigu.yygh.user.service.LoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LoginRecordServiceImpl extends ServiceImpl<LoginRecordMapper, UserLoginRecord> implements LoginRecordService {
    @Override
    public void saveLoginRecord(Long userId, String ip) {
        UserLoginRecord record = new UserLoginRecord();
        record.setUserId(userId);
        record.setIp(ip);
        baseMapper.insert(record);
    }
}
