package com.eklaweb.googlegeocodingapi

import net.liftweb.json._
import dispatch._
import dispatch.liftjson.Js._

object Geocoding {
  val endPoint = "http://maps.googleapis.com/maps/api/geocode/json"
  val defaultParams = List(
      ("sensor", "true"),
      ("region", "fr"),
      ("language", "en")
  )
  def encodeAddress(
    address: String,
    params: List[(String, String)] = defaultParams): Response = {
    implicit val formats = DefaultFormats
    val req = url(endPoint) <<? (("address", address) :: params)
    Http(req ># { _.extract[Response] })
  }
}

