(ns codewars.bus)

(defn solution
  [bus-stops]
  (loop [[on off] (first bus-stops)
         remaining-stops bus-stops
         acc 0]
    (let [new-acc (- (+ acc on) off)
          new-stops (rest remaining-stops)]
      (if (empty? new-stops)
        new-acc
        (recur (first new-stops) new-stops new-acc)))))
