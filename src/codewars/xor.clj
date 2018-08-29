(ns codewars.xor)

(defn xor
  [a b]
  (if a
    (if b
      false
      true)
    (if b
      true
      false)))
