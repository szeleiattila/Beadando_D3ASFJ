# Raktár manager

A raktár manager programban alkalmaztam az **OOP alapelveket**.
- Egységbezárás ( encapsulation )
    - Az adattagokat és a rajtuk műveleteket végrehajtó metódusokat egységbe zárjuk, ezt az egységet osztálynak nevezzük. az objektum belső állapotát
meg kell védeni, azt csak a saját metódusai változtathatják meg. Ezt szokás információ rejtésnek
(angolul: information hiding) is nevezni.
- Öröklődés ( inheritance )
    - Az öröklődés (angolul: inheritance) a kód-újrahasznosítás kényelmes formája. A gyermek osztály az ős osztály minden nem privát mezőjét és metódusát megörökli. Azaz a gyermek osztály örökli az ős osztály felületét és megvalósítását. 

- Többalakúság ( polymorphism )
    - Maga a többalakúság az öröklődés következménye. Mivel a gyermek osztály örökli az ős felületét, ezért a gyermek osztály példányai megkapják az ős típusát is. Így egy objektum több típusként, azaz több alakban is használható.

Továbbá különböző **tervezési mintákat**.

- Egyke ( singleton )
    - Akkor alkalmazzuk ha csak egy példányunk lehet. Példányt az osztály konstruktorával készíthetünk. Ha van publikus konstruktor az osztályban, akkor akárhánypéldány készíthető belőle. Az egykének van egy osztályszintű getInstance (szerezPéldányt) metódusa, ami mindenkinek ugyanazt a példányt adja vissza. Ezt a példányt is létre kell hozni, de a privát konstruktort a szerezPéldány hívhatja, hiszen ő is az egyke osztály része.


- Gyártó metódus ( Factory method )
    - A gyártómetódus (angolul: factory method) egy létrehozási tervezési minta. Ezzel a mintával lehet
    szépen kiváltani a programunkban lévő rengeteg hasonló new utasítást. A minta leírja, hogyan
    készítsünk gyártómetódust.

         A
    gyártómetódus a nevében magadott terméket adja vissza, tehát a készítKutya (angolul: createDog) egy
    kutyát, a készítMacska (angolul: createCat) egy macskát. Ez azért jobb, mint a new Kutya() vagy a new
    Macska() konstruktor hívás, mert itt az elkészítés algoritmusát egységbe tudjuk zárni. Ez azért előnyös,
    mert ha a gyártás folyamata változik, akkor azt csak egy helyen kell módosítani.
