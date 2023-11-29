package io.swagger.server.api.service;

import io.swagger.server.api.model.InlineResponse20018;
import io.swagger.server.api.model.InlineResponse20019;
import io.swagger.server.api.model.InlineResponse2002;
import io.swagger.server.api.model.InlineResponse400;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface CompteApi  {

    String WEBSERVICE_ADDRESS_COMPTEAPI = "";
    String OPERATION_ID_GETQUOTACOMPTE = "getQuotaCompte";
    String OPERATION_ID_GETWEBHOOKENDPOINT = "getWebhookEndpoint";
    String OPERATION_ID_SETWEBHOOKENDPOINT = "setWebhookEndpoint";

    void getQuotaCompte(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getWebhookEndpoint(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void setWebhookEndpoint(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
