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
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderHeaderPartnerType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderHeaderPrElementType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderItemType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderTextType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASlsOrdPaymentPlanItemDetailsType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sales Order (API)
 */
@ApiModel(description = "Sales Order (API)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T07:18:58.114Z")
public class APISALESORDERSRVASalesOrderType {
  @SerializedName("SalesOrder")
  private String salesOrder = null;
  
  @SerializedName("SalesOrderType")
  private String salesOrderType = null;
  
  @SerializedName("SalesOrganization")
  private String salesOrganization = null;
  
  @SerializedName("DistributionChannel")
  private String distributionChannel = null;
  
  
  @SerializedName("OrganizationDivision")
  private String organizationDivision = null;
  
  @SerializedName("SalesGroup")
  private String salesGroup = null;
  
  @SerializedName("SalesOffice")
  private String salesOffice = null;
  
  @SerializedName("SalesDistrict")
  private String salesDistrict = null;
  
  @SerializedName("SoldToParty")
  private String soldToParty = null;
  
  @SerializedName("PurchaseOrderByCustomer")
  private String purchaseOrderByCustomer = null;
  @SerializedName("TotalNetAmount")
  private String totalNetAmount = null;
  @SerializedName("TransactionCurrency")
  private String transactionCurrency = null;
  @SerializedName("IncotermsClassification")
  private String incotermsClassification = null;
  @SerializedName("IncotermsTransferLocation")
  private String  incotermsTransferLocation = null;
  @SerializedName("IncotermsLocation1")
  private String incotermsLocation1 = null;
  @SerializedName("CustomerPaymentTerms")
  private String customerPaymentTerms = null;
  @SerializedName("OverallSDProcessStatus")
  private String overallSDProcessStatus = null;
  @SerializedName("OverallTotalDeliveryStatus")
  private String overallTotalDeliveryStatus = null;
  @SerializedName("OverallSDDocumentRejectionSts")
  private String overallSDDocumentRejectionSts = null;
  
  @SerializedName("CreationDate")
  private String creationDate = null;
  @SerializedName("CreatedByUser")
  private String createdByUser = null;
  @SerializedName("LastChangeDateTime")
  private String lastChangeDateTime = null;
  @SerializedName("SalesOrderDate")
  private String salesOrderDate = null;
  @SerializedName("PricingDate")
  private String pricingDate = null;
  @SerializedName("RequestedDeliveryDate")
  private String requestedDeliveryDate = null;
  @SerializedName("ShippingCondition")
  private String shippingCondition = null;
  
  
  
  
  
  
  @SerializedName("to_Item")
  private CollectionOfASalesOrderItemType toItem = null;

  @SerializedName("to_Partner")
  private CollectionOfASalesOrderHeaderPartnerType toPartner = null;
  
  @SerializedName("to_PaymentPlanItemDetails")
  private CollectionOfASlsOrdPaymentPlanItemDetailsType toPaymentPlanItemDetails = null;
  
  @SerializedName("to_PricingElement")
  private CollectionOfASalesOrderHeaderPrElementType toPricingElement = null;
  
  @SerializedName("to_Text")
  private CollectionOfASalesOrderTextType toText = null;
  
