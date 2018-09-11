(ns codewars.skin-a-cat-test
  (:require  [clojure.test :refer :all]
             [codewars.skin-a-cat :refer :all]))

(deftest basic-test
  (testing "two parameters"
    (is (= (sum 5 5) 10)))
  (testing "one parameter"
    (is (= ((sum 5) 5) 10))))
