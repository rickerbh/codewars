(ns codewars.power-of-four-test
  (:require [codewars.power-of-four :refer :all]
            [clojure.test :refer :all]))

(deftest simple
  (are [x expected]
      (= expected (isPowerOf4? x))
    0 true
    1 true
    2 false
    3 false
    4 true
    5 false
    16 true
    256 true
    257 false
    (* 4 4 4 4) true
    (inc (* 4 4 4 4)) false))
