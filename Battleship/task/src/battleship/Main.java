package battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


class dashboard {
    char[][] pole = new char[10][11];
    public static char[] abc1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public void get_pole() {
        for (int i = 0; i < pole.length; i++) {

            for (int j = 0; j < pole[i].length; j++) {

                if (j == 0) {
                    pole[i][j] = abc1[i];
                } else {


                    pole[i][j] = '~';
                }
            }
        }
    }

    public static void draw_pole(char[][] pole) {

        System.out.println("  1 2 3 4 5 6 7 8 9 10");

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
    }
}




class Ships {

    int count =0;
    enum ShipType {
        SHIP_5(4, "Aircraft Carrier"),
        SHIP_4(3, "Battleship"),
        SHIP_3(2, "Submarine"),
        SHIP_3_1(2, "Cruiser"),

        SHIP_2(1, "Destroyer");
        int length;
        String name;

        ShipType(int length, String name) {
            this.length = length;
            this.name = name;
        }
    }

    static boolean isTrue = true;


    public List<String> set_ship() {
        try {
            List<String> tokens = new ArrayList<>();
            var br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st != null && st.hasMoreElements()) {
                tokens.add(st.nextToken());
            }

            return tokens;

        } catch (IOException e) {
            System.out.println(e);
        }
        return null;

    }


    public static boolean check(char s, char abc1[]) {
        for (int i = 0; i < abc1.length; i++) {
            if (s == (abc1[i])) {
                return true;
            }

        }
        return false;
    }

    public  int replace_alpha_to_int(char s, char[] abc1) {
        if (check(s, dashboard.abc1)) {
            for (int i = 0; i < abc1.length; i++) {
                if (s == (abc1[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    public String chek_coord(int x,int y,char[][]pole) {
        String s="";
        if (x == 0 && y != 1&& y != 10) {
            if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i < pole[x].length; i++) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y - 1] == 'X') {
                for (int i = y - 1; i > 0; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x + 1][y] == 'X') {
                for (int i = x + 1; i < pole.length; i++) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (x == 9 && y != 1 && y != 10) {
                if (pole[x][y + 1] == 'X') {
                    for (int i = y + 1; i < pole[x].length; i++) {
                        if (pole[x][i] != 'O') {
                            s = "You sank a ship!";
                        }
                    }
                } else if (pole[x][y - 1] == 'X') {
                    for (int i = y - 1; i > 0; i--) {
                        if (pole[x][i] != 'O') {
                            s = "You sank a ship!";
                        }
                    }
                } else if (pole[x - 1][y] == 'X') {
                    for (int i = x - 1; i > 0; i--) {
                        if (pole[i][y] != 'O') {
                            s = "You sank a ship!";
                        }
                    }

                }
            }
        } else if (y == 1 &&  x != 9&& x!=0) {
            if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i < pole[x].length; i++) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i > 0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x + 1][y] == 'X') {
                for (int i = x + 1; i < pole.length; i++) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }
        } else if (y == 10 && x != 0 && x != 9) {
            if (pole[x + 1][y] == 'X') {
                for (int i = x + 1; i < pole.length; i++) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y - 1] == 'X') {
                for (int i = y - 1; i > 0; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i >0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }

            }
        } else if (y == 1 && x == 0) {
            if (pole[x + 1][y] == 'X') {
                for (int i = x + 1; i < pole.length; i++) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i < pole[x].length; i++) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }
        }else if(y==10&&x==9) {
            if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i > 0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y - 1] == 'X') {
                for (int i = y - 1; i > 0; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }
        }else if (x==9 && y==1){
            if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i > 0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i <pole[x].length; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
        }}else if (x==9&&y!=1&&y!=10){
            if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i > 0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i <pole[x].length; i++) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }

        }else if (pole[x][y- 1] == 'X') {
                for (int i = y - 1; i >0; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }
        }else{
            if (pole[x][y + 1] == 'X') {
                for (int i = y + 1; i < pole[x].length; i++) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x - 1][y] == 'X') {
                for (int i = x - 1; i > 0; i--) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            } else if (pole[x + 1][y] == 'X') {
                for (int i = x + 1; i < pole.length; i++) {
                    if (pole[i][y] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }else if (pole[x][y - 1] == 'X') {
                for (int i = y - 1; i >0; i--) {
                    if (pole[x][i] != 'O') {
                        s = "You sank a ship!";
                    }
                }
            }
        }
        return s;
    }
    public void set_coordinates( List<String> tokens, int a, String b, char[][] pole) {
        String X = tokens.get(0);
        String Y = tokens.get(1);
        int x = replace_alpha_to_int(X.charAt(0), dashboard.abc1);
        int y = replace_alpha_to_int(Y.charAt(0), dashboard.abc1);
        int x1 = Integer.parseInt(X.substring(1));
        int y1 = Integer.parseInt(Y.substring(1));
        if (x - y == a || y - x == a || x1 - y1 == a || y1 - x1 == a) {
            if (x == y) {
                int z = Math.max(x1, y1);
                int q = Math.min(x1, y1);

                if (x == 0) {
                    for (int i = q; i < z + 1; i++){
                        if (pole[x][i] == '~' && pole[x + 1][i] != 'O') {
                            pole[x][i] = 'O';
                            isTrue = false;
                        }
                    }} else if (x == 9) {
                    for (int i = q; i < z + 1; i++){
                        if (pole[x][i] == '~' && pole[x - 1][i] != 'O') {
                            pole[x][i] = 'O';
                            isTrue = false;
                        }}

                } else {
                    for (int i = q; i < z + 1; i++){
                        if (pole[x][i] == '~' && pole[x + 1][i] != 'O' && pole[x - 1][i] != 'O') {
                            pole[x][i] = 'O';
                            isTrue = false;

                        }
                    }
                }
            } else if (x1 == y1) {
                int z = Math.max(x, y);
                int q = Math.min(x, y);

                if (q == 0) {
                    for (int i = q; i < z + 1; i++) {
                        if (pole[i][x1] == '~' && pole[i + 1][x1] != 'O') {
                            pole[i][x1] = 'O';
                            isTrue = false;
                        }}
                } else if (z == 9) {
                    for (int i = q; i < z + 1; i++) {
                        if (pole[i][x1] == '~' && pole[i][x1] != 'O') {
                            pole[i][x1] = 'O';
                            isTrue = false;
                        }
                    }} else {
                    for (int i = q; i < z + 1; i++) {
                        if (pole[i][x1] == '~' && pole[i][x1-1] != 'O' && pole[i][x1+1]!='O'&&pole[i][x1+1]!='O'&&pole[i+1][x1-1]!='O'&&pole[z+1][x1+1]!='O'&&pole[q-1][x1]!='O'&&pole[z+1][x1]!='O') {
                            pole[i][x1] = 'O';
                            isTrue = false;

                        } else {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            break;
                        }}

                }
            } else  {
                System.out.println("Error! Wrong ship location! Try again:");
            }
        } else {
            System.out.println("Error! Wrong length of the " + b + "! Try again:");
        }
    }

    public void set_Aircraft(char[][] pole) {

        System.out.print(">");

        set_coordinates(set_ship(), ShipType.SHIP_5.length, ShipType.SHIP_5.name, pole);
    }

    public void Battleship(char[][] pole) {

        System.out.print(">");
        set_coordinates(set_ship(), ShipType.SHIP_4.length, ShipType.SHIP_4.name, pole);
    }

    public void Submarine(char[][] pole) {


        System.out.print(">");
        set_coordinates(set_ship(), ShipType.SHIP_3.length, ShipType.SHIP_3.name, pole);
    }

    public void Cruiser(char[][] pole) {


        System.out.print(">");
        set_coordinates(set_ship(), ShipType.SHIP_3_1.length, ShipType.SHIP_3_1.name, pole);
    }

    public void Destroyer(char[][] pole) {

        System.out.print(">");
        set_coordinates(set_ship(), ShipType.SHIP_2.length, ShipType.SHIP_2.name, pole);
    }

    public void set_pole(char[][] pole) {
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        while (Ships.isTrue) {
            set_Aircraft(pole);
        }
        dashboard.draw_pole(pole);
        Ships.isTrue = true;
        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        while (Ships.isTrue) {

            Battleship(pole);
        }
        dashboard.draw_pole(pole);
        Ships.isTrue = true;
        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        while (Ships.isTrue) {
            Submarine(pole);
        }
        dashboard.draw_pole(pole);
        Ships.isTrue = true;
        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        while (Ships.isTrue) {
            Cruiser(pole);
        }
        dashboard.draw_pole(pole);
        Ships.isTrue = true;
        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        while (Ships.isTrue) {
            Destroyer(pole);
        }
        dashboard.draw_pole(pole);
    }

    public  int attack(List<String> tokens, Ships a, char[][] pole, char [][]pole1, Ships ships) {
        String X = tokens.get(0);

        int x1=0;
        int x = a.replace_alpha_to_int(X.charAt(0), dashboard.abc1);
        if (Integer.parseInt(X.substring(1)) > 0 && Integer.parseInt(X.substring(1)) < 11) {
            x1 = Integer.parseInt(X.substring(1));
        } else {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
        }

        if (pole[x][x1] == 'O') {
            ships.count++;
            System.out.println("You hit a ship!");
            pole[x][x1] = 'X';
            pole1[x][x1] = 'X';
            if (chek_coord(x,x1,pole)=="You sank a ship!"){
                System.out.println("You sank a ship!");
            }
            dashboard.draw_pole(pole);
        }else if (pole[x][x1] == '~') {
            System.out.println("You missed!");
            pole[x][x1] = 'M';
            pole1[x][x1] = 'M';
            dashboard.draw_pole(pole);
        }

return ships.count;
    }
}


