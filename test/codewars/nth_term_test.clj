(ns codewars.nth-term-test
  (:require [codewars.nth-term :as sut]
            [clojure.test :refer :all]))

(deftest example-nth-term-test
  (is (= (sut/nth-term 1 2 3) 7) )
  (is (= (sut/nth-term 2 2 2) 6) )
  (is (= (sut/nth-term -50 10 20) 150) )
  )
