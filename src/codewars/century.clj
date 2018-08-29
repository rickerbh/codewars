(ns codewars.century)

(defn century
  [year]
  (int (Math/ceil (/ year 100))))
