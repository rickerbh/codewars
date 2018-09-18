(ns codewars.excelsheet-test
  (:require [codewars.excelsheet :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "Basic tests"
    (is (= (title-to-nb "A") 1))
    (is (= (title-to-nb "Z") 26))
    (is (= (title-to-nb "AA") 27))
    (is (= (title-to-nb "AB") 28))
    (is (= (title-to-nb "AZ") 52))
    (is (= (title-to-nb "BA") 53))
    (is (= (title-to-nb "CODEWARS") 28779382963))    
    ))

