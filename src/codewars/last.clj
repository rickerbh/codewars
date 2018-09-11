(ns codewars.last)

(defn last
  [xs]
  (first (take-last 1 xs)))
