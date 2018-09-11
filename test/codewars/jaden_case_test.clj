(ns codewars.jaden-case-test
  (:require [codewars.jaden-case :refer :all]
            [clojure.test :refer :all]))

(deftest test-quote
  (is (= "How Can Mirrors Be Real If Our Eyes Aren't Real"
         (jaden-case "How can mirrors be real if our eyes aren't real"))))
