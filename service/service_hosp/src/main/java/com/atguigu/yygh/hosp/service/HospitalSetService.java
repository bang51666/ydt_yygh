package com.atguigu.yygh.hosp.service;


import com.atguigu.yygh.model.hosp.HospitalSet;
import com.atguigu.yygh.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

public interface HospitalSetService extends IService<HospitalSet> {
	//根据传递过来的医院编码，查询数据库，查询签名
	String getSignKey(String hosCode);

	//获取医院签名信息
	SignInfoVo getSignInfoVo(String hoscode);
}
