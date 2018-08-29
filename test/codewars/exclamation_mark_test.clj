(ns codewars.exclamation-mark-test
  (:require  [clojure.test :refer :all]
             [codewars.exclamation-mark :refer :all]))

(deftest basic-greetings-test
  (let [greetings ["Hi", "Hi!", "Hi!!!!", "!Hi", "!Hi!", "Hi Hi!!", "Hi!\nHi", "!!!!!!!"]
        expected ["Hi!", "Hi!", "Hi!", "Hi!", "Hi!", "Hi Hi!", "Hi\nHi!", "!"]]
    (doall (map #(is (= (remove-bang %1) %2) "Basic tests") greetings expected))))
