(ns codewars.reverse-longer)

(defn- reverseLonger'
  [shorter longer]
  (str shorter (apply str (reverse longer)) shorter))

(defn reverseLonger
  [a b]
  (if (< (count a) (count b))
    (reverseLonger' a b)
    (reverseLonger' b a)))
