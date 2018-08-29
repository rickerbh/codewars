(ns codewars.chromosomes-test
  (:require  [clojure.test :refer :all]
             [codewars.chromosomes :refer :all]))

(deftest simple-tests
  (is (= "Congratulations! You're going to have a son." (chromosome-check "XY")))
  (is (= "Congratulations! You're going to have a daughter." (chromosome-check "XX"))))
