
## @GrpcClient
```java
    @GrpcClient("cityscoreclient")
    private cityscoreGrpc.cityscoreBlockingStub citysScoreStub;
```
> Example: @GrpcClient("myClient") <-> grpc.client.myClient.address=static://localhost:9090
 
## Grpc request setting
address, port and security

```properties
# address, port, security method for grpc client channel
grpc.client.cityscoreclient.address=static://localhost:9906
grpc.client.cityscoreclient.negotiation-type=plaintext
```

## Usage

`http://localhost:8200/cal-score?idNumber=1223&name=daf&surname=dafga&phoneNumber=3242&cityCode=78`

