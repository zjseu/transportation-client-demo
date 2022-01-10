# Request Demo
## List Search Request
```$xslt
{
    "RequestHeader": {
        "MessageHeader": {
            "Channel": "Affiliate",
            "SubChannelID": 0,
            "TransactionID": "44e27a82-b456-4e45-8e27-cffa71a4c862",
            "RequestID": "",
            "ClientIP": "",
            "DeviceID": "",
            "DevicePlatform": ""
        },
        "LoggingLevel": 0,
        "DiagInput": "test"
    },
    "SearchCriteria": {
        "JourneyRequest": [
            {
                "DepartDate": "2021-11-01",
                "DepartLocation": {
                    "Type": 1,
                    "Location": "CNX"
                },
                "ArriveLocation": {
                    "Type": 1,
                    "Location": "BKK"
                }
            },
            {
                "DepartDate": "2021-11-05",
                "DepartLocation": {
                    "Type": 1,
                    "Location": "BKK"
                },
                "ArriveLocation": {
                    "Type": 1,
                    "Location": "CNX"
                }
            }
        ],
        "PaxRequest": [
            {
                "AgeType": 1,
                "Count": 1
            }
        ],
        "CabinCode": [
            "F",
            "C"
        ],
        "SaleCurrency": "CNY",
        "Language": "",
        "ExtensionOption": [
            {
                "Key": "Test",
                "Value": "Test"
            }
        ],
        "UserParameter": {
            "UserID": "test",
            "MemberLevel": ""
        },
       "ResultControl": {
            "NeedRecommendation": false,
            "ValidatingCarrier": null
        },
        "IntlOrDomesticRequest":1,
        "RequestScene":"MainProcess"
    }
}

```

## More Info List Request
```$xslt
{
    "RequestHeader": {
        "MessageHeader": {
            "Channel": "Affiliate",
            "SubChannelID": 0,
            "TransactionID": "44e27a82-b456-4e45-8e27-cffa71a4c862",
            "RequestID": "",
            "ClientIP": "",
            "DeviceID": "",
            "DevicePlatform": ""
        },
        "LoggingLevel": 0,
        "DiagInput": ""
    },
    "SearchCriteria": {
        "JourneyRequest": [
            {
                "DepartDate": "2021-11-01",
                "DepartLocation": {
                    "Type": 1,
                    "Location": "CNX"
                },
                "ArriveLocation": {
                    "Type": 1,
                    "Location": "BKK"
                }
            },
            {
                "DepartDate": "2021-11-05",
                "DepartLocation": {
                    "Type": 1,
                    "Location": "BKK"
                },
                "ArriveLocation": {
                    "Type": 1,
                    "Location": "CNX"
                }
            }
        ],
        "PaxRequest": [
            {
                "AgeType": 1,
                "Count": 1
            }
        ],
        "CabinCode": [
            "F",
            "C"
        ],
        "SaleCurrency": "CNY",
        "Language": "",
        "ExtensionOption": [
            {
                "Key": "Test",
                "Value": "Test"
            }
        ],
        "UserParameter": {
            "UserID": "test",
            "MemberLevel": ""
        },
		 "ResultControl": {
            "NeedRecommendation": false,
            "ValidatingCarrier": null
        },
        "IntlOrDomesticRequest":1,
        "RequestScene":"MainProcess"
    },
    "RouteSearch": {
        "SearchMode": 1,
        "OfferToken": "test",
        "MaxJourneyNo": 2
    }
}
```