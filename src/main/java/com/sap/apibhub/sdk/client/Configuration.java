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


package com.sap.apibhub.sdk.client;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T07:18:58.114Z")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
