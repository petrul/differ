package org.differ.model

/**
 * a Cause is a program that, when run(), produces a DigitalObject
 */

abstract class Cause extends DigitalObject {
  def run(): DigitalObject
}