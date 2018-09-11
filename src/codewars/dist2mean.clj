(ns codewars.dist2mean)

(defn round-to-2dp
  [n]
  (/ (Math/round (* n 100.0)) 100.0))

(defn distances-from-average [arr]
  arr
  (let [sum (reduce + arr)
        avg (/ sum (count arr))]
    (map #(round-to-2dp (- avg %)) arr)))
