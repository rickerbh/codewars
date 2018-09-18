(ns codewars.number-of-squares-test
  (:require [codewars.number-of-squares :refer [get-number-of-squares]]
            [clojure.test :refer :all]))

(deftest example-tests
  (are [n answer] (= (get-number-of-squares n) answer)
    1 0
    2 1
    5 1
    6 2
    50 4
    100 6
    1000 13
    10000 30
    100000 66
    1000000 143
    ))
