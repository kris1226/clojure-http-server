(ns clojure-http-server.core
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t]))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str (t/time-now))})

(defn -main [& args]
  "Runs application"
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
