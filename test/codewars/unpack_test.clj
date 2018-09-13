(ns codewars.unpack-test
  (:require [codewars.unpack :as unpack]
            [clojure.test :refer :all]))

(deftest examples
  (is (= (unpack/spread + [1 2 3 4 5]) 15), "Spread isn't working!")
  )
