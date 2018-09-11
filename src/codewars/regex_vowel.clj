(ns codewars.regex-vowel)

(defn vowel
  [str]
  (not (empty? (re-matches #"(?i)[aeiou]" str))))
