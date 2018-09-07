(ns codewars.reversefun)

;; Works, but too slow
(defn reverse-fun'
  [s]
  (loop [s (reverse s)
         acc ""]
    (if (empty? s)
      acc
      (recur (reverse (rest s)) (str acc (first s))))))

(defn reverse-fun
  [s] 
  (loop [s s
         acc ""]
    (if (empty? s)
      acc
      (if (= 1 (count s))
        (str acc (first s))
        (recur (drop-last (rest s)) (str acc (last s) (first s)))))))
