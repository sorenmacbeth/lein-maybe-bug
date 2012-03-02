(defproject lein-maybe-bug "1.0.0-SNAPSHOT"
  :description "demostrates some odd leiningen behaviour with java sources and gen-class forms"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :aot [lein-maybe-bug.core])

