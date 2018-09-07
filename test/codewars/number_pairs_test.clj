(ns codewars.number-pairs-test
  (:require [codewars.number-pairs :refer :all]
            [clojure.test :refer :all]))

(deftest example-tests
  (is (vector? (get-larger-numbers [] [])))
  (are [xs ys res] (= (get-larger-numbers xs ys) res)
    [13 64 15 17 88] [23 14 53 17 80] [23 64 53 17 88]
    [34 -64 15 17 88] [23 14 53 17 80] [34 14 53 17 88]
    ))
