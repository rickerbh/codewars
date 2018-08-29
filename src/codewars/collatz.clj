(ns codewars.collatz)

(defn hotpo
  [n]
  (loop [n n
         iterations 0]
    (if (= 1 n)
      iterations
      (let [next-iter (inc iterations)]
        (if (even? n)
          (recur (/ n 2) next-iter)
          (recur (inc (* 3 n)) next-iter))))))
  
