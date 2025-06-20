Opgave 1
Skriv en rekursiv metode public static int factorial(int n) der beregner n!, n>=0.
Den rekursive definition er givet ved
    Termineringsregel: 0! = 1
    Rekurrensregel: n! = n*(n-1)!, n>0

Opgave 2
Skriv en rekursiv metode public static int fibonacci(int n) der beregner
Fibonacci tal.
    Termineringsregel: fibonacci(0) = 0, fibonacci(1) = 1
    Rekurrensregel: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
Ekstraopgave: Optimer din løsning ved at gemme delresultater i et array.

Opgave 3
Skriv en rekursiv metode public static int power(int n, int p) der beregner 𝑛𝑝,
p>=0.
Den rekursive definition er givet ved
    Termineringsregel: 𝑛0 = 1
    Rekurrensregel:𝑛𝑝 = 𝑛𝑝−1 ∗ 𝑛, 𝑝 > 0
Optimer din power metode, ved at udnytte potensregnereglen
    𝑛𝑝∗𝑞 = (𝑛𝑝)𝑞
Så hvis p er lige, kan man bruge (𝑛^2)^p/2
så:

    Rekurrensregel:𝑛𝑝 = 𝑛𝑝−1 ∗ 𝑛, 𝑝 > 0, hvis p er ulige
    Rekurrensregel:𝑛𝑝 = (𝑛^2)^p/2 , 𝑝 > 0, ℎ𝑣𝑖𝑠 𝑝 𝑒𝑟 𝑙𝑖𝑔𝑒

Opgave 4
Skriv en rekursiv metode public static String reverse(String s) der returnerer s
med karaktererne i omvendt rækkefølge. For eksempel skal kaldet
reverse(”eirefretniV”) returnere ”Vinterferie”
Beskriv først den rekursive definition for at vende en String. Programmer
dernæst den rekursive metode.

Opgave 5
Skriv en rekursiv metode der implemeterer Euclids algoritme der finder største
fælles divisor af to positive heltal. Den største fælles divisor af to tal er det
største heltal der går op i begge tal. Euclids algoritme Største Fælles Divisor
sfd(a,b) er defineret ved:

Termineringsregel: b, hvis b<=a og b går op i a
Rekurrensregel: sfd(b,a), hvis a < b
Sfd(b, a%b), ellers
