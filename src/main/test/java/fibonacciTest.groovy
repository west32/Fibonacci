import Fibonacci.CountFibonacci
import spock.lang.Specification
import spock.lang.Unroll

class fibonacciTest extends Specification {

    @Unroll
    def "Fibonacci"() {

        given:
        FakeConsumerStrategy fakeConsumer = new FakeConsumerStrategy()
        CountFibonacci fibonacciCheck = new CountFibonacci(fakeConsumer)
        when:
        fibonacciCheck.countFibonacci(howManyNumbers)
        then:
        fakeConsumer.getFibonacciNumbersList() == expectedResult
        where:
        howManyNumbers || expectedResult
        1              || [0]
        2              || [0, 1]
        3              || [0, 1, 1]
        4              || [0, 1, 1, 2]
        0              || []

    }
}

