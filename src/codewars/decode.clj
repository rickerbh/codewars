(ns codewars.decode
  (:require [clojure.string :as s]))

(defn to-bin
  [string]
  (map #(as-> % $
          (int $)
          (Integer/toString $ 2)
          (format "%8s" $)
          (s/replace $ #" " "0")) string))

(defn decode-pass
  [pass-arr bin]
  (let [result (filter #(= bin (s/join " " (to-bin %))) pass-arr)]
    (if (empty? result)
      false
      (first result))))
