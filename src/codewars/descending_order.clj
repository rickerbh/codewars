(ns codewars.descending-order)

(defn desc-order
  [n]
  (->> n
       str
       sort
       reverse
       (apply str)
       read-string))

