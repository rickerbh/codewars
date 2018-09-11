(ns codewars.is-it-a-letter-test
  (:require [codewars.is-it-a-letter :refer [letter?]]
            [clojure.test :refer :all]))

(deftest letter?-tests
  (testing "letter"
    (doseq [s ["a" "X"]]
      (testing (prn-str s)
        (is (true? (letter? s))))))
  (testing "non-letter"
    (doseq [s ["" "7" "*" "ab" "a\n"]]
      (testing (prn-str s)
        (is (false? (letter? s))))))
  )

