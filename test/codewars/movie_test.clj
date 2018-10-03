(ns codewars.movie-test
  (:require [codewars.movie :refer :all]
            [clojure.test :refer :all]))

(deftest a-test1
  (testing "movie"
    (is (= (movie 500, 15, 0.9) 43))
    (is (= (movie 100, 10, 0.95) 24))
    (is (= (movie 532948, 41, 0.81) 13004))
    (is (= (movie 719154, 13, 0.59) 55322))
    (is (= (movie 0, 10, 0.95) 55322))
    (is (= (movie 2500, 20, 0.9) 135))
    
    ))
