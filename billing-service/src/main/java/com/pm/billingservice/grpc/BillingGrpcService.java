package com.pm.billingservice.grpc;

import billing.BillingResponse;
import billing.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {
    @Override
    public void createBillingAccount(billing.BillingRequest billingRequest, StreamObserver<billing.BillingResponse> responseObserver) {
        log.info("createBillingAccount request received {}", billingRequest.toString());

        //e.g Business logic - save to database, perform calculations etc

        BillingResponse billingResponse = BillingResponse.newBuilder().setAccountId("123456").setStatus("ACTIVE").build();

        responseObserver.onNext(billingResponse);

        //closing response before closing request
        responseObserver.onCompleted();
    }
}
