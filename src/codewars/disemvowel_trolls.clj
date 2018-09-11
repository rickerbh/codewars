(ns codewars.disemvowel-trolls)

(defn disemvowel
  [s]
  (apply str (remove #((set "aeiouAEIOU") %) s)))
