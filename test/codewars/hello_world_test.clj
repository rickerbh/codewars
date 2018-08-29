(ns codewars.hello-world-test
  (:require  [clojure.test :refer :all]
             [codewars.hello-world :refer :all]))

(deftest hello-world
  (testing "Is it a function?"
    (is (function? greet) "greet should be a function"))
  (testing "Does it return the correct value?"
    (is (= (greet) "hello world!") "greet should return \"hello world!\"")))

