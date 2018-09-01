(ns codewars.band-name-generator-test
  (:require  [clojure.test :refer :all]
             [codewars.band-name-generator :refer :all]))

(deftest sample
  (testing "sample-tests"
    (are [input expected] (= (generate-band-name input) expected)
      "knife" "The Knife"
      "tart" "Tartart"
      "sandles" "Sandlesandles"
      "bed" "The Bed")))

