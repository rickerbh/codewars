(ns codewars.collatz-test
  (:require [clojure.test :refer :all]
            [codewars.collatz :refer :all]))

(deftest simple-test
  (is (= (hotpo 1) 0))
  (is (= (hotpo 5) 5))
  (is (= (hotpo 6) 8))
  (is (= (hotpo 23) 15)))
