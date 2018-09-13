(ns codewars.penultimate-test
  (:require [codewars.penultimate :as penultimate]
            [clojure.test :refer :all]))

(deftest test-penultimate
  (let [input1 [1 9 13 1 99 9 9 13]]
    (testing (prn-str input1)
      (is (= (penultimate/penultimate input1) 9)))))
