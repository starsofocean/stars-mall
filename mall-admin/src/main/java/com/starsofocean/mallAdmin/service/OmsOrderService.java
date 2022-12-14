package com.starsofocean.mallAdmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starsofocean.mallAdmin.dto.*;
import com.starsofocean.mallCommon.domain.OmsOrder;

import java.util.List;

/**
 * @author starsofocean
 * date 2022/10/23 11:38
 */
public interface OmsOrderService extends IService<OmsOrder> {
    List<OmsOrder> getList(OmsOrderQueryParam queryParam, Integer pageNum, Integer pageSize);

    int updateDelivery(List<OmsOrderDeliveryParam> deliveryParamList);

    int close(List<Long> ids, String note);

    int delete(List<Long> ids);

    OmsOrderDetail getDetail(Long id);

    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    int updateNote(Long id, String note, Integer status);
}
