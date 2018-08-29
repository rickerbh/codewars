(ns codewars.fcc.reverse-test
  (:require  [clojure.test :refer :all]
             [codewars.fcc.reverse :refer :all]))

(deftest reverse-test

  (is (string? (reverse-string "hello"))
      "should return a string")

  (is (= (reverse-string "hello")
         "olleh")
      "should return \"olleh\"")

  (is (= (reverse-string "Howdy")
         "ydwoH")
      "should return \"ydwoH\"")

  (is (= (reverse-string "Greetings from Earth")
         "htraE morf sgniteerG")
      "should return \"htraE morf sgniteerG\""))
