(ns codewars.girl-age-test
  (:require  [clojure.test :refer :all]
             [codewars.girl-age :refer :all]))

(deftest
  how-old-test
  (testing "Testing how old"
    (is (= (how-old "1 year old") 1))
    (is (= (how-old "6 years old") 6))))
