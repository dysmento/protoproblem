(ns protoproblem.protoproblem
  "I seem to have a compiler error."
  (:require [protojure.grpc.client.providers.http2 :as grpc.http2]))

(defn -main
  [& _args]
  @(grpc.http2/connect {:uri "http://localhost:1234"}))
