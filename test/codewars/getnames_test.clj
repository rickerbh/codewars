(ns codewars.getnames-test
  (:require [codewars.getnames :as sut]
            [clojure.test :refer :all]))

(def data [{:name "Joe", :age 20} {:name "Bill", :age 30} {:name "Kate", :age 23}])

(deftest get-names-tests
  (is (= (sut/get-names data) ["Joe" "Bill" "Kate"])))
