(ns codewars.digitizer)

(defn digitize
  [digits] 
  (->> digits
       str
       reverse
       (map #(Integer/parseInt (str %)))))
