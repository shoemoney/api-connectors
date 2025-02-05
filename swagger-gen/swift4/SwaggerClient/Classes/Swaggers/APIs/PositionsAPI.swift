//
// PositionsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class PositionsAPI {
    /**
     Update margin.
     
     - parameter symbol: (query) Contract type which you want update its margin 
     - parameter margin: (query) New margin you want set 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func positionsChangeMargin(symbol: String, margin: String, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        positionsChangeMarginWithRequestBuilder(symbol: symbol, margin: margin).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Update margin.
     - POST /position/change-position-margin
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter symbol: (query) Contract type which you want update its margin 
     - parameter margin: (query) New margin you want set 

     - returns: RequestBuilder<Any> 
     */
    open class func positionsChangeMarginWithRequestBuilder(symbol: String, margin: String) -> RequestBuilder<Any> {
        let path = "/position/change-position-margin"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "symbol": symbol, 
            "margin": margin
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get my position list.
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func positionsMyPosition(completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        positionsMyPositionWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get my position list.
     - GET /position/list
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<Any> 
     */
    open class func positionsMyPositionWithRequestBuilder() -> RequestBuilder<Any> {
        let path = "/position/list"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Change user leverage.
     
     - parameter symbol: (query) A symbol which you want change its leverage 
     - parameter leverage: (query) New leverage you want set 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func positionsSaveLeverage(symbol: String, leverage: String, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        positionsSaveLeverageWithRequestBuilder(symbol: symbol, leverage: leverage).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Change user leverage.
     - POST /user/leverage/save
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter symbol: (query) A symbol which you want change its leverage 
     - parameter leverage: (query) New leverage you want set 

     - returns: RequestBuilder<Any> 
     */
    open class func positionsSaveLeverageWithRequestBuilder(symbol: String, leverage: String) -> RequestBuilder<Any> {
        let path = "/user/leverage/save"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "symbol": symbol, 
            "leverage": leverage
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Set Trading-Stop Condition.
     
     - parameter symbol: (query) Contract type 
     - parameter takeProfit: (query) Not less than 0, 0 means cancel TP (optional)
     - parameter stopLoss: (query) Not less than 0, 0 means cancel SL (optional)
     - parameter trailingStop: (query) Not less than 0, 0 means cancel TS (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func positionsTradingStop(symbol: String, takeProfit: String? = nil, stopLoss: String? = nil, trailingStop: String? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        positionsTradingStopWithRequestBuilder(symbol: symbol, takeProfit: takeProfit, stopLoss: stopLoss, trailingStop: trailingStop).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Set Trading-Stop Condition.
     - POST /open-api/position/trading-stop
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]
     
     - parameter symbol: (query) Contract type 
     - parameter takeProfit: (query) Not less than 0, 0 means cancel TP (optional)
     - parameter stopLoss: (query) Not less than 0, 0 means cancel SL (optional)
     - parameter trailingStop: (query) Not less than 0, 0 means cancel TS (optional)

     - returns: RequestBuilder<Any> 
     */
    open class func positionsTradingStopWithRequestBuilder(symbol: String, takeProfit: String? = nil, stopLoss: String? = nil, trailingStop: String? = nil) -> RequestBuilder<Any> {
        let path = "/open-api/position/trading-stop"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "symbol": symbol, 
            "take_profit": takeProfit, 
            "stop_loss": stopLoss, 
            "trailing_stop": trailingStop
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get user leverage setting.
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func positionsUserLeverage(completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        positionsUserLeverageWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get user leverage setting.
     - GET /user/leverage
     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apiKey
     - API Key:
       - type: apiKey sign (QUERY)
       - name: apiSignature
     - API Key:
       - type: apiKey timestamp (QUERY)
       - name: timestamp
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<Any> 
     */
    open class func positionsUserLeverageWithRequestBuilder() -> RequestBuilder<Any> {
        let path = "/user/leverage"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
