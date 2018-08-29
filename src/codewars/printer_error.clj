(ns codewars.printer-error)

(defn printer-error
  [control]
  (let [error-count (->> control
                         sort
                         (clojure.string/join "")
                         (re-find #"[n-z]+")
                         count)]
    (str error-count "/" (count control))))
