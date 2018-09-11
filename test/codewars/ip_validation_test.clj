(ns codewars.ip-validation-test
  (:require [codewars.ip-validation :refer :all]
            [clojure.test :refer :all]))

(deftest
  how-old
  (testing "Testing how old"
    (is (false? (validate-ip "")))
    (is (false? (validate-ip "12.b.3.a")))
    (is (false? (validate-ip "32.64.128.256")))
    (is (true? (validate-ip "127.0.0.1")))
    (is (true? (validate-ip "32.64.128.255")))))
