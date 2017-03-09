package com.github.sycyhy

import spock.lang.Specification

/**
 * @author Lukasz Warzecha
 */
class SampleTest extends Specification {

    def "adding two number results in sum"(){
        expect:
        2+2==4
    }

}