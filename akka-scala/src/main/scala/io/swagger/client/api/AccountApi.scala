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

import io.swagger.client.model.User
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AccountApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * @param body Created user object
   */
  def accountGet(body: User): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/I3516/Sparta/1.0.0", "/account", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
      

}

