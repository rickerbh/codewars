(ns codewars.share-price-test
  (:require [codewars.share-price :refer :all]
            [clojure.test :refer :all]))

(deftest t
  (testing "100 [-50 50]"
    (is (= "75.00" (share-price 100 [-50 50])))))
