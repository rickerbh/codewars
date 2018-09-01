(ns codewars.partlist
  (:require [clojure.string :as s]))

(defn partlist
  [arr]
  (loop [first-a []
         second-a arr
         acc []]
    (let [next-first-a (conj first-a (first second-a))
          next-second-a (rest second-a)]
      (if (empty? next-second-a)
        acc
        (recur next-first-a
               next-second-a
               (conj acc [(s/join " " next-first-a) (s/join " " next-second-a)]))))))
