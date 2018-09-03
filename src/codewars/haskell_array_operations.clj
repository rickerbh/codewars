(ns codewars.haskell-array-operations)

(defn head
  [xs]
  (first xs))

(def tail rest)

(defn init
  [xs]
  (-> xs
      reverse
      rest
      reverse))

(defn last_
  [xs]
  (-> xs
      reverse
      first))
