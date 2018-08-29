(ns codewars.century-test
  (:require  [clojure.test :refer :all]
             [codewars.century :refer :all]))

(deftest basic
  (testing "Year 1705"
    (is (= (century 1705) 18)))
  (testing "Year 1900"
    (is (= (century 1900) 19)))
  (testing "Year 1601"
    (is (= (century 1601) 17)))
  (testing "Year 2000"
    (is (= (century 2000) 20)))
  (testing "Year 174"
    (is (= (century 174) 2))))
