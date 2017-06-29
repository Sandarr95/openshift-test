(ns openshift-test.core
  (:require [aleph.http :as http])
  (:gen-class))

(defn handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Yo, it works, gj"})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (http/start-server handler {:port 8080})
  (println "Server started")
  (while true (Thread/sleep 100)))
