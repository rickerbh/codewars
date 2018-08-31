(ns codewars.longest)

(defn longest
  [s1 s2]
  (->> (concat s1 s2)
       set
       sort
       (apply str)))
