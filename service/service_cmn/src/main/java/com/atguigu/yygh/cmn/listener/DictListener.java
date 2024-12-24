package com.atguigu.yygh.cmn.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.atguigu.yygh.cmn.mapper.DictMapper;
import com.atguigu.yygh.model.cmn.Dict;
import com.atguigu.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DictListener extends AnalysisEventListener<DictEeVo> {

	//这里采用的是构造注入，所以需要手动创建一个有参构造方法
	private DictMapper dictMapper;

	public DictListener(DictMapper dictMapper) {
		this.dictMapper = dictMapper;
	}

	//一行一行地读取，从第二行开始读取(表头不读取)
	@Override
	public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
		//调用方法添加到数据库
		Dict dict = new Dict();
		BeanUtils.copyProperties(dictEeVo,dict);//将dictEeVo的属性拷贝到dict中
		dictMapper.insert(dict);
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext analysisContext) {

	}
}
