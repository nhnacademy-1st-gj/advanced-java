import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class TicTacToe {
    public static int checkRes(String[][] arr,int user){ //결과를 확인하는 메서드입니다.
        int[] res ={0,0,0};
        int[] res2 ={0,0,0};
        int[] res3 = {0,0};
        int finalRes =0;
        String check ="";
        if(user == 1){ //1이면 사용자, 아니면 컴퓨터입니다.
            check ="O";
        }else{
            check = "X";
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                 if(arr[i][j].equals(check)){ //가로를 확인
                     res[i]++;
                 }
                if(arr[j][i].equals(check)){ //세로를 확인
                    res2[i]++;
                }
            }
            }
        if(arr[0][0].equals(check) && arr[1][1].equals(check) && arr[2][2].equals(check)){ //대각선을 확인 
            res3[0]=3;
        }   
        if(arr[0][2].equals(check) && arr[1][1].equals(check) && arr[2][0].equals(check)){ //대각선을 확인
            res3[1]=3;
        }
        for(int i=0;i<res.length;i++){
            if(res[i] != 3 && res2[i]!= 3){
                continue;
            }else{
                finalRes =1; 
            }
        } 
        for(int i=0;i<res3.length;i++){
            if(res3[i] != 3 ){
                continue;
            }else{
                finalRes =1;
            }
        } 
        return finalRes;
    }

    public static void main(String[] args){
        int win=0;
        boolean end = true;
        //2차원 배열을 만들고 게임판을 출력합니다.
        System.out.println("Let's start Tic Tac Toe game!");
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                board[i][j] = " ";
            }
        }
        System.out.println("|   |   |   |");
        System.out.println("|---|---|---|");
        System.out.println("|   |   |   |");
        System.out.println("|---|---|---|");
        System.out.println("|   |   |   |");
        


        while(end){
            int x,y=0;
            System.out.println("Enter you move(x y)");

            //입력을 받습니다.
            Scanner sc = new Scanner(System.in); 
            x = sc.nextInt();
            y = sc.nextInt();

            //입력 받은 숫자를 좌표값 삼아 값을 넣습니다. 
            try{
                if(board[x][y] != " "){
                    System.out.println("This field is already selected. Re-enter your move");
                    continue;
                }else{
                     board[x][y]= "O";
                }
            }catch(InputMismatchException e){
                System.out.println("Enter only digits");
                e.getStackTrace();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Enter digits between 0 ~2");
                continue;
            }
            
            //값을 포함하여 보드판을 출력합니다.
            for (int i = 0; i < 3; i++) {
                System.out.println("  " + board[i][0] + "|  "
                        + board[i][1] + "|  " + board[i][2]); 
                if (i != 2) 
                    System.out.println("---|---|---");				
            }

           
            System.out.println("Computer's move");
            //컴퓨터가 값을 넣을 좌표 생성해줍니다.
            while(true){
                Random random = new Random();
                x=random.nextInt(3); 
                y=random.nextInt(3); 
                
                if(board[x][y] != " "){ //칸 유효성 검사
                    continue;
                }else{
                    board[x][y]= "X";
                    break;
                 }
            };
             //값을 포함하여 보드판을 출력합니다.
             for (int i = 0; i < 3; i++) {
                System.out.println("  " + board[i][0] + "|  "
                        + board[i][1] + "|  " + board[i][2]); 
                if (i != 2) 
                    System.out.println("---|---|---");				
            }

            win = checkRes(board, 1); //사용자
            int win2 = checkRes(board, 2); //컴퓨터
            if (win == 1){
                System.out.println("Winner : user");
                end = false;
            }if(win2 == 1){
                System.out.println("Winner: computer");
                end=false;
            }

            //배열에 빈공간이 없으면 종료합니다.
            int finish =0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){
                    if(board[i][j] != " "){
                        finish++;
                        if(finish >= 9){
                            end=false;
                        }
                    }
                    
                    
                }
            }

         }

    }
    
}
