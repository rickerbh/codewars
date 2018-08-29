(ns codewars.star-sort)

(defn star-sort
  [strings]
  (->> strings
       sort
       first
       (clojure.string/join "***")))
