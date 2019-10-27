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

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Number
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class ConditionalApi(
  val defBasePath: String = "https://api-testnet.bybit.com",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ConditionalApiAsyncHelper(client, config)

  /**
   * Cancel conditional order.
   * 
   *
   * @param stopOrderId Order ID of conditional order. 
   * @return Any
   */
  def conditionalCancel(stopOrderId: String): Option[Any] = {
    val await = Try(Await.result(conditionalCancelAsync(stopOrderId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Cancel conditional order. asynchronously
   * 
   *
   * @param stopOrderId Order ID of conditional order. 
   * @return Future(Any)
   */
  def conditionalCancelAsync(stopOrderId: String): Future[Any] = {
      helper.conditionalCancel(stopOrderId)
  }

  /**
   * Get my conditional order list.
   * 
   *
   * @param stopOrderId Order ID of conditional order. (optional)
   * @param orderLinkId Agency customized order ID. (optional)
   * @param symbol Contract type. Default BTCUSD. (optional)
   * @param order Sort orders by creation date (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page. (optional)
   * @return Any
   */
  def conditionalGetOrders(stopOrderId: Option[String] = None, orderLinkId: Option[String] = None, symbol: Option[String] = None, order: Option[String] = None, page: Option[Number] = None, limit: Option[Number] = None): Option[Any] = {
    val await = Try(Await.result(conditionalGetOrdersAsync(stopOrderId, orderLinkId, symbol, order, page, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get my conditional order list. asynchronously
   * 
   *
   * @param stopOrderId Order ID of conditional order. (optional)
   * @param orderLinkId Agency customized order ID. (optional)
   * @param symbol Contract type. Default BTCUSD. (optional)
   * @param order Sort orders by creation date (optional)
   * @param page Page. Default getting first page data (optional)
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page. (optional)
   * @return Future(Any)
   */
  def conditionalGetOrdersAsync(stopOrderId: Option[String] = None, orderLinkId: Option[String] = None, symbol: Option[String] = None, order: Option[String] = None, page: Option[Number] = None, limit: Option[Number] = None): Future[Any] = {
      helper.conditionalGetOrders(stopOrderId, orderLinkId, symbol, order, page, limit)
  }

  /**
   * Place a new conditional order.
   * 
   *
   * @param side Side. 
   * @param symbol Contract type. 
   * @param orderType Conditional order type. 
   * @param qty Order quantity. 
   * @param basePrice Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. 
   * @param stopPx Trigger price. 
   * @param timeInForce Time in force. 
   * @param price Execution price for conditional order (optional)
   * @param triggerBy Trigger price type. Default LastPrice. (optional)
   * @param closeOnTrigger close on trigger. (optional)
   * @param orderLinkId Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.. (optional)
   * @return Any
   */
  def conditionalNew(side: String, symbol: String, orderType: String, qty: Number, basePrice: Double, stopPx: Double, timeInForce: String, price: Option[Double] = None, triggerBy: Option[String] = None, closeOnTrigger: Option[Boolean] = None, orderLinkId: Option[String] = None): Option[Any] = {
    val await = Try(Await.result(conditionalNewAsync(side, symbol, orderType, qty, basePrice, stopPx, timeInForce, price, triggerBy, closeOnTrigger, orderLinkId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Place a new conditional order. asynchronously
   * 
   *
   * @param side Side. 
   * @param symbol Contract type. 
   * @param orderType Conditional order type. 
   * @param qty Order quantity. 
   * @param basePrice Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. 
   * @param stopPx Trigger price. 
   * @param timeInForce Time in force. 
   * @param price Execution price for conditional order (optional)
   * @param triggerBy Trigger price type. Default LastPrice. (optional)
   * @param closeOnTrigger close on trigger. (optional)
   * @param orderLinkId Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.. (optional)
   * @return Future(Any)
   */
  def conditionalNewAsync(side: String, symbol: String, orderType: String, qty: Number, basePrice: Double, stopPx: Double, timeInForce: String, price: Option[Double] = None, triggerBy: Option[String] = None, closeOnTrigger: Option[Boolean] = None, orderLinkId: Option[String] = None): Future[Any] = {
      helper.conditionalNew(side, symbol, orderType, qty, basePrice, stopPx, timeInForce, price, triggerBy, closeOnTrigger, orderLinkId)
  }

  /**
   * Replace conditional order. Only incomplete orders can be modified. 
   * 
   *
   * @param orderId Order ID. 
   * @param symbol Contract type. 
   * @param pRQty Order quantity. (optional)
   * @param pRPrice Order price. (optional)
   * @param pRTriggerPrice Trigger price. (optional)
   * @return Any
   */
  def conditionalReplace(orderId: String, symbol: String, pRQty: Option[Number] = None, pRPrice: Option[Double] = None, pRTriggerPrice: Option[Double] = None): Option[Any] = {
    val await = Try(Await.result(conditionalReplaceAsync(orderId, symbol, pRQty, pRPrice, pRTriggerPrice), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Replace conditional order. Only incomplete orders can be modified.  asynchronously
   * 
   *
   * @param orderId Order ID. 
   * @param symbol Contract type. 
   * @param pRQty Order quantity. (optional)
   * @param pRPrice Order price. (optional)
   * @param pRTriggerPrice Trigger price. (optional)
   * @return Future(Any)
   */
  def conditionalReplaceAsync(orderId: String, symbol: String, pRQty: Option[Number] = None, pRPrice: Option[Double] = None, pRTriggerPrice: Option[Double] = None): Future[Any] = {
      helper.conditionalReplace(orderId, symbol, pRQty, pRPrice, pRTriggerPrice)
  }

}

class ConditionalApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def conditionalCancel(stopOrderId: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/stop-order/cancel"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (stopOrderId == null) throw new Exception("Missing required parameter 'stopOrderId' when calling ConditionalApi->conditionalCancel")

    queryParams += "stop_order_id" -> stopOrderId.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def conditionalGetOrders(stopOrderId: Option[String] = None,
    orderLinkId: Option[String] = None,
    symbol: Option[String] = None,
    order: Option[String] = None,
    page: Option[Number] = None,
    limit: Option[Number] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/stop-order/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    stopOrderId match {
      case Some(param) => queryParams += "stop_order_id" -> param.toString
      case _ => queryParams
    }
    orderLinkId match {
      case Some(param) => queryParams += "order_link_id" -> param.toString
      case _ => queryParams
    }
    symbol match {
      case Some(param) => queryParams += "symbol" -> param.toString
      case _ => queryParams
    }
    order match {
      case Some(param) => queryParams += "order" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def conditionalNew(side: String,
    symbol: String,
    orderType: String,
    qty: Number,
    basePrice: Double,
    stopPx: Double,
    timeInForce: String,
    price: Option[Double] = None,
    triggerBy: Option[String] = None,
    closeOnTrigger: Option[Boolean] = None,
    orderLinkId: Option[String] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/stop-order/create"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (side == null) throw new Exception("Missing required parameter 'side' when calling ConditionalApi->conditionalNew")

    if (symbol == null) throw new Exception("Missing required parameter 'symbol' when calling ConditionalApi->conditionalNew")

    if (orderType == null) throw new Exception("Missing required parameter 'orderType' when calling ConditionalApi->conditionalNew")

    if (timeInForce == null) throw new Exception("Missing required parameter 'timeInForce' when calling ConditionalApi->conditionalNew")

    queryParams += "side" -> side.toString
    queryParams += "symbol" -> symbol.toString
    queryParams += "order_type" -> orderType.toString
    queryParams += "qty" -> qty.toString
    price match {
      case Some(param) => queryParams += "price" -> param.toString
      case _ => queryParams
    }
    queryParams += "base_price" -> basePrice.toString
    queryParams += "stop_px" -> stopPx.toString
    queryParams += "time_in_force" -> timeInForce.toString
    triggerBy match {
      case Some(param) => queryParams += "trigger_by" -> param.toString
      case _ => queryParams
    }
    closeOnTrigger match {
      case Some(param) => queryParams += "close_on_trigger" -> param.toString
      case _ => queryParams
    }
    orderLinkId match {
      case Some(param) => queryParams += "order_link_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def conditionalReplace(orderId: String,
    symbol: String,
    pRQty: Option[Number] = None,
    pRPrice: Option[Double] = None,
    pRTriggerPrice: Option[Double] = None
    )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/open-api/stop-order/replace"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orderId == null) throw new Exception("Missing required parameter 'orderId' when calling ConditionalApi->conditionalReplace")

    if (symbol == null) throw new Exception("Missing required parameter 'symbol' when calling ConditionalApi->conditionalReplace")

    queryParams += "order_id" -> orderId.toString
    queryParams += "symbol" -> symbol.toString
    pRQty match {
      case Some(param) => queryParams += "p_r_qty" -> param.toString
      case _ => queryParams
    }
    pRPrice match {
      case Some(param) => queryParams += "p_r_price" -> param.toString
      case _ => queryParams
    }
    pRTriggerPrice match {
      case Some(param) => queryParams += "p_r_trigger_price" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
