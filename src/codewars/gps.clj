(ns codewars.gps)

(defn gps
  [s xs]
  (if (< (count xs) 2)
    0
    (->> xs
         (partition 2 1)
         (map #(- (second %) (first %)))
         (map #(/ (* 3600 %) s))
         (map #(int (Math/floor %)))
         (apply max))))
