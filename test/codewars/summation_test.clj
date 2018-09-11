(ns codewars.summation-test
  (:require [codewars.sum :refer [sum]]
            [clojure.test :refer :all]))

(deftest simple-tests
  (is (sum 1) 1)
  (is (sum 1 2) 3)
  (is (sum 5 7 9) 21)
  (is (sum 12 1 1 1 1) 16)
  (is (sum 12 1 1 1 1 1 1) 18))
