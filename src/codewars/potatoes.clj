(ns codewars.potatoes)

(defn potatoes
  [p0 w0 p1]
  (let [potato-percent (- 100 p0)
        water-change (- p0 p1)
        post-potato-percent (- 100 p1)
        potato-weight-percent-ratio-change (/ potato-percent post-potato-percent)
        final-weight (* potato-weight-percent-ratio-change w0)]
    (int final-weight)))
