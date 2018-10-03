(ns codewars.movie)

(defn card-price-for-visit
  [ticket perc visit]
  (if (= 1 visit)
    (* ticket perc)
    (apply * (into [ticket] (repeat visit perc)))))

(defn movie'
  [card ticket perc]
  (let [a-seq (map-indexed (fn [idx price] (* (inc idx) price)) (repeat ticket))
        b-seq (map (fn [idx]
                     (apply + (into [card]
                                    (map #(card-price-for-visit ticket perc %) (range 1 (inc idx))))))
                   (drop 1 (range)))]
    (->> (interleave a-seq b-seq)
         (partition 2 2)
         (keep-indexed #(if (apply > %2) (inc %1) nil))
         first)))

(defn movie
  [card ticket perc] 
  (let [b-multiplier (* ticket perc)]
    (loop [a-price ticket
           b-price (+ card b-multiplier)
           b-multiplier b-multiplier
           iter 1]
      (if (< (Math/ceil b-price) a-price)
        iter
        (let [next-visit (inc iter)
              new-multiplier (* b-multiplier perc)]
          (recur (+ a-price ticket)
                 (+ b-price new-multiplier)
                 new-multiplier
                 next-visit))))))
