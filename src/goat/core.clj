(ns goat.core)

(defn quandary
  []
  (let [prizes (shuffle [:goat :goat :car])
        numbered (map vector (range) prizes)]
    (into {} numbered)))

(defn find-goat 
  [q guess]
  (let [other-choices (dissoc q guess)
        goats (filter (fn [pair] (= :goat (last pair))) other-choices)
        our-goat (first (shuffle goats))]
    (first our-goat)))

(defn make-guess
  [q guess]
  (let [goat (find-goat q guess)]))
