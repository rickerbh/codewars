(ns codewars.excelsheet)

(defn title-to-nb
  [title]
  (let [char-xs (reverse (map #(- (int %) 64) title))]
    (loop [offset 1
           xs char-xs
           acc 0]
      (if (empty? xs)
        acc
        (recur (* 26 offset)
               (rest xs)
               (+ acc (* offset (first xs))))))))
