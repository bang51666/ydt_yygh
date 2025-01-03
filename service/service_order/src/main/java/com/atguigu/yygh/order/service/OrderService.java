package com.atguigu.yygh.order.service;

import com.atguigu.yygh.model.order.OrderInfo;
import com.atguigu.yygh.vo.order.OrderCountQueryVo;
import com.atguigu.yygh.vo.order.OrderQueryVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface OrderService extends IService<OrderInfo> {
    //保存订单
    Long saveOrder(String scheduleId, Long patientId);
    /**
     * 分页列表
     */
    Page<OrderInfo> selectPage(Page<OrderInfo> pageParam, OrderQueryVo orderQueryVo);

    /**
     * 查询当前用户的订单
     */
    Page<OrderInfo> selectPageByUserId(Page<OrderInfo> pageParam, OrderQueryVo orderQueryVo);
    /**
     * 获取订单详情
     */
    OrderInfo getOrderInfo(Long id);

    /**
     * 订单详情
     * @param orderId
     * @return
     */
    Map<String,Object> show(Long orderId);

    /**
     * 取消订单
     * @param orderId
     */
    Boolean cancelOrder(Long orderId);

    /**
     * 就诊提醒
     */
    void patientTips();

    /**
     * 订单统计
     */
    Map<String, Object> getCountMap(OrderCountQueryVo orderCountQueryVo);
}