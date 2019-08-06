/*
 * Sales Order - Create, Read, Update, Delete (A2X)
 * You can use this service to integrate external  applications with sales order processing in SAP  S/4HANA Cloud. In every API call, you can make  use of the following operations:  - You can retrieve  sales orders. Apply any of the filters provided or  retrieve all existing data.  - You can create sales  orders. Note that you must use “deep insert”  requests (a header plus the following entities:  header partner, header pricing element, header  text, payment details, item, item partner, item  pricing element, and item text). You cannot create  entities without including any related entities.  - For  existing sales orders, you can create new items.  Note that you must use “deep insert” requests  (with the following entities: item partner, item pricing  element, and item text). You cannot create entities  without including any related entities.  - For existing  sales orders, you can update the header, header  partner, header pricing element, header text,  payment details, item, item partner, item pricing  element, and item text.  - For existing sales  orders, you can delete the header, header partner,  header pricing element, header text, payment  details, item, item partner, item pricing element,  and item text.  - You can accept or deny approval  requests for sales orders that cannot be processed  without the consent of an approver.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_sales_order_srv.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sales Order Payment Plan Item Details (API)
 */
@ApiModel(description = "Sales Order Payment Plan Item Details (API)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T07:18:58.114Z")
public class APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType {
  @SerializedName("SalesOrder")
  private String salesOrder = null;

  @SerializedName("PaymentPlanItem")
  private String paymentPlanItem = null;

  @SerializedName("to_SalesOrder")
  private APISALESORDERSRVASalesOrderType toSalesOrder = null;

  public APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType salesOrder(String salesOrder) {
    this.salesOrder = salesOrder;
    return this;
  }

   /**
   * Sales Order
   * @return salesOrder
  **/
  @ApiModelProperty(value = "Sales Order")
  public String getSalesOrder() {
    return salesOrder;
  }

  public void setSalesOrder(String salesOrder) {
    this.salesOrder = salesOrder;
  }

  public APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType paymentPlanItem(String paymentPlanItem) {
    this.paymentPlanItem = paymentPlanItem;
    return this;
  }

   /**
   * Item for billing plan/invoice plan/payment cards
   * @return paymentPlanItem
  **/
  @ApiModelProperty(value = "Item for billing plan/invoice plan/payment cards")
  public String getPaymentPlanItem() {
    return paymentPlanItem;
  }

  public void setPaymentPlanItem(String paymentPlanItem) {
    this.paymentPlanItem = paymentPlanItem;
  }

  public APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType toSalesOrder(APISALESORDERSRVASalesOrderType toSalesOrder) {
    this.toSalesOrder = toSalesOrder;
    return this;
  }

   /**
   * Get toSalesOrder
   * @return toSalesOrder
  **/
  @ApiModelProperty(value = "")
  public APISALESORDERSRVASalesOrderType getToSalesOrder() {
    return toSalesOrder;
  }

  public void setToSalesOrder(APISALESORDERSRVASalesOrderType toSalesOrder) {
    this.toSalesOrder = toSalesOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType apISALESORDERSRVASlsOrdPaymentPlanItemDetailsType = (APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType) o;
    return Objects.equals(this.salesOrder, apISALESORDERSRVASlsOrdPaymentPlanItemDetailsType.salesOrder) &&
        Objects.equals(this.paymentPlanItem, apISALESORDERSRVASlsOrdPaymentPlanItemDetailsType.paymentPlanItem) &&
        Objects.equals(this.toSalesOrder, apISALESORDERSRVASlsOrdPaymentPlanItemDetailsType.toSalesOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesOrder, paymentPlanItem, toSalesOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APISALESORDERSRVASlsOrdPaymentPlanItemDetailsType {\n");
    
    sb.append("    salesOrder: ").append(toIndentedString(salesOrder)).append("\n");
    sb.append("    paymentPlanItem: ").append(toIndentedString(paymentPlanItem)).append("\n");
    sb.append("    toSalesOrder: ").append(toIndentedString(toSalesOrder)).append("\n");
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

