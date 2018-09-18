(ns codewars.powers3-test
  (:require [codewars.powers3 :refer :all]
            [clojure.test :refer :all]))

(deftest test-cases
  (testing "Small cases"
    (is (= (largest-power 2) 0))
    (is (= (largest-power 3) 0))
    (is (= (largest-power 4) 1))
    (is (= (largest-power 5) 1))
    (is (= (largest-power 7) 1)))
  (testing "Large cases"
    (is (= (largest-power 81) 3))
    (is (= (largest-power 82) 4))
    (is (= (largest-power 59049) 9))
    (is (= (largest-power 59050) 10))
    (is (= (largest-power 123456789) 16))
    (is (= (largest-power 987654321) 18))
    )
  (testing "Edge case"
    (is (= (largest-power 1) -1))))

