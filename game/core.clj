(ns game.core
  (:require [arcadia.core :refer :all]
            [arcadia.linear :as l])
  (:import [UnityEngine Vector3]))

(defonce c (create-primitive :sphere))

(comment
(defn move!
  [go v3]
  (set! (.. go transform position)
        (l/v3+ (.. go transform position)
                   v3)))

(defn def-move!
  [go _]
  (let [offset (Vector3. 0.01 0 0)]
    (move! go offset)))

(defn test!
  [_ _]
  (log "test"))

(hook+ c :update :move #'test!)
)
