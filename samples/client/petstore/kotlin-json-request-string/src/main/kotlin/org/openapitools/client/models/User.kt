/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * A User who is purchasing from the pet store
 *
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */
@Parcelize
@Serializable

data class User (

    @SerialName(value = "id")
    val id: kotlin.Long? = null,

    @SerialName(value = "username")
    val username: kotlin.String? = null,

    @SerialName(value = "firstName")
    val firstName: kotlin.String? = null,

    @SerialName(value = "lastName")
    val lastName: kotlin.String? = null,

    @SerialName(value = "email")
    val email: kotlin.String? = null,

    @SerialName(value = "password")
    val password: kotlin.String? = null,

    @SerialName(value = "phone")
    val phone: kotlin.String? = null,

    /* User Status */
    @SerialName(value = "userStatus")
    val userStatus: kotlin.Int? = null

) : Parcelable {


}

