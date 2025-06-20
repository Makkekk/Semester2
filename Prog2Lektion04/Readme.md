Opgave 1
I models pakken finder du en IntegerVault klassen, der kan gemme en Integer.
Lav klassen om, så det kan gemme andre typer end Integer.

Opgave 2
ArrayBag klassen er en delvis implementering af Bag interface. Idéen er at man
har en taske der kan indeholde et antal elementer, men ikke vokse, så tasken kan
blive fuld. Implementer de metoder der mangler at blive implementeret. Der
følgende metoder.
    • public boolean add(E newEntry)
    • public E remove()
    • public boolean remove
    • public void clear()
    • public int getFrequencyOf(E anEntry)
    • public boolean contains(E anEntry)
    • public E[] toArray()

I finder beskrivelser af hver enkelt metode i Bag Interface. Der er lavet unittests
til metoderne i tests/opgave02/Opgave2Tests

Opgave 3
Lav en ny klasse ArrayListRing der implementerer interface Ring. Brug an
ArrayList til at implementerer funktionaliteten for Ring interface, dvs. lav en
attribut af typen ArrayList i ArrayListRing og brug denne til at implementerer
alle metoderne i Ring interface.
