//SP1 Game
// 1 player, 4 enemies, 4 random cookies. Get 10 cookies/points and you win!
// Game will reset on 10 points or at 0 hp.
int[][]map = new int[30][30];
int size = 25;
int prevFrameCount=frameCount;
int cookiesPrevFrameCount=frameCount;
int currentFrameCount;
Enemy[] enemyArr = new Enemy[4];
Cookies[] cookieArr = new Cookies[4];

Player player;
Enemy enemy;
Enemy enemy2;
Enemy enemy3;
Enemy enemy4;
Cookies cookies;
Cookies cookies2;
Cookies cookies3;
Cookies cookies4;

void setup()
{

  frameRate(10);
  //printIntArray(map);
  size(751, 751);
  player = new Player(15, 15 );
  enemy = new Enemy(20, 19, player);
  enemy2 = new Enemy(10, 24, player);
  enemy3 = new Enemy(23, 23, player);
  enemy4 = new Enemy(27, 29, player);
  cookies = new Cookies(20, 1, player);
  cookies2 = new Cookies(25, 15, player);
  cookies3 = new Cookies(1, 28, player);
  cookies4 = new Cookies(12, 27, player);
  enemyArr = new Enemy[]{enemy, enemy2, enemy3, enemy4};
  cookieArr = new Cookies[]{cookies,cookies2,cookies3,cookies4};
}

void draw()
{
  movement();
  clearGrid();
  displayPlayer();
  drawGrid();
  cookies.move();
}


// Drawing the map/board.
void drawGrid()
{
  for (int x=0; x<map.length; x++)
  {
    for (int y=0; y<map[0].length; y++)
    {
      fill(setColorToType(map[x][y]));
      stroke(200);

      rect(x * size, y * size, size, size);
    }
  }
}

//Resets the map, so when the player moves the previous position won't change color.
void clearGrid()
{
  for (int x=0; x<map.length; x++)
  {
    for (int y=0; y<map[0].length; y++)
    {
      map[x][y]=0;
    }
  }
}


// This is display everything: Player, Enemies and the cookies.
//made a framecount, so the speed of enemies are slower.
void displayPlayer()
{
  currentFrameCount=frameCount;
  int frameCountDifference = currentFrameCount - prevFrameCount;

  map[player.x][player.y] = player.type;
  map[enemy.x][enemy.y] =   enemy.type;
  map[enemy2.x][enemy2.y] = enemy2.type;
  map[enemy3.x][enemy3.y] = enemy3.type;
  map[enemy4.x][enemy4.y] = enemy4.type;
  map[cookies.x][cookies.y] = cookies.type;
  map[cookies2.x][cookies2.y] = cookies.type;
  map[cookies3.x][cookies3.y] = cookies.type;
  map[cookies4.x][cookies4.y] = cookies.type;
  player.loseHP();
  player.gainPoints();

// Set a FramecountDifference on Enemy movement, so they're slower.
  if (frameCountDifference == 5) {
    enemy.huntPlayerX();
    enemy.huntPlayerY();
    prevFrameCount = currentFrameCount;
  }
}

//Switch case which indicate color on different int types.
color setColorToType(int type) 
{
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(0);
    break;
  case 1: 
    c = color(0, 255, 0);
    break;
  case 2: 
    c = color(255, 0, 0);
    break;
  case 3: 
    c = color(#ebd834);
    break;
  }    

  return c;
}
// The controls for the Players movement. Constrain which makes sure that the player and enemy doesn't go out of bounds.
void movement()
{
  if (keyCode == UP)
  {
    player.y--;
  }
  if (keyCode == RIGHT)
  {
    player.x++;
  }
  if (keyCode == LEFT)
  {
    player.x--;
  }
  if (keyCode == DOWN)
  {
    player.y++;
  }
  player.x= constrain(player.x, 0, 29);
  player.y = constrain(player.y, 0, 29);
  enemy.x = constrain(enemy.x, 0, 29);
  enemy.y = constrain(enemy.y, 0, 29);
}

void keyReleased() {
  keyCode=-1;
}


////void printIntArray(int[][] arr) 
////{
////  System.out.println("");
////  System.out.println("");
////  System.out.println("");
////  for (int x = 0; x < arr.length; x++)
////  {
////    for (int y = 0; y < arr[0].length; y++) 
////    {

////      System.out.print(arr[y][x] + ", ");
////    }
////    println();
//  }
