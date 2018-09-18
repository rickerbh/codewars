(ns codewars.powers3)

(defn power
  [n e]
  (apply * (repeat e n)))

;; Works
(defn largest-power'
  [n]
  (if (= n 1)
    -1
    (loop [acc 1] 
      (if (<= n (power 3 acc)) 
        (dec acc) 
        (recur (inc acc))))))

;; Also works, with a lazy-seq
(defn largest-power
  [n]
  (if (= n 1)
    -1
    (let [sequence (lazy-seq (map (partial power 3) (range 1 (/ n 3))))]
      (->> sequence 
           (take-while (partial > n))
           count))))
