(ns codewars.disemvowel-trolls-test
  (:require [codewars.disemvowel-trolls :refer :all]
            [clojure.test :refer :all]))

(deftest Testing...
  (is (= (disemvowel "This website is for losers LOL!") "Ths wbst s fr lsrs LL!"))
  )
