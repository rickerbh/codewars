(ns codewars.reverse
  (:refer-clojure :exclude [reverse]))

(defn reverse
  "Reverse a list"
  [lst]
  (loop [xs lst
         acc []]
    (if (empty? xs)
      acc
      (recur (drop-last xs)
             (conj acc (last xs))))))
