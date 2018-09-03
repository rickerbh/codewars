(ns codewars.reverser-test
  (:require  [clojure.test :refer :all]
             [codewars.reverser :refer :all]))

(deftest sample-tests
  (are [inp exp] (= (solution inp) exp)
    "How now brown cow" "woH won nworb woc"
    "racecar." ".racecar"
    "Hi mom!" "iH !mom"
    " go away " " og yawa "
    "I like noodles" "I ekil seldoon"
    "The red pen wrote on the wall" "ehT der nep etorw no eht llaw"
    "Green trucks drive fast" "neerG skcurt evird tsaf"
    "Pink trucks drive slow" "kniP skcurt evird wols"
    "Be happy" "eB yppah"))
