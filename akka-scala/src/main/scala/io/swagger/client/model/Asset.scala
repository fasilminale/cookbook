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
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Asset (
  id: Option[Long] = None,
  methodEnd: Option[String] = None,
  salivageValue: Option[Double] = None,
  methodStartDate: Option[Date] = None,
  methodEndDate: Option[Date] = None,
  state: Option[String] = None,
  name: Option[String] = None,
  code: Option[Long] = None,
  purchaseValue: Option[Double] = None,
  isActive: Option[Boolean] = None,
  note: Option[String] = None,
  purchaseDate: Option[Date] = None,
  depreMethod: Option[String] = None,
  methodPeriod: Option[Long] = None,
  company: Option[Company] = None,
  partner: Option[Partner] = None,
  currency: Option[Currency] = None
) extends ApiModel


