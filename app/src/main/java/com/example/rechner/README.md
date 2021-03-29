TP - Rechner


# Erfüllte Anforderungen
Der Benutzer kann zwischen den vier Grundrechenarten auswählen (mit Hilfe einer „RadioGroup“, bzw. 4 „RadioButtons“) und zwei Zahlen in Textfeldern („Number“) eingeben. Das Ergebnis der Berechnung wird sofort angezeigt, sobald der Benutzer eine gültige Eingabe getätigt hat, ohne das der Benutzer extra auf einen Button klicken muss.

Zusätzlich hat der Benutzer die Möglichkeit (mit Hilfe eines „SwitchButton“) den Verlauf seiner getätigten Rechnungen zu speichern, also sofern er möchte. Mit Klick auf einen Button kann er sich diesen anzeigen lassen, wobei dieser Verlauf auf einer zweiten „Activity“ angezeigt wird.

# Lösungsansatz
Listeners an den RadioGroup, EditTexts und Button anhängen.

## EditText
`addTextChangedListener` und `TextWatcher` Klassen

## RadioGroup
`setOnCheckedChangeListener` und OnCheckedChangeListener` Klassen / Methoden

## Button
`setOnClickListener` Methode


