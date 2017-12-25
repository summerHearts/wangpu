package com.wangpu.service;

import com.github.pagehelper.PageInfo;
import com.wangpu.common.ServerResponse;
import com.wangpu.pojo.Shipping;

/**
 * Created by Kenvin on 2017/12/25.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
