// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public final class ComCtripFlightAggShoppingContractTransportationRequest {
  private ComCtripFlightAggShoppingContractTransportationRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchRequestType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchRequestType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchCriteriaType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchCriteriaType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_JourneyRequestType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_JourneyRequestType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_LocationType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_LocationType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_UserParameterType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_UserParameterType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_RouteSearchType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_RouteSearchType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCcom.ctrip.flight.agg.shopping.contract" +
      ".transportation.request.proto\022=com.ctrip" +
      ".flight.agg.shopping.contract.transporta" +
      "tion.request\0324com.ctrip.flight.agg.shopp" +
      "ing.contract.message.proto\032;com.ctrip.fl" +
      "ight.agg.shopping.contract.transportatio" +
      "n.proto\"\275\002\n\021SearchRequestType\022X\n\rRequest" +
      "Header\030\001 \001(\0132A.com.ctrip.flight.agg.shop" +
      "ping.contract.message.RequestHeaderType\022" +
      "i\n\016SearchCriteria\030\002 \001(\0132Q.com.ctrip.flig" +
      "ht.agg.shopping.contract.transportation." +
      "request.SearchCriteriaType\022c\n\013RouteSearc" +
      "h\030\003 \001(\0132N.com.ctrip.flight.agg.shopping." +
      "contract.transportation.request.RouteSea" +
      "rchType\"\204\004\n\022SearchCriteriaType\022i\n\016Journe" +
      "yRequest\030\001 \003(\0132Q.com.ctrip.flight.agg.sh" +
      "opping.contract.transportation.request.J" +
      "ourneyRequestType\022a\n\nPaxRequest\030\002 \003(\0132M." +
      "com.ctrip.flight.agg.shopping.contract.t" +
      "ransportation.request.PaxRequestType\022\021\n\t" +
      "CabinCode\030\003 \003(\t\022\024\n\014SaleCurrency\030\004 \001(\t\022\020\n" +
      "\010Language\030\005 \001(\t\022`\n\017ExtensionOption\030\006 \003(\013" +
      "2G.com.ctrip.flight.agg.shopping.contrac" +
      "t.transportation.KeyValuePairType\022\032\n\022Nee" +
      "dRecommendation\030\007 \001(\010\022g\n\rUserParameter\030\010" +
      " \001(\0132P.com.ctrip.flight.agg.shopping.con" +
      "tract.transportation.request.UserParamet" +
      "erType\"\362\001\n\022JourneyRequestType\022\022\n\nDepartD" +
      "ate\030\001 \001(\t\022c\n\016DepartLocation\030\002 \001(\0132K.com." +
      "ctrip.flight.agg.shopping.contract.trans" +
      "portation.request.LocationType\022c\n\016Arrive" +
      "Location\030\003 \001(\0132K.com.ctrip.flight.agg.sh" +
      "opping.contract.transportation.request.L" +
      "ocationType\".\n\014LocationType\022\014\n\004Type\030\001 \001(" +
      "\005\022\020\n\010Location\030\002 \001(\t\"e\n\021UserParameterType" +
      "\022\023\n\013MemberLevel\030\001 \001(\t\022\021\n\tVisitorID\030\002 \001(\t" +
      "\022\020\n\010DeviceID\030\003 \001(\t\022\026\n\016DevicePlatform\030\004 \001" +
      "(\t\"0\n\016PaxRequestType\022\017\n\007AgeType\030\001 \001(\005\022\r\n" +
      "\005Count\030\002 \001(\005\"O\n\017RouteSearchType\022\022\n\nSearc" +
      "hMode\030\001 \001(\005\022\022\n\nOfferToken\030\002 \001(\t\022\024\n\014MaxJo" +
      "urneyNo\030\003 \001(\005BA\n=com.ctrip.flight.agg.sh" +
      "opping.contract.transportation.requestP\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.getDescriptor(),
          com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.getDescriptor(),
        }, assigner);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchRequestType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchRequestType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchRequestType_descriptor,
        new java.lang.String[] { "RequestHeader", "SearchCriteria", "RouteSearch", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchCriteriaType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchCriteriaType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_SearchCriteriaType_descriptor,
        new java.lang.String[] { "JourneyRequest", "PaxRequest", "CabinCode", "SaleCurrency", "Language", "ExtensionOption", "NeedRecommendation", "UserParameter", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_JourneyRequestType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_JourneyRequestType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_JourneyRequestType_descriptor,
        new java.lang.String[] { "DepartDate", "DepartLocation", "ArriveLocation", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_LocationType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_LocationType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_LocationType_descriptor,
        new java.lang.String[] { "Type", "Location", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_UserParameterType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_UserParameterType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_UserParameterType_descriptor,
        new java.lang.String[] { "MemberLevel", "VisitorID", "DeviceID", "DevicePlatform", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_PaxRequestType_descriptor,
        new java.lang.String[] { "AgeType", "Count", });
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_RouteSearchType_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_RouteSearchType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ctrip_flight_agg_shopping_contract_transportation_request_RouteSearchType_descriptor,
        new java.lang.String[] { "SearchMode", "OfferToken", "MaxJourneyNo", });
    com.ctrip.flight.agg.shopping.contract.message.ComCtripFlightAggShoppingContractMessage.getDescriptor();
    com.ctrip.flight.agg.shopping.contract.transportation.ComCtripFlightAggShoppingContractTransportation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
