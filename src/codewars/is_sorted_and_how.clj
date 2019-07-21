(ns codewars.is-sorted-and-how)

(defn sorted-and-how?
  [xs]
  (let [duplicates? (not= (count xs) (count (set xs)))
        asc? (= xs (sort < xs))
        desc? (= xs (sort > xs))]
    (if duplicates?
      "no"
      (if asc?
        "yes, ascending"
        (if desc?
          "yes, descending"
          "no")))))
