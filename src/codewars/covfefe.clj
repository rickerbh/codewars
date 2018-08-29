(ns codewars.covfefe)

(defn covfefe
  [s]
  (let [match-re #"coverage"
        replace-str "covfefe"]
    (if (re-find match-re s)
      (clojure.string/replace s match-re replace-str)
      (str s " " replace-str))))
