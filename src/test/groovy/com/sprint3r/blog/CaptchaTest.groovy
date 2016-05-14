package com.sprint3r.blog

import spock.lang.Specification

class CaptchaTest extends Specification{
    def "Returned string should be 'three - 1' "(){
        setup:
            def captcha = new Captcha(2, 3, 3, 1)

        when:
            def combined = captcha.toString()

        then:
            combined == "three - 1"
    }
    def "Returned string should be '1 + one' "(){
        setup:
            def captcha = new Captcha(1, 1, 1, 1)

        when:
            def combined = captcha.toString()

        then:
            combined == "1 + one"
    }
    def "Operator should be minus"(){
        setup:
            def captcha = new Captcha(1, 1, 3, 1)

        when:
            def operator = captcha.operator()

        then:
            operator == "-"
    }
    def "Operator should be multiply"(){
        setup:
            def captcha = new Captcha(1, 1, 2, 1)

        when:
            def operator = captcha.operator()

        then:
            operator == "*"
    }
    def "Operator should be plus"(){
        setup:
            def captcha = new Captcha(1, 1, 1, 1)

        when:
            def operator = captcha.operator()

        then:
            operator == "+"
    }
    def "Second pattern right operand should be 9"(){
        setup:
            def captcha = new Captcha(2, 1, 1, 9)

        when:
            def right = captcha.right()

        then:
            right == "9"
    }
    def "Second pattern right operand should be 1"(){
        setup:
            def captcha = new Captcha(2, 1, 1, 1)

        when:
            def right = captcha.right()

        then:
            right == "1"
    }
    def "First pattern right operand should be nine"(){
        setup:
            def captcha = new Captcha(1, 1, 1, 9)

        when:
            def right = captcha.right()

        then:
            right == "nine"
    }
    def "First pattern right operand should be one"(){
        setup:
            def captcha = new Captcha(1, 1, 1, 1)

        when:
            def right = captcha.right()

        then:
            right == "one"
    }
    def "Second pattern left operand should be nine"(){
        setup:
            def captcha = new Captcha(2, 9, 1, 1)

        when:
            def left = captcha.left()

        then:
            left == "nine"
    }
    def "Second pattern left operand should be one"() {
        setup:
            def captcha = new Captcha(2, 1, 1, 1)

        when:
            def left = captcha.left()

        then:
            left == "one"
    }
    def "First pattern left operand should be 1"() {
        setup:
            def captcha = new Captcha(1, 1, 1, 1)

        when:
            def left = captcha.left()

        then:
            left == "1"

    }
    def "First pattern left operand should be 2"(){
        setup:
            def captcha = new Captcha(1, 2, 1, 1)

        when:
            def left = captcha.left()

        then:
            left == "2"

    }
    def "First pattern left operand should be 9"(){
        setup:
            def captcha = new Captcha(1, 9, 1, 1)

        when:
            def left = captcha.left()

        then:
            left == "9"
    }
}
