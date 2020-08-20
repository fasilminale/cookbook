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

case class TrialBalanceReport (
  id: Option[Long] = None,
  chartsOfAccount: Option[String] = None,
  filteredBy: Option[String] = None,
  targetMoves: Option[String] = None,
  dateFrom: Option[Date] = None,
  dateTo: Option[Date] = None,
  periodFrom: Option[Date] = None,
  periodTo: Option[Date] = None,
  sortedBy: Option[String] = None,
  currency: Option[String] = None,
  createdAt: Option[String] = None,
  updatedAt: Option[String] = None,
  journal: Option[Journal] = None,
  fiscalYear: Option[FiscalYear] = None
) extends ApiModel


