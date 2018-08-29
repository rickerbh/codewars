(ns codewars.seven-wonders-test
  (:require [codewars.seven-wonders :refer :all]
            [clojure.test :refer :all]))

(deftest seven-wonders-science-test
  (is (= (seven-wonders-science 1 1 1) 10))
  (is (= (seven-wonders-science 2 1 1) 13))
  (is (= (seven-wonders-science 4 2 2) 38)))
