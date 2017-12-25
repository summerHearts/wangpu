package com.wangpu.service.Impl;

import com.alipay.api.AlipayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.demo.trade.config.Configs;
import com.alipay.demo.trade.model.ExtendParams;
import com.alipay.demo.trade.model.GoodsDetail;
import com.alipay.demo.trade.model.builder.AlipayTradePrecreateRequestBuilder;
import com.alipay.demo.trade.model.result.AlipayF2FPrecreateResult;
import com.alipay.demo.trade.service.AlipayTradeService;
import com.alipay.demo.trade.service.impl.AlipayTradeServiceImpl;
import com.alipay.demo.trade.utils.ZxingUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.wangpu.common.Const;
import com.wangpu.common.ServerResponse;
import com.wangpu.dao.*;
import com.wangpu.pojo.*;
import com.wangpu.service.IOrderService;
import com.wangpu.util.BigDecimalUtil;
import com.wangpu.util.DateTimeUtil;
import com.wangpu.util.PropertiesUtil;
import com.wangpu.vo.OrderItemVo;
import com.wangpu.vo.OrderVo;
import com.wangpu.vo.ShippingVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Kenvin on 2017/12/25.
 */
@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {

}
