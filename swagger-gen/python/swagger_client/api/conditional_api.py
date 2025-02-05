# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class ConditionalApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def conditional_cancel(self, stop_order_id, **kwargs):  # noqa: E501
        """Cancel conditional order.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_cancel(stop_order_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stop_order_id: Order ID of conditional order. (required)
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.conditional_cancel_with_http_info(stop_order_id, **kwargs)  # noqa: E501
        else:
            (data) = self.conditional_cancel_with_http_info(stop_order_id, **kwargs)  # noqa: E501
            return data

    def conditional_cancel_with_http_info(self, stop_order_id, **kwargs):  # noqa: E501
        """Cancel conditional order.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_cancel_with_http_info(stop_order_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stop_order_id: Order ID of conditional order. (required)
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['stop_order_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method conditional_cancel" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'stop_order_id' is set
        if ('stop_order_id' not in params or
                params['stop_order_id'] is None):
            raise ValueError("Missing the required parameter `stop_order_id` when calling `conditional_cancel`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'stop_order_id' in params:
            query_params.append(('stop_order_id', params['stop_order_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKey', 'apiSignature', 'timestamp']  # noqa: E501

        return self.api_client.call_api(
            '/open-api/stop-order/cancel', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def conditional_get_orders(self, **kwargs):  # noqa: E501
        """Get my conditional order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_get_orders(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stop_order_id: Order ID of conditional order.
        :param str order_link_id: Agency customized order ID.
        :param str symbol: Contract type. Default BTCUSD.
        :param str order: Sort orders by creation date
        :param float page: Page. Default getting first page data
        :param float limit: Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.conditional_get_orders_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.conditional_get_orders_with_http_info(**kwargs)  # noqa: E501
            return data

    def conditional_get_orders_with_http_info(self, **kwargs):  # noqa: E501
        """Get my conditional order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_get_orders_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str stop_order_id: Order ID of conditional order.
        :param str order_link_id: Agency customized order ID.
        :param str symbol: Contract type. Default BTCUSD.
        :param str order: Sort orders by creation date
        :param float page: Page. Default getting first page data
        :param float limit: Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['stop_order_id', 'order_link_id', 'symbol', 'order', 'page', 'limit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method conditional_get_orders" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'stop_order_id' in params:
            query_params.append(('stop_order_id', params['stop_order_id']))  # noqa: E501
        if 'order_link_id' in params:
            query_params.append(('order_link_id', params['order_link_id']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501
        if 'order' in params:
            query_params.append(('order', params['order']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('limit', params['limit']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKey', 'apiSignature', 'timestamp']  # noqa: E501

        return self.api_client.call_api(
            '/open-api/stop-order/list', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def conditional_new(self, side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, **kwargs):  # noqa: E501
        """Place a new conditional order.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_new(side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str side: Side. (required)
        :param str symbol: Contract type. (required)
        :param str order_type: Conditional order type. (required)
        :param float qty: Order quantity. (required)
        :param float price: Execution price for conditional order (required)
        :param float base_price: Send current market price. It will be used to compare with the value of 'stop_px', to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. (required)
        :param float stop_px: Trigger price. (required)
        :param str time_in_force: Time in force. (required)
        :param str trigger_by: Trigger price type. Default LastPrice.
        :param bool close_on_trigger: close on trigger.
        :param str order_link_id: Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique..
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.conditional_new_with_http_info(side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, **kwargs)  # noqa: E501
        else:
            (data) = self.conditional_new_with_http_info(side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, **kwargs)  # noqa: E501
            return data

    def conditional_new_with_http_info(self, side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, **kwargs):  # noqa: E501
        """Place a new conditional order.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_new_with_http_info(side, symbol, order_type, qty, price, base_price, stop_px, time_in_force, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str side: Side. (required)
        :param str symbol: Contract type. (required)
        :param str order_type: Conditional order type. (required)
        :param float qty: Order quantity. (required)
        :param float price: Execution price for conditional order (required)
        :param float base_price: Send current market price. It will be used to compare with the value of 'stop_px', to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order.. (required)
        :param float stop_px: Trigger price. (required)
        :param str time_in_force: Time in force. (required)
        :param str trigger_by: Trigger price type. Default LastPrice.
        :param bool close_on_trigger: close on trigger.
        :param str order_link_id: Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique..
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['side', 'symbol', 'order_type', 'qty', 'price', 'base_price', 'stop_px', 'time_in_force', 'trigger_by', 'close_on_trigger', 'order_link_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method conditional_new" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'side' is set
        if ('side' not in params or
                params['side'] is None):
            raise ValueError("Missing the required parameter `side` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'symbol' is set
        if ('symbol' not in params or
                params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'order_type' is set
        if ('order_type' not in params or
                params['order_type'] is None):
            raise ValueError("Missing the required parameter `order_type` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'qty' is set
        if ('qty' not in params or
                params['qty'] is None):
            raise ValueError("Missing the required parameter `qty` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'price' is set
        if ('price' not in params or
                params['price'] is None):
            raise ValueError("Missing the required parameter `price` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'base_price' is set
        if ('base_price' not in params or
                params['base_price'] is None):
            raise ValueError("Missing the required parameter `base_price` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'stop_px' is set
        if ('stop_px' not in params or
                params['stop_px'] is None):
            raise ValueError("Missing the required parameter `stop_px` when calling `conditional_new`")  # noqa: E501
        # verify the required parameter 'time_in_force' is set
        if ('time_in_force' not in params or
                params['time_in_force'] is None):
            raise ValueError("Missing the required parameter `time_in_force` when calling `conditional_new`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'side' in params:
            query_params.append(('side', params['side']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501
        if 'order_type' in params:
            query_params.append(('order_type', params['order_type']))  # noqa: E501
        if 'qty' in params:
            query_params.append(('qty', params['qty']))  # noqa: E501
        if 'price' in params:
            query_params.append(('price', params['price']))  # noqa: E501
        if 'base_price' in params:
            query_params.append(('base_price', params['base_price']))  # noqa: E501
        if 'stop_px' in params:
            query_params.append(('stop_px', params['stop_px']))  # noqa: E501
        if 'time_in_force' in params:
            query_params.append(('time_in_force', params['time_in_force']))  # noqa: E501
        if 'trigger_by' in params:
            query_params.append(('trigger_by', params['trigger_by']))  # noqa: E501
        if 'close_on_trigger' in params:
            query_params.append(('close_on_trigger', params['close_on_trigger']))  # noqa: E501
        if 'order_link_id' in params:
            query_params.append(('order_link_id', params['order_link_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKey', 'apiSignature', 'timestamp']  # noqa: E501

        return self.api_client.call_api(
            '/open-api/stop-order/create', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def conditional_replace(self, order_id, symbol, **kwargs):  # noqa: E501
        """Replace conditional order. Only incomplete orders can be modified.   # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_replace(order_id, symbol, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID. (required)
        :param str symbol: Contract type. (required)
        :param float p_r_qty: Order quantity.
        :param float p_r_price: Order price.
        :param float p_r_trigger_price: Trigger price.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.conditional_replace_with_http_info(order_id, symbol, **kwargs)  # noqa: E501
        else:
            (data) = self.conditional_replace_with_http_info(order_id, symbol, **kwargs)  # noqa: E501
            return data

    def conditional_replace_with_http_info(self, order_id, symbol, **kwargs):  # noqa: E501
        """Replace conditional order. Only incomplete orders can be modified.   # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.conditional_replace_with_http_info(order_id, symbol, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID. (required)
        :param str symbol: Contract type. (required)
        :param float p_r_qty: Order quantity.
        :param float p_r_price: Order price.
        :param float p_r_trigger_price: Trigger price.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['order_id', 'symbol', 'p_r_qty', 'p_r_price', 'p_r_trigger_price']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method conditional_replace" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'order_id' is set
        if ('order_id' not in params or
                params['order_id'] is None):
            raise ValueError("Missing the required parameter `order_id` when calling `conditional_replace`")  # noqa: E501
        # verify the required parameter 'symbol' is set
        if ('symbol' not in params or
                params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `conditional_replace`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'order_id' in params:
            query_params.append(('order_id', params['order_id']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501
        if 'p_r_qty' in params:
            query_params.append(('p_r_qty', params['p_r_qty']))  # noqa: E501
        if 'p_r_price' in params:
            query_params.append(('p_r_price', params['p_r_price']))  # noqa: E501
        if 'p_r_trigger_price' in params:
            query_params.append(('p_r_trigger_price', params['p_r_trigger_price']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/x-www-form-urlencoded'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKey', 'apiSignature', 'timestamp']  # noqa: E501

        return self.api_client.call_api(
            '/open-api/stop-order/replace', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
