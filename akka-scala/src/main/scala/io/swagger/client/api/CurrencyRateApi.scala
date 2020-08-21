/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find  out more about Swagger at  [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.Company
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CurrencyRateApi {

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid id supplied)
   *   code 404 :  (element not found)
   * 
   * @param id The id that needs to be deleted
   */
  def currencyRatesIdDelete(id: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/currency_rates/{id}", "application/json")
      .withPathParam("id", id)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Company (successful operation)
   *   code 400 :  (Invalid id supplied)
   *   code 404 :  (item not found)
   * 
   * @param id The name that needs to be fetched.
   */
  def currencyRatesIdGet(id: String): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.GET, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/currency_rates/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Company](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid user supplied)
   *   code 404 :  (item not found)
   * 
   * @param id 
   * @param body Updated user object
   */
  def currencyRatesIdPut(id: String, body: Company): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/currency_rates/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 405 :  (Invalid input)
   * 
   * @param body object that needs to be added to the store
   */
  def currencyRatesPost(body: Option[Company] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/currency_rates", "application/json")
      .withBody(body)
      .withErrorResponse[Unit](405)
      

}

