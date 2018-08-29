(ns codewars.fn-with-fn-test
  (:require  [clojure.test :refer :all]
             [codewars.fn-with-fn :refer :all]))

(deftest testcases
  (is (= 1 ((always 1)))))

