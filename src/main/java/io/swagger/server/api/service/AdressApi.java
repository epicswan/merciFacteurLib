package io.swagger.server.api.service;

import io.swagger.server.api.model.AdressInfosAdress;
import io.swagger.server.api.model.InlineResponse2002;
import io.swagger.server.api.model.InlineResponse2004;
import io.swagger.server.api.model.InlineResponse2005;
import io.swagger.server.api.model.InlineResponse2006;
import io.swagger.server.api.model.InlineResponse2007;
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
public interface AdressApi  {

    String WEBSERVICE_ADDRESS_ADRESSAPI = "";
    String OPERATION_ID_DELETEADRESS = "deleteAdress";
    String OPERATION_ID_GETADRESSINFOS = "getAdressInfos";
    String OPERATION_ID_GETCOUNTRY = "getCountry";
    String OPERATION_ID_LISTADRESS = "listAdress";
    String OPERATION_ID_SETNEWADRESS = "setNewAdress";
    String OPERATION_ID_UPDATEADRESS = "updateAdress";

    void deleteAdress(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getAdressInfos(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void getCountry(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void listAdress(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void setNewAdress(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
    void updateAdress(RequestParameter body, ServiceRequest request, Handler<AsyncResult<ServiceResponse>> resultHandler);
}
