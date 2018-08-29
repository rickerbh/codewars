(ns codewars.cofefe-test
  (:require  [clojure.test :refer :all]
             [codewars.covfefe :refer :all]))

(is (= (covfefe "coverage") "covfefe"))
(is (= (covfefe "I have coverage of them") "I have covfefe of them"))
(is (= (covfefe "I dont know") "I dont know covfefe"))
