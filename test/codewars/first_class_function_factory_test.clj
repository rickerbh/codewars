(ns codewars.first-class-function-factory-test
  (:require [codewars.first-class-function-factory :refer :all]
            [clojure.test :refer :all]))

(deftest factory-tests
  (let [xs [1 2 3]]
    (are [x expected] (= expected ((factory x) xs))
      3 [3 6 9]
      5 [5 10 15]
      )))

