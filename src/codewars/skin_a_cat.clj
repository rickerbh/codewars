(ns codewars.skin-a-cat)

(defn sum
  ([a]
   (partial + a))
  ([a b]
   (+ a b)))
