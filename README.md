# 1. Client demo: TransportationHttpClient.java

#### URL of flight search API for different environment:
	     
    FWS： https://apiproxy-fws.ctripqa.com/apiproxy/soa2/20937/zstd-protobuf-3/search
    UAT： https://apiproxy-uat.ctripqa.com/apiproxy/soa2/20937/zstd-protobuf-3/search
    PRO： https://apiproxy.ctrip.com/apiproxy/soa2/20937/zstd-protobuf-3/search
       
**PS**:

 ####(1) Gateway validation is required in PRO，
  >For more information, please visit: https://github.com/Bee2857/cerberus-client-demo

 ####(2) Gateway validation is not needed in FWS/UAT. 
  >For gateway testing in FWS/UAT，new appKey & appSecret are needed, 
 and add queryString："gateAuthMode=app" in the end to open gateway validation，
 example: https://apiproxy-fws.ctripqa.com/apiproxy/soa2/20937/zstd-protobuf-3/search?sign=4f2595830d33de4a&timeStamp=1552632509159&token=qqqwwweeerrr&gateAuthMode=app
  
---

# 2. Schema
   - path: ./contract/gencode/contracts (.proto)
   
# 3. Schema instruction
   - index illustrate of response: ContractInstructions.png
   - instruction: https://trade.trip.com/fltconfigsystem/APIDoc/en-us/Distributor/Booking/FlightSearch/AggTransportationSearch
---

# 4. Call formatter
   - google proto3 serialization + zstd
     - proto3: https://developers.google.com/protocol-buffers/docs/proto3
     - zstd: https://github.com/luben/zstd-jni
     
   - java sample
     - code: ZstdGoogleProtobuf3ContentFormatter.java
     - path: ./callformat
   
# 5. Request Body Demo
   - path: RequestBodyDemo.md
