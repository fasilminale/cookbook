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
import io.swagger.client.model.User
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CountryApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Company] (successful operation)
   */
  def countryGet(): ApiRequest[Seq[Company]] =
    ApiRequest[Seq[Company]](ApiMethods.GET, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/country", "application/json")
      .withSuccessResponse[Seq[Company]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : Any (Country has been added)
   *   code 405 :  (Invalid input)
   * 
   * @param body Created user object
   */
  def countryPost(body: User): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/country", "application/json")
      .withBody(body)
      .withSuccessResponse[Any](201)
      .withErrorResponse[Unit](405)
      

}

