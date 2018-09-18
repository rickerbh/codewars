(ns codewars.number-of-squares)

(defn get-number-of-squares
  [n]
  (if (= n 1)
    0 
    (loop [sum 0
           acc 0]
      (let [next-acc (inc acc)
            next-sum (+ sum (* next-acc next-acc))]
        (if (<= n next-sum)
          acc
          (recur next-sum next-acc))))))
