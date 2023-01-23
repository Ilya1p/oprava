public class arePositiveSorted {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,56,5,4};//neruste
        int[]arr = new int []{0,-1,-55,34,73};//zaporne
        int[] arrrr= new int []{4, 5, 6,12,40};//od mensiho k vetsimu
        int[] arrr = new int []{-1,0,1,24,144,555};
        System.out.println(arePositiveSorted(arrr));//F
        System.out.println(arePositiveSorted(ar));//F
        System.out.println(arePositiveSorted(arr));//F
        System.out.println(arePositiveSorted(arrrr));//T
    }

        public static boolean arePositiveSorted ( int[] numbers){/**metoda se prijima int[] ("numbers" nazyv matice)
         boolean typ funkce, metody, dava odpoved true nebo false.arePositiveSorted - nazyv funkce
         **/
            for (int i = 0; i < numbers.length; i++) {//.length delka matice встроена в джаву.Метод проверяет если больше ноля
                if (numbers[i] <= 0) {
                    return false;//return se da vysledek F после ретерна функция не работает
                }
            }

            for (int i = 0; i < numbers.length - 1; i++) {//проверяет если массив идёт по возрастанию
                if (numbers[i] > numbers[i + 1]) {
                    return false;
                }
            }
            //jestli zadna podminka splnena se dava T
            return true;
        }
    }
