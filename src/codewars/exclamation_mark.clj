(ns codewars.exclamation-mark)

(defn remove-bang
  [word]
  (-> word
      (clojure.string/replace #"!" "")
      (str "!")))
