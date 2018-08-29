(ns codewars.lazy-next)

(defn positions
  [pred coll]
  (keep-indexed (fn [idx x]
                  (when (pred x)
                    idx))
                coll))

(defn next-item
  [xs item]
  (if-let [i (first (positions #{item} xs))] 
    (nth xs (inc i) nil)))
