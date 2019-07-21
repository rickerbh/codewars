(ns codewars.complementary-dna)

(def dna-complements {\A \T
                      \T \A
                      \C \G
                      \G \C})

(defn dna-strand [dna]
  (->> dna
       (map #(get dna-complements %))
       (apply str)))
