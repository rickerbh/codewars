(ns codewars.average-test
  (:require [codewars.average :refer :all]
            [clojure.test :refer :all]))

(deftest basic-test
  (testing "Empty collection"
    (is (= 0 (average' []))))
  (testing "One-element collection"
    (is (= 3 (average' [3]))))
  (testing "Normal collection"
    (is (= 4 (average' [5 3 3 5]))))
  (testing "When mean isn't int"
    (is (= 8 (average' [7 8 9 10])))))
