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
 * LeverageInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T19:54:52.777+08:00")
public class LeverageInfo {
  @SerializedName("leverage")
  private BigDecimal leverage = null;

  public LeverageInfo leverage(BigDecimal leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeverage() {
    return leverage;
  }

  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeverageInfo leverageInfo = (LeverageInfo) o;
    return Objects.equals(this.leverage, leverageInfo.leverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeverageInfo {\n");
    
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
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

