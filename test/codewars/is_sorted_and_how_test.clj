(ns codewars.is-sorted-and-how-test
  (:require [codewars.is-sorted-and-how :as sut]
            [clojure.test :refer :all]))

(deftest sample-tests
  (are [inp exp] (= exp (sut/sorted-and-how? inp))
    [1 2] "yes, ascending"
    [15 7 3 -8] "yes, descending"
    [4 2 30] "no"))
