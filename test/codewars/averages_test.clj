(ns codewars.averages-test
  (:require [codewars.averages :as sut]
            [clojure.test :refer :all]))

(deftest averages-test
  (are [in out] (= (sut/averages in) out)
    '(2 2 2 2 2) '(2.0 2.0 2.0 2.0)
    '(2 -2 2 -2 2) '(0.0 0.0 0.0 0.0)
    '(1 3 5 1 -10) '(2.0 4.0 3.0 -4.5)
    ))
