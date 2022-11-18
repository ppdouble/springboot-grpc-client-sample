package com.pxample.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: cityscoreproto.proto")
public final class cityscoreGrpc {

  private cityscoreGrpc() {}

  public static final String SERVICE_NAME = "cityscore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pxample.api.CityScore.CityScoreRequest,
      com.pxample.api.CityScore.CityScoreResponse> getCalculateCityScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateCityScore",
      requestType = com.pxample.api.CityScore.CityScoreRequest.class,
      responseType = com.pxample.api.CityScore.CityScoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pxample.api.CityScore.CityScoreRequest,
      com.pxample.api.CityScore.CityScoreResponse> getCalculateCityScoreMethod() {
    io.grpc.MethodDescriptor<com.pxample.api.CityScore.CityScoreRequest, com.pxample.api.CityScore.CityScoreResponse> getCalculateCityScoreMethod;
    if ((getCalculateCityScoreMethod = cityscoreGrpc.getCalculateCityScoreMethod) == null) {
      synchronized (cityscoreGrpc.class) {
        if ((getCalculateCityScoreMethod = cityscoreGrpc.getCalculateCityScoreMethod) == null) {
          cityscoreGrpc.getCalculateCityScoreMethod = getCalculateCityScoreMethod = 
              io.grpc.MethodDescriptor.<com.pxample.api.CityScore.CityScoreRequest, com.pxample.api.CityScore.CityScoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cityscore", "calculateCityScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pxample.api.CityScore.CityScoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pxample.api.CityScore.CityScoreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cityscoreMethodDescriptorSupplier("calculateCityScore"))
                  .build();
          }
        }
     }
     return getCalculateCityScoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cityscoreStub newStub(io.grpc.Channel channel) {
    return new cityscoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cityscoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cityscoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cityscoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cityscoreFutureStub(channel);
  }

  /**
   */
  public static abstract class cityscoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateCityScore(com.pxample.api.CityScore.CityScoreRequest request,
        io.grpc.stub.StreamObserver<com.pxample.api.CityScore.CityScoreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateCityScoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateCityScoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pxample.api.CityScore.CityScoreRequest,
                com.pxample.api.CityScore.CityScoreResponse>(
                  this, METHODID_CALCULATE_CITY_SCORE)))
          .build();
    }
  }

  /**
   */
  public static final class cityscoreStub extends io.grpc.stub.AbstractStub<cityscoreStub> {
    private cityscoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cityscoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cityscoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cityscoreStub(channel, callOptions);
    }

    /**
     */
    public void calculateCityScore(com.pxample.api.CityScore.CityScoreRequest request,
        io.grpc.stub.StreamObserver<com.pxample.api.CityScore.CityScoreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateCityScoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class cityscoreBlockingStub extends io.grpc.stub.AbstractStub<cityscoreBlockingStub> {
    private cityscoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cityscoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cityscoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cityscoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.pxample.api.CityScore.CityScoreResponse calculateCityScore(com.pxample.api.CityScore.CityScoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateCityScoreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class cityscoreFutureStub extends io.grpc.stub.AbstractStub<cityscoreFutureStub> {
    private cityscoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cityscoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cityscoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cityscoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pxample.api.CityScore.CityScoreResponse> calculateCityScore(
        com.pxample.api.CityScore.CityScoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateCityScoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_CITY_SCORE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cityscoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cityscoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_CITY_SCORE:
          serviceImpl.calculateCityScore((com.pxample.api.CityScore.CityScoreRequest) request,
              (io.grpc.stub.StreamObserver<com.pxample.api.CityScore.CityScoreResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class cityscoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cityscoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pxample.api.CityScore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cityscore");
    }
  }

  private static final class cityscoreFileDescriptorSupplier
      extends cityscoreBaseDescriptorSupplier {
    cityscoreFileDescriptorSupplier() {}
  }

  private static final class cityscoreMethodDescriptorSupplier
      extends cityscoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cityscoreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (cityscoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cityscoreFileDescriptorSupplier())
              .addMethod(getCalculateCityScoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
