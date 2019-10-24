//
// ExtFields.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** extra fields */

public struct ExtFields: Codable {

    public var oReqNum: Double?
    public var xreqType: String?
    public var xreqOffset: Double?

    public init(oReqNum: Double?, xreqType: String?, xreqOffset: Double?) {
        self.oReqNum = oReqNum
        self.xreqType = xreqType
        self.xreqOffset = xreqOffset
    }

    public enum CodingKeys: String, CodingKey { 
        case oReqNum = "o_req_num"
        case xreqType = "xreq_type"
        case xreqOffset = "xreq_offset"
    }


}
