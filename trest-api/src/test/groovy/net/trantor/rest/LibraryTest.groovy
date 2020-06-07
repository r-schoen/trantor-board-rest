package net.trantor.rest

import spock.lang.Specification

class LibraryTest extends Specification {
    def "sayHi say's Hi"() {
		expect:
		Library.sayHi() == "Hello, World!";
	}
}
