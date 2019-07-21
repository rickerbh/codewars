(ns codewars.complementary-dna-tests
  (:require [codewars.complementary-dna :refer [dna-strand]]
            [clojure.test :refer :all]))

(deftest sample-tests
  (is (= (dna-strand "ATCG") "TAGC")))
