(ns codewars.validword-test
  (:require  [clojure.test :refer :all]
             [codewars.validword :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "find-even-index"
    (println "Fixed Tests validate-word")
    (test-assert(validate-word "abcabc"), true)
    (test-assert(validate-word "abc123"), true)
    (test-assert(validate-word "abcabcd"), false)
    (test-assert(validate-word "abc!abc!"), true)
    (test-assert(validate-word "abc!abc"), false)
    ))
