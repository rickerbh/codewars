(ns codewars.seqlist)

(defn seqlist
  [first c terms] 
  (take terms (iterate (partial + c) first)))
