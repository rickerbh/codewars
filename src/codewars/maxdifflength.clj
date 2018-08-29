(ns codewars.maxdifflength)

(defn abs [n] (max n (-' n)))

(defn mxdiflg
  [xs ys]
  (if (or (= 0 (count xs))
          (= 0 (count ys)))
    -1
    (let [len-xs (map count xs)
          len-ys (map count ys)]
      (->> len-xs
           (map #(map (fn [y] (abs (- % y))) len-ys))
           flatten
           (apply max)))))

