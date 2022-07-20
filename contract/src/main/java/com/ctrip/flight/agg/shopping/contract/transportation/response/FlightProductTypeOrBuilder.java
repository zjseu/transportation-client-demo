// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface FlightProductTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.FlightProductType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 索引号
   * </pre>
   *
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 出票航司
   * </pre>
   *
   * <code>string ValidatingCarrier = 2;</code>
   */
  java.lang.String getValidatingCarrier();
  /**
   * <pre>
   * 出票航司
   * </pre>
   *
   * <code>string ValidatingCarrier = 2;</code>
   */
  com.google.protobuf.ByteString
      getValidatingCarrierBytes();

  /**
   * <pre>
   * 查询Channel
   * </pre>
   *
   * <code>string BookingChannel = 3;</code>
   */
  java.lang.String getBookingChannel();
  /**
   * <pre>
   * 查询Channel
   * </pre>
   *
   * <code>string BookingChannel = 3;</code>
   */
  com.google.protobuf.ByteString
      getBookingChannelBytes();

  /**
   * <pre>
   * 根据乘客类型划分的航班价格信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType PaxProduct = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType> 
      getPaxProductList();
  /**
   * <pre>
   * 根据乘客类型划分的航班价格信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType PaxProduct = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType getPaxProduct(int index);
  /**
   * <pre>
   * 根据乘客类型划分的航班价格信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType PaxProduct = 4;</code>
   */
  int getPaxProductCount();
  /**
   * <pre>
   * 根据乘客类型划分的航班价格信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType PaxProduct = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductTypeOrBuilder> 
      getPaxProductOrBuilderList();
  /**
   * <pre>
   * 根据乘客类型划分的航班价格信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductType PaxProduct = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FlightPaxProductTypeOrBuilder getPaxProductOrBuilder(
      int index);

  /**
   * <pre>
   * 产品类型
   * </pre>
   *
   * <code>repeated string ProductType = 5;</code>
   */
  java.util.List<java.lang.String>
      getProductTypeList();
  /**
   * <pre>
   * 产品类型
   * </pre>
   *
   * <code>repeated string ProductType = 5;</code>
   */
  int getProductTypeCount();
  /**
   * <pre>
   * 产品类型
   * </pre>
   *
   * <code>repeated string ProductType = 5;</code>
   */
  java.lang.String getProductType(int index);
  /**
   * <pre>
   * 产品类型
   * </pre>
   *
   * <code>repeated string ProductType = 5;</code>
   */
  com.google.protobuf.ByteString
      getProductTypeBytes(int index);

  /**
   * <pre>
   * 提供行程单或发票选项：1: 发票, 2: 行程单, 4: 行+差, 8: 电子凭证, 按位相加可以表示多个值
   * </pre>
   *
   * <code>int32 InvoiceType = 6;</code>
   */
  int getInvoiceType();

  /**
   * <pre>
   * 限制类信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.RestrictionType Restriction = 7;</code>
   */
  boolean hasRestriction();
  /**
   * <pre>
   * 限制类信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.RestrictionType Restriction = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.RestrictionType getRestriction();
  /**
   * <pre>
   * 限制类信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.RestrictionType Restriction = 7;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.RestrictionTypeOrBuilder getRestrictionOrBuilder();

  /**
   * <pre>
   *None = 0;
   *Exclusive = 1;
   *Cloud = 2;
   *Prioritizing = 4;
   *LowestPrice = 8;
   *FlagShipStore = 16;
   * </pre>
   *
   * <code>int32 ProductCategory = 8;</code>
   */
  int getProductCategory();

  /**
   * <pre>
   *None = 0;
   *Platforms = 1;
   *PlatformsPrivate = 2;
   *OverseasPrivate = 3;
   *Overseas = 4;
   *Owner = 5;
   *Pseat = 6;
   *RTSeat = 7;
   *CSD = 8;
   *CSDPrivate = 9;
   *Airline = 10;
   *LowestPrice = 11;
   *KWPrivate = 12;
   *CSDPublish = 13;
   *OSeat = 14;
   * </pre>
   *
   * <code>int32 SubProductCategory = 9;</code>
   */
  int getSubProductCategory();

  /**
   * <pre>
   * 缓存信息，调试用
   * </pre>
   *
   * <code>int32 CacheRef = 10;</code>
   */
  int getCacheRef();

  /**
   * <pre>
   * 最晚出票时限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TicketingTimeLimitType TicketingTimeLimit = 11;</code>
   */
  boolean hasTicketingTimeLimit();
  /**
   * <pre>
   * 最晚出票时限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TicketingTimeLimitType TicketingTimeLimit = 11;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.TicketingTimeLimitType getTicketingTimeLimit();
  /**
   * <pre>
   * 最晚出票时限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.TicketingTimeLimitType TicketingTimeLimit = 11;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.TicketingTimeLimitTypeOrBuilder getTicketingTimeLimitOrBuilder();

  /**
   * <pre>
   * 运价Fare信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FareRefType FareRef = 12;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.FareRefType> 
      getFareRefList();
  /**
   * <pre>
   * 运价Fare信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FareRefType FareRef = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FareRefType getFareRef(int index);
  /**
   * <pre>
   * 运价Fare信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FareRefType FareRef = 12;</code>
   */
  int getFareRefCount();
  /**
   * <pre>
   * 运价Fare信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FareRefType FareRef = 12;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.FareRefTypeOrBuilder> 
      getFareRefOrBuilderList();
  /**
   * <pre>
   * 运价Fare信息
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.FareRefType FareRef = 12;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.FareRefTypeOrBuilder getFareRefOrBuilder(
      int index);

  /**
   * <pre>
   * 航司最晚出票时间
   * </pre>
   *
   * <code>string CarrierTicketingDeadline = 13;</code>
   */
  java.lang.String getCarrierTicketingDeadline();
  /**
   * <pre>
   * 航司最晚出票时间
   * </pre>
   *
   * <code>string CarrierTicketingDeadline = 13;</code>
   */
  com.google.protobuf.ByteString
      getCarrierTicketingDeadlineBytes();

  /**
   * <pre>
   * 资质描述信息的RefID
   * </pre>
   *
   * <code>int32 EligibilityRemarkRef = 14;</code>
   */
  int getEligibilityRemarkRef();

  /**
   * <pre>
   * 国际机票标签类信息
   * </pre>
   *
   * <code>repeated int32 RecommendPrdType = 15;</code>
   */
  java.util.List<java.lang.Integer> getRecommendPrdTypeList();
  /**
   * <pre>
   * 国际机票标签类信息
   * </pre>
   *
   * <code>repeated int32 RecommendPrdType = 15;</code>
   */
  int getRecommendPrdTypeCount();
  /**
   * <pre>
   * 国际机票标签类信息
   * </pre>
   *
   * <code>repeated int32 RecommendPrdType = 15;</code>
   */
  int getRecommendPrdType(int index);

  /**
   * <pre>
   * 供应商信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierType FlightSupplier = 16;</code>
   */
  boolean hasFlightSupplier();
  /**
   * <pre>
   * 供应商信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierType FlightSupplier = 16;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierType getFlightSupplier();
  /**
   * <pre>
   * 供应商信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierType FlightSupplier = 16;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.FlightSupplierTypeOrBuilder getFlightSupplierOrBuilder();

  /**
   * <pre>
   * 按航司显示舱位、票面价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CarrierPriceShowType CarrierPriceShow = 17;</code>
   */
  boolean hasCarrierPriceShow();
  /**
   * <pre>
   * 按航司显示舱位、票面价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CarrierPriceShowType CarrierPriceShow = 17;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.CarrierPriceShowType getCarrierPriceShow();
  /**
   * <pre>
   * 按航司显示舱位、票面价
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CarrierPriceShowType CarrierPriceShow = 17;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.CarrierPriceShowTypeOrBuilder getCarrierPriceShowOrBuilder();

  /**
   * <pre>
   * 抢票信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.GrabTicketType GrabTicket = 18;</code>
   */
  boolean hasGrabTicket();
  /**
   * <pre>
   * 抢票信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.GrabTicketType GrabTicket = 18;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.GrabTicketType getGrabTicket();
  /**
   * <pre>
   * 抢票信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.GrabTicketType GrabTicket = 18;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.GrabTicketTypeOrBuilder getGrabTicketOrBuilder();

  /**
   * <pre>
   * 会员注册,1：联系人注册,2：单个乘机人注册,3：多个乘机人注册
   * </pre>
   *
   * <code>int32 MembershipRegisterType = 19;</code>
   */
  int getMembershipRegisterType();

  /**
   * <pre>
   * 航司直销Pc码
   * </pre>
   *
   * <code>string PcCode = 20;</code>
   */
  java.lang.String getPcCode();
  /**
   * <pre>
   * 航司直销Pc码
   * </pre>
   *
   * <code>string PcCode = 20;</code>
   */
  com.google.protobuf.ByteString
      getPcCodeBytes();

  /**
   * <pre>
   * 营销活动代码
   * </pre>
   *
   * <code>repeated string MarketingCode = 21;</code>
   */
  java.util.List<java.lang.String>
      getMarketingCodeList();
  /**
   * <pre>
   * 营销活动代码
   * </pre>
   *
   * <code>repeated string MarketingCode = 21;</code>
   */
  int getMarketingCodeCount();
  /**
   * <pre>
   * 营销活动代码
   * </pre>
   *
   * <code>repeated string MarketingCode = 21;</code>
   */
  java.lang.String getMarketingCode(int index);
  /**
   * <pre>
   * 营销活动代码
   * </pre>
   *
   * <code>repeated string MarketingCode = 21;</code>
   */
  com.google.protobuf.ByteString
      getMarketingCodeBytes(int index);

  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 22;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType> 
      getTagList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 22;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType getTag(int index);
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 22;</code>
   */
  int getTagCount();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 22;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder> 
      getTagOrBuilderList();
  /**
   * <pre>
   * 扩展结点
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairType Tag = 22;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.KeyValuePairTypeOrBuilder getTagOrBuilder(
      int index);

  /**
   * <pre>
   * 政策关键信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PolicyKeyType PolicyKey = 23;</code>
   */
  boolean hasPolicyKey();
  /**
   * <pre>
   * 政策关键信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PolicyKeyType PolicyKey = 23;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PolicyKeyType getPolicyKey();
  /**
   * <pre>
   * 政策关键信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PolicyKeyType PolicyKey = 23;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PolicyKeyTypeOrBuilder getPolicyKeyOrBuilder();

  /**
   * <pre>
   * 多程政策的限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionType MultiSegmentRestriction = 24;</code>
   */
  boolean hasMultiSegmentRestriction();
  /**
   * <pre>
   * 多程政策的限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionType MultiSegmentRestriction = 24;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionType getMultiSegmentRestriction();
  /**
   * <pre>
   * 多程政策的限制信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionType MultiSegmentRestriction = 24;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MultiSegmentRestrictionTypeOrBuilder getMultiSegmentRestrictionOrBuilder();

  /**
   * <pre>
   * 绿飞权益信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.GreenFlyingType GreenFlying = 25;</code>
   */
  boolean hasGreenFlying();
  /**
   * <pre>
   * 绿飞权益信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.GreenFlyingType GreenFlying = 25;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.GreenFlyingType getGreenFlying();
  /**
   * <pre>
   * 绿飞权益信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.GreenFlyingType GreenFlying = 25;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.GreenFlyingTypeOrBuilder getGreenFlyingOrBuilder();

  /**
   * <pre>
   * 预订场景信息的Ref
   * </pre>
   *
   * <code>int32 BookingSceneSpecifiedRef = 26;</code>
   */
  int getBookingSceneSpecifiedRef();

  /**
   * <pre>
   * 国内PATA信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PataType Pata = 27;</code>
   */
  boolean hasPata();
  /**
   * <pre>
   * 国内PATA信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PataType Pata = 27;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PataType getPata();
  /**
   * <pre>
   * 国内PATA信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PataType Pata = 27;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PataTypeOrBuilder getPataOrBuilder();

  /**
   * <pre>
   * 无证件标识 0:不支持无证件 1:支持无证件
   * </pre>
   *
   * <code>int32 NoIdentityCardInd = 28;</code>
   */
  int getNoIdentityCardInd();

  /**
   * <pre>
   * 会员注册信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterType MemberRegister = 29;</code>
   */
  boolean hasMemberRegister();
  /**
   * <pre>
   * 会员注册信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterType MemberRegister = 29;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterType getMemberRegister();
  /**
   * <pre>
   * 会员注册信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterType MemberRegister = 29;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MemberRegisterTypeOrBuilder getMemberRegisterOrBuilder();

  /**
   * <pre>
   * 溢价产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PremiumProductType PremiumProduct = 30;</code>
   */
  boolean hasPremiumProduct();
  /**
   * <pre>
   * 溢价产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PremiumProductType PremiumProduct = 30;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PremiumProductType getPremiumProduct();
  /**
   * <pre>
   * 溢价产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PremiumProductType PremiumProduct = 30;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PremiumProductTypeOrBuilder getPremiumProductOrBuilder();

  /**
   * <pre>
   * 账单信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.BillingType Billing = 31;</code>
   */
  boolean hasBilling();
  /**
   * <pre>
   * 账单信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.BillingType Billing = 31;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.BillingType getBilling();
  /**
   * <pre>
   * 账单信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.BillingType Billing = 31;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.BillingTypeOrBuilder getBillingOrBuilder();

  /**
   * <pre>
   * 优惠的产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PreferentialProductType PreferentialProduct = 32;</code>
   */
  boolean hasPreferentialProduct();
  /**
   * <pre>
   * 优惠的产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PreferentialProductType PreferentialProduct = 32;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PreferentialProductType getPreferentialProduct();
  /**
   * <pre>
   * 优惠的产品信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.PreferentialProductType PreferentialProduct = 32;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.PreferentialProductTypeOrBuilder getPreferentialProductOrBuilder();

  /**
   * <pre>
   * 航班舱位可累积里程积分
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType MileageCredit = 33;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType> 
      getMileageCreditList();
  /**
   * <pre>
   * 航班舱位可累积里程积分
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType MileageCredit = 33;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType getMileageCredit(int index);
  /**
   * <pre>
   * 航班舱位可累积里程积分
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType MileageCredit = 33;</code>
   */
  int getMileageCreditCount();
  /**
   * <pre>
   * 航班舱位可累积里程积分
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType MileageCredit = 33;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditTypeOrBuilder> 
      getMileageCreditOrBuilderList();
  /**
   * <pre>
   * 航班舱位可累积里程积分
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditType MileageCredit = 33;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MileageCreditTypeOrBuilder getMileageCreditOrBuilder(
      int index);

  /**
   * <pre>
   * 餐食信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MealType Meal = 34;</code>
   */
  boolean hasMeal();
  /**
   * <pre>
   * 餐食信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MealType Meal = 34;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MealType getMeal();
  /**
   * <pre>
   * 餐食信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.MealType Meal = 34;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.MealTypeOrBuilder getMealOrBuilder();

  /**
   * <pre>
   * 两舱特征信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CFCabinFeatureType CFCabinFeature = 35;</code>
   */
  boolean hasCFCabinFeature();
  /**
   * <pre>
   * 两舱特征信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CFCabinFeatureType CFCabinFeature = 35;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.CFCabinFeatureType getCFCabinFeature();
  /**
   * <pre>
   * 两舱特征信息
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.response.CFCabinFeatureType CFCabinFeature = 35;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.CFCabinFeatureTypeOrBuilder getCFCabinFeatureOrBuilder();
}
