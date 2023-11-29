package io.swagger.server.api.service;

import io.swagger.server.api.model.InlineResponse20020;
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
public interface ErrorsApi  {

    String WEBSERVICE_ADDRESS_ERRORSAPI = "";
    String OPERATION_ID_LISTERRORS = "listErrors";

    void listErrors(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
