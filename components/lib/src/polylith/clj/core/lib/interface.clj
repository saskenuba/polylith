(ns polylith.clj.core.lib.interface
  (:require [polylith.clj.core.lib.core :as core])
  (:require [polylith.clj.core.lib.size :as size]
            [polylith.clj.core.lib.resolve-libs :as resolve-libs]
            [polylith.clj.core.lib.text-table.lib-table :as lib-table]))

(defn latest-with-sizes [libraries user-home]
  (core/latest-with-sizes libraries user-home))

(defn with-sizes [libraries user-home]
  (size/with-sizes libraries user-home))

(defn brick-lib-deps [ws-type config top-namespace ns-to-lib namespaces user-home]
  (core/brick-lib-deps ws-type config top-namespace ns-to-lib namespaces user-home))

(defn print-lib-table [workspace is-all]
  (lib-table/print-table workspace is-all))

(defn resolve-libs [src-deps override-deps]
  (resolve-libs/resolve-libs src-deps override-deps))
