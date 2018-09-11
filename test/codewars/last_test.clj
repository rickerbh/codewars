(ns codewars.last-test
  (:require [codewars.last :as last]
            [clojure.test :refer :all]))

(deftest test-last-function
  (testing "[1 9 13 1 99 9 9 13]"
    (is (= (last/last [1 9 13 1 99 9 9 13]) 13)))
  (testing "Empty list"
    (is (= (last/last '()) nil)))  
  (testing "String: \"I suppose I should learn Lisp, but it seems so foreign.\" - Paul Graham, Nov 1983"
    (is (= (last/last "\"I suppose I should learn Lisp, but it seems so foreign.\" - Paul Graham, Nov 1983") \3))))
