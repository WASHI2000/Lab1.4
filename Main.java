class Main {
  public static void main(String[] args) 
   int dzialanie;
   System.out.println("Kalkulator");
   System.out.println();
   System.out.println("1 - Dodawanie");
   System.out.print("Wybierz działanie: ");
  Scanner wczytaj = new Scanner(wczytaj.in);
  opcja = wczytaj.nextInt();
        switch (dzialanie){
          case 1 : {
  {
    System.out.println("Podaj r1: ");
    r1 = wczytaj.nextInt();
    System.out.println("Podaj r2: ");
    r2 = wczytaj.nextInt();
    double pi = 3.14;
    double kolo1, kolo2, suma_kola;
    kolo1 = (pi * r1);
    kolo2 = (pi * r2);
    suma_kola = (kolo1 + kolo2);
    System.out.println("Suma dwóch pól koła to: "+suma_kola);
    break;
  }
}