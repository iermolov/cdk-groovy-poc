package ru.ermolov.model

import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.builder.*

/**
 * Created by iermolov on 11/08/15.
 */
@ToString
@Immutable
class Identification {
    String shortID
    String transactionID
    String orderID
}
