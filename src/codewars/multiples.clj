(ns codewars.multiples)

(defn solution [number]
  (->> number
       (range 1)
       (filter #(or (= 0 (mod % 3)) (= 0 (mod % 5))))
       (reduce +)))