  public APISALESORDERSRVASalesOrderType salesOrder(String salesOrder) {
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
  
  public APISALESORDERSRVASalesOrderType toItem(CollectionOfASalesOrderItemType toItem) {
    this.toItem = toItem;
    return this;
  }
  
   /**
   * Get toItem
   * @return toItem
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASalesOrderItemType getToItem() {
    return toItem;
  }
  
  public void setToItem(CollectionOfASalesOrderItemType toItem) {
    this.toItem = toItem;
  }
  
  public APISALESORDERSRVASalesOrderType toPartner(CollectionOfASalesOrderHeaderPartnerType toPartner) {
    this.toPartner = toPartner;
    return this;
  }
  
   /**
   * Get toPartner
   * @return toPartner
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASalesOrderHeaderPartnerType getToPartner() {
    return toPartner;
  }
  
  public void setToPartner(CollectionOfASalesOrderHeaderPartnerType toPartner) {
    this.toPartner = toPartner;
  }
  
  public APISALESORDERSRVASalesOrderType toPaymentPlanItemDetails(CollectionOfASlsOrdPaymentPlanItemDetailsType toPaymentPlanItemDetails) {
    this.toPaymentPlanItemDetails = toPaymentPlanItemDetails;
    return this;
  }
  
   /**
   * Get toPaymentPlanItemDetails
   * @return toPaymentPlanItemDetails
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASlsOrdPaymentPlanItemDetailsType getToPaymentPlanItemDetails() {
    return toPaymentPlanItemDetails;
  }
  
  public void setToPaymentPlanItemDetails(CollectionOfASlsOrdPaymentPlanItemDetailsType toPaymentPlanItemDetails) {
    this.toPaymentPlanItemDetails = toPaymentPlanItemDetails;
  }
  
  public APISALESORDERSRVASalesOrderType toPricingElement(CollectionOfASalesOrderHeaderPrElementType toPricingElement) {
    this.toPricingElement = toPricingElement;
    return this;
  }
  
   /**
   * Get toPricingElement
   * @return toPricingElement
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASalesOrderHeaderPrElementType getToPricingElement() {
    return toPricingElement;
  }
  
  public void setToPricingElement(CollectionOfASalesOrderHeaderPrElementType toPricingElement) {
    this.toPricingElement = toPricingElement;
  }
  
  public APISALESORDERSRVASalesOrderType toText(CollectionOfASalesOrderTextType toText) {
    this.toText = toText;
    return this;
  }
  
   /**
   * Get toText
   * @return toText
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASalesOrderTextType getToText() {
    return toText;
  }
  
  public void setToText(CollectionOfASalesOrderTextType toText) {
    this.toText = toText;
  }
  
  
  public String getSalesOrderType() {
	return salesOrderType;
}

public void setSalesOrderType(String salesOrderType) {
	this.salesOrderType = salesOrderType;
}

public String getSalesOrganization() {
	return salesOrganization;
}

public void setSalesOrganization(String salesOrganization) {
	this.salesOrganization = salesOrganization;
}

public String getDistributionChannel() {
	return distributionChannel;
}

public void setDistributionChannel(String distributionChannel) {
	this.distributionChannel = distributionChannel;
}

public String getOrganizationDivision() {
	return organizationDivision;
}

public void setOrganizationDivision(String organizationDivision) {
	this.organizationDivision = organizationDivision;
}

public String getSalesGroup() {
	return salesGroup;
}

public void setSalesGroup(String salesGroup) {
	this.salesGroup = salesGroup;
}

public String getSalesOffice() {
	return salesOffice;
}

public void setSalesOffice(String salesOffice) {
	this.salesOffice = salesOffice;
}

public String getSalesDistrict() {
	return salesDistrict;
}

public void setSalesDistrict(String salesDistrict) {
	this.salesDistrict = salesDistrict;
}

public String getSoldToParty() {
	return soldToParty;
}

public void setSoldToParty(String soldToParty) {
	this.soldToParty = soldToParty;
}

  public String getPurchaseOrderByCustomer() {
	return purchaseOrderByCustomer;
}

public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
	this.purchaseOrderByCustomer = purchaseOrderByCustomer;
}

public String getTotalNetAmount() {
	return totalNetAmount;
}

public void setTotalNetAmount(String totalNetAmount) {
	this.totalNetAmount = totalNetAmount;
}

public String getTransactionCurrency() {
	return transactionCurrency;
}

public void setTransactionCurrency(String transactionCurrency) {
	this.transactionCurrency = transactionCurrency;
}

public String getIncotermsClassification() {
	return incotermsClassification;
}

public void setIncotermsClassification(String incotermsClassification) {
	this.incotermsClassification = incotermsClassification;
}

public String getIncotermsTransferLocation() {
	return incotermsTransferLocation;
}

public void setIncotermsTransferLocation(String incotermsTransferLocation) {
	this.incotermsTransferLocation = incotermsTransferLocation;
}

public String getIncotermsLocation1() {
	return incotermsLocation1;
}

public void setIncotermsLocation1(String incotermsLocation1) {
	this.incotermsLocation1 = incotermsLocation1;
}

public String getCustomerPaymentTerms() {
	return customerPaymentTerms;
}

public void setCustomerPaymentTerms(String customerPaymentTerms) {
	this.customerPaymentTerms = customerPaymentTerms;
}

public String getOverallSDProcessStatus() {
	return overallSDProcessStatus;
}

public void setOverallSDProcessStatus(String overallSDProcessStatus) {
	this.overallSDProcessStatus = overallSDProcessStatus;
}

public String getOverallTotalDeliveryStatus() {
	return overallTotalDeliveryStatus;
}

public void setOverallTotalDeliveryStatus(String overallTotalDeliveryStatus) {
	this.overallTotalDeliveryStatus = overallTotalDeliveryStatus;
}

public String getOverallSDDocumentRejectionSts() {
	return overallSDDocumentRejectionSts;
}

public void setOverallSDDocumentRejectionSts(String overallSDDocumentRejectionSts) {
	this.overallSDDocumentRejectionSts = overallSDDocumentRejectionSts;
}



public String getCreationDate() {
	return creationDate;
}

public void setCreationDate(String creationDate) {
	this.creationDate = creationDate;
}

public String getCreatedByUser() {
	return createdByUser;
}

public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
}

public String getLastChangeDateTime() {
	return lastChangeDateTime;
}

public void setLastChangeDateTime(String lastChangeDateTime) {
	this.lastChangeDateTime = lastChangeDateTime;
}

public String getSalesOrderDate() {
	return salesOrderDate;
}

public void setSalesOrderDate(String salesOrderDate) {
	this.salesOrderDate = salesOrderDate;
}

public String getPricingDate() {
	return pricingDate;
}

public void setPricingDate(String pricingDate) {
	this.pricingDate = pricingDate;
}

public String getRequestedDeliveryDate() {
	return requestedDeliveryDate;
}

public void setRequestedDeliveryDate(String requestedDeliveryDate) {
	this.requestedDeliveryDate = requestedDeliveryDate;
}

public String getShippingCondition() {
	return shippingCondition;
}

public void setShippingCondition(String shippingCondition) {
	this.shippingCondition = shippingCondition;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APISALESORDERSRVASalesOrderType apISALESORDERSRVASalesOrderType = (APISALESORDERSRVASalesOrderType) o;
    return Objects.equals(this.salesOrder, apISALESORDERSRVASalesOrderType.salesOrder) &&
        Objects.equals(this.toItem, apISALESORDERSRVASalesOrderType.toItem) &&
        Objects.equals(this.toPartner, apISALESORDERSRVASalesOrderType.toPartner) &&
        Objects.equals(this.toPaymentPlanItemDetails, apISALESORDERSRVASalesOrderType.toPaymentPlanItemDetails) &&
        Objects.equals(this.toPricingElement, apISALESORDERSRVASalesOrderType.toPricingElement) &&
        Objects.equals(this.toText, apISALESORDERSRVASalesOrderType.toText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesOrder, toItem, toPartner, toPaymentPlanItemDetails, toPricingElement, toText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APISALESORDERSRVASalesOrderType {\n");
    
    sb.append("    salesOrder: ").append(toIndentedString(salesOrder)).append("\n");
    sb.append("    salesOrderType: ").append(toIndentedString(salesOrderType)).append("\n");
    sb.append("    toItem: ").append(toIndentedString(toItem)).append("\n");
    sb.append("    toPartner: ").append(toIndentedString(toPartner)).append("\n");
    sb.append("    toPaymentPlanItemDetails: ").append(toIndentedString(toPaymentPlanItemDetails)).append("\n");
    sb.append("    toPricingElement: ").append(toIndentedString(toPricingElement)).append("\n");
    sb.append("    toText: ").append(toIndentedString(toText)).append("\n");
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

