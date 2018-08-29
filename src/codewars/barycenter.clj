(ns codewars.barycenter)

(defn round
  [x & {p :precision}]
  (if p
    (let [scale (Math/pow 10 p)]
      (-> x (* scale) Math/round (/ scale)))
    (Math/round x)))

(defn calculate-bar
  [a b c]
  (round (/ (+ a b c) 3.0) :precision 4))

(defn bar-triang
  [[xa ya] [xb yb] [xc yc]] 
  [(calculate-bar xa xb xc)
   (calculate-bar ya yb yc)])
