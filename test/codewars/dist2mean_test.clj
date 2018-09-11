(ns codewars.dist2mean-test
  (:require [codewars.dist2mean :refer :all]
            [clojure.test :refer :all]))

(defn test-assert [act exp]
  (is (= act exp))) 
(deftest a-test1
  (testing "distances-from-average"
    (test-assert (distances-from-average [55, 95, 62, 36, 48]) [4.2, -35.8, -2.8, 23.2, 11.2])
    (test-assert (distances-from-average [1, 1, 1, 1, 1]) [0.0, 0.0, 0.0, 0.0, 0.0])
    (test-assert (distances-from-average [1, -1, 1, -1, 1, -1]) [-1.0, 1.0, -1.0, 1.0, -1.0, 1.0])
    (test-assert (distances-from-average [1, -1, 1, -1, 1]) [-0.8, 1.2, -0.8, 1.2, -0.8])
    (test-assert (distances-from-average [2, -2]) [-2.0, 2.0])
    (test-assert (distances-from-average [123 -65 32432 -353 -534]) [6197.6 6385.6 -26111.4 6673.6 6854.6])
    ))

