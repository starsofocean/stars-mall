package com.starsofocean.mallCommon.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author starsofocean
 * date 2022/11/7 20:18
 */
@Data
public class OmsOrderReturnApply implements Serializable {
    private Long id;


    private Long orderId;


    private Long companyAddressId;


    private Long productId;


    private String orderSn;


    private Date createTime;


    private String memberUsername;


    private BigDecimal returnAmount;


    private String returnName;


    private String returnPhone;


    private Integer status;


    private Date handleTime;


    private String productPic;


    private String productName;

    private String productBrand;


    private String productAttr;


    private Integer productCount;


    private BigDecimal productPrice;


    private BigDecimal productRealPrice;


    private String reason;


    private String description;


    private String proofPics;


    private String handleNote;

    private String handleMan;


    private String receiveMan;


    private Date receiveTime;


    private String receiveNote;

    private static final long serialVersionUID = 1L;
}
