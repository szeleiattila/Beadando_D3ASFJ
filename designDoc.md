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
    gyártómetódus a nevében magadott terméket adja vissza, tehát a készítRaktár (makeRaktár) egy
    raktárat. Ez azért jobb, mint a new Rartár() konstruktor hívás, mert itt az elkészítés algoritmusát egységbe tudjuk zárni. Ez azért előnyös,
    mert ha a gyártás folyamata változik, akkor azt csak egy helyen kell módosítani.

- Megfigyelő ( Observer )
    - egy viselkedési tervezési minta, amely egy esemény által kiváltott változékony metódust emel ki egy egy-sok kapcsolat sok oldalára.A megfigyelő tervezési minta lehetővé teszi, hogy egy objektum megváltozása esetén értesíteni tudjon
    tetszőleges más objektumokat anélkül, hogy bármit is tudna róluk.

    Kétfajta megfigyelő megvalósítást ismerünk:
    - „Pull-os” vagy húzó megfigyelő: Ebben az esetben a megfigyelő lehúzza a változásokat az
    alanytól.
    - „Push-os” vagy toló megfigyelő: Ebben az esetben az alany odanyomja a változásokat a
megfigyelőnek.

- Építő ( Builder )
    - Létrehozási tervezési minta, amely több lépésben képes felépíteni egy
    összetett objektumot, és azt az építési folyamat végén visszaadni. Segítségével könnyen lehet
    olyan új építőt létrehozni, amelyben az építés lépései hasonlóak, de az építés eredménye egy kicsit
    más. Előnye, hogy
    szétválasztja az építés folyamatát és az elkészült objektum lekérdezését.

## Tervezési minták implementációja.

- ### Singleton 
            private RaktarFactory(){}
            private static RaktarFactory instance ;
            public static RaktarFactory getInstance(){
            if (instance ==null) {
            instance = new RaktarFactory();
        }
        return instance;
        }
    **Magyarázat**: A RaktarFactoryból csak egy példány szeretnénk a rendszerben, valamint szeretnénk hogy elérhető legyen globálisan több elem számára is.
    
    A private konstruktor azért kell hogy ne lehessen new kulcsszóval példányosítani.

    Kell egy statikus mező az egyetlen példányunk számára.

    Valamint egy getInstance metódus, ami biztosítja számunkra a példányosítást és egyben visszaadja a példányt, ha még nem létezik akkor létrehozza ha már létezik akkor visszadja ugyanazt.

    Az AruFactory osztályban is ugyan ezt alkalmaztam.

- ### Factory method
---
          
        public interface Raktár {
            VARIABLES;
            METHODS();
           }
---
        public class ÉlelmiszerRaktár implements RaktáR {

         @Override
            METHODS();
        }
---
        public class BútorRaktár implements Raktár {

            @Override
            METHODS();
        }
---
        public class RaktarFactory{

            public static Raktár makeRaktár(char raktarType){
        switch (raktarType){
            case 'b':
                return new BútorRaktár();
            case 'e':
                return new ÉlelmiszerRaktár();
            default:
                return null;
                }
            }
        }

**Magyarázat**: Ha különböző megvalósítású, de azonos felületű objektumokat szeretnénk létrehozni a klienstől elszigetelten, akkor a factory tervezési mintát ajánlott használni.

A módszer lényege hogy könnyen bővíthető legyen, és a kliensnek minimális módosítás, ismeretre legyen szüksége.

Szükségünk van egy Objektumra ami a "termékek" közös jellemzőit foglalja össze. Ez a Raktár interface.

 - Ha van adat jellegű közös tagjuk, akkor absztrakt osztály, egyébként interface. Ebben a programban mindkettőt megvalósítottam.

A különböző raktárok implementálják a Raktar interfészt és Overrideolják a metódusokat, vagy ha absztrakt osztályról van szó akkor származnak abból. (class abstract Aru).

A RaktarFactorynk tartalmaz egy makeRaktár metódust, amely
- ismeri a Raktár termékeket,
- visszatérési értéke Raktar,
- Raktár títpus alapján eldönti melyik osztály példánya kell.

### Observer


           public interface Observer  {

            void update(String msg) ;
        } 
---
        public interface Subject {

        void addObserver(org.example.manager.Observer o);
        void deleteObserver(Observer o) ;
        void notifyObserver();
    }
---
    public class RaktárManager implements Subject {


    //obverser collection tárol
    private Collection<Observer> raktarObserverek= new ArrayList<>();

    @Override
    public void addObserver(...
    }

    @Override
    public void deleteObserver(...
    }

    @Override
    public void notifyObserver(...
        }
    }
    
Observer felület (Megfigyelő) Frissítő interfészt határoz
meg az értesítendő objektumok számára. Frissítő
(update) művelet segítségével.

A Subject (Alany) tárolja a beregisztrált megfigyelőket, interfészt kínál a megfigyelők be- és
kiregisztrálására valamint értesítésére.

A Raktármanager osztály egy private listában tárolja az observereket. Implementálja a Subject interfészt, és felülírja a metódusait. 
- Amikor egy observer regisztrál, egyszerűen hozzáadjuk a listához(addObserver)
-  amikor egy observer kéri a törlését, egyszerűen töröljük a listából(deleteObserver)
- szólunk az observereknek az állapotról
  mivel mind observerek, van Update() metódusuk, így tudjuk őket értesíteni (notifyObserver)

### Builder

**Builder interfész**, amely deklarálja a termékrész objektum létrehozására szolgáló
absztrakt műveleteket.

            public interface RendelesBuilder  {
            RendelesBuilder setVasarlo(...;
            Absztrakt methods();
---
**Builder implementációs osztály**, definiálja a Builder interfészben előírt metódusokat
felépíti és összeállítja a termék adott részét

            public class RendelesBuilderImpl implements RendelesBuilder{..
            
            @Override
            RendelesBuilder setVasarlo(...

            @Override
            public Rendeles build() 
            {return new Rendeles(...)
            }
            ...
---
**Termék osztály** ,
ami az elkészítendő osztály maga. A *Builder impl osztály* felépíti ennek a terméknek belső ábrázolását és definiálja
az összeállítási folyamatokat.

    
    public class Rendeles {
    public List<RendelesiElemek> getRendelesiLista() {
        return bevasarloLista;
    }
    ...
    }
    
---
**Termék részei osztály** 
Az az osztály ami a termék részeit tartalmazza. Jelen esetben a rendelesi lista,

            public class RendelesiElemek {
    
     private String aruNev;
     private String aruType;
     private int mennyiseg;
     ...}

