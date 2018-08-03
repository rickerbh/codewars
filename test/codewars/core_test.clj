(ns codewars.core-test
  (:require [clojure.test :refer :all]
            [codewars.core :refer :all]))

(deftest rotate-for-a-max-test
  (testing "Rotating to get the max"
    (is (= 68957 (max-rot 56789)))))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest nb-year-test
  (testing "nb-year"
    (test-assert(nb-year 1500, 5, 100, 5000), 15)
    (test-assert(nb-year 1500000, 2.5, 10000, 2000000), 10)
    (test-assert(nb-year 1500000, 0.25, 1000, 2000000), 94)))

(deftest predit-age-test1
  (is (= (predict-age 65 60 75 55 60 63 64 45) 86)))

(deftest predit-age-test2
  (is (= (predict-age 32 54 76 65 34 63 64 45) 79)))
