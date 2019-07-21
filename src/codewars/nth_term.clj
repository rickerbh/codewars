(ns codewars.nth-term)

(defn nth-term
  [a b c]
  (last (range a (+ a (* (inc b) c)) c)))
