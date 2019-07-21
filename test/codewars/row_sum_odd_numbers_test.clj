(ns codewars.row-sum-odd-numbers-test
  (:require [codewars.row-sum-odd-numbers :refer :all]
            [clojure.test :refer :all]))

(deftest sample-tests
  (is (= 1 (row-sum-odd-numbers 1)))
  (is (= 125 (row-sum-odd-numbers 5)))
  (is (= 343 (row-sum-odd-numbers 7))))
