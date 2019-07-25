(ns codewars.find-the-odd-int)

(defn find-odd [xs]
  (->> xs
       (group-by identity)
       (map #(vector (first %) (count (second %))))
       (filter #(odd? (second %)))
       first
       first))
