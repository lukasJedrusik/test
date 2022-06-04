public class Main {
    public static void main(String[] args) {
        int jablko = 7;
        int pomarancz = 5;
        int monety = 1;
        int  roznica = 0;

        if(jablko > pomarancz){
             roznica = jablko - pomarancz;

            for (int i = 0; i < roznica; i++){
                if(monety == 0){
                    break;
                }
                pomarancz++;
                monety--;
            }
            if(monety > 0){
                while(monety != 0){
                    pomarancz++;
                    monety--;
                    if(monety > 0){
                        jablko++;
                        monety--;
                    }
                }
            }
            roznica = jablko - pomarancz;

                    } else if (pomarancz > jablko){
             roznica = pomarancz - jablko;
            for (int i = 0; i < roznica; i++){
                if(monety == 0){
                    break;
                }
                jablko++;
                monety--;
            }
            if(monety > 0){
                while(monety != 0){
                    pomarancz++;
                    monety--;
                            if(monety > 0){
                                jablko++;
                                monety--;
                            }
                }

            }

            roznica = pomarancz - jablko;
        }
        else {

            if(monety > 0){
                while(monety != 0){
                    pomarancz++;
                    monety--;
                    if(monety > 0){
                        jablko++;
                        monety--;
                    }
                }

            }
            roznica = pomarancz - jablko;

        }

        System.out.println("Minimalna roznica: " + Math.abs(roznica));
        System.out.println("Ilosc jablek: " + jablko);
        System.out.println("ilosc pomaranczy: " + pomarancz);
    }
   // static int roznica = 0;
}
