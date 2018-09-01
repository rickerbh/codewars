(ns codewars.calc
  (:require [clojure.string :as s]))

(defn str-to-ints
  [string]
  (map #(Integer/parseInt %)
       (s/split string #"")))

(defn calc
  [s]
  (let [total1 (apply str (map int s))
        total2 (s/replace total1 #"7" "1")
        sum-1  (reduce + (str-to-ints total1))
        sum-2  (reduce + (str-to-ints total2))]
    (- sum-1 sum-2)))

(def solution calc)
