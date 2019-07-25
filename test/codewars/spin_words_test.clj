(ns codewars.spin-words-test
  (:require [codewars.spin-words :as sut]
            [clojure.test :refer :all]))

(deftest one-word-test
  (is (= (sut/spin-words "Welcome") "emocleW")))

(deftest one-word-test
  (is (= (sut/spin-words "Hey fellow warriors") "Hey wollef sroirraw"))
  (is (= (sut/spin-words "This is a test") "This is a test"))
  (is (= (sut/spin-words "This is another test") "This is rehtona test")))
