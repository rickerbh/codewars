(ns codewars.calc-total-test
  (:require [clojure.test :refer :all]
            [codewars.calc-total :refer :all]))

(deftest test1
  (testing "Basic"
    (is (= true  (calculate_total [1 2 2] [1 0 0])))
    (is (= false (calculate_total [6 45 1] [1 55 0])))
    (is (= true  (calculate_total [57 2 1] [])))
    (is (= false (calculate_total [] [3 4 3])))
    (is (= false (calculate_total [] [])))))
