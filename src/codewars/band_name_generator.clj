(ns codewars.band-name-generator
  (:require [clojure.string :as s]))

(defn generate-band-name
  [noun]
  (let [back (apply str (rest noun))
        uc-first-char (s/upper-case (str (first noun)))]
    (if (= uc-first-char (s/upper-case (last noun)))
      (apply str uc-first-char  (repeat 2 back))
      (str "The " (apply str uc-first-char) back))))

;; In retrospect, I should have used s/capitalize. Oh well.
