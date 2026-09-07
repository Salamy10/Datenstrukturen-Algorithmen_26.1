# 📚 Algorithmen und Datenstrukturen (AuD) - Klausurvorbereitung

Dieses Repository dient zur Zusammenfassung und Vorbereitung auf die Klausur im Modul **Algorithmen und Datenstrukturen (AuD)**. Es enthält Implementierungen, Prinzipien und Notizen zu den prüfungsrelevanten Themen, die speziell auf die Anforderungen der Vorlesung zugeschnitten sind.

## 🎓 Kursinformationen
* **Studiengang:** Wirtschaftsinformatik
* **Semester:** 2. Semester
* **Dozent:** Julian
* **Datum der Klausur:** Do., 17.09.2026

---

## 🎯 Prüfungsrelevante Themen

### 1. Datenstrukturen
* **Queue & Stack:** 
  * Prüfungsrelevant! Implementierung muss sitzen.
  * Oft in Verbindung mit `LinkedList`-Aufgaben gefragt.
* **LinkedList:** 
  * Fokus liegt nur auf der **einfach verketteten** (normalen) Liste.
  * Doppelt verkettete Listen sind *nicht* prüfungsrelevant.

### 2. Algorithmen (Sortieren & Suchen)
* **Lineare Sortier- und Suchalgorithmen:**
  * **Anforderung:** Prinzip verstanden haben und Code schreiben können.
  * **Behandelte Algos:** BubbleSort, InsertionSort, SelectionSort sowie Jump Search.
* **Rekursive Sortieralgorithmen:**
  * **Anforderung:** Prinzip und manueller Ablauf (Tracing) müssen sitzen.
  * *Hinweis:* Rekursives BubbleSort ist nicht relevant.
  * **Mergesort:** 
    * Zusammenführung nach dem **ebenenweisen/generationsbasierten Prinzip** (Bottom-Up Verschmelzung von links nach rechts).
  * **Quicksort:**
    * **Hoare-Partitionierung (Zwei-Zeiger-Methode):** Ein Zeiger (L) läuft von links, einer (R) von rechts.
    * **Pivotelement (P):** Liegt immer ganz rechts im Teilarray.
    * **Wichtig für die Klausur (Tracing):** Bei manuellem Tracing in der Klausur immer das Array nach jedem Vertauschen neu hinschreiben und die getätigten "Swaps" in einer separaten Liste rechts daneben notieren. Feste Elemente markieren.

### 3. Graphen und Bäume
* **Tiefen- und Breitendurchlauf (DFS & BFS):**
  * Prinzip verstehen und den Code lesen/nachvollziehen können.
  * Wahrscheinlich *nicht* komplett selbst zu implementieren.

---

## 💡 Klausur-Tipps & Rahmenbedingungen
* **Code-Aufgaben:** Es muss nur der spezifisch gefragte Teil (die Logik) implementiert werden. Rahmenklassen (Boilerplate-Code) müssen nicht geschrieben werden.
* **Hilfsmittel:** Benötigte mathematische Formeln sind in der Klausur gegeben.
* **Bewertung (Kulanz):** Julian berücksichtigt es bei der Korrektur, falls bestimmte Aufgaben im Schnitt zu schwer ausgefallen sind. Wenn fast niemand Punkte hat, schaut er, "was sich machen lässt".

---

## 📂 Struktur des Repositories

*(Hier kannst du eintragen, wie du deine Dateien im Repo abgelegt hast, z.B.:)*
* `/src` - Java-Quellcode zu den Implementierungen von Sortieralgorithmen und Datenstrukturen.
* `/docs` - Vorlesungsfolien, Mitschriften und Tracing-Beispiele.
