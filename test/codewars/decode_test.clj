(ns codewars.decode-test
  (:require  [clojure.test :refer :all]
             [codewars.decode :refer :all]))

(deftest decode-example-test
  (is (= (decode-pass '["password123" "admin" "admin1"] "01110000 01100001 01110011 01110011 01110111 01101111 01110010 01100100 00110001 00110010 00110011") "password123"))
  (is (=(decode-pass '["password" "admin" "admin1"] "01110000 01100001 01110011 01110011 01110111 01101111 01110010 01100100 00110001 00110010 00110011") false))
  (is (=(decode-pass '["password" "pass" "test"] "01110000 01100001 01110011 01110011 01110111 01101111 01110010 01100100 00110001 00110010 00110011") false)))
