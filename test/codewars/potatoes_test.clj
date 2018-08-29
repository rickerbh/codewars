(ns codewars.potatoes-test
  (:require  [clojure.test :refer :all]
             [codewars.potatoes :refer :all]))

(defn dotest [p0 w0 p1 sol]
  (is (= (potatoes p0 w0 p1) sol)))

(deftest a-test
  (println "Basic Tests")
  (dotest 99 100 98 50)
  (dotest 82 127 80 114)
  (dotest 93 129 91 100))
