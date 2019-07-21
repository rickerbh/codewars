(ns codewars.averages)

(defn averages
  [xs]
  (if (or (nil? xs)
          (>= 1 (count xs)))
    []
    (loop [a (first xs)
           b (second xs)
           xs (drop 2 xs)
           averages []]
      (let [updated  (conj averages (double (/ (+ a b) 2)))]
        (if (empty? xs)
          updated
          (recur b (first xs) (drop 1 xs) updated))))))
