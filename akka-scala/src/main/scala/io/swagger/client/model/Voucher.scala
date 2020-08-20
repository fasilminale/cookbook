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

case class Voucher (
  id: Option[Long] = None,
  date: Option[Date] = None,
  dueDate: Option[Date] = None,
  state: Option[String] = None,
  reference: Option[String] = None,
  name: Option[String] = None,
  amount: Option[Double] = None,
  createdAt: Option[String] = None,
  updatedAt: Option[String] = None,
  currency: Option[Currency] = None,
  tax: Option[Tax] = None,
  period: Option[Period] = None,
  account: Option[Account] = None,
  company: Option[Company] = None,
  partner: Option[Partner] = None
) extends ApiModel


