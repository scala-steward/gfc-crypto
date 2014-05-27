package com.gilt.gfc.crypto

import java.security.MessageDigest

/**
 * Helper library for various cryptographic functions.
 */
// move
object HashFunctions {

  def sha256(str: String): Array[Byte] = sha256(str, "UTF-8")

  def sha256Str(str: String): String = sha256Str(str, "UTF-8")

  def sha256(str: String, enc: String): Array[Byte] = digest(str.getBytes(enc), "SHA-256")

  def sha256Str(str: String, enc: String): String = digestStr(str.getBytes(enc), "SHA-256")

  def sha512(str: String): Array[Byte] = sha512(str, "UTF-8")

  def sha512Str(str: String): String = sha512Str(str, "UTF-8")

  def sha512(str: String, enc: String): Array[Byte] = digest(str.getBytes(enc), "SHA-512")

  def sha512Str(str: String, enc: String): String = digestStr(str.getBytes(enc), "SHA-512")

  def digest(bytes: Array[Byte], algo: String): Array[Byte] = MessageDigest.getInstance(algo).digest(bytes)

  def digestStr(bytes: Array[Byte], algo: String): String = digest(bytes, algo).map("%02x".format(_)).mkString
}
