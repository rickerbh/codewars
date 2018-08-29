(ns codewars.string-repeat-test
  (:require [codewars.string-repeat :refer :all]
            [clojure.test :refer :all]))

(deftest simple-test
  (is (= (repeat-str 4 "a") "aaaa"))
  (is (= (repeat-str 3 "hello ") "hello hello hello "))
  (is (= (repeat-str 2 "abc") "abcabc")))
