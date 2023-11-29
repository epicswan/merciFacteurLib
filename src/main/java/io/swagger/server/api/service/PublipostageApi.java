package io.swagger.server.api.service;

import io.swagger.server.api.model.InlineResponse20013;
import io.swagger.server.api.model.InlineResponse20014;
import io.swagger.server.api.model.InlineResponse2009;
import io.swagger.server.api.model.InlineResponse400;
import io.swagger.server.api.model.SendCourrierAnonymize;
import io.swagger.server.api.model.SourcePublipostageSource;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface PublipostageApi  {

    String WEBSERVICE_ADDRESS_PUBLIPOSTAGEAPI = "";
    String OPERATION_ID_SENDPUBLIPOSTAGE = "sendPublipostage";
    String OPERATION_ID_SOURCEPUBLIPOSTAGE = "sourcePublipostage";
    String OPERATION_ID_TEMPLATEPUBLIPOSTAGE = "templatePublipostage";

    void sendPublipostage(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void sourcePublipostage(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void templatePublipostage(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
