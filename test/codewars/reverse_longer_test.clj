(ns codewars.reverse-longer-test
  (:require [codewars.reverse-longer :refer :all]
            [clojure.test :refer :all]))

(deftest SampleTests
  (is (= (reverseLonger "first" "abcde") "abcdetsrifabcde" ))
  (is (= (reverseLonger "hello" "bau") "bauollehbau"))
  (is (= (reverseLonger "abcde" "fghi") "fghiedcbafghi"))
  (is (= (reverseLonger "abc" "123") "123cba123"))
  (is (= (reverseLonger "" "123") "321"))
  (is (= (reverseLonger "abc" "") "cba")))
