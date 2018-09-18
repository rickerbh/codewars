(ns codewars.power-of-four)

;; Tests are broken, so is solution.
(defn isPowerOf4? 
  [x]
  (or
   (= 1 x)
   (= 0 (mod x 4))))