public class Main {
    public static void main(String[] args) {

        dashboard mypole = new dashboard();
        dashboard mypole_withships = new dashboard();
        dashboard enemypole = new dashboard();
        dashboard enemypole_withships = new dashboard();
        Ships myships = new Ships();
        Ships enemyships = new Ships();
        System.out.println("Player 1, place your ships on the game field");
        mypole_withships.get_pole();
        mypole.get_pole();
        dashboard.draw_pole(mypole_withships.pole);
        myships.set_pole(mypole_withships.pole);
        System.out.println("Press Enter and pass the move to another player");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Player 2, place your ships to the game field");
        enemypole.get_pole();
        enemypole_withships.get_pole();
        Ships.isTrue = true;
        dashboard.draw_pole(enemypole_withships.pole);
        enemyships.set_pole(enemypole_withships.pole);
        while (myships.count< 17|| enemyships.count<17) {
            System.out.println("Press Enter and pass the move to another player");
            sc.nextLine();
            dashboard.draw_pole(enemypole.pole);
            System.out.println("---------------------");
            dashboard.draw_pole(mypole_withships.pole);
            System.out.println("Player 1, it's your turn:");
            myships.attack(enemyships.set_ship(),enemyships, enemypole_withships.pole,enemypole.pole,myships);
            System.out.println(myships.count);
            if(myships.count==17){
                break;
            }
            System.out.println("Press Enter and pass the move to another player");

            sc.nextLine();
            dashboard.draw_pole(mypole.pole);
            System.out.println("---------------------");
            dashboard.draw_pole(enemypole_withships.pole);
            System.out.println("Player 2, it's your turn:");
            enemyships.attack(myships.set_ship(),myships, mypole_withships.pole,mypole.pole,enemyships);
            System.out.println(enemyships.count);
            if(enemyships.count==17){
                break;
            }
        }
        System.out.println("You sank the last ship. You won. Congratulations!");
    }}

