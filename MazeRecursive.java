package first;
public class MazeRecursive {
    static int size =8;
    static int wall =0;
    static int path =1;
    static int visited =2;
    static int noAccess=3;


    public static int[][] makeMaze(){
        int[][] maze = new int[8][8];
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
                maze[i][j] = (int)(Math.random()*2);
            }
        }
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
               System.out.print(maze[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("미로찾기를 시작합니다.");
        return maze;
    }

    public static int[][] printMaze(int[][] maze){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
               System.out.print(maze[i][j]);
            }
            System.out.print("\n");
        }
        return maze;
    }

    public static boolean findPath(int[][] maze,int x, int y){
        if(x<0 || y<0 || x>= size|| y>= size){
            return false;
        }
        else if(maze[x][y] != path){
            return false;
        }
        else if(x==size-1 && y==size-1){
            maze[x][y] = visited;
            return true; 
        }
       
        else{
            maze[x][y] = visited;
            if(findPath(maze, x-1, y)|| findPath(maze, x, y+1)|| findPath(maze, x+1, y)||findPath(maze, x, y-1)||
            findPath(maze, x-1, y-1)||findPath(maze, x-1, y+1)||findPath(maze, x+1, y-1)||findPath(maze, x+1, y+1)
            ){
                return true;
            }
            else{
                maze[x][y]=noAccess;
                return false;
            }
        }

    }


    
    public static void main(String[] args){
        int[][] maze = makeMaze(); 
        boolean res = findPath(maze, 0, 0);
        printMaze(maze);
        if(res == true){
            System.out.println("미로 탈출! 게임을 종료합니다.");
        }else{
            System.out.println("탈출구가 없습니다.");
        }
        
    }
    
}
