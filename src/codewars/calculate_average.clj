(ns codewars.calculate-average)

(defn find-average
  [numbers] 
  (/ (apply + numbers) (count numbers)))
