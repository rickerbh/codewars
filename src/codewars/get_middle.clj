(ns codewars.get-middle)

(defn get-middle [s]
  (let [s-len (count s)]
    (if (even? s-len)
      (apply str (take 2 (drop (dec (/ s-len 2)) s)))
      (str (first (drop (Math/floor (/ s-len 2)) s))))))
