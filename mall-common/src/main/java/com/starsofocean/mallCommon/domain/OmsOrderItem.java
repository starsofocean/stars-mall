package com.starsofocean.mallCommon.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author starsofocean
 * date 2022/11/2 11:44
 */
@Data
public class OmsOrderItem implements Serializable {
    private Long id;


    private Long orderId;


    private String orderSn;

    private Long productId;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productSn;


    private BigDecimal productPrice;


    private Integer productQuantity;


    private Long productSkuId;


    private String productSkuCode;


    private Long productCategoryId;


    private String promotionName;


    private BigDecimal promotionAmount;


    private BigDecimal couponAmount;


    private BigDecimal integrationAmount;


    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;


    private String productAttr;

    private static final long serialVersionUID = 1L;
}
