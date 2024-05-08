package issue13506

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class MyControllerSpec extends Specification implements ControllerUnitTest<MyController>, DataTest {

    void "test something"() {
        when:
        controller.index()

        then:
        response.text == 'Test Message'
    }
}
