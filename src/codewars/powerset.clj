(ns codewars.powerset)

(defn powers
  [xs]
  (bigint (.pow 2M (count xs))))

;; Below not necessary, but here's the powerset algorithm
(defn powerset-gen
  [xs]
  (if (empty? xs)
    [xs]
    (let [current (first xs)
          subset (powerset-gen (rest xs))]
      (concat subset (map #(conj % current) subset)))))
