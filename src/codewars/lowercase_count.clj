(ns codewars.lowercase-count)

(defn lowercase_count
  [string]
  (count (re-seq #"[a-z]" string)))
