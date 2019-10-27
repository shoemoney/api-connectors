/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Place new conditional order response
 */
@ApiModel(description = "Place new conditional order response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-27T12:05:04.065+08:00")
public class ConditionalRes {
  @SerializedName("stop_order_id")
  private String stopOrderId = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("stop_order_status")
  private String stopOrderStatus = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("qty")
  private BigDecimal qty = null;

  @SerializedName("time_in_force")
  private String timeInForce = null;

  @SerializedName("stop_order_type")
  private String stopOrderType = null;

  @SerializedName("base_price")
  private Double basePrice = null;

  @SerializedName("stop_px")
  private Double stopPx = null;

  @SerializedName("order_link_id")
  private String orderLinkId = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public ConditionalRes stopOrderId(String stopOrderId) {
    this.stopOrderId = stopOrderId;
    return this;
  }

   /**
   * Get stopOrderId
   * @return stopOrderId
  **/
  @ApiModelProperty(value = "")
  public String getStopOrderId() {
    return stopOrderId;
  }

  public void setStopOrderId(String stopOrderId) {
    this.stopOrderId = stopOrderId;
  }

  public ConditionalRes userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public ConditionalRes stopOrderStatus(String stopOrderStatus) {
    this.stopOrderStatus = stopOrderStatus;
    return this;
  }

   /**
   * Get stopOrderStatus
   * @return stopOrderStatus
  **/
  @ApiModelProperty(value = "")
  public String getStopOrderStatus() {
    return stopOrderStatus;
  }

  public void setStopOrderStatus(String stopOrderStatus) {
    this.stopOrderStatus = stopOrderStatus;
  }

  public ConditionalRes symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ConditionalRes side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public ConditionalRes orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public ConditionalRes price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ConditionalRes qty(BigDecimal qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQty() {
    return qty;
  }

  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  public ConditionalRes timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @ApiModelProperty(value = "")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public ConditionalRes stopOrderType(String stopOrderType) {
    this.stopOrderType = stopOrderType;
    return this;
  }

   /**
   * Get stopOrderType
   * @return stopOrderType
  **/
  @ApiModelProperty(value = "")
  public String getStopOrderType() {
    return stopOrderType;
  }

  public void setStopOrderType(String stopOrderType) {
    this.stopOrderType = stopOrderType;
  }

  public ConditionalRes basePrice(Double basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @ApiModelProperty(value = "")
  public Double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(Double basePrice) {
    this.basePrice = basePrice;
  }

  public ConditionalRes stopPx(Double stopPx) {
    this.stopPx = stopPx;
    return this;
  }

   /**
   * Get stopPx
   * @return stopPx
  **/
  @ApiModelProperty(value = "")
  public Double getStopPx() {
    return stopPx;
  }

  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }

  public ConditionalRes orderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
    return this;
  }

   /**
   * Get orderLinkId
   * @return orderLinkId
  **/
  @ApiModelProperty(value = "")
  public String getOrderLinkId() {
    return orderLinkId;
  }

  public void setOrderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
  }

  public ConditionalRes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ConditionalRes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalRes conditionalRes = (ConditionalRes) o;
    return Objects.equals(this.stopOrderId, conditionalRes.stopOrderId) &&
        Objects.equals(this.userId, conditionalRes.userId) &&
        Objects.equals(this.stopOrderStatus, conditionalRes.stopOrderStatus) &&
        Objects.equals(this.symbol, conditionalRes.symbol) &&
        Objects.equals(this.side, conditionalRes.side) &&
        Objects.equals(this.orderType, conditionalRes.orderType) &&
        Objects.equals(this.price, conditionalRes.price) &&
        Objects.equals(this.qty, conditionalRes.qty) &&
        Objects.equals(this.timeInForce, conditionalRes.timeInForce) &&
        Objects.equals(this.stopOrderType, conditionalRes.stopOrderType) &&
        Objects.equals(this.basePrice, conditionalRes.basePrice) &&
        Objects.equals(this.stopPx, conditionalRes.stopPx) &&
        Objects.equals(this.orderLinkId, conditionalRes.orderLinkId) &&
        Objects.equals(this.createdAt, conditionalRes.createdAt) &&
        Objects.equals(this.updatedAt, conditionalRes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopOrderId, userId, stopOrderStatus, symbol, side, orderType, price, qty, timeInForce, stopOrderType, basePrice, stopPx, orderLinkId, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalRes {\n");
    
    sb.append("    stopOrderId: ").append(toIndentedString(stopOrderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    stopOrderStatus: ").append(toIndentedString(stopOrderStatus)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    stopOrderType: ").append(toIndentedString(stopOrderType)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    stopPx: ").append(toIndentedString(stopPx)).append("\n");
    sb.append("    orderLinkId: ").append(toIndentedString(orderLinkId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

