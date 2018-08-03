(ns codewars.calculate-average-test
  (:require  [clojure.test :refer :all]
             [codewars.calculate-average :refer :all]))

(deftest example-tests
  (is (= 1 (find-average [1 1 1])))
  (is (= 2 (find-average [1 2 3])))
  (is (= 2.5 (double (find-average [1 2 3 4])))))
