package org.differ.model

/**
 * a thing with a size
 */
abstract class DigitalObject {

  def sizeInBits : Int

}

abstract class AbstractDigitalObject extends DigitalObject {
  def size : Int = sizeInBits / 8
}


