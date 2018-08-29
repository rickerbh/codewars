(ns codewars.sort-the-inner-content-test
  (require [clojure.test :refer :all])
  (use [codewars.sort-the-inner-content :rename {sort-the-inner-content solution}]))

(deftest sample-tests
  (is (= (solution "sort the inner content in descending order") "srot the inner ctonnet in dsnnieedcg oredr"))
  (is (= (solution "wait for me") "wiat for me"))
  (is (= (solution "this kata is easy") "tihs ktaa is esay"))
  (is (= (solution "mind the     spaaaace ") "mnid the     spcaaaae "))
  (is (= (solution "this is a test") "tihs is a tset"))
  (is (= (solution "a") "a"))
  (is (= (solution "  a ") "  a "))
  (is (= (solution "a b c") "a b c"))
  (is (= (solution " a b  c   ") " a b  c   "))
  (is (= (solution "ab") "ab"))
  (is (= (solution " ab") " ab"))
  (is (= (solution "ab cd ef") "ab cd ef"))
  (is (= (solution " ab  cd  ef ") " ab  cd  ef "))
  (is (= (solution " abc def ") " abc def ")))

