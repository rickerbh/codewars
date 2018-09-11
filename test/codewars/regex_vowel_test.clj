(ns codewars.regex-vowel-test
  (:require [codewars.regex-vowel :refer :all]
            [clojure.test :refer :all]))

(defn assert_equals [act exp]
  (is (= act exp)))

(deftest vowel-test
  (testing "Basic Tests"
    (assert_equals (vowel "") false)
    (assert_equals (vowel "a") true)
    (assert_equals (vowel "E") true)
    (assert_equals (vowel "ou") false)
    (assert_equals (vowel "z" )false)
    (assert_equals (vowel "lol") false)
    ))
