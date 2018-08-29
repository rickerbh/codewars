(ns codewars.bonus-test
  (:require  [clojure.test :refer :all]
             [codewars.bonus :refer :all]))

(deftest basic-tests
  (is (= (bonus-time 10000 true) "$100000"))
  (is (= (bonus-time 25000 true) "$250000"))
  (is (= (bonus-time 10000 false) "$10000"))
  (is (= (bonus-time 60000 false) "$60000"))
  (is (= (bonus-time 2 true) "$20"))
  (is (= (bonus-time 78 false) "$78"))
  (is (= (bonus-time 67890 true) "$678900")))
