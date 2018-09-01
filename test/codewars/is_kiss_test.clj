(ns codewars.is-kiss-test
  (:require [clojure.test :refer :all]
            [codewars.is-kiss :refer :all]))

(deftest sample-tests
  (testing "word count: 5"
    (is (= (solution "Joe had a bad day") "Good work Joe!"))
    (is (= (solution "Joe had some bad days") "Good work Joe!"))
    (is (= (solution "Joe is having no fun") "Keep It Simple Stupid"))
    (is (= (solution "Sometimes Joe cries for hours") "Keep It Simple Stupid")))
  (testing "word count: 6"
    (is (= (solution "Joe is having lots of fun") "Good work Joe!"))
    (is (= (solution "Joe is working hard a lot") "Keep It Simple Stupid")))
  (testing "word count: 10"
    (is (= (solution "Joe listened to the noise and it was an onamonapia") "Good work Joe!"))
    (is (= (solution "Joe listened to the noises and there were some onamonapias") "Keep It Simple Stupid"))))

