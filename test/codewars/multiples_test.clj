(ns codewars.multiples-test
  (:require [codewars.multiples :as sut]
            [clojure.test :refer :all]))

(deftest test-multiples-of-3-and-5
  (is (= 23 (sut/solution 10))))
