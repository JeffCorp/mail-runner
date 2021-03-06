/**
 * Covid-19 Sniffer
 * This documentation was created to help developers use the Covid 19 Sniffer Resource.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class User (
  email: String,
  password: String,
  name: String,
  phone: String,
  dob: Date,
  /* Gender should be any of these */
  gender: UserEnums.Gender,
  /* should contain properties that defines the user's account. Such as  - role (object) - country (object) - state (object) */
  meta: Option[Any] = None
) extends ApiModel

object UserEnums {

  type Gender = Gender.Value
  object Gender extends Enumeration {
    val Male = Value("male")
    val Female = Value("female")
  }

}

