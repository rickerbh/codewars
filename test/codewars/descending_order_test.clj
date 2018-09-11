(ns codewars.descending-order-test
  (:require [codewars.descending-order :refer :all]
            [clojure.test :refer :all]))

(deftest test-cases
  (are [n expected]
      (= expected (desc-order n))
    0          0
    1          1
    15         51))
