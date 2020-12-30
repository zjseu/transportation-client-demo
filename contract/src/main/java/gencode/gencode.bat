
rem transportation
del ..\..\java\com\ctrip\flight\agg\shopping\contract\* /q /f /s
rem del ..\..\java\com\ctrip\soa\* /q /f /s

protoc -I contracts --java_out=..\..\java contracts\com.ctrip.flight.agg.shopping.contract.baggage.proto
protoc -I contracts --java_out=..\..\java contracts\com.ctrip.flight.agg.shopping.contract.message.proto
protoc -I contracts --java_out=..\..\java contracts\com.ctrip.flight.agg.shopping.contract.transportation.proto
rem protoc -I contracts --java_out=..\..\java contracts\BaijiCommonTypes.proto
protoc -I contracts --java_out=..\..\java contracts\com.ctrip.flight.agg.shopping.contract.transportation.request.proto
protoc -I contracts --java_out=..\..\java contracts\com.ctrip.flight.agg.shopping.contract.transportation.response.proto

pause