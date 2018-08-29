(ns codewars.digitizer-test
  (:require  [clojure.test :refer :all]
             [codewars.digitizer :refer :all]))

(deftest basic-tests
  (is (= (digitize 35231) [1 3 2 5 3])))

