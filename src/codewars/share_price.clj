(ns codewars.share-price)

(def format-2dp (partial format "%.2f"))

(defn share-price
  [invested changes]
  (if (empty? changes)
    (format-2dp (* invested 1.0))
    (format-2dp (reduce #(+ %1 (* %1 (/ %2 100.0))) invested changes))))

