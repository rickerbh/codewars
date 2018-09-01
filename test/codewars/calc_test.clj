(ns codewars.calc-test
  (:require  [clojure.test :refer :all]
             [codewars.calc :refer :all]))

(deftest sample-tests
  (are [inp exp] (= exp (solution inp))
    "ABC" 6
    "abcdef" 6
    "ifkhchlhfd" 6
    "aaaaaddddr" 30
    "jfmgklf8hglbe" 6
    "jaam" 12))

