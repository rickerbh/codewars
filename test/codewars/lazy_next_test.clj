(ns codewars.lazy-next-test
  (:require  [clojure.test :refer :all]
             [codewars.lazy-next :refer :all]))

(deftest SampleTests
  (is (= (next-item (range 1 25) 12) 13))
  (is (= (next-item "testing" \t) \e))
  (is (nil? (next-item [:a :b :c] :d)))
  (is (nil? (next-item [:a :b :c] :c))))
