(ns codewars.fcc.reverse)

(defn reverse-string [s]
  (loop [s s
         result []]
    (if (= 0 (count s))
      (clojure.string/join result) 
      (recur (take (- (count s) 1) s)
             (conj result (last s))))))
