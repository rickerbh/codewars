(ns codewars.number-pairs)

(defn get-larger-numbers
  [a b]
  (let [xs (->> (interleave a b)
                (partition 2))]
    (into [] (map #(apply max %) xs))))

;; Much more compact solution
(def get-larger-numbers' (partial mapv max))
