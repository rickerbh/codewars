(ns codewars.rentalcarcost-test
  (:require  [clojure.test :refer :all]
             [codewars.rentalcarcost :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "rental-car-cost"
    (test-assert (rental-car-cost  1) 40)
    (test-assert (rental-car-cost  3) 100)
    (test-assert (rental-car-cost  8) 270)
    ))
