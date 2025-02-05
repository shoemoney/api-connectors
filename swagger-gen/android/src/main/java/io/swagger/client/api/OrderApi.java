/**
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

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrderApi {
  String basePath = "https://api-testnet.bybit.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get my active order list.
  * 
   * @param orderId Order ID
   * @param symbol Contract type.
   * @return Object
  */
  public Object orderCancel (String orderId, String symbol) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling orderCancel",
        new ApiException(400, "Missing the required parameter 'orderId' when calling orderCancel"));
    }

    // create path and map variables
    String path = "/open-api/order/cancel";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    String[] contentTypes = {
      "application/json",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get my active order list.
   * 
   * @param orderId Order ID   * @param symbol Contract type.
  */
  public void orderCancel (String orderId, String symbol, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling orderCancel",
        new ApiException(400, "Missing the required parameter 'orderId' when calling orderCancel"));
    }

    // create path and map variables
    String path = "/open-api/order/cancel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get my active order list.
  * 
   * @param orderId Order ID
   * @param orderLinkId Customized order ID.
   * @param symbol Contract type. Default BTCUSD
   * @param order Sort orders by creation date
   * @param page Page. Default getting first page data
   * @param limit TLimit for data size per page, max size is 50. Default as showing 20 pieces of data per page
   * @param orderStatus Query your orders for all statuses if &#39;order_status&#39; is empty. If you want to query orders with specific statuses , you can pass the order_status split by
   * @return Object
  */
  public Object orderGetOrders (String orderId, String orderLinkId, String symbol, String order, BigDecimal page, BigDecimal limit, String orderStatus) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/open-api/order/list";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_status", orderStatus));
    String[] contentTypes = {
      "application/json",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get my active order list.
   * 
   * @param orderId Order ID   * @param orderLinkId Customized order ID.   * @param symbol Contract type. Default BTCUSD   * @param order Sort orders by creation date   * @param page Page. Default getting first page data   * @param limit TLimit for data size per page, max size is 50. Default as showing 20 pieces of data per page   * @param orderStatus Query your orders for all statuses if &#39;order_status&#39; is empty. If you want to query orders with specific statuses , you can pass the order_status split by
  */
  public void orderGetOrders (String orderId, String orderLinkId, String symbol, String order, BigDecimal page, BigDecimal limit, String orderStatus, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/open-api/order/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_status", orderStatus));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Place active order
  * 
   * @param side Side
   * @param symbol Contract type.
   * @param orderType Active order type
   * @param qty 
   * @param price Order price.
   * @param timeInForce Time in force
   * @param takeProfit take profit price
   * @param stopLoss stop loss price
   * @param reduceOnly reduce only
   * @param closeOnTrigger close on trigger
   * @param orderLinkId TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
   * @return Object
  */
  public Object orderNew (String side, String symbol, String orderType, BigDecimal qty, Double price, String timeInForce, Double takeProfit, Double stopLoss, Boolean reduceOnly, Boolean closeOnTrigger, String orderLinkId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'side' is set
    if (side == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'side' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'side' when calling orderNew"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'symbol' when calling orderNew"));
    }
    // verify the required parameter 'orderType' is set
    if (orderType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderType' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'orderType' when calling orderNew"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'qty' when calling orderNew"));
    }
    // verify the required parameter 'price' is set
    if (price == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'price' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'price' when calling orderNew"));
    }
    // verify the required parameter 'timeInForce' is set
    if (timeInForce == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeInForce' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'timeInForce' when calling orderNew"));
    }

    // create path and map variables
    String path = "/open-api/order/create";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "side", side));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_type", orderType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qty", qty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "price", price));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_in_force", timeInForce));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "take_profit", takeProfit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_loss", stopLoss));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "reduce_only", reduceOnly));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "close_on_trigger", closeOnTrigger));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    String[] contentTypes = {
      "application/json",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Place active order
   * 
   * @param side Side   * @param symbol Contract type.   * @param orderType Active order type   * @param qty    * @param price Order price.   * @param timeInForce Time in force   * @param takeProfit take profit price   * @param stopLoss stop loss price   * @param reduceOnly reduce only   * @param closeOnTrigger close on trigger   * @param orderLinkId TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
  */
  public void orderNew (String side, String symbol, String orderType, BigDecimal qty, Double price, String timeInForce, Double takeProfit, Double stopLoss, Boolean reduceOnly, Boolean closeOnTrigger, String orderLinkId, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'side' is set
    if (side == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'side' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'side' when calling orderNew"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'symbol' when calling orderNew"));
    }
    // verify the required parameter 'orderType' is set
    if (orderType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderType' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'orderType' when calling orderNew"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'qty' when calling orderNew"));
    }
    // verify the required parameter 'price' is set
    if (price == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'price' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'price' when calling orderNew"));
    }
    // verify the required parameter 'timeInForce' is set
    if (timeInForce == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeInForce' when calling orderNew",
        new ApiException(400, "Missing the required parameter 'timeInForce' when calling orderNew"));
    }

    // create path and map variables
    String path = "/open-api/order/create".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "side", side));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_type", orderType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qty", qty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "price", price));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_in_force", timeInForce));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "take_profit", takeProfit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_loss", stopLoss));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "reduce_only", reduceOnly));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "close_on_trigger", closeOnTrigger));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get my active order list.
  * 
   * @param orderId Order ID
   * @param symbol Contract type. Default BTCUSD
   * @return Object
  */
  public Object orderQuery (String orderId, String symbol) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/v2/private/order";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    String[] contentTypes = {
      "application/json",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get my active order list.
   * 
   * @param orderId Order ID   * @param symbol Contract type. Default BTCUSD
  */
  public void orderQuery (String orderId, String symbol, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/v2/private/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Replace active order. Only incomplete orders can be modified. 
  * 
   * @param orderId Order ID.
   * @param symbol Contract type.
   * @param pRQty Order quantity.
   * @param pRPrice Order price.
   * @return Object
  */
  public Object orderReplace (String orderId, String symbol, BigDecimal pRQty, Double pRPrice) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling orderReplace",
        new ApiException(400, "Missing the required parameter 'orderId' when calling orderReplace"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderReplace",
        new ApiException(400, "Missing the required parameter 'symbol' when calling orderReplace"));
    }

    // create path and map variables
    String path = "/open-api/order/replace";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "p_r_qty", pRQty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "p_r_price", pRPrice));
    String[] contentTypes = {
      "application/json",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Replace active order. Only incomplete orders can be modified. 
   * 
   * @param orderId Order ID.   * @param symbol Contract type.   * @param pRQty Order quantity.   * @param pRPrice Order price.
  */
  public void orderReplace (String orderId, String symbol, BigDecimal pRQty, Double pRPrice, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderId' when calling orderReplace",
        new ApiException(400, "Missing the required parameter 'orderId' when calling orderReplace"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderReplace",
        new ApiException(400, "Missing the required parameter 'symbol' when calling orderReplace"));
    }

    // create path and map variables
    String path = "/open-api/order/replace".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_id", orderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "p_r_qty", pRQty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "p_r_price", pRPrice));


    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey", "apiSignature", "timestamp" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
