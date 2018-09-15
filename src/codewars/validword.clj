(ns codewars.validword
  (:require [clojure.string :as s]))

(defn validate-word
  [word]
  (let [fs (-> word s/lower-case frequencies)
        char-num (-> fs vals first)]
    (->> fs
         (filter #(= char-num (second %)))
         count
         (= (count fs)))))

;; Could be much shorter...
(defn validate-word'
  [word]
  (apply = (-> word
               s/lower-case
               frequencies
               vals)))
