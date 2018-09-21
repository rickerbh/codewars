(ns codewars.binary-score)

;; Naïve solution
(defn score'
  [n]
  (if (= 0 n)
    0
    (apply bit-or (range (inc n)))))

;; Expanding brain solution
(defn score
  [n]
  (if (= 0 n)
    0
    (as-> n $
      (biginteger $)
      (.toString $ 2)
      (count $)
      (repeat $ "1")
      (apply str $)
      (str "2r" $)
      (read-string $))))
