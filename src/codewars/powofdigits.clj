(ns codewars.powofdigits)

(defn number->digits
  [n]
  (map #(- (byte %) 48) (str n)))

(defn power
  [n e]
  (apply * (repeat e n)))

;; Hmmm, this is a bit incomprehensible
(defn eq-sum-pow-dig
  [hmax po]
  (->> hmax
       inc
       (range 2)
       (map (fn [x]
              [x (->> x
                      number->digits
                      (map #(power % po))
                      (apply +))]))
       (filter #(= (first %) (second %)))
       (map second)))
