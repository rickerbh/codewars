(ns codewars.rock-paper-scissors)

(def game-state
  {:rock {:rock :draw
          :scissors :p1
          :paper :p2}
   :scissors {:rock :p2
              :scissors :draw
              :paper :p1}
   :paper {:rock :p1
           :scissors :p2
           :paper :draw}})

(defn rps
  [& moves]
  (case (get-in game-state (map keyword moves))
    :p1 "Player 1 won!"
    :p2 "Player 2 won!"
    :draw "Draw!"))
