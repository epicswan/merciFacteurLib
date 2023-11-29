package io.swagger.server.api.service;

import io.swagger.server.api.model.AdressSendCourrier;
import io.swagger.server.api.model.InlineResponse20010;
import io.swagger.server.api.model.InlineResponse20011;
import io.swagger.server.api.model.InlineResponse20012;
import io.swagger.server.api.model.InlineResponse20016;
import io.swagger.server.api.model.InlineResponse20017;
import io.swagger.server.api.model.InlineResponse2002;
import io.swagger.server.api.model.InlineResponse2008;
import io.swagger.server.api.model.InlineResponse2009;
import io.swagger.server.api.model.InlineResponse400;
import io.swagger.server.api.model.SendCourrierAnonymize;
import io.swagger.server.api.model.SendCourrierContent;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;

import java.util.List;
import java.util.Map;

@WebApiServiceGen
public interface CourrierApi  {

    String WEBSERVICE_ADDRESS_COURRIERAPI = "";
    String OPERATION_ID_DELETEENVOI = "deleteEnvoi";
    String OPERATION_ID_GETENVOI = "getEnvoi";
    String OPERATION_ID_GETPOSTAGEPRICE = "getPostagePrice";
    String OPERATION_ID_GETPROOF = "getProof";
    String OPERATION_ID_GETSUIVIENVOI = "getSuiviEnvoi";
    String OPERATION_ID_LISTENVOIS = "listEnvois";
    String OPERATION_ID_SENDCOURRIER = "sendCourrier";
    String OPERATION_ID_UPLOADFILE = "uploadFile";

    void deleteEnvoi(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getEnvoi(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getPostagePrice(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getProof(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getSuiviEnvoi(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void listEnvois(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void sendCourrier(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void uploadFile(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
