(ns lein-maybe-bug.core
  (:import leinmaybebug.SomeClass))

(gen-class :name lein-maybe-bug.SomeGenClass
           :prefix "somegenclass-")

(defn somegenclass-test [this]
  (SomeClass.))

