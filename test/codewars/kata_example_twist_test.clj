(ns codewars.kata-example-twist-test
  (:require  [clojure.test :refer :all]
             [codewars.kata-example-twist :refer :all]))

(deftest kata-example-twist-tests
  (is (pos? (count websites)))
  (is (= 1000 (count websites)))
  (is (every? #(= "codewars" %) websites)))



