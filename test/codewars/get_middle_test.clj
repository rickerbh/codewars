(ns codewars.get-middle-test
  (:require [codewars.get-middle :refer :all]
            [clojure.test :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "get-middle"
    (test-assert(get-middle "test"), "es")
    (test-assert(get-middle "testing"), "t")
    (test-assert(get-middle "middle"), "dd")
    (test-assert(get-middle "A"), "A")
    ))
