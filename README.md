# SpringBasic
Schritt 1: Erstelle eine Spring-Boot-Anwendung mit dem Spring Initializr und füge den spring-web-starter hinzu.

Schritt 2: Schreibe einen Controller, der eine GET-Anfrage auf '/hello' verarbeitet und 'Hello, World!' zurückgibt.

Schritt 3: Verwende Path Variables, um den Namen in der Nachricht anzupassen.
Beispiel: '/hello/John' gibt 'Hello, John!' zurück.

Schritt 4: Teste deine Controller-Methode mit einem REST-Client oder Postman und dokumentiere deine Ergebnisse.

### Bonus
Schritt 1: Erstelle eine neue Klasse 'Message' mit den Felder 'name', 'message' und 'id' vom Typ String.

Schritt 2: Der Controller soll nun eine Liste von Message-Objekten haben.

Schritt 3: Implementiere eine zusätzliche Controller-Methode, die eine POST-Anfrage auf '/messages' verarbeitet. Diese Methode sollte eine id, einen Namen und eine Message im Request-Body entgegennehmen und sie in der Liste speichern.

Schritt 4: Implementiere eine zusätzliche Controller-Methode, die eine GET-Anfrage auf '/messages' verarbeitet. Diese Methode sollte die Liste der Messages zurückgeben.

Schritt 5: Implementiere eine zusätzliche Controller-Methode, die eine DELETE-Anfrage auf '/messages/id' verarbeitet. Diese Methode sollte die Message mit der entsprechenden id aus der Liste löschen.(nutze eine Path Variable)
