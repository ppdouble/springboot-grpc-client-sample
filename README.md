
## The starter with grpc client

```xml
<dependency>
    <groupId>net.devh</groupId>
    <artifactId>grpc-client-spring-boot-starter</artifactId>
    <version>2.13.0.RELEASE</version>
</dependency>
```
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


## Ref

[grpc server cpp demo](https://github.com/ppdouble/grpc-cpp-server-sample)

[grpc client cpp demo](https://github.com/ppdouble/grpc-cpp-client-sample)

[grpc client with springboot demo](https://github.com/ppdouble/springboot-grpc-client-sample)

[grpc server with springboot demo](https://github.com/ppdouble/springboot-grpc-server-sample)

[grpc client java demo](https://github.com/ppdouble/grpc-service-sample-client)

[grpc server java demo](https://github.com/ppdouble/grpc-service-pemo)

[sprintboot with grpc server. Fork from nils](https://github.com/ppdouble/city-score)

[gRPC Java Client App Implementation](https://www.youtube.com/watch?v=J0AMX9YpdLk)

[grpc sample on github](https://github.com/techtter/grpc)


