(ns codewars.powofdigits-test
  (:require [codewars.powofdigits :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "Basic tests"    
    (is (= (eq-sum-pow-dig 100 2) []))
    (is (= (eq-sum-pow-dig 1000 2) []))
    (is (= (eq-sum-pow-dig 2000 2) []))
    (is (= (eq-sum-pow-dig 200 3) [153]))
    (is (= (eq-sum-pow-dig 370 3) [153 370]))
    ))
